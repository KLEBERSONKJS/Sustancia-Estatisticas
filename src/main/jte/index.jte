
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