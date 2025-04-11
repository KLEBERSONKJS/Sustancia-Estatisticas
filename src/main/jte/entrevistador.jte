@import com.ads.sustancia.dto.request.EntrevistadorDTO
@param String mensagem
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sustância - Visualizar Relatórios</title>
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@400;500;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/css/entrevistador.css">
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
            <li><a href="/home" >
                <i class='bx bxs-home-circle' alt="Home Page"></i>
                Home
            </a></li>
            <li><a href="/relatorio" >
                <i class='bx bxs-network-chart'alt="Visualizar Relatórios"></i>
                Visualizar Relatórios
            </a></li>
            <li><a href="/entrevistador" class="ativo">
                <i class='bx bxs-user-badge' alt = "Entrevistadores"></i>
                Entrevistadores
            </a></li>
            <li><a href="#perfil">
                <i class='bx bxs-user-detail' alt = "Editar Perfil"></i>
                Perfil
            </a></li>
            <li><a href="#visualizar-graficos">
                <i class='bx bxs-pie-chart-alt-2' alt = "Editar Perfil"></i>
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

                    <div class="card-acoes">
                        <form method="get" action="/entrevistador/editar/1">
                            <button type="submit" class="btn-editar">Editar</button>
                        </form>
                        <form method="post" action="/entrevistador/excluir/1">
                            <button type="submit" class="btn-excluir">Excluir</button>
                        </form>
                    </div>


                </article>
                <!-- Repetir o card conforme necessário -->
            </div>
        </section>

<section class="conteudo">
  <!-- Formulário estilizado dentro de um card -->
  <div class="form-card">
      @if(mensagem!= null)
          <p>${mensagem}</p>
      @endif
    <h3>Cadastrar Entrevistador</h3>
 <form method="post" action="/entrevistador/cadastrar">
  <input type="hidden" id="entrevistador-id" name="id">

  <div class="form-group">
    <label for="nome">Nome</label>
    <input type="text" id="nome" name="nome" placeholder="Digite o nome" required>
  </div>

  <div class="form-group">
    <label for="email">Email</label>
    <input type="email" id="email" name="email" placeholder="Digite o email" required>
  </div>

  <div class="form-group">
    <label for="senha">Senha</label>
    <input type="password" id="senha" name="senha" placeholder="Digite a senha" required>
  </div>


  <div class="form-group">
    <label for="dataNascimento">Data de Nascimento</label>
    <input type="date" id="dataNascimento" name="dataNascimento" required>
  </div>

  <button type="submit" class="btn-salvar">Salvar</button>
</form>

  </div>

  <div class="cards" id="cards-container">
    <!-- Cards dos entrevistadores serão adicionados aqui via JavaScript -->
  </div>
</section>



    </main>



</body>
</html>
