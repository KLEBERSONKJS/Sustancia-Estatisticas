@import com.ads.sustancia.dto.request.CoordenadorDTO
@import java.util.List;
@param List<CoordenadorDTO> coordenadores = null
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
        <form action="/coordenador/cadastrar" method="post" class="formulario-horizontal">
            <div class="form-group">
                <label for="nome">Nome:</label>
                <input type="text" id="nome" name="nome" required placeholder="Digite o Nome do Coordenador">
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required placeholder="Digite o email do Coordenador">
            </div>

            <div class="form-group">
                <label for="senha">Senha:</label>
                <input type="password" id="senha" name="senha" required placeholder="Digite a senha">
            </div>

            <div class="form-group">
                <label for="dataNascimento">Data de Nascimento:</label>
                <input type="date" id="dataNascimento" name="dataNascimento" required>
            </div>

            <button type="submit" class="btn-salvar">Cadastrar Coordenador</button>
        </form>
    </div>

    @if(coordenadores!= null && !coordenadores.isEmpty())
<div class="entrevistadores-cards"> 
    <div class="cards">
        @for(CoordenadorDTO c: coordenadores)
            <article class="card">
                <div class="card-header">
                    <img src="/assets/icons/portrait.svg" alt="Coordenador" class="foto-entrevistador">
                    <div class="info-entrevista">
                        <h4>${c.getNome()}</h4>
                        <p>${c.getEmail()}</p>
                </div>
            </div>
        </article>
        @endfor
    </div>
</div>
    @endif
</section>

`)