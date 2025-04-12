@import com.ads.sustancia.enums.*
@import com.ads.sustancia.dto.request.FiltroDTO
@import com.ads.sustancia.model.Resposta
@import com.ads.sustancia.dto.response.DadosGraficoDTO
@import java.util.Objects

@param FiltroDTO filtro

@template.layout.main(content = @`


<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Relatório de Insegurança Alimentar</title>
    <link rel="stylesheet" href="../resources/static/css/relatorio.css">
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>

<body>
    <main class="pagina-relatorio">
        <h1 class="titulo-pagina">Filtros Avançados</h1>

        <form action="/relatorio" method="get" class="formulario-filtros">
            <fieldset class="filtros filtro-container">
                <legend class="filtros-legenda">Filtrar por:</legend>
                <div class="filtros-grid">

                    <div class="filtro-item">
                        <label for="raca">Raça/Cor:</label>
                        <select id="raca" name="raca">
                            <option value="">Todas</option>
                            @for (RacaEnum raca : RacaEnum.values())
                                <option value="${raca.name()}">${filtro != null && Objects.equals(filtro.raca(), raca) ? "selected" : ""}</option>
                            @endfor
                        </select>
                    </div>
                    <!-- Repita para todos os outros filtros -->

                </div>

                <div class="botoes-form">
                    <button type="submit" class="botao botao-principal">Gerar Relatório</button>
                </div>
            </fieldset>
        </form>

        <section class="graficos-secao">
            <h2 class="graficos-titulo">Resultados dos Gráficos</h2>

            <article class="grafico-article">
                <h3 class="grafico-titulo">Você já passou por insegurança alimentar?</h3>
                <canvas id="chart0" class="grafico-canvas"></canvas>
            </article>

            <article class="grafico-article">
                <h3 class="grafico-titulo">Com que frequência você consome frutas?</h3>
                <canvas id="chart1" class="grafico-canvas"></canvas>
            </article>

            <p class="mensagem-vazia" style="display: none;">Nenhum dado disponível para exibir.</p>
        </section>
    </main>

    <script>
        function createPieChart(canvasId, title, labels, data, index = 0) {
            const ctx = document.getElementById(canvasId).getContext('2d');

            const baseColors = [
                '#36A2EB', '#FF6384', '#FFCE56', '#4BC0C0', '#9966FF',
                '#FF9F40', '#8AC24A', '#607D8B', '#E91E63', '#9C27B0'
            ];

            const rotatedColors = [...baseColors.slice(index % baseColors.length), ...baseColors.slice(0, index % baseColors.length)];

            new Chart(ctx, {
                type: 'pie',
                data: {
                    labels: labels,
                    datasets: [{
                        data: data,
                        backgroundColor: rotatedColors,
                        hoverOffset: 20
                    }]
                },
                options: {
                    responsive: true,
                    plugins: {
                        title: {
                            display: true,
                            text: title,
                            font: {
                                size: 18,
                                weight: 'bold'
                            },
                            padding: {
                                top: 10,
                                bottom: 20
                            }
                        },
                        tooltip: {
                            callbacks: {
                                label: function(context) {
                                    const total = context.dataset.data.reduce((a, b) => a + b, 0);
                                    const percentage = total > 0 ? Math.round(context.raw * 100 / total) : 0;
                                    return `${context.label}: ${context.raw} (${percentage}%)`;
                                }
                            }
                        }
                    }
                }
            });
        }

        document.addEventListener("DOMContentLoaded", () => {
            const chart0Data = {
                labels: ["Sim", "Não"],
                data: [${model.get("inseguranca_alimentar_sim")}, ${model.get("inseguranca_alimentar_nao")}]
            };

            const chart1Data = {
                labels: ["Diariamente", "Raramente", "Nunca"],
                data: [${model.get("consumo_frutas_diariamente")}, ${model.get("consumo_frutas_raramente")}, ${model.get("consumo_frutas_nunca")}]
            };

            createPieChart("chart0", "Você já passou por insegurança alimentar?", chart0Data.labels, chart0Data.data, 0);
            createPieChart("chart1", "Com que frequência você consome frutas?", chart1Data.labels, chart1Data.data, 1);
        });
    </script>

`)