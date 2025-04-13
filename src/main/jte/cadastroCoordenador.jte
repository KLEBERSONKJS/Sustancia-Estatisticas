
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/login.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <title>Login</title>
</head>

<body>
<div class="conteiner">
    <!-- Formulário de Login -->
    <div class="caixa-de-formulario login">
        <form action="/coordenador/cadastrar" method="post">
            <h1>Log-in</h1>
            <div class="caixa-de-input">
                <input type="text" name="nome" required>
                <i class='bx bxs-user'></i>
            </div>
            <div class="caixa-de-input">
                <input type="email" name="email" required>
                <i class='bx bxs-user'></i>
            </div>
            <div class="caixa-de-input">
                <input type="password" name="senha" required>
                <i class='bx bxs-lock-alt'></i>
            </div>
            <button type="submit" class="btn">Login</button>
        </form>
    </div>

</div>


</body>

</html>