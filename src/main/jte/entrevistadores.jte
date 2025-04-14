@import com.ads.sustancia.dto.request.EntrevistadorDTO
@import java.util.List;
@param List<EntrevistadorDTO> entrevistadores = null
@param String error
@param String mensagem
@template.layout.main(content = @`

<section class="entrevistador-container">
    <div class="entrevistadores-formulario-horizontal">
        <h3>Cadastrar Entrevistador</h3>
        @if(error!=null)
        <p style="color:red">${error}</p>
        @endif
        @if(mensagem!=null)
            <p style="color:red">${mensagem}</p>
        @endif
        <form action="/entrevistador/cadastrar" method="post" class="formulario-horizontal">
            <div class="form-group">
                <label for="nome">Nome:</label>
                <input type="text" id="nome" name="nome" required placeholder="Digite o Nome do Entrevistador">
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required placeholder="Digite o email do Entrevistador">
            </div>

            <div class="form-group">
                <label for="senha">Senha:</label>
                <input type="password" id="senha" name="senha" required placeholder="Digite a senha">
            </div>

            <div class="form-group">
                <label for="dataNascimento">Data de Nascimento:</label>
                <input type="date" id="dataNascimento" name="dataNascimento" required>
            </div>

            <button type="submit" class="btn-salvar">Cadastrar Entrevistador</button>
        </form>
    </div>
    
    @if(entrevistadores != null && !entrevistadores.isEmpty())
 <div class="entrevistadores-cards">    
    <div class="cards">
        @for(EntrevistadorDTO e: entrevistadores)
        <article class="card">
            <div class="card-header">
                <img src="/assets/icons/portrait.svg" alt="Entrevistador" class="foto-entrevistador">
                <div class="info-entrevista">
                    <h2>${e.getNome()}</h2>
                    <h1>${e.getEmail()}</h1>
                </div>
            </div>
        </article>
        @endfor
    </div>
</div>
    @endif
</section>

`)