@import com.ads.sustancia.dto.request.EntrevistadorDTO
@import java.util.List;
@param List<EntrevistadorDTO> entrevistadores = null

@template.layout.main(content = @`
<<<<<<< Updated upstream
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
=======
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
>>>>>>> Stashed changes
`)
