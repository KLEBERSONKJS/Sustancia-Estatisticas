<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sustância - Home Page</title>
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@400;500;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/css/home.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200&icon_names=menu" />
</head>
<body>
<nav class="barra-lateral">
    <div class="logo">
        <img src="/assets/icons/sustancia-logo.svg" alt="Menu">
    </div>
    <ul>
        <li><a href="/home">
                <i class='bx bxs-home-circle' alt="Home Page"></i>
                Home
            </a></li>
        <li><a href="/relatorio">
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
            <img src="/assets/icons/botao-sair.svg" alt="Sair">
            Sair
        </a>
    </div>
</nav>

<script src="/js/home.js">
    function clickMenu {
        if(barra-lateral.style.display == 'block') {
        barra-lateral.style.display = 'none'
        } else {
            barra-lateral.style.display = 'block'
        }
    }
</script>
</body>
</html>
