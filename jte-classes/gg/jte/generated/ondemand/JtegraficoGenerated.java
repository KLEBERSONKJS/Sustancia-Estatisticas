package gg.jte.generated.ondemand;
import com.ads.sustancia.enums.*;
import com.ads.sustancia.record.FiltroDTO;
import java.util.Objects;
@SuppressWarnings("unchecked")
public final class JtegraficoGenerated {
	public static final String JTE_NAME = "grafico.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,4,107,107,107,108,108,108,108,108,108,108,108,108,109,109,109,111,111,121,121,122,122,122,122,122,122,122,122,122,123,123,123,125,125,134,134,135,135,135,135,135,135,135,135,135,136,136,136,138,138,146,146,147,147,147,147,147,147,147,147,147,148,148,148,150,150,158,158,159,159,159,159,159,159,159,159,159,160,160,160,162,162,170,170,171,171,171,171,171,171,171,171,171,172,172,172,174,174,182,182,183,183,183,183,183,183,183,183,183,184,184,184,186,186,194,194,195,195,195,195,195,195,195,195,195,196,196,196,198,198,207,211,211,211,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, FiltroDTO filtro) {
		jteOutput.writeContent("<!DOCTYPE html>\n<html lang=\"pt-BR\">\n\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Filtros Avançados</title>\n    <style>\n        body {\n            font-family: Arial, sans-serif;\n            max-width: 800px;\n            margin: 0 auto;\n            padding: 20px;\n            line-height: 1.6;\n        }\n\n        .filter-section {\n            background-color: #f5f5f5;\n            padding: 20px;\n            border-radius: 8px;\n            margin-bottom: 20px;\n            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n        }\n\n        .filter-group {\n            margin-bottom: 15px;\n        }\n\n        h1 {\n            color: #2c3e50;\n            text-align: center;\n            margin-bottom: 20px;\n        }\n\n        h2 {\n            margin-top: 0;\n            color: #333;\n            border-bottom: 1px solid #ddd;\n            padding-bottom: 10px;\n        }\n\n        label {\n            display: block;\n            margin-bottom: 5px;\n            font-weight: bold;\n            color: #2c3e50;\n        }\n\n        select,\n        input[type=\"number\"] {\n            padding: 10px;\n            width: 100%;\n            border: 1px solid #ddd;\n            border-radius: 4px;\n            font-size: 16px;\n        }\n\n        button {\n            background-color: #4CAF50;\n            color: white;\n            padding: 12px 20px;\n            border: none;\n            border-radius: 4px;\n            cursor: pointer;\n            font-size: 16px;\n            width: 100%;\n            transition: background-color 0.3s;\n        }\n\n        button:hover {\n            background-color: #45a049;\n        }\n\n        .range-inputs {\n            display: flex;\n            gap: 10px;\n        }\n\n        .range-inputs input {\n            flex: 1;\n        }\n\n        #results {\n            margin-top: 20px;\n            padding: 15px;\n            background-color: #f9f9f9;\n            border-radius: 4px;\n        }\n    </style>\n</head>\n\n<body>\n    <h1>Filtros Avançados</h1>\n\n    <form action=\"/relatorio\" method=\"get\">\n        <div class=\"filter-section\">\n            <h2>Filtrar por:</h2>\n\n            <div class=\"filter-group\">\n                <label for=\"raca\">Raça/Cor:</label>\n                <select id=\"raca\" name=\"raca\">\n                    <option value=\"\">Todos as Raças</option>\n                    ");
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
			jteOutput.writeContent(">\n                        ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(raca.name());
			jteOutput.writeContent("\n                    </option>\n                    ");
		}
		jteOutput.writeContent("\n                </select>\n            </div>\n\n\n\n            <div class=\"filter-group\">\n                <label for=\"religiao\">Religiao:</label>\n                <select id=\"religiao\" name=\"religiao\">\n                    <option value=\"\">Todas os Religiões</option>\n                    ");
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
			jteOutput.writeContent(">\n                        ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(religiao.name());
			jteOutput.writeContent("\n                    </option>\n                    ");
		}
		jteOutput.writeContent("\n                </select>\n            </div>\n\n\n            <div class=\"filter-group\">\n                <label for=\"genero\">Genero:</label>\n                <select id=\"genero\" name=\"genero\">\n                    <option value=\"\">Todos os gêneros</option>\n                    ");
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
			jteOutput.writeContent(">\n                        ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(genero.name());
			jteOutput.writeContent("\n                    </option>\n                    ");
		}
		jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filter-group\">\n                <label for=\"escolaridade\">Escolaridade:</label>\n                <select id=\"escolaridade\" name=\"escolaridade\">\n                    <option value=\"\">Todas as Escolaridade</option>\n                    ");
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
			jteOutput.writeContent(">\n                        ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(escolaridade.name());
			jteOutput.writeContent("\n                    </option>\n                    ");
		}
		jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filter-group\">\n                <label for=\"estadoCivil\">Estado Civil:</label>\n                <select id=\"estadoCivil\" name=\"estadoCivil\">\n                    <option value=\"\">Todos  estadoCivil</option>\n                    ");
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
			jteOutput.writeContent(">\n                        ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(estadoCivil.name());
			jteOutput.writeContent("\n                    </option>\n                    ");
		}
		jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filter-group\">\n                <label for=\"emprego\">Emprego:</label>\n                <select id=\"emprego\" name=\"emprego\">\n                    <option value=\"\">Todos os empregos</option>\n                    ");
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
			jteOutput.writeContent(">\n                        ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(emprego.name());
			jteOutput.writeContent("\n                    </option>\n                    ");
		}
		jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filter-group\">\n                <label for=\"dependentes\">Dependentes:</label>\n                <select id=\"dependentes\" name=\"dependentes\">\n                    <option value=\"\">Todas os dependentes</option>\n                    ");
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
			jteOutput.writeContent(">\n                        ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(dependentes.name());
			jteOutput.writeContent("\n                    </option>\n                    ");
		}
		jteOutput.writeContent("\n                </select>\n            </div>\n\n            <div class=\"filter-group\">\n                <label for=\"auxilio\">Auxilio:</label>\n                <select id=\"auxilio\" name=\"auxilio\">\n                    <option value=\"\">Todas os auxilios</option>\n                    ");
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
			jteOutput.writeContent(">\n                        ");
			jteOutput.setContext("option", null);
			jteOutput.writeUserContent(auxilio.name());
			jteOutput.writeContent("\n                    </option>\n                    ");
		}
		jteOutput.writeContent("\n                </select>\n            </div>\n\n            <button type=\"submit\">Gerar Relatório</button>\n        </div>\n    </form>\n\n    <div id=\"results\">\n        ");
		jteOutput.writeContent("\n    </div>\n</body>\n\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		FiltroDTO filtro = (FiltroDTO)params.get("filtro");
		render(jteOutput, jteHtmlInterceptor, filtro);
	}
}
