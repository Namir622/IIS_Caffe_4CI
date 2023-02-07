import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainSceneController {

    @FXML
    private TextField TtTitle;

    @FXML
    void btnOKClicked(ActionEvent event) {
        Stage mainWindow = (Stage) TtTitle.getScene().getWindow();
        String title = TtTitle.getText();
        mainWindow.setTitle(title);
    }

}
