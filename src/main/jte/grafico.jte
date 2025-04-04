@import com.ads.sustancia.enums.*
@import com.ads.sustancia.dto.request.FiltroDTO
@import com.ads.sustancia.model.Resposta
@import com.ads.sustancia.dto.response.DadosGraficoDTO
@import java.util.Objects
@import java.util.List;

@param FiltroDTO filtro
<<<<<<< Updated upstream
@param List<DadosGraficoDTO> inseguracaAlimentarList = null
=======
@param List<DadosGraficoDTO> inseguracaAlimentar = null
>>>>>>> Stashed changes
    <!DOCTYPE html>
    <html lang="pt-BR">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Filtros Avançados</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                max-width: 1200px;
                margin: 0 auto;
                padding: 20px;
                line-height: 1.6;
            }

            .filter-container {
                background-color: #f5f5f5;
                padding: 15px;
                border-radius: 8px;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
                margin-bottom: 20px;
            }

            .filter-section {
                display: grid;
                grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
                gap: 15px;
            }

            .filter-group {
                margin-bottom: 0;
            }

            h1 {
                color: #2c3e50;
                text-align: center;
                margin-bottom: 20px;
            }

            label {
                display: block;
                margin-bottom: 5px;
                font-weight: bold;
                color: #2c3e50;
                font-size: 14px;
            }

            select {
                padding: 8px;
                width: 100%;
                border: 1px solid #ddd;
                border-radius: 4px;
                font-size: 14px;
                height: 38px;
            }

            button {
                background-color: #4CAF50;
                color: white;
                padding: 10px 15px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                font-size: 14px;
                width: auto;
                margin-top: 10px;
                grid-column: 1 / -1;
                justify-self: end;
            }

            button:hover {
                background-color: #45a049;
            }

            #results {
                display: flex;
                margin-top: 20px;
                padding: 20px;
                background-color: #fff;
                border-radius: 8px;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            }

            .chart-container {
                width: 80%;
                margin: 20px auto;
                padding: 15px;
                border: 1px solid #eee;
                border-radius: 8px;
            }

            .chart-title {
                text-align: center;
                margin-bottom: 10px;
                font-weight: bold;
                color: #2c3e50;
                font-family: 'Courier New', Courier, monospace;
            }
        </style>
    </head>

    <body>
        <h1>Filtros Avançados</h1>

        <form action="/relatorio" method="get">
            <div class="filter-section">
                <h2>Filtrar por:</h2>

                <div class="filter-group">
                    <label for="raca">Raça/Cor:</label>
                    <select id="raca" name="raca">
                        <option value="">Todos as Raças</option>
                        @for (RacaEnum raca : RacaEnum.values())
                        <option value="${raca.name()}">
                            ${raca.name()}
                        </option>
                        @endfor
                    </select>
                </div>

                <div class="filter-group">
                    <label for="religiao">Religiao:</label>
                    <select id="religiao" name="religiao">
                        <option value="">Todas os Religiões</option>
                        @for (ReligiaoEnum religiao : ReligiaoEnum.values())
                        <option value="${religiao.name()}">
                            ${religiao.name()}
                        </option>
                        @endfor
                    </select>
                </div>

                <div class="filter-group">
                    <label for="genero">Genero:</label>
                    <select id="genero" name="genero">
                        <option value="">Todos os gêneros</option>
                        @for (GeneroEnum genero : GeneroEnum.values())
                        <option value="${genero.name()}">
                            ${genero.name()}
                        </option>
                        @endfor
                    </select>
                </div>

                <div class="filter-group">
                    <label for="escolaridade">Escolaridade:</label>
                    <select id="escolaridade" name="escolaridade">
                        <option value="">Todas as Escolaridade</option>
                        @for (EscolaridadeEnum escolaridade : EscolaridadeEnum.values())
                        <option value="${escolaridade.name()}">
                            ${escolaridade.name()}
                        </option>
                        @endfor
                    </select>
                </div>

                <div class="filter-group">
                    <label for="estadoCivil">Estado Civil:</label>
                    <select id="estadoCivil" name="estadoCivil">
                        <option value="">Todos estadoCivil</option>
                        @for (EstadoCivilEnum estadoCivil : EstadoCivilEnum.values())
                        <option value="${estadoCivil.name()}">
                            ${estadoCivil.name()}
                        </option>
                        @endfor
                    </select>
                </div>

                <div class="filter-group">
                    <label for="emprego">Emprego:</label>
                    <select id="emprego" name="emprego">
                        <option value="">Todos os empregos</option>
                        @for (EmpregoEnum emprego : EmpregoEnum.values())
                        <option value="${emprego.name()}">
                            ${emprego.name()}
                        </option>
                        @endfor
                    </select>
                </div>

                <div class="filter-group">
                    <label for="dependentes">Dependentes:</label>
                    <select id="dependentes" name="dependentes">
                        <option value="">Todas os dependentes</option>
                        @for (DependentesEnum dependentes : DependentesEnum.values())
                        <option value="${dependentes.name()}">
                            ${dependentes.name()}
                        </option>
                        @endfor
                    </select>
                </div>

                <div class="filter-group">
                    <label for="auxilio">Auxilio:</label>
                    <select id="auxilio" name="auxilio">
                        <option value="">Todas os auxilios</option>
                        @for (AuxilioEnum auxilio : AuxilioEnum.values())
                        <option value="${auxilio.name()}">
                            ${auxilio.name()}
                        </option>
                        @endfor
                    </select>
                </div>

                <button type="submit">Gerar Relatório</button>
            </div>
        </form>

        <div id="results">
<<<<<<< Updated upstream
            @if (inseguracaAlimentarList != null && !inseguracaAlimentarList.isEmpty())
            @for (DadosGraficoDTO d : inseguracaAlimentarList)
            @if(d!=null)
            <div class=".chart-container">
            <div class="chart-title">${d.getPergunta()}</div>
            <canvas id="chart${inseguracaAlimentarList.indexOf(d)}"></canvas>
=======
            @if (inseguracaAlimentar != null && !inseguracaAlimentar.isEmpty())
            @for (DadosGraficoDTO d : inseguracaAlimentar)
            @if(d!=null)
            <div class=".chart-container">
            <div class="chart-title">${d.getPergunta()}</div>
            <canvas id="chart${inseguracaAlimentar.indexOf(d)}"></canvas>
>>>>>>> Stashed changes
            </div> 
            <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
            @endif
            @endfor
            
<<<<<<< Updated upstream
            @for (DadosGraficoDTO d : inseguracaAlimentarList)
            @if(d!=null)
            <script>
                const ctx${ inseguracaAlimentarList.indexOf(d)} = document.getElementById('chart${inseguracaAlimentarList.indexOf(d)}').getContext('2d');
                new Chart(ctx${ inseguracaAlimentarList.indexOf(d) }, {
=======
            @for (DadosGraficoDTO d : inseguracaAlimentar)
            @if(d!=null)
            <script>
                const ctx${ inseguracaAlimentar.indexOf(d)} = document.getElementById('chart${inseguracaAlimentar.indexOf(d)}').getContext('2d');
                new Chart(ctx${ inseguracaAlimentar.indexOf(d) }, {
>>>>>>> Stashed changes
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
                                    const percentage = Math.round(context.raw * 100 / total);
                                    return context.label + ': ' + context.raw + ' (' + percentage + '%)';
                                }
                            }
                        }
                    }
                }
           });
            </script>
            @else
            <p>Nenhum dado disponível para exibir.</p>
            @endif
            @endfor
            @else
            <p>Error</p>
            @endif
        </div>
    </body>
    </html>