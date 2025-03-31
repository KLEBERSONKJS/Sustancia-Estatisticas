package gg.jte.generated.ondemand;
import com.ads.sustancia.enums.*;
import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.model.Resposta;
import com.ads.sustancia.record.DadosGraficoDTO;
import java.util.Objects;
import java.util.List;;
@SuppressWarnings("unchecked")
public final class JtegraficoGenerated {
	public static final String JTE_NAME = "grafico.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,7,7,7,7,122,122,122,123,123,123,123,123,123,123,123,123,124,124,124,126,126,134,134,135,135,135,135,135,135,135,135,135,136,136,136,138,138,146,146,147,147,147,147,147,147,147,147,147,148,148,148,150,150,158,158,159,159,159,159,159,159,159,159,159,160,160,160,162,162,170,170,171,171,171,171,171,171,171,171,171,172,172,172,174,174,182,182,183,183,183,183,183,183,183,183,183,184,184,184,186,186,194,194,195,195,195,195,195,195,195,195,195,196,196,196,198,198,206,206,207,207,207,207,207,207,207,207,207,208,208,208,210,210,219,219,220,220,222,222,222,223,223,223,223,225,225,229,229,230,230,230,230,230,230,231,231,231,235,235,236,236,236,236,236,236,236,237,237,241,241,242,242,242,242,242,242,243,243,257,257,257,279,279,281,281,283,283,287,287,287,7,8,8,8,8};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, FiltroDTO filtro, List<DadosGraficoDTO> dadosP2) {
		jteOutput.writeContent("    <!DOCTYPE html>\r\n    <html lang=\"pt-BR\">\r\n\r\n    <head>\r\n        <meta charset=\"UTF-8\">\r\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n        <title>Filtros Avançados</title>\r\n        <style>\r\n            body {\r\n                font-family: Arial, sans-serif;\r\n                max-width: 1200px;\r\n                margin: 0 auto;\r\n                padding: 20px;\r\n                line-height: 1.6;\r\n            }\r\n\r\n            .filter-container {\r\n                background-color: #f5f5f5;\r\n                padding: 15px;\r\n                border-radius: 8px;\r\n                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\r\n                margin-bottom: 20px;\r\n            }\r\n\r\n            .filter-section {\r\n                display: grid;\r\n                grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));\r\n                gap: 15px;\r\n            }\r\n\r\n            .filter-group {\r\n                margin-bottom: 0;\r\n            }\r\n\r\n            h1 {\r\n                color: #2c3e50;\r\n                text-align: center;\r\n                margin-bottom: 20px;\r\n            }\r\n\r\n            label {\r\n                display: block;\r\n                margin-bottom: 5px;\r\n                font-weight: bold;\r\n                color: #2c3e50;\r\n                font-size: 14px;\r\n            }\r\n\r\n            select {\r\n                padding: 8px;\r\n                width: 100%;\r\n                border: 1px solid #ddd;\r\n                border-radius: 4px;\r\n                font-size: 14px;\r\n                height: 38px;\r\n            }\r\n\r\n            button {\r\n                background-color: #4CAF50;\r\n                color: white;\r\n                padding: 10px 15px;\r\n                border: none;\r\n                border-radius: 4px;\r\n                cursor: pointer;\r\n                font-size: 14px;\r\n                width: auto;\r\n                margin-top: 10px;\r\n                grid-column: 1 / -1;\r\n                justify-self: end;\r\n            }\r\n\r\n            button:hover {\r\n                background-color: #45a049;\r\n            }\r\n\r\n            #results {\r\n                display: flex;\r\n                margin-top: 20px;\r\n                padding: 20px;\r\n                background-color: #fff;\r\n                border-radius: 8px;\r\n                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\r\n            }\r\n\r\n            .chart-container {\r\n                width: 80%;\r\n                margin: 20px auto;\r\n                padding: 15px;\r\n                border: 1px solid #eee;\r\n                border-radius: 8px;\r\n            }\r\n\r\n            .chart-title {\r\n                text-align: center;\r\n                margin-bottom: 10px;\r\n                font-weight: bold;\r\n                color: #2c3e50;\r\n                font-family: 'Courier New', Courier, monospace;\r\n            }\r\n        </style>\r\n    </head>\r\n\r\n    <body>\r\n        <h1>Filtros Avançados</h1>\r\n\r\n        <form action=\"/relatorio\" method=\"get\">\r\n            <div class=\"filter-section\">\r\n                <h2>Filtrar por:</h2>\r\n\r\n                <div class=\"filter-group\">\r\n                    <label for=\"raca\">Raça/Cor:</label>\r\n                    <select id=\"raca\" name=\"raca\">\r\n                        <option value=\"\">Todos as Raças</option>\r\n                        ");
		for (RacaEnum raca : RacaEnum.values()) {
			jteOutput.writeContent("\r\n                        <option");
			var __jte_html_attribute_0 = raca.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_0);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\r\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(raca.name());
			jteOutput.writeContent("\r\n                        </option>\r\n                        ");
		}
		jteOutput.writeContent("\r\n                    </select>\r\n                </div>\r\n\r\n                <div class=\"filter-group\">\r\n                    <label for=\"religiao\">Religiao:</label>\r\n                    <select id=\"religiao\" name=\"religiao\">\r\n                        <option value=\"\">Todas os Religiões</option>\r\n                        ");
		for (ReligiaoEnum religiao : ReligiaoEnum.values()) {
			jteOutput.writeContent("\r\n                        <option");
			var __jte_html_attribute_1 = religiao.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_1);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\r\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(religiao.name());
			jteOutput.writeContent("\r\n                        </option>\r\n                        ");
		}
		jteOutput.writeContent("\r\n                    </select>\r\n                </div>\r\n\r\n                <div class=\"filter-group\">\r\n                    <label for=\"genero\">Genero:</label>\r\n                    <select id=\"genero\" name=\"genero\">\r\n                        <option value=\"\">Todos os gêneros</option>\r\n                        ");
		for (GeneroEnum genero : GeneroEnum.values()) {
			jteOutput.writeContent("\r\n                        <option");
			var __jte_html_attribute_2 = genero.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_2);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\r\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(genero.name());
			jteOutput.writeContent("\r\n                        </option>\r\n                        ");
		}
		jteOutput.writeContent("\r\n                    </select>\r\n                </div>\r\n\r\n                <div class=\"filter-group\">\r\n                    <label for=\"escolaridade\">Escolaridade:</label>\r\n                    <select id=\"escolaridade\" name=\"escolaridade\">\r\n                        <option value=\"\">Todas as Escolaridade</option>\r\n                        ");
		for (EscolaridadeEnum escolaridade : EscolaridadeEnum.values()) {
			jteOutput.writeContent("\r\n                        <option");
			var __jte_html_attribute_3 = escolaridade.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_3);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\r\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(escolaridade.name());
			jteOutput.writeContent("\r\n                        </option>\r\n                        ");
		}
		jteOutput.writeContent("\r\n                    </select>\r\n                </div>\r\n\r\n                <div class=\"filter-group\">\r\n                    <label for=\"estadoCivil\">Estado Civil:</label>\r\n                    <select id=\"estadoCivil\" name=\"estadoCivil\">\r\n                        <option value=\"\">Todos estadoCivil</option>\r\n                        ");
		for (EstadoCivilEnum estadoCivil : EstadoCivilEnum.values()) {
			jteOutput.writeContent("\r\n                        <option");
			var __jte_html_attribute_4 = estadoCivil.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_4);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\r\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(estadoCivil.name());
			jteOutput.writeContent("\r\n                        </option>\r\n                        ");
		}
		jteOutput.writeContent("\r\n                    </select>\r\n                </div>\r\n\r\n                <div class=\"filter-group\">\r\n                    <label for=\"emprego\">Emprego:</label>\r\n                    <select id=\"emprego\" name=\"emprego\">\r\n                        <option value=\"\">Todos os empregos</option>\r\n                        ");
		for (EmpregoEnum emprego : EmpregoEnum.values()) {
			jteOutput.writeContent("\r\n                        <option");
			var __jte_html_attribute_5 = emprego.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_5);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\r\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(emprego.name());
			jteOutput.writeContent("\r\n                        </option>\r\n                        ");
		}
		jteOutput.writeContent("\r\n                    </select>\r\n                </div>\r\n\r\n                <div class=\"filter-group\">\r\n                    <label for=\"dependentes\">Dependentes:</label>\r\n                    <select id=\"dependentes\" name=\"dependentes\">\r\n                        <option value=\"\">Todas os dependentes</option>\r\n                        ");
		for (DependentesEnum dependentes : DependentesEnum.values()) {
			jteOutput.writeContent("\r\n                        <option");
			var __jte_html_attribute_6 = dependentes.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_6)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_6);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\r\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(dependentes.name());
			jteOutput.writeContent("\r\n                        </option>\r\n                        ");
		}
		jteOutput.writeContent("\r\n                    </select>\r\n                </div>\r\n\r\n                <div class=\"filter-group\">\r\n                    <label for=\"auxilio\">Auxilio:</label>\r\n                    <select id=\"auxilio\" name=\"auxilio\">\r\n                        <option value=\"\">Todas os auxilios</option>\r\n                        ");
		for (AuxilioEnum auxilio : AuxilioEnum.values()) {
			jteOutput.writeContent("\r\n                        <option");
			var __jte_html_attribute_7 = auxilio.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_7)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_7);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\r\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(auxilio.name());
			jteOutput.writeContent("\r\n                        </option>\r\n                        ");
		}
		jteOutput.writeContent("\r\n                    </select>\r\n                </div>\r\n\r\n                <button type=\"submit\">Gerar Relatório</button>\r\n            </div>\r\n        </form>\r\n\r\n        <div id=\"results\">\r\n            ");
		if (dadosP2 != null && !dadosP2.isEmpty()) {
			jteOutput.writeContent("\r\n            ");
			for (DadosGraficoDTO d : dadosP2) {
				jteOutput.writeContent("\r\n            <div class=\"chart-container\">\r\n                <div class=\"chart-title\">");
				jteOutput.setContext("div", null);
				jteOutput.writeUserContent(d.getPergunta());
				jteOutput.writeContent("</div>\r\n                <canvas id=\"chart");
				jteOutput.setContext("canvas", "id");
				jteOutput.writeUserContent(dadosP2.indexOf(d));
				jteOutput.setContext("canvas", null);
				jteOutput.writeContent("\"></canvas>\r\n            </div>\r\n            ");
			}
			jteOutput.writeContent("\r\n\r\n            <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\r\n            <script>\r\n                ");
			for (DadosGraficoDTO d : dadosP2) {
				jteOutput.writeContent("\r\n                const ctx");
				jteOutput.setContext("script", null);
				jteOutput.writeUserContent( dadosP2.indexOf(d));
				jteOutput.writeContent(" = document.getElementById('chart");
				jteOutput.setContext("script", null);
				jteOutput.writeUserContent(dadosP2.indexOf(d));
				jteOutput.writeContent("').getContext('2d');\r\n                new Chart(ctx");
				jteOutput.setContext("script", null);
				jteOutput.writeUserContent( dadosP2.indexOf(d) );
				jteOutput.writeContent(", {\r\n                    type: 'pie',\r\n                    data: {\r\n                        labels: [\r\n                            ");
				for (Resposta resposta: d.getRespostas()) {
					jteOutput.writeContent("\r\n                \"");
					jteOutput.setContext("script", null);
					jteOutput.writeUserContent(resposta.getCampo());
					jteOutput.writeContent("\"");
					if (!resposta.equals(d.getRespostas().get(d.getRespostas().size() - 1))) {
						jteOutput.writeContent(", ");
					}
					jteOutput.writeContent("\r\n                ");
				}
				jteOutput.writeContent("\r\n                            ],\r\n                datasets: [{\r\n                    data: [\r\n                        ");
				for (Resposta resposta: d.getRespostas()) {
					jteOutput.writeContent("\r\n                    ");
					jteOutput.setContext("script", null);
					jteOutput.writeUserContent( resposta.getValor() );
					if (!resposta.equals(d.getRespostas().get(d.getRespostas().size() - 1))) {
						jteOutput.writeContent(", ");
					}
					jteOutput.writeContent("\r\n                    ");
				}
				jteOutput.writeContent("\r\n                                ],\r\n                backgroundColor: [\r\n                    '#36A2EB', '#FF6384', '#FFCE56', '#4BC0C0', '#9966FF',\r\n                    '#FF9F40', '#8AC24A', '#607D8B', '#E91E63', '#9C27B0'\r\n                ],\r\n                    hoverOffset: 20\r\n                            }]\r\n                        },\r\n                options: {\r\n                    responsive: true,\r\n                        plugins: {\r\n                        title: {\r\n                            display: true,\r\n                                text: '");
				jteOutput.setContext("script", null);
				jteOutput.writeUserContent(d.getDescricao());
				jteOutput.writeContent("',\r\n                                    font: {\r\n                                size: 18,\r\n                                    weight: 'bold'\r\n                            },\r\n                            padding: {\r\n                                top: 10,\r\n                                    bottom: 20\r\n                            }\r\n                        },\r\n                        tooltip: {\r\n                            callbacks: {\r\n                                label: function(context) {\r\n                                    const total = context.dataset.data.reduce((a, b) => a + b, 0);\r\n                                    const percentage = Math.round(context.raw * 100 / total);\r\n                                    return context.label + ': ' + context.raw + ' (' + percentage + '%)';\r\n                                }\r\n                            }\r\n                        }\r\n                    }\r\n                }\r\n                    });\r\n                ");
			}
			jteOutput.writeContent("\r\n            </script>\r\n            ");
		} else {
			jteOutput.writeContent("\r\n            <p>Nenhum dado disponível para exibir. Aplique os filtros e gere o relatório.</p>\r\n            ");
		}
		jteOutput.writeContent("\r\n        </div>\r\n    </body>\r\n\r\n    </html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		FiltroDTO filtro = (FiltroDTO)params.get("filtro");
		List<DadosGraficoDTO> dadosP2 = (List<DadosGraficoDTO>)params.getOrDefault("dadosP2", null);
		render(jteOutput, jteHtmlInterceptor, filtro, dadosP2);
	}
}
