@import com.ads.sustancia.record.LoginDTO
@import com.ads.sustancia.record.CadastroCoordenadorDTO
@import com.ads.sustancia.record.ErrorResponse
@param ErrorResponse error = new ErrorResponse()
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/login.css">
    <title>Login</title>
</head>

<body>
    <div class="conteiner">
        <!-- Formulário de Login -->
        <div class="caixa-de-formulario login">
            <form action="/auth" method="post">
                <h1>Log-in</h1>
                <div class="caixa-de-input">
                    <input type="text" placeholder="Usuário" name="email" id="email" value required>
                    <i class='bx bxs-user'></i>
                </div>
                <div class="caixa-de-input">
                    <input type="password" name="senha" id="senha" placeholder="Senha" required>
                    <i class='bx bxs-lock-alt'></i>
                </div>
                <div class="esqueceu-senha">
                    <a href="esCliente.html">Esqueceu a senha?</a>
                </div>
                <div class="esqueceu-senha">
                </div>
                <button type="submit" class="btn">Login</button>
            </form>
        </div>

        <!-- Formulário de Cadastro -->
        <div class="caixa-de-formulario cadastro">
            <form action="/coordenador/cadastrar" method="post">
                <h1>Cadastre-se</h1>
                <div class="caixa-de-input">
                    <input type="text" placeholder="Usuário" name="nome" id="nome" required>
                    <i class='bx bxs-user'></i>
                </div>
                <div class="caixa-de-input">
                    <input type="email" placeholder="Email" name="email" id="email" required>
                    <i class='bx bxs-envelope'></i>
                </div>
                <div class="caixa-de-input">
                    <input type="password" placeholder="Senha" name="senha" id="senha" required>
                    <i class='bx bxs-lock-alt'></i>
                </div>
                <div class="caixa-de-input">
                    <input type="date" placeholder="Data de Nascimento" name="dataNascimento" id="dataNascimento"
                        required>
                    <i class='bx bxs-lock-alt'></i>
                </div>
                @if (error != null)
                <p>${error.getField()} ${error.getMessage()}</p>
                @endif
                <button type="submit" class="btn">Faça a Diferença!</button>
            </form>
        </div>

        <!-- Painel de Alternância -->
        <div class="toggle-box">
            <div class="toggle-panel toggle-esquerdo">
                <h1>Olá, Bem-Vindo!</h1>
                <p>Não tem uma conta ainda?</p>
                <button class="btn botao-cadastro">Cadastre-se</button>
            </div>

            <div class="toggle-panel toggle-direito">
                <h1>Bem vindo de Volta!</h1>
                <p>Já tem uma conta?</p>
                <button class="btn botao-de-login">Login</button>
            </div>
        </div>
    </div>


    <script>
        const conteiner = document.querySelector('.conteiner');
        const btnCadastro = document.querySelector('.botao-cadastro');
        const btnLogin = document.querySelector('.botao-de-login');

        conteiner.classList.add('ativo');
        btnCadastro.addEventListener('click', () => {
            conteiner.classList.add('ativo');
        });

        btnLogin.addEventListener('click', () => {
            conteiner.classList.remove('ativo');
        });

    </script>
</body>

</html>