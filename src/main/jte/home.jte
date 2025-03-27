<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sustância - Home Page</title>
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@400;500;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/css/home.css">
</head>
<body>
    <nav class="barra-lateral">
        <button class="menu-hamburguer sidebar-close">
            <img src="/assets/icons/menu-burger.svg" alt="Menu Hamburguer">
        </button>
        <div class="logo">
            <img src="/assets/icons/sustancia-logo.svg" alt="Menu">
        </div>
        <ul>
            <li><a href="/home" class="ativo">
                <img src="/assets/icons/botao-home-page.svg" alt="Home">
                Home
            </a></li>
            <li><a href="/relatorio">
                <img src="/assets/icons/botao-visualizar-relatorios.svg" alt="Visualizar Relatórios">
                Visualizar Relatórios
            </a></li>
            <li><a href="/entrevistador">
                <img src="/assets/icons/botao-entrevistadores.svg" alt="Entrevistadores">
                Entrevistadores
            </a></li>
            <li><a href="#botao1">
                <img src="/assets/icons/menu-burger.svg" alt="Visualizar Perfil">
                Perfil
            </a></li>
            <li><a href="#botao2">
                <img src="/assets/icons/menu-burger.svg" alt="Botão">
                Botão
            </a></li>
            <li><a href="#botao3">
                <img src="/assets/icons/menu-burger.svg" alt="Botão">
                Botão
            </a></li>
            <li><a href="#botao4">
                <img src="/assets/icons/menu-burger.svg" alt="Botão">
                Botão
            </a></li>
        </ul>
        <div class="sair">
            <a href="#sair">
                <img src="/assets/icons/botao-sair.svg" alt="Sair">
                Sair
            </a>
        </div>
    </nav>
    <main>
        <header class="cabecalho">
            <button class="menu-hamburguer">
                <img src="/assets/icons/menu-burger.svg" alt="Menu Hamburguer">
            </button>
            <div class="bem-vindo">Olá NOME DO ENTREVISTADOR, Bem-Vindo à Sustância!</div>
            <div class="container-pesquisa">
                <img src="/assets/icons/botao-de-pesquisar.svg" alt="Search Icon">
                <input type="text" placeholder="Pesquise">
            </div>
        </header>
        <section class="conteudo">
            <article>
                <h3>Novos Entrevistados</h3>
                <div class="grafico">321</div>
            </article>
            <article>
                <h3>Lorem</h3>
                <div class="grafico">Gráfico em barras</div>
            </article>
            <article class="tela-inteira">
                <h3>Lorem</h3>
                <div class="grafico">Gráfico de linhas</div>
            </article>
            <article>
                <h3>Horário do dia</h3>
                <div class="grafico">Horário das Entrevistas</div>
            </article>
            <article>
                <div class="perfil">
                    <img src="/assets/icons/botao-entrevistadores.svg" alt="Entrevistador">
                    <div class="info">10 Entrevistas realizadas</div>
                </div>
            </article>
        </section>
    </main>
    <script src="/front/js/home.js"></script>
</body>
</html>
