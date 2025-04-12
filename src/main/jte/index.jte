@import com.ads.sustancia.enums.*
@import com.ads.sustancia.dto.request.FiltroDTO
@import com.ads.sustancia.model.Resposta
@import com.ads.sustancia.dto.response.DadosGraficoDTO
@import java.util.Objects

@param FiltroDTO filtro

@template.layout.main(content = @`

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

`)