@import com.ads.sustancia.record.CadastroCoordenadorDTO
@import com.ads.sustancia.record.ErrorResponse
@param ErrorResponse error = new ErrorResponse()
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/cadastro.css">
    <title>Cadastro</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>

<body>
    <div class="page">
        <main class="container">
            <form action="/coordenador/cadastrar" method="post">
                <button type="button" class="voltar" onclick="window.location.href='login.html'">
                    <i class="fas fa-arrow-left"></i>
                </button>

                <h1>Cadastro</h1>

                <div class="input-box">
                    <input id="nome" placeholder="Nome Completo" type="text" required>
                </div>
                <div class="input-box">
                    <input id="email" placeholder="Email" type="email" required>
                </div>
                <div class="input-box">
                    <input id="senha" placeholder="Senha" type="password" required>
                </div>
                <div class="input-box">
                    <input placeholder="Confirmar Senha" type="password">
                </div>
                <button type="submit">Cadastrar</button>
            </form>
        </main>
        @if(error!=null)
            <script>
                alert("")
            </script>
        @endif
    </div>
</body>

</html>
