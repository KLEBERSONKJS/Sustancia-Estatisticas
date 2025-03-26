<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sustância - Visualizar Relatórios</title>
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@400;500;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../css/visualizar-relatorios.css">
</head>
<body>
    <nav class="barra-lateral">
        <button class="menu-hamburguer sidebar-close">
            <img src="/front/assets/icons/menu-burger.svg" alt="Menu Hamburguer">
        </button>
        <div class="logo">
            <img src="/front/assets/icons/sustancia-logo.svg" alt="Logo Sustância">
        </div>
        <ul>
            <li><a href="#home">
                <img src="/front/assets/icons/botao-home-page.svg" alt="Home">
                Home
            </a></li>
            <li><a href="#relatorios" class="ativo">
                <img src="/front/assets/icons/botao-visualizar-relatorios.svg" alt="Visualizar Relatórios">
                Visualizar Relatórios
            </a></li>
            <li><a href="#entrevistadores">
                <img src="/front/assets/icons/botao-entrevistadores.svg" alt="Entrevistadores">
                Entrevistadores
            </a></li>
            <li><a href="#botao1">
                <img src="/front/assets/icons/menu-burger.svg" alt="Botão">
                Botão
            </a></li>
            <li><a href="#botao2">
                <img src="/front/assets/icons/menu-burger.svg" alt="Botão">
                Botão
            </a></li>
            <li><a href="#botao3">
                <img src="/front/assets/icons/menu-burger.svg" alt="Botão">
                Botão
            </a></li>
            <li><a href="#botao4">
                <img src="/front/assets/icons/menu-burger.svg" alt="Botão">
                Botão
            </a></li>
        </ul>
        <div class="sair">
            <a href="#sair">
                <img src="/front/assets/icons/botao-sair.svg" alt="Sair">
                Sair
            </a>
        </div>
    </nav>
    <main>
        <header class="cabecalho">
            <button class="menu-hamburguer">
                <img src="/front/assets/icons/menu-burger.svg" alt="Menu Hamburguer">
            </button>
            <div class="container-pesquisa">
                <img src="/front/assets/icons/botao-de-pesquisar.svg" alt="Search Icon">
                <input type="text" placeholder="Pesquise">
            </div>
        </header>
        <section class="conteudo">
            <div class="cards">
                <!-- Card exemplo -->
                <article class="card">
                    <div class="card-header">
                        <img src="/front/assets/icons/portrait.svg" alt="Entrevistador" class="foto-entrevistador">
                        <div class="info-entrevista">
                            <h4>Nome do Entrevistador</h4>
                            <p>Data: 01/01/2023</p>
                        </div>
                    </div>
                    <div class="card-footer">
                        <button class="btn-filtro">#18-23</button>
                        <button class="btn-filtro">#pardos</button>
                        <button class="btn-filtro">#outro-filtro</button>
                    </div>
                </article>
                <!-- Repetir o card conforme necessário -->
            </div>
        </section>
    </main>
    <script src="/front/js/visualizar-relatorios.js"></script>
</body>
</html>
