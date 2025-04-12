package gg.jte.generated.ondemand;
import com.ads.sustancia.enums.*;
import com.ads.sustancia.dto.request.FiltroDTO;
import com.ads.sustancia.model.Resposta;
import com.ads.sustancia.dto.response.DadosGraficoDTO;
import java.util.Objects;
@SuppressWarnings("unchecked")
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,6,6,6,6,8,8,8,8,13,13,14,14,14,14,14,14,14,14,14,14,14,14,15,15,18,33,39,51,51,51,51,51,6,6,6,6};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, FiltroDTO filtro) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <div class=\"filtro-item\">\n        <label for=\"raca\">Raça/Cor:</label>\n        <select id=\"raca\" name=\"raca\">\n            <option value=\"\">Todas</option>\n            ");
				for (com.ads.sustancia.enums.RacaEnum raca : com.ads.sustancia.enums.RacaEnum.values()) {
					jteOutput.writeContent("\n                <option");
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
					jteOutput.writeUserContent(raca.name());
					jteOutput.writeContent("</option>\n            ");
				}
				jteOutput.writeContent("\n        </select>\n    </div>\n    ");
				jteOutput.writeContent("\n    <div class=\"graficos-grid\">\n        <article class=\"grafico-article\">\n            <h3 class=\"grafico-titulo\">Você já passou por insegurança alimentar?</h3>\n            <canvas id=\"chart0\" class=\"grafico-canvas\"></canvas>\n        </article>\n\n        <article class=\"grafico-article\">\n            <h3 class=\"grafico-titulo\">Com que frequência você consome frutas?</h3>\n            <canvas id=\"chart1\" class=\"grafico-canvas\"></canvas>\n        </article>\n    </div>\n    </section>\n    </main>\n\n    ");
				jteOutput.writeContent("\n    <script src=\"../resources/static/js/menu.js\"></script>\n    <script src=\"../resources/static/js/logoff.js\"></script>\n    <script src=\"../resources/static/js/chart-utils.js\"></script>\n    <script src=\"../resources/static/js/grafico.js\"></script>\n    <script>\n        ");
				jteOutput.writeContent("\n        document.addEventListener(\"DOMContentLoaded\", () => {\n            createPieChart(\"chart0\",\n                \"Você já passou por insegurança alimentar?\",\n                [\"Sim\", \"Não\"], [42, 58], 0\n            );\n            createPieChart(\"chart1\",\n                \"Com que frequência você consome frutas?\",\n                [\"Diariamente\", \"Raramente\", \"Nunca\"], [60, 25, 15], 1\n            );\n        });\n    </script>\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		FiltroDTO filtro = (FiltroDTO)params.get("filtro");
		render(jteOutput, jteHtmlInterceptor, filtro);
	}
}
