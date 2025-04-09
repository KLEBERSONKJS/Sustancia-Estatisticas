function toggleMenu() {
    const menu = document.getElementById("menu");
    if (menu.style.display === "none" || menu.style.display === "") {
        menu.style.display = "block";  // Exibe o menu
    } else {
        menu.style.display = "none";  // Esconde o menu
    }
}