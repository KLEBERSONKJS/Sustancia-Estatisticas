package gg.jte.generated.ondemand;
import com.ads.sustancia.enums.*;
import com.ads.sustancia.dto.request.FiltroDTO;
import com.ads.sustancia.model.Resposta;
import com.ads.sustancia.dto.response.DadosGraficoDTO;
import java.util.Objects;
@SuppressWarnings("unchecked")
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,6,6,6,6,8,8,9,9,36,36,37,37,37,37,37,37,37,37,37,37,37,37,38,38,41,109,109,109,120,120,120,120,120,120,125,125,125,125,125,125,125,125,125,133,133,133,6,6,6,6};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, FiltroDTO filtro) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n\r\n<!DOCTYPE html>\r\n<html lang=\"pt-BR\">\r\n\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>Relatório de Insegurança Alimentar</title>\r\n    <link rel=\"stylesheet\" href=\"../resources/static/css/relatorio.css\">\r\n    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\r\n</head>\r\n\r\n<body>\r\n    <main class=\"pagina-relatorio\">\r\n        <h1 class=\"titulo-pagina\">Filtros Avançados</h1>\r\n\r\n        <form action=\"/relatorio\" method=\"get\" class=\"formulario-filtros\">\r\n            <fieldset class=\"filtros filtro-container\">\r\n                <legend class=\"filtros-legenda\">Filtrar por:</legend>\r\n                <div class=\"filtros-grid\">\r\n\r\n                    <div class=\"filtro-item\">\r\n                        <label for=\"raca\">Raça/Cor:</label>\r\n                        <select id=\"raca\" name=\"raca\">\r\n                            <option value=\"\">Todas</option>\r\n                            ");
				for (RacaEnum raca : RacaEnum.values()) {
					jteOutput.writeContent("\r\n                                <option");
					var __jte_html_attribute_0 = raca.name();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("option", "value");
						jteOutput.writeUserContent(__jte_html_attribute_0);
						jteOutput.setContext("option", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">");
					jteOutput.setContext("option", null);
					jteOutput.writeUserContent(filtro != null && Objects.equals(filtro.raca(), raca) ? "selected" : "");
					jteOutput.writeContent("</option>\r\n                            ");
				}
				jteOutput.writeContent("\r\n                        </select>\r\n                    </div>\r\n                    ");
				jteOutput.writeContent("\r\n\r\n                </div>\r\n\r\n                <div class=\"botoes-form\">\r\n                    <button type=\"submit\" class=\"botao botao-principal\">Gerar Relatório</button>\r\n                </div>\r\n            </fieldset>\r\n        </form>\r\n\r\n        <section class=\"graficos-secao\">\r\n            <h2 class=\"graficos-titulo\">Resultados dos Gráficos</h2>\r\n\r\n            <article class=\"grafico-article\">\r\n                <h3 class=\"grafico-titulo\">Você já passou por insegurança alimentar?</h3>\r\n                <canvas id=\"chart0\" class=\"grafico-canvas\"></canvas>\r\n            </article>\r\n\r\n            <article class=\"grafico-article\">\r\n                <h3 class=\"grafico-titulo\">Com que frequência você consome frutas?</h3>\r\n                <canvas id=\"chart1\" class=\"grafico-canvas\"></canvas>\r\n            </article>\r\n\r\n            <p class=\"mensagem-vazia\" style=\"display: none;\">Nenhum dado disponível para exibir.</p>\r\n        </section>\r\n    </main>\r\n\r\n    <script>\r\n        function createPieChart(canvasId, title, labels, data, index = 0) {\r\n            const ctx = document.getElementById(canvasId).getContext('2d');\r\n\r\n            const baseColors = [\r\n                '#36A2EB', '#FF6384', '#FFCE56', '#4BC0C0', '#9966FF',\r\n                '#FF9F40', '#8AC24A', '#607D8B', '#E91E63', '#9C27B0'\r\n            ];\r\n\r\n            const rotatedColors = [...baseColors.slice(index % baseColors.length), ...baseColors.slice(0, index % baseColors.length)];\r\n\r\n            new Chart(ctx, {\r\n                type: 'pie',\r\n                data: {\r\n                    labels: labels,\r\n                    datasets: [{\r\n                        data: data,\r\n                        backgroundColor: rotatedColors,\r\n                        hoverOffset: 20\r\n                    }]\r\n                },\r\n                options: {\r\n                    responsive: true,\r\n                    plugins: {\r\n                        title: {\r\n                            display: true,\r\n                            text: title,\r\n                            font: {\r\n                                size: 18,\r\n                                weight: 'bold'\r\n                            },\r\n                            padding: {\r\n                                top: 10,\r\n                                bottom: 20\r\n                            }\r\n                        },\r\n                        tooltip: {\r\n                            callbacks: {\r\n                                label: function(context) {\r\n                                    const total = context.dataset.data.reduce((a, b) => a + b, 0);\r\n                                    const percentage = total > 0 ? Math.round(context.raw * 100 / total) : 0;\r\n                                    return ");
			}
		}${context.label}: ${context.raw} (${percentage}%)`;);
		jteOutput.writeContent("\r\n                            }\r\n                        }\r\n                    }\r\n                }\r\n            });\r\n        }\r\n\r\n        document.addEventListener(\"DOMContentLoaded\", () => {\r\n            const chart0Data = {\r\n                labels: [\"Sim\", \"Não\"],\r\n                data: [");
		jteOutput.setContext("html", null);
		jteOutput.writeUserContent(model.get("inseguranca_alimentar_sim"));
		jteOutput.writeContent(", ");
		jteOutput.setContext("html", null);
		jteOutput.writeUserContent(model.get("inseguranca_alimentar_nao"));
		jteOutput.writeContent("]\r\n            };\r\n\r\n            const chart1Data = {\r\n                labels: [\"Diariamente\", \"Raramente\", \"Nunca\"],\r\n                data: [");
		jteOutput.setContext("html", null);
		jteOutput.writeUserContent(model.get("consumo_frutas_diariamente"));
		jteOutput.writeContent(", ");
		jteOutput.setContext("html", null);
		jteOutput.writeUserContent(model.get("consumo_frutas_raramente"));
		jteOutput.writeContent(", ");
		jteOutput.setContext("html", null);
		jteOutput.writeUserContent(model.get("consumo_frutas_nunca"));
		jteOutput.writeContent("]\r\n            };\r\n\r\n            createPieChart(\"chart0\", \"Você já passou por insegurança alimentar?\", chart0Data.labels, chart0Data.data, 0);\r\n            createPieChart(\"chart1\", \"Com que frequência você consome frutas?\", chart1Data.labels, chart1Data.data, 1);\r\n        });\r\n    </script>\r\n\r\n`)");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		FiltroDTO filtro = (FiltroDTO)params.get("filtro");
		render(jteOutput, jteHtmlInterceptor, filtro);
	}
}
