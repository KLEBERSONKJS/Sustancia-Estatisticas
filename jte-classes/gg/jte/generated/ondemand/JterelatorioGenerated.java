package gg.jte.generated.ondemand;
import com.ads.sustancia.enums.*;
import com.ads.sustancia.dto.request.FiltroDTO;
import com.ads.sustancia.model.Resposta;
import com.ads.sustancia.dto.response.DadosGraficoDTO;
import java.util.Objects;
import com.ads.sustancia.model.Resposta;
import java.util.List;;
@SuppressWarnings("unchecked")
public final class JterelatorioGenerated {
	public static final String JTE_NAME = "relatorio.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,6,9,9,9,9,17,17,17,17,20,22,28,28,29,29,29,29,29,29,29,29,29,29,29,29,30,30,38,38,39,39,39,39,39,39,39,39,39,39,39,39,40,40,48,48,49,49,49,49,49,49,49,49,49,49,49,49,50,50,58,58,59,59,59,59,59,59,59,59,59,59,59,59,60,60,68,68,69,69,69,69,69,69,69,69,69,69,69,69,70,70,78,78,79,79,79,79,79,79,79,79,79,79,79,79,80,80,88,88,89,89,89,89,89,89,89,89,89,89,89,89,90,90,98,98,99,99,99,99,99,99,99,99,99,99,99,99,100,100,107,110,110,110,111,111,111,111,111,111,111,111,111,115,115,115,116,116,116,116,116,116,116,116,116,120,120,120,121,121,121,121,121,121,121,121,121,124,124,126,126,126,127,127,127,127,127,127,127,127,127,129,129,136,136,136,138,144,146,146,146,148,148,149,149,149,150,150,150,150,151,151,151,152,152,155,155,155,157,157,158,158,158,159,159,159,159,160,160,160,161,161,164,164,164,165,165,165,166,166,167,167,167,168,168,168,168,169,169,169,170,170,173,173,174,174,174,176,176,177,177,177,178,178,178,178,179,179,179,180,180,182,182,189,189,189,9,10,11,12,13,13,13,13};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, FiltroDTO filtro, DadosGraficoDTO refeicaoPCelular, DadosGraficoDTO refeicoes, DadosGraficoDTO consumoOntem, List<DadosGraficoDTO> inseguracaAlimentarList) {
		jteOutput.writeContent("\n\n\n    ");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n        <section class=\" container-relatorio\">\n\n        ");
				jteOutput.writeContent("\n        <form action=\"/relatorio\" method=\"get\" class=\"filtros-horizontal\">\n            ");
				jteOutput.writeContent("\n\n            <div class=\"filtro-item\">\n                <label for=\"raca\">Raça/Cor:</label>\n                <select id=\"raca\" name=\"raca\">\n                    <option value=\"\">Todas</option>\n                    ");
				for (RacaEnum raca : RacaEnum.values()) {
					jteOutput.writeContent("\n                    <option");
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
					jteOutput.writeContent("</option>\n                    ");
				}
				jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filtro-item\">\n                <label for=\"religiao\">Religião:</label>\n                <select id=\"religiao\" name=\"religiao\">\n                    <option value=\"\">Todas</option>\n                    ");
				for (ReligiaoEnum religiao : ReligiaoEnum.values()) {
					jteOutput.writeContent("\n                    <option");
					var __jte_html_attribute_1 = religiao.name();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("option", "value");
						jteOutput.writeUserContent(__jte_html_attribute_1);
						jteOutput.setContext("option", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">");
					jteOutput.setContext("option", null);
					jteOutput.writeUserContent(religiao.name());
					jteOutput.writeContent("</option>\n                    ");
				}
				jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filtro-item\">\n                <label for=\"genero\">Gênero:</label>\n                <select id=\"genero\" name=\"genero\">\n                    <option value=\"\">Todos</option>\n                    ");
				for (GeneroEnum genero : GeneroEnum.values()) {
					jteOutput.writeContent("\n                    <option");
					var __jte_html_attribute_2 = genero.name();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("option", "value");
						jteOutput.writeUserContent(__jte_html_attribute_2);
						jteOutput.setContext("option", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">");
					jteOutput.setContext("option", null);
					jteOutput.writeUserContent(genero.name());
					jteOutput.writeContent("</option>\n                    ");
				}
				jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filtro-item\">\n                <label for=\"escolaridade\">Escolaridade:</label>\n                <select id=\"escolaridade\" name=\"escolaridade\">\n                    <option value=\"\">Todas</option>\n                    ");
				for (EscolaridadeEnum escolaridade : EscolaridadeEnum.values()) {
					jteOutput.writeContent("\n                    <option");
					var __jte_html_attribute_3 = escolaridade.name();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("option", "value");
						jteOutput.writeUserContent(__jte_html_attribute_3);
						jteOutput.setContext("option", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">");
					jteOutput.setContext("option", null);
					jteOutput.writeUserContent(escolaridade.name());
					jteOutput.writeContent("</option>\n                    ");
				}
				jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filtro-item\">\n                <label for=\"estadoCivil\">Estado Civil:</label>\n                <select id=\"estadoCivil\" name=\"estadoCivil\">\n                    <option value=\"\">Todos</option>\n                    ");
				for (EstadoCivilEnum estadoCivil : EstadoCivilEnum.values()) {
					jteOutput.writeContent("\n                    <option");
					var __jte_html_attribute_4 = estadoCivil.name();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("option", "value");
						jteOutput.writeUserContent(__jte_html_attribute_4);
						jteOutput.setContext("option", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">");
					jteOutput.setContext("option", null);
					jteOutput.writeUserContent(estadoCivil.name());
					jteOutput.writeContent("</option>\n                    ");
				}
				jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filtro-item\">\n                <label for=\"emprego\">Situação de Emprego:</label>\n                <select id=\"emprego\" name=\"emprego\">\n                    <option value=\"\">Todas</option>\n                    ");
				for (EmpregoEnum emprego : EmpregoEnum.values()) {
					jteOutput.writeContent("\n                    <option");
					var __jte_html_attribute_5 = emprego.name();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_5)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("option", "value");
						jteOutput.writeUserContent(__jte_html_attribute_5);
						jteOutput.setContext("option", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">");
					jteOutput.setContext("option", null);
					jteOutput.writeUserContent(emprego.name());
					jteOutput.writeContent("</option>\n                    ");
				}
				jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filtro-item\">\n                <label for=\"dependentes\">Número de Dependentes:</label>\n                <select id=\"dependentes\" name=\"dependentes\">\n                    <option value=\"\">Todos</option>\n                    ");
				for (DependentesEnum dependentes : DependentesEnum.values()) {
					jteOutput.writeContent("\n                    <option");
					var __jte_html_attribute_6 = dependentes.name();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_6)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("option", "value");
						jteOutput.writeUserContent(__jte_html_attribute_6);
						jteOutput.setContext("option", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">");
					jteOutput.setContext("option", null);
					jteOutput.writeUserContent(dependentes.name());
					jteOutput.writeContent("</option>\n                    ");
				}
				jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filtro-item\">\n                <label for=\"auxilio\">Auxílio do Governo:</label>\n                <select id=\"auxilio\" name=\"auxilio\">\n                    <option value=\"\">Todos</option>\n                    ");
				for (AuxilioEnum auxilio : AuxilioEnum.values()) {
					jteOutput.writeContent("\n                    <option");
					var __jte_html_attribute_7 = auxilio.name();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_7)) {
						jteOutput.writeContent(" value=\"");
						jteOutput.setContext("option", "value");
						jteOutput.writeUserContent(__jte_html_attribute_7);
						jteOutput.setContext("option", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">");
					jteOutput.setContext("option", null);
					jteOutput.writeUserContent(auxilio.name());
					jteOutput.writeContent("</option>\n                    ");
				}
				jteOutput.writeContent("\n                </select>\n            </div>\n\n            <button type=\"submit\" class=\"botao botao-principal\">Gerar Relatório</button>\n        </form>\n\n        ");
				jteOutput.writeContent("\n        <div class=\"graficos-grid\">\n            <article class=\"grafico-article\">\n                <h3 class=\"grafico-titulo\">");
				jteOutput.setContext("h3", null);
				jteOutput.writeUserContent(refeicaoPCelular.getPergunta());
				jteOutput.writeContent("</h3>\n                <canvas");
				var __jte_html_attribute_8 = refeicaoPCelular.hashCode();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_8)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("canvas", "id");
					jteOutput.writeUserContent(__jte_html_attribute_8);
					jteOutput.setContext("canvas", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"grafico-canvas\"></canvas>\n            </article>\n\n            <article class=\"grafico-article\">\n                <h3 class=\"grafico-titulo\">");
				jteOutput.setContext("h3", null);
				jteOutput.writeUserContent(refeicoes.getPergunta());
				jteOutput.writeContent("</h3>\n                <canvas");
				var __jte_html_attribute_9 = refeicoes.hashCode();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_9)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("canvas", "id");
					jteOutput.writeUserContent(__jte_html_attribute_9);
					jteOutput.setContext("canvas", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"grafico-canvas\"></canvas>\n            </article>\n\n            <article class=\"grafico-article\">\n                <h3 class=\"grafico-titulo\">");
				jteOutput.setContext("h3", null);
				jteOutput.writeUserContent(consumoOntem.getPergunta());
				jteOutput.writeContent("</h3>\n                <canvas");
				var __jte_html_attribute_10 = consumoOntem.hashCode();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_10)) {
					jteOutput.writeContent(" id=\"");
					jteOutput.setContext("canvas", "id");
					jteOutput.writeUserContent(__jte_html_attribute_10);
					jteOutput.setContext("canvas", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"grafico-canvas\"></canvas>\n            </article>\n\n            ");
				for (DadosGraficoDTO d: inseguracaAlimentarList) {
					jteOutput.writeContent("\n            <article class=\"grafico-article\">\n                <h3 class=\"grafico-titulo\">");
					jteOutput.setContext("h3", null);
					jteOutput.writeUserContent(d.getPergunta());
					jteOutput.writeContent("</h3>\n                <canvas");
					var __jte_html_attribute_11 = d.hashCode();
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_11)) {
						jteOutput.writeContent(" id=\"");
						jteOutput.setContext("canvas", "id");
						jteOutput.writeUserContent(__jte_html_attribute_11);
						jteOutput.setContext("canvas", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(" class=\"grafico-canvas\"></canvas>\n            </article>\n            ");
				}
				jteOutput.writeContent("\n\n        </div>\n\n        </section>\n        </section>\n        </main>\n        ");
			}
		});
		jteOutput.writeContent("\n\n        ");
		jteOutput.writeContent("\n        <script src=\"/js/menu.js\"></script>\n        <script src=\"/js/logoff.js\"></script>\n        <script src=\"/js/chart-utils.js\"></script>\n        <script src=\"/js/grafico.js\"></script>\n        <script>\n            ");
		jteOutput.writeContent("\n            document.addEventListener(\"DOMContentLoaded\", () => {\n                createPieChart(\"");
		jteOutput.setContext("script", null);
		jteOutput.writeUserContent(refeicaoPCelular.hashCode());
		jteOutput.writeContent("\",\n                    \"\",\n                    [");
		for (Resposta r: refeicaoPCelular.getRespostas()) {
			jteOutput.writeContent("\n            \"");
			jteOutput.setContext("script", null);
			jteOutput.writeUserContent(r.getCampo().replace("-", " "));
			jteOutput.writeContent("\",\n                ");
		}
		jteOutput.writeContent("], [");
		for (Resposta r: refeicaoPCelular.getRespostas()) {
			jteOutput.writeContent("\n            ");
			jteOutput.setContext("script", null);
			jteOutput.writeUserContent(r.getValor());
			jteOutput.writeContent(",\n                ");
		}
		jteOutput.writeContent("], 0\n        );\n\n            createPieChart(\"");
		jteOutput.setContext("script", null);
		jteOutput.writeUserContent(refeicoes.hashCode());
		jteOutput.writeContent("\",\n                \"\",\n                [");
		for (Resposta r: refeicoes.getRespostas()) {
			jteOutput.writeContent("\n            \"");
			jteOutput.setContext("script", null);
			jteOutput.writeUserContent(r.getCampo().replace("_", " "));
			jteOutput.writeContent("\",\n                ");
		}
		jteOutput.writeContent("], [");
		for (Resposta r: refeicoes.getRespostas()) {
			jteOutput.writeContent("\n            ");
			jteOutput.setContext("script", null);
			jteOutput.writeUserContent(r.getValor());
			jteOutput.writeContent(",\n                ");
		}
		jteOutput.writeContent("], 0\n        );\n\n            createPieChart(\"");
		jteOutput.setContext("script", null);
		jteOutput.writeUserContent(consumoOntem.hashCode());
		jteOutput.writeContent("\",\n                \"");
		jteOutput.setContext("script", null);
		jteOutput.writeUserContent(consumoOntem.getPergunta());
		jteOutput.writeContent("\",\n                [");
		for (Resposta r: consumoOntem.getRespostas()) {
			jteOutput.writeContent("\n            \"");
			jteOutput.setContext("script", null);
			jteOutput.writeUserContent(r.getCampo().replace("_", " "));
			jteOutput.writeContent("\",\n                ");
		}
		jteOutput.writeContent("], [");
		for (Resposta r: consumoOntem.getRespostas()) {
			jteOutput.writeContent("\n        ");
			jteOutput.setContext("script", null);
			jteOutput.writeUserContent(r.getValor());
			jteOutput.writeContent(",\n            ");
		}
		jteOutput.writeContent("], 0\n        );\n\n            ");
		for (DadosGraficoDTO d: inseguracaAlimentarList) {
			jteOutput.writeContent("\n            createPieChart(\"");
			jteOutput.setContext("script", null);
			jteOutput.writeUserContent(d.hashCode());
			jteOutput.writeContent("\",\n                \"\",\n                [");
			for (Resposta r: d.getRespostas()) {
				jteOutput.writeContent("\n            \"");
				jteOutput.setContext("script", null);
				jteOutput.writeUserContent(r.getCampo());
				jteOutput.writeContent("\",\n                ");
			}
			jteOutput.writeContent("], [");
			for (Resposta r: d.getRespostas()) {
				jteOutput.writeContent("\n        ");
				jteOutput.setContext("script", null);
				jteOutput.writeUserContent(r.getValor());
				jteOutput.writeContent(",\n            ");
			}
			jteOutput.writeContent("], 0\n        );\n            ");
		}
		jteOutput.writeContent("\n\n    });\n\n\n\n\n        </script>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		FiltroDTO filtro = (FiltroDTO)params.get("filtro");
		DadosGraficoDTO refeicaoPCelular = (DadosGraficoDTO)params.get("refeicaoPCelular");
		DadosGraficoDTO refeicoes = (DadosGraficoDTO)params.get("refeicoes");
		DadosGraficoDTO consumoOntem = (DadosGraficoDTO)params.get("consumoOntem");
		List<DadosGraficoDTO> inseguracaAlimentarList = (List<DadosGraficoDTO>)params.getOrDefault("inseguracaAlimentarList", null);
		render(jteOutput, jteHtmlInterceptor, filtro, refeicaoPCelular, refeicoes, consumoOntem, inseguracaAlimentarList);
	}
}
