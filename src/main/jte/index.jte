@import com.ads.sustancia.enums.*
@import com.ads.sustancia.dto.request.FiltroDTO
@import com.ads.sustancia.model.Resposta
@import com.ads.sustancia.dto.response.DadosGraficoDTO
@import java.util.Objects

@param FiltroDTO filtro

@template.layout.main(content = @`
    <div class="filtro-item">
        <label for="raca">Raça/Cor:</label>
        <select id="raca" name="raca">
            <option value="">Todas</option>
            @for (com.ads.sustancia.enums.RacaEnum raca : com.ads.sustancia.enums.RacaEnum.values())
                <option value="${raca.name()}">${raca.name()}</option>
            @endfor
        </select>
    </div>
    <!-- GRÁFICOS embaixo -->
    <div class="graficos-grid">
        <article class="grafico-article">
            <h3 class="grafico-titulo">Você já passou por insegurança alimentar?</h3>
            <canvas id="chart0" class="grafico-canvas"></canvas>
        </article>

        <article class="grafico-article">
            <h3 class="grafico-titulo">Com que frequência você consome frutas?</h3>
            <canvas id="chart1" class="grafico-canvas"></canvas>
        </article>
    </div>
    </section>
    </main>

    <!-- SCRIPTS -->
    <script src="../resources/static/js/menu.js"></script>
    <script src="../resources/static/js/logoff.js"></script>
    <script src="../resources/static/js/chart-utils.js"></script>
    <script src="../resources/static/js/grafico.js"></script>
    <script>
        // Exemplo: criando os gráficos
        document.addEventListener("DOMContentLoaded", () => {
            createPieChart("chart0",
                "Você já passou por insegurança alimentar?",
                ["Sim", "Não"], [42, 58], 0
            );
            createPieChart("chart1",
                "Com que frequência você consome frutas?",
                ["Diariamente", "Raramente", "Nunca"], [60, 25, 15], 1
            );
        });
    </script>
`)