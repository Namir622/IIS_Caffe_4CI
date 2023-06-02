import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TextEditor extends JFrame {
   private JMenuBar menuBar;
   private JMenu fileMenu, editMenu;
   private JMenuItem newFileItem, openFileItem, saveFileItem, exitItem, copyItem, pasteItem;
   private JTextArea textArea;
   private Clipboard clipboard;

   public TextEditor() {
      // Inizializzazione dei componenti
      menuBar = new JMenuBar();
      fileMenu = new JMenu("File");
      editMenu = new JMenu("Modifica");
      newFileItem = new JMenuItem("Nuovo");
      openFileItem = new JMenuItem("Apri");
      saveFileItem = new JMenuItem("Salva");
      exitItem = new JMenuItem("Esci");
      copyItem = new JMenuItem("Copia");
      pasteItem = new JMenuItem("Incolla");
      textArea = new JTextArea();
      clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

      // Aggiunta dei componenti al menu "File"
      fileMenu.add(newFileItem);
      fileMenu.add(openFileItem);
      fileMenu.add(saveFileItem);
      fileMenu.addSeparator();
      fileMenu.add(exitItem);

      // Aggiunta dei componenti al menu "Modifica"
      editMenu.add(copyItem);
      editMenu.add(pasteItem);

      // Aggiunta dei menu alla barra del menu
      menuBar.add(fileMenu);
      menuBar.add(editMenu);

      // Aggiunta del listener al menu "File"
      newFileItem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            textArea.setText("");
         }
      });

      openFileItem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(TextEditor.this);
            if (result == JFileChooser.APPROVE_OPTION) {
               File selectedFile = fileChooser.getSelectedFile();
               try {
                  FileReader fileReader = new FileReader(selectedFile);
                  BufferedReader bufferedReader = new BufferedReader(fileReader);
                  String line;
                  textArea.setText("");
                  while ((line = bufferedReader.readLine()) != null) {
                     textArea.append(line + "\n");
                  }
                  bufferedReader.close();
               } catch (IOException ex) {
                  ex.printStackTrace();
               }
            }
         }
      });

      saveFileItem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(TextEditor.this);
            if (result == JFileChooser.APPROVE_OPTION) {
               File selectedFile = fileChooser.getSelectedFile();
               try {
                  FileWriter fileWriter = new FileWriter(selectedFile);
                  fileWriter.write(textArea.getText());
                  fileWriter.close();
               } catch (IOException ex) {
                  ex.printStackTrace();
               }
            }
         }
      });

      exitItem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });

      // Aggiunta del listener al menu "Modifica"
      copyItem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String selectedText = textArea.getSelectedText();
            if (selectedText != null) {
               StringSelection stringSelection = new StringSelection(selectedText);
               clipboard.setContents(stringSelection, null);
            }
         }
      });

      pasteItem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            Transferable transferable = clipboard.getContents(TextEditor.this);
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
               try {
                  String text = (String) transferable.getTransferData(DataFlavor.stringFlavor);
                  textArea.replaceSelection(text);
               } catch (UnsupportedFlavorException | IOException ex) {
                  ex.printStackTrace();
               }
            }
         }
      });

      // Impostazione del layout e aggiunta dei componenti al contenitore principale
      setLayout(new BorderLayout());
      add(menuBar, BorderLayout.NORTH);
      add(new JScrollPane(textArea), BorderLayout.CENTER);

      // Impostazione delle dimensioni della finestra
      setSize(800, 600);

      // Impostazione della posizione della finestra al centro dello schermo
      setLocationRelativeTo(null);

      // Impostazione della chiusura della finestra
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {
      TextEditor textEditor = new TextEditor();
      textEditor.setVisible(true);
   }
}