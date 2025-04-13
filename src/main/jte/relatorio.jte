@import com.ads.sustancia.enums.*
@import com.ads.sustancia.dto.request.FiltroDTO
@import com.ads.sustancia.model.Resposta
@import com.ads.sustancia.dto.response.DadosGraficoDTO
@import java.util.Objects
@import com.ads.sustancia.model.Resposta
@import java.util.List;


@param FiltroDTO filtro
@param DadosGraficoDTO refeicaoPCelular
@param DadosGraficoDTO refeicoes
@param DadosGraficoDTO consumoOntem
@param List<DadosGraficoDTO> inseguracaAlimentarList = null



    @template.layout.main(content = @`
        <section class=" container-relatorio">

        <!-- FILTROS no topo, horizontal -->
        <form action="/relatorio" method="get" class="filtros-horizontal">
            <!-- Legenda opcional (se quiser manter <fieldset> + <legend> também funciona) -->

            <div class="filtro-item">
                <label for="raca">Raça/Cor:</label>
                <select id="raca" name="raca">
                    <option value="">Todas</option>
                    @for (RacaEnum raca : RacaEnum.values())
                    <option value="${raca.name()}">${raca.name()}</option>
                    @endfor
                </select>
            </div>

            <div class="filtro-item">
                <label for="religiao">Religião:</label>
                <select id="religiao" name="religiao">
                    <option value="">Todas</option>
                    @for (ReligiaoEnum religiao : ReligiaoEnum.values())
                    <option value="${religiao.name()}">${religiao.name()}</option>
                    @endfor
                </select>
            </div>

            <div class="filtro-item">
                <label for="genero">Gênero:</label>
                <select id="genero" name="genero">
                    <option value="">Todos</option>
                    @for (GeneroEnum genero : GeneroEnum.values())
                    <option value="${genero.name()}">${genero.name()}</option>
                    @endfor
                </select>
            </div>

            <div class="filtro-item">
                <label for="escolaridade">Escolaridade:</label>
                <select id="escolaridade" name="escolaridade">
                    <option value="">Todas</option>
                    @for (EscolaridadeEnum escolaridade : EscolaridadeEnum.values())
                    <option value="${escolaridade.name()}">${escolaridade.name()}</option>
                    @endfor
                </select>
            </div>

            <div class="filtro-item">
                <label for="estadoCivil">Estado Civil:</label>
                <select id="estadoCivil" name="estadoCivil">
                    <option value="">Todos</option>
                    @for (EstadoCivilEnum estadoCivil : EstadoCivilEnum.values())
                    <option value="${estadoCivil.name()}">${estadoCivil.name()}</option>
                    @endfor
                </select>
            </div>

            <div class="filtro-item">
                <label for="emprego">Situação de Emprego:</label>
                <select id="emprego" name="emprego">
                    <option value="">Todas</option>
                    @for (EmpregoEnum emprego : EmpregoEnum.values())
                    <option value="${emprego.name()}">${emprego.name()}</option>
                    @endfor
                </select>
            </div>

            <div class="filtro-item">
                <label for="dependentes">Número de Dependentes:</label>
                <select id="dependentes" name="dependentes">
                    <option value="">Todos</option>
                    @for (DependentesEnum dependentes : DependentesEnum.values())
                    <option value="${dependentes.name()}">${dependentes.name()}</option>
                    @endfor
                </select>
            </div>

            <div class="filtro-item">
                <label for="auxilio">Auxílio do Governo:</label>
                <select id="auxilio" name="auxilio">
                    <option value="">Todos</option>
                    @for (AuxilioEnum auxilio : AuxilioEnum.values())
                    <option value="${auxilio.name()}">${auxilio.name()}</option>
                    @endfor
                </select>
            </div>

            <button type="submit" class="botao botao-principal">Gerar Relatório</button>
        </form>

        <!-- GRÁFICOS embaixo -->
        <div class="graficos-grid">
            <article class="grafico-article">
                <h3 class="grafico-titulo">${refeicaoPCelular.getPergunta()}</h3>
                <canvas id="${refeicaoPCelular.hashCode()}" class="grafico-canvas"></canvas>
            </article>

            <article class="grafico-article">
                <h3 class="grafico-titulo">${refeicoes.getPergunta()}</h3>
                <canvas id="${refeicoes.hashCode()}" class="grafico-canvas"></canvas>
            </article>

            <article class="grafico-article">
                <h3 class="grafico-titulo">${consumoOntem.getPergunta()}</h3>
                <canvas id="${consumoOntem.hashCode()}" class="grafico-canvas"></canvas>
            </article>

            @for(DadosGraficoDTO d: inseguracaAlimentarList)
            <article class="grafico-article">
                <h3 class="grafico-titulo">${d.getPergunta()}</h3>
                <canvas id="${d.hashCode()}" class="grafico-canvas"></canvas>
            </article>
            @endfor

        </div>

        </section>
        </section>
        </main>
        `)

        <!-- SCRIPTS -->
        <script src="/js/menu.js"></script>
        <script src="/js/logoff.js"></script>
        <script src="/js/chart-utils.js"></script>
        <script src="/js/grafico.js"></script>
        <script>
            // Exemplo: criando os gráficos
            document.addEventListener("DOMContentLoaded", () => {
                createPieChart("${refeicaoPCelular.hashCode()}",
                    "",
                    [@for (Resposta r: refeicaoPCelular.getRespostas())
            "${r.getCampo().replace("NAOSABE", "NÃO SABE").replace("NAO", "NÃO")}",
                @endfor], [@for (Resposta r: refeicaoPCelular.getRespostas())
            ${r.getValor()},
                @endfor], 0
        );

            createPieChart("${refeicoes.hashCode()}",
                "",
                [@for (Resposta r: refeicoes.getRespostas())
            "${r.getCampo().replace("_", " ").replace("ALMOCO", "ALMOÇO").replace("CAFE DA MANHA" ,"CAFÉ DA MANHÃ").replace("LANCHE DA MANHA" ,"LANCHE DA MANHÃ")}",
                @endfor], [@for (Resposta r: refeicoes.getRespostas())
            ${r.getValor()},
                @endfor], 0
        );

            createPieChart("${consumoOntem.hashCode()}",
                "${consumoOntem.getPergunta()}",
                [@for (Resposta r: consumoOntem.getRespostas())
            "${r.getCampo().replace("_", " ").replace("BEBIDAS ADOCADAS", "BEBIDAS ADOÇADAS").replace("FEIJAO", "FEIJÃO")}",
                @endfor], [@for (Resposta r: consumoOntem.getRespostas())
        ${r.getValor()},
            @endfor], 0
        );

            @for (DadosGraficoDTO d: inseguracaAlimentarList)
            createPieChart("${d.hashCode()}",
                "",
                [@for (Resposta r: d.getRespostas())
            "${r.getCampo().replace("NAOSABE", "NÃO SABE").replace("NAO", "NÃO")}",
                @endfor], [@for (Resposta r: d.getRespostas())
        ${r.getValor()},
            @endfor], 0
        );
            @endfor

    });




        </script>