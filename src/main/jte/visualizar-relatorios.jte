<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sustância - Visualizar Relatórios</title>
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@400;500;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/css/visualizar-relatorios.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
<nav class="barra-lateral">
    <button class="menu-hamburguer sidebar-close">
        <img src="/assets/icons/menu-burger.svg" alt="Menu Hamburguer">
    </button>
    <div class="logo">
        <img src="/assets/icons/sustancia-logo.svg" alt="Logo Sustância">
    </div>
    <ul>
        <li><a href="/home">
                <i class='bx bxs-home-circle' alt="Home Page"></i>
                Home
            </a></li>
        <li><a href="/relatorio" class="ativo">
                <i class='bx bxs-network-chart' alt="Visualizar Relatórios"></i>
                Visualizar Relatórios
            </a></li>
        <li><a href="/entrevistador">
                <i class='bx bxs-user-badge' alt="Entrevistadores"></i>
                Entrevistadores
            </a></li>
        <li><a href="#perfil">
                <i class='bx bxs-user-detail' alt="Editar Perfil"></i>
                Perfil
            </a></li>
        <li><a href="#graficos">
                <i class='bx bxs-pie-chart-alt-2' alt="Editar Perfil"></i>
                Graficos
            </a></li>
    </ul>
    <div class="sair">
        <a href="#sair">
            <i class='bx bxs-exit' alt="Sair"></i>
            Sair
        </a>
    </div>
</nav>
<main>
    <header class="cabecalho">
        <button class="menu-hamburguer">
            <i class='bx bx-menu' alt="Abrir Barra Lateral"></i>
        </button>
        <div class="container-pesquisa">
            <i class='bx bx-search-alt' alt="Pesquisar"></i>
            <input type="text" placeholder="Pesquise">
        </div>
    </header>
    <section class="conteudo">
        <div class="cards">
            <!-- Card exemplo -->
            <article class="card">
                <div class="card-header">
                    <img src="/assets/icons/portrait.svg" alt="Entrevistador" class="foto-entrevistador">
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
