@import com.ads.sustancia.enums.*
@import com.ads.sustancia.dto.request.FiltroDTO
@import com.ads.sustancia.model.Resposta
@import com.ads.sustancia.dto.response.DadosGraficoDTO
@import java.util.Objects
@import java.util.List;

@param FiltroDTO filtro
@param List<DadosGraficoDTO> inseguracaAlimentarList = null
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

                    </div>

                    <div class="botoes-form">
                        <button type="submit" class="botao botao-principal">Gerar Relatório</button>
                    </div>
                </fieldset>
            </form>

            <section class="graficos-secao">
                <h2 class="graficos-titulo">Resultados dos Gráficos</h2>

                @if (inseguracaAlimentarList != null && !inseguracaAlimentarList.isEmpty())
                @for (DadosGraficoDTO d : inseguracaAlimentarList)
                @if (d != null)
                <article class="grafico-article">
                    <h3 class="grafico-titulo">${d.getPergunta()}</h3>
                    <canvas id="chart${inseguracaAlimentarList.indexOf(d)}" class="grafico-canvas"></canvas>
                </article>
                @endif
                @endfor

                <script>
                    @for (DadosGraficoDTO d : inseguracaAlimentarList)
                    @if (d != null)
                        const ctx${ inseguracaAlimentarList.indexOf(d)} = document.getElementById('chart${inseguracaAlimentarList.indexOf(d)}').getContext('2d');
                    new Chart(ctx${ inseguracaAlimentarList.indexOf(d) }, {
                        type: 'pie',
                        data: {
                            labels: [
                                @for(Resposta resposta: d.getRespostas())
                    "${resposta.getCampo()}"@if (!resposta.equals(d.getRespostas().get(d.getRespostas().size() - 1))), @endif
                    @endfor
                                    ],
                    datasets: [{
                        data: [
                            @for(Resposta resposta: d.getRespostas())
                        ${ resposta.getValor() }@if (!resposta.equals(d.getRespostas().get(d.getRespostas().size() - 1))), @endif
                        @endfor
                                        ],
                    backgroundColor: [
                        '#36A2EB', '#FF6384', '#FFCE56', '#4BC0C0', '#9966FF',
                        '#FF9F40', '#8AC24A', '#607D8B', '#E91E63', '#9C27B0'
                    ],
                        hoverOffset: 20
                                    }]
                                },
                    options: {
                        responsive: true,
                            plugins: {
                            title: {
                                display: true,
                                    text: '${d.getDescricao()}',
                                        font: { size: 18, weight: 'bold' },
                                padding: { top: 10, bottom: 20 }
                            },
                            tooltip: {
                                callbacks: {
                                    label: function(context) {
                                        const total = context.dataset.data.reduce((a, b) => a + b, 0);
                                        const percentage = Math.round(context.raw * 100 / total);
                                        return context.label + ': ' + context.raw + ' (' + percentage + '%)';
                                    }
                                }
                            }
                        }
                    }
                            });
                    @endif
                    @endfor
                </script>
                @else
                <p class="mensagem-vazia">Nenhum dado disponível para exibir.</p>
                @endif
            </section>
        </main>
    </body>

    </html>