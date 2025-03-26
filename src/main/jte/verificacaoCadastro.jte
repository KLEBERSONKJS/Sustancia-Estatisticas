@import com.ads.sustancia.record.VerificacaoCadastroDTO
@param String email

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/login.css">
    <title>Verificar Cadastro</title>
</head>

<body>
    <div class="conteiner">
        <!-- Formulário de Verificacao -->
        <div class="caixa-de-formulario login">
            <form action="/coordenador/verificar-codigo" method="post">
                <h1>Verificação</h1>
                <div class="caixa-de-input">
                    <input type="text" placeholder="Código" name="codigo" id="codigo" required>
                    <input type="hidden" name="email" id="email" value="${email}">
                    <i class='bx bxs-user'></i>
                </div>
                <button type="submit" class="btn">Verificar</button>
            </form>
        </div>
    </div> 

    <script>
        const conteiner = document.querySelector('.conteiner');
        const btnCadastro = document.querySelector('.botao-cadastro');
        const btnLogin = document.querySelector('.botao-de-login');

        btnCadastro.addEventListener('click', () => {
            conteiner.classList.add('ativo');
        });

        btnLogin.addEventListener('click', () => {
            conteiner.classList.remove('ativo');
        });
    </script>
</body>

</html>