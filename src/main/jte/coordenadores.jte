@import com.ads.sustancia.dto.request.CoordenadorDTO
@import java.util.List;
@param List<CoordenadorDTO> coordenadores = null
@param String error
@param String mensagem
@template.layout.main(content = @`

<section class="entrevistador-container">
    <div class="entrevistadores-formulario-horizontal">
        <h3>Cadastrar Coordenador</h3>
        @if(error!=null)
            <p style="color:red">${error}</p>
        @endif
        @if(mensagem!=null)
            <p id="msg" style="color:red; transition: opacity 0.5s ease;">${mensagem}</p>
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
                <label for="cpf">CPF:</label>
                <input type="text" id="cpf" name="cpf"
                       placeholder="ex:000.000.000-00"
                       pattern="\d{3}\.\d{3}\.\d{3}-\d{2}"
                       title="Digite o CPF no formato 000.000.000-00">
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

    <div class="card-busca">
        <form action="/coordenador/buscar" method="get" style="margin: 30px 0;">
            <h3>Buscar por Nome</h3>
            <input type="text" name="nome" placeholder="Buscar por nome" style="padding: 5px; width: 250px;">
            <button type="submit" class="btn-salvar" style="padding: 5px 10px;">Buscar</button>
        </form>

        <form action="/coordenador/buscarPorCpf" method="get" style="margin: 30px 0;">
            <h3>Buscar por CPF</h3>
            <input type="text" name="cpf" placeholder="Buscar por CPF (ex: 000.000.000-00)"
                   style="padding: 5px; width: 250px;"
                   pattern="\d{3}\.\d{3}\.\d{3}-\d{2}"
                   title="Digite o CPF no formato 000.000.000-00">
            <button type="submit" class="btn-salvar" style="padding: 5px 10px;">Buscar</button>
        </form>
    </div>

    @if(coordenadores != null && !coordenadores.isEmpty())
    <div class="entrevistadores-cards">
        <div class="cards">
            @for(CoordenadorDTO c : coordenadores)
            <article class="card">
                <div class="card-header">
                    <img src="/assets/icons/portrait.svg" alt="Coordenador" class="foto-entrevistador">
                        <div class="info-entrevista">

                            <div id="view-${c.getId()}" class="view-mode">
                                <h2>${c.getNome()}</h2>
                                <p>Email: ${c.getEmail()}</p>
                                <p>CPF: ${c.getCpf()}</p>
                                @if(c.getDataNascimento() != null)
                                    <p>Data de Nascimento: ${c.getDataNascimento().toString()}</p>
                                @endif

                                <div class="secao-edit">
                                    <button class="btn-editar" onclick="toggleEdit('${c.getId()}')">✏️ Editar</button>
                                    <a href="/coordenador/delete?id=${c.getId()}" class="btn-excluir" onclick="return confirm('Tem certeza que deseja excluir?')">
                                        🗑️ Excluir
                                    </a>
                                </div>
                            </div>

                            <div id="edit-${c.getId()}" class="edit-mode" style="display: none;">
                                <form action="/coordenador/atualizar" method="post" class="form-editar">
                                    <input type="hidden" name="id" value="${c.getId()}">
                                    <label>Nome:</label>
                                    <input type="text" name="nome" value="${c.getNome()}" required>
                                    <label>Email:</label>
                                    <input type="email" name="email" value="${c.getEmail()}" required>
                                    <label>Senha:</label>
                                    <input type="password" name="senha" placeholder="Digite a nova senha">
                                    <label>CPF:</label>
                                    <input type="text" name="cpf" value="${c.getCpf()}" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" required>
                                    <label>Data de Nascimento:</label>
                                    <input type="date" name="dataNascimento" value="${c.getDataNascimento() != null ? c.getDataNascimento().toString().substring(0, 10) : ""}" required>
                                    <button type="submit">💾 Salvar</button>
                                    <button type="button" onclick="toggleEdit('${c.getId()}')">❌ Cancelar</button>
                                </form>
                            </div>
                        </div>
                    </div>
            </article>
            @endfor
        </div>
    </div>
    @endif
    <script src="/js/editar-card.js"></script>
    <script src="/js/fade-msg.js"></script>
</section>

`)