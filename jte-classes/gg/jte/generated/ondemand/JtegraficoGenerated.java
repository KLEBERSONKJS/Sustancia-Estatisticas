package gg.jte.generated.ondemand;
import com.ads.sustancia.enums.*;
import com.ads.sustancia.record.FiltroDTO;
import com.ads.sustancia.record.DadosGraficoDTO;
import java.util.Objects;
import java.util.List;;
@SuppressWarnings("unchecked")
public final class JtegraficoGenerated {
	public static final String JTE_NAME = "grafico.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,6,6,6,6,109,109,109,110,110,110,110,110,110,110,110,110,111,111,111,113,113,123,123,124,124,124,124,124,124,124,124,124,125,125,125,127,127,136,136,137,137,137,137,137,137,137,137,137,138,138,138,140,140,148,148,149,149,149,149,149,149,149,149,149,150,150,150,152,152,160,160,161,161,161,161,161,161,161,161,161,162,162,162,164,164,172,172,173,173,173,173,173,173,173,173,173,174,174,174,176,176,184,184,185,185,185,185,185,185,185,185,185,186,186,186,188,188,196,196,197,197,197,197,197,197,197,197,197,198,198,198,200,200,209,209,217,218,219,225,225,226,226,226,227,227,229,229,230,230,230,231,231,255,255,257,257,261,261,261,6,7,7,7,7};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, FiltroDTO filtro, List<DadosGraficoDTO> dados) {
		jteOutput.writeContent("    <!DOCTYPE html>\n    <html lang=\"pt-BR\">\n\n    <head>\n        <meta charset=\"UTF-8\">\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n        <title>Filtros Avançados</title>\n        <style>\n            body {\n                font-family: Arial, sans-serif;\n                max-width: 1200px;\n                margin: 0 auto;\n                padding: 20px;\n                line-height: 1.6;\n            }\n        \n            .filter-container {\n                background-color: #f5f5f5;\n                padding: 15px;\n                border-radius: 8px;\n                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n                margin-bottom: 20px;\n            }\n        \n            .filter-section {\n                display: grid;\n                grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));\n                gap: 15px;\n            }\n        \n            .filter-group {\n                margin-bottom: 0;\n            }\n        \n            h1 {\n                color: #2c3e50;\n                text-align: center;\n                margin-bottom: 20px;\n            }\n        \n            label {\n                display: block;\n                margin-bottom: 5px;\n                font-weight: bold;\n                color: #2c3e50;\n                font-size: 14px;\n            }\n        \n            select {\n                padding: 8px;\n                width: 100%;\n                border: 1px solid #ddd;\n                border-radius: 4px;\n                font-size: 14px;\n                height: 38px;\n            }\n        \n            button {\n                background-color: #4CAF50;\n                color: white;\n                padding: 10px 15px;\n                border: none;\n                border-radius: 4px;\n                cursor: pointer;\n                font-size: 14px;\n                width: auto;\n                margin-top: 10px;\n                grid-column: 1 / -1;\n                justify-self: end;\n            }\n        \n            button:hover {\n                background-color: #45a049;\n            }\n        \n            #results {\n                margin-top: 20px;\n                padding: 20px;\n                background-color: #fff;\n                border-radius: 8px;\n                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n            }\n        \n            .chart-container {\n                width:30%;\n                margin: 0 auto;\n            }\n        </style>\n    </head>\n\n    <body>\n        <h1>Filtros Avançados</h1>\n\n        <form action=\"/relatorio\" method=\"get\">\n            <div class=\"filter-section\">\n                <h2>Filtrar por:</h2>\n\n                <div class=\"filter-group\">\n                    <label for=\"raca\">Raça/Cor:</label>\n                    <select id=\"raca\" name=\"raca\">\n                        <option value=\"\">Todos as Raças</option>\n                        ");
		for (RacaEnum raca : RacaEnum.values()) {
			jteOutput.writeContent("\n                        <option");
			var __jte_html_attribute_0 = raca.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_0);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(raca.name());
			jteOutput.writeContent("\n                        </option>\n                        ");
		}
		jteOutput.writeContent("\n                    </select>\n                </div>\n\n\n\n                <div class=\"filter-group\">\n                    <label for=\"religiao\">Religiao:</label>\n                    <select id=\"religiao\" name=\"religiao\">\n                        <option value=\"\">Todas os Religiões</option>\n                        ");
		for (ReligiaoEnum religiao : ReligiaoEnum.values()) {
			jteOutput.writeContent("\n                        <option");
			var __jte_html_attribute_1 = religiao.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_1);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(religiao.name());
			jteOutput.writeContent("\n                        </option>\n                        ");
		}
		jteOutput.writeContent("\n                    </select>\n                </div>\n\n\n                <div class=\"filter-group\">\n                    <label for=\"genero\">Genero:</label>\n                    <select id=\"genero\" name=\"genero\">\n                        <option value=\"\">Todos os gêneros</option>\n                        ");
		for (GeneroEnum genero : GeneroEnum.values()) {
			jteOutput.writeContent("\n                        <option");
			var __jte_html_attribute_2 = genero.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_2);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(genero.name());
			jteOutput.writeContent("\n                        </option>\n                        ");
		}
		jteOutput.writeContent("\n                    </select>\n                </div>\n\n                <div class=\"filter-group\">\n                    <label for=\"escolaridade\">Escolaridade:</label>\n                    <select id=\"escolaridade\" name=\"escolaridade\">\n                        <option value=\"\">Todas as Escolaridade</option>\n                        ");
		for (EscolaridadeEnum escolaridade : EscolaridadeEnum.values()) {
			jteOutput.writeContent("\n                        <option");
			var __jte_html_attribute_3 = escolaridade.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_3);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(escolaridade.name());
			jteOutput.writeContent("\n                        </option>\n                        ");
		}
		jteOutput.writeContent("\n                    </select>\n                </div>\n\n                <div class=\"filter-group\">\n                    <label for=\"estadoCivil\">Estado Civil:</label>\n                    <select id=\"estadoCivil\" name=\"estadoCivil\">\n                        <option value=\"\">Todos estadoCivil</option>\n                        ");
		for (EstadoCivilEnum estadoCivil : EstadoCivilEnum.values()) {
			jteOutput.writeContent("\n                        <option");
			var __jte_html_attribute_4 = estadoCivil.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_4);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(estadoCivil.name());
			jteOutput.writeContent("\n                        </option>\n                        ");
		}
		jteOutput.writeContent("\n                    </select>\n                </div>\n\n                <div class=\"filter-group\">\n                    <label for=\"emprego\">Emprego:</label>\n                    <select id=\"emprego\" name=\"emprego\">\n                        <option value=\"\">Todos os empregos</option>\n                        ");
		for (EmpregoEnum emprego : EmpregoEnum.values()) {
			jteOutput.writeContent("\n                        <option");
			var __jte_html_attribute_5 = emprego.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_5);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(emprego.name());
			jteOutput.writeContent("\n                        </option>\n                        ");
		}
		jteOutput.writeContent("\n                    </select>\n                </div>\n\n                <div class=\"filter-group\">\n                    <label for=\"dependentes\">Dependentes:</label>\n                    <select id=\"dependentes\" name=\"dependentes\">\n                        <option value=\"\">Todas os dependentes</option>\n                        ");
		for (DependentesEnum dependentes : DependentesEnum.values()) {
			jteOutput.writeContent("\n                        <option");
			var __jte_html_attribute_6 = dependentes.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_6)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_6);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(dependentes.name());
			jteOutput.writeContent("\n                        </option>\n                        ");
		}
		jteOutput.writeContent("\n                    </select>\n                </div>\n\n                <div class=\"filter-group\">\n                    <label for=\"auxilio\">Auxilio:</label>\n                    <select id=\"auxilio\" name=\"auxilio\">\n                        <option value=\"\">Todas os auxilios</option>\n                        ");
		for (AuxilioEnum auxilio : AuxilioEnum.values()) {
			jteOutput.writeContent("\n                        <option");
			var __jte_html_attribute_7 = auxilio.name();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_7)) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("option", "value");
				jteOutput.writeUserContent(__jte_html_attribute_7);
				jteOutput.setContext("option", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                            ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(auxilio.name());
			jteOutput.writeContent("\n                        </option>\n                        ");
		}
		jteOutput.writeContent("\n                    </select>\n                </div>\n\n                <button type=\"submit\">Gerar Relatório</button>\n            </div>\n        </form>\n\n        <div id=\"results\">\n            ");
		if (dados != null && !dados.isEmpty()) {
			jteOutput.writeContent("\n            <div class=\"chart-container\">\n                <canvas id=\"myChart\"></canvas>\n            </div>\n\n            <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\n            <script>\n          \n                ");
			jteOutput.writeContent("\n                ");
			jteOutput.writeContent("\n                ");
			jteOutput.writeContent("\n                \n                const ctx = document.getElementById('myChart').getContext('2d');\n                new Chart(ctx, {\n                    type: 'pie',\n                    data: {\n                        labels: [");
			for (DadosGraficoDTO d: dados) {
				jteOutput.writeContent("\n                                    \"");
				jteOutput.setContext("script", null);
				jteOutput.writeUserContent(d.getCampo());
				jteOutput.writeContent("\",\n                                ");
			}
			jteOutput.writeContent("],\n                        datasets: [{\n                            data: [");
			for (DadosGraficoDTO d: dados) {
				jteOutput.writeContent("\n                                    ");
				jteOutput.setContext("script", null);
				jteOutput.writeUserContent(d.getValor());
				jteOutput.writeContent(",\n                                ");
			}
			jteOutput.writeContent("],\n                            backgroundColor: [\n                                '#36A2EB', '#FF6384', '#FFCE56', '#4BC0C0', '#9966FF',\n                                '#FF9F40', '#8AC24A', '#607D8B', '#E91E63', '#9C27B0'\n                            ],\n                            hoverOffset: 20\n                        }]\n                    },\n                    options: {\n                        responsive: true,\n                        plugins: {\n                            tooltip: {\n                                callbacks: {\n                                    label: function(context) {\n                                        const total = context.dataset.data.reduce((a, b) => a + b, 0);\n                                        const percentage = Math.round(context.raw * 100 / total);\n                                        return context.label + ': ' + context.raw + ' (' + percentage + '%)';\n                                    }\n                                }\n                            }\n                        }\n                    }\n                });\n            </script>\n            ");
		} else {
			jteOutput.writeContent("\n            <p>Nenhum dado disponível para exibir. Aplique os filtros e gere o relatório.</p>\n            ");
		}
		jteOutput.writeContent("\n        </div>\n    </body>\n\n    </html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		FiltroDTO filtro = (FiltroDTO)params.get("filtro");
		List<DadosGraficoDTO> dados = (List<DadosGraficoDTO>)params.getOrDefault("dados", null);
		render(jteOutput, jteHtmlInterceptor, filtro, dados);
	}
}
