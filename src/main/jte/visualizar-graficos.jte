<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sustância - Visualizar Graficos</title>
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@400;500;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../resources/static/css/visualizar-graficos.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
    <nav class="barra-lateral">
        <button class="menu-hamburguer sidebar-close">
            <img src="../resources/static/assets/icons/menu-burger.svg" alt="Menu Hamburguer">
        </button>
        <div class="logo">
            <img src="../resources/static/assets/icons/sustancia-logo.svg" alt="Logo Sustância">
        </div>
        <ul>
            <li><a href="home.html" target=_self>
                <i class='bx bxs-home-circle' alt="Home Page"></i>
                Home
            </a></li>
            <li><a href="visualizar-relatorios.html" class="ativo" target=_self>
                <i class='bx bxs-network-chart' alt="Visualizar Relatórios"></i>
                Visualizar Relatórios
            </a></li>
            <li><a href="cadastro-entrevistador.html" target=_self>
                <i class='bx bxs-user-badge' alt="Entrevistadores"></i>
                Entrevistadores
            </a></li>
            <li><a href="#perfil" target=_self>
                <i class='bx bxs-user-detail' alt="Editar Perfil"></i>
                Perfil
            </a></li>
            <li><a href="visualizar-graficos.jte" target=_self>
                <i class='bx bxs-pie-chart-alt-2' alt="Editar Perfil"></i>
                Graficos
            </a></li>
        </ul>
        <div class="sair">
            <a href="login-administrador.html" target=_self>
                <i class='bx bxs-exit' alt="Sair"></i>
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
                <i class='bx bx-search-alt' alt="Pesquisar"></i>
                <select multiple>
                    <option value="homem">Homem</option>
                    <option value="3-filhos">3 Filhos</option>
                    <option value="pensionista">Pensionista</option>
                    <!-- Adicione mais opções conforme necessário -->
                </select>
            </div>
            <button class="filtrar">Filtrar</button>
        </header>
        <section class="conteudo">
            <article>
                <h3>Gráfico 1</h3>
                <div class="grafico">321</div>
            </article>
            <article>
                <h3>Gráfico 2</h3>
                <div class="grafico">Gráfico em barras</div>
            </article>
            <article>
                <h3>Gráfico 3</h3>
                <div class="grafico">Gráfico de linhas</div>
            </article>
            <article>
                <h3>Gráfico 4</h3>
                <div class="grafico">Horário das Entrevistas</div>
            </article>
            <article>
                <h3>Gráfico 5</h3>
                <div class="perfil">
                    <img src="/front/assets/icons/botao-entrevistadores.svg" alt="Entrevistador">
                    <div class="info">10 Entrevistas realizadas</div>
                </div>
            </article>
        </section>
    </main>
    <script>
        document.addEventListener('DOMContentLoaded', function() {
            // Seleciona os elementos do menu-hamburguer e a barra lateral
            const menuHamburguer = document.querySelectorAll('.menu-hamburguer');
            const barraLateral = document.querySelector('.barra-lateral');
    
            menuHamburguer.forEach(botao => {
                botao.addEventListener('click', () => {
                    barraLateral.classList.toggle('ativa'); // Adiciona ou remove a classe "ativa"
                });
            });
        });
    </script>
</body>
</html>
