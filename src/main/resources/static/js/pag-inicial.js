// Rolagem suave ao clicar nos links do menu
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener("click", function(e) {
        e.preventDefault();
        const target = document.querySelector(this.getAttribute("href"));
        if (target) {
            window.scrollTo({
                top: target.offsetTop - 50,
                behavior: "smooth"
            });
        }
    });
});

// Rolagem suave ao clicar nos links do menu
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener("click", function(e) {
        e.preventDefault();
        const target = document.querySelector(this.getAttribute("href"));
        if (target) {
            window.scrollTo({
                top: target.offsetTop - 50,
                behavior: "smooth"
            });
        }
    });
});


    // === Carrossel de imagens sincronizado com palavras ===
    const imagens = document.querySelectorAll('.imagem-carrossel');
    let indiceAtual = 0;
    const totalSlides = imagens.length;
    const tempoSlide = 2000; // 2s por palavra

    function atualizarImagem() {
        imagens.forEach((img, i) => {
            img.classList.toggle('ativo', i === indiceAtual);
        });
        indiceAtual = (indiceAtual + 1) % totalSlides;
    }

    if (imagens.length > 0) {
        atualizarImagem(); // Inicializa
        setInterval(atualizarImagem, tempoSlide);
    }

