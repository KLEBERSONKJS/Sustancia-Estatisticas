@import com.ads.sustancia.dto.request.EntrevistadorDTO
@import java.util.List;
@param List<EntrevistadorDTO> entrevistadores = null

@template.layout.main(content = @`

    <div>
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

    @if(entrevistadores!= null && !entrevistadores.isEmpty())
        <div class="cards">
        <!-- Card exemplo -->
        @for(EntrevistadorDTO e: entrevistadores)
            <article class="card">
                <div class="card-header">
                    <img src="/assets/icons/portrait.svg" alt="Entrevistador" class="foto-entrevistador">
                    <div class="info-entrevista">
                        <h4>${e.getNome()}</h4>
                        <p>${e.getEmail()}</p>
                    </div>
                </div>
            </article>

        @endfor
    @endif
    </div>
    </section>

`)
