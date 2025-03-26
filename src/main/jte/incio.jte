<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../resources/static/css/home.css">
    <title>Dashboard</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>
</head>

<body>
    <header>
        <button class="menu-toggle" onclick="toggleMenu()"><img src="../imagens/cardapio.png" alt=""></button>
        <h1>SUSTÂNCIA</h1>
        <p>| Software Estatístico</p>
    </header>

    <div class="flexV">
            <nav id="menu" class="menu">
                
                <ul>
                    <a href="#">
                        <div class="options">Inicio</div>
                    </a>
                    <a href="#">
                        <div class="options">Relatórios</div>
                    </a>
                    <a href="#">
                        <div class="options">Equipe</div>
                    </a>
                    <a href="#">
                        <div class="options">Configurações</div>
                    </a>
                    
                </ul>

            </nav>
        <main class="dashboard">
            <canvas class="line-chart"></canvas>
        </main>
    </div>

    <script src="../js/home.js"></script>
    <script src="../js/incio.js"></script>
</body>
</html> 