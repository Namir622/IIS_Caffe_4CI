// Creiamo una funzione che mostra o nasconde il menu
function toggleMenu() {
  // Otteniamo l'elemento del menu dal nostro documento HTML
  var menu = document.getElementById("menu");

  // Se il menu è nascosto, mostralo e cambia il testo del pulsante
  if (menu.style.display === "none") {
    menu.style.display = "block";
    button.innerHTML = "Chiudi il menu";
  } else { // Altrimenti, nascondi il menu e cambia il testo del pulsante
    menu.style.display = "none";
    button.innerHTML = "Apri il menu";
  }
}

// Creiamo un pulsante per aprire e chiudere il menu
var button = document.createElement("button");
button.innerHTML = "Apri il menu";

// Assegniamo all'elemento del pulsante l'azione di chiamare la funzione toggleMenu quando viene cliccato
button.addEventListener ("click", toggleMenu);

// Aggiungiamo il pulsante al nostro documento HTML
document.body.appendChild(button);
