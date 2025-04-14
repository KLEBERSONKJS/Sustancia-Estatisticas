package gg.jte.generated.ondemand;
import com.ads.sustancia.dto.request.EntrevistadorDTO;
import java.util.List;;
@SuppressWarnings("unchecked")
public final class JteentrevistadoresGenerated {
	public static final String JTE_NAME = "entrevistadores.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,4,4,4,4,33,33,36,36,41,41,41,42,42,42,46,46,49,49,52,52,52,53,53,53,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<EntrevistadorDTO> entrevistadores) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n<section class=\"entrevistador-container\">\r\n<div class=\"entrevistadores-formulario-horizontal\">\r\n    <h3>Cadastrar Entrevistador</h3>\r\n    <form action=\"/entrevistador/cadastrar\" method=\"post\" class=\"formulario-horizontal\">\r\n        <div class=\"form-group\">\r\n            <label for=\"nome\">Nome:</label>\r\n            <input type=\"text\" id=\"nome\" name=\"nome\" required placeholder=\"Digite o Nome do Entrevistador\">\r\n        </div>\r\n\r\n        <div class=\"form-group\">\r\n            <label for=\"email\">Email:</label>\r\n            <input type=\"email\" id=\"email\" name=\"email\" required placeholder=\"Digite o email do Entrevistador\">\r\n        </div>\r\n\r\n        <div class=\"form-group\">\r\n            <label for=\"senha\">Senha:</label>\r\n            <input type=\"password\" id=\"senha\" name=\"senha\" required placeholder=\"Digite a senha\">\r\n        </div>\r\n\r\n        <div class=\"form-group\">\r\n            <label for=\"dataNascimento\">Data de Nascimento:</label>\r\n            <input type=\"date\" id=\"dataNascimento\" name=\"dataNascimento\" required>\r\n        </div>\r\n\r\n        <button type=\"submit\" class=\"btn-salvar\">Cadastrar Entrevistador</button>\r\n    </form>\r\n</div>\r\n    ");
				if (entrevistadores != null && !entrevistadores.isEmpty()) {
					jteOutput.writeContent("\r\n <div class=\"entrevistadores-cards\">    \r\n    <div class=\"cards\">\r\n        ");
					for (EntrevistadorDTO e: entrevistadores) {
						jteOutput.writeContent("\r\n        <article class=\"card\">\r\n            <div class=\"card-header\">\r\n                <img src=\"/assets/icons/portrait.svg\" alt=\"Entrevistador\" class=\"foto-entrevistador\">\r\n                <div class=\"info-entrevista\">\r\n                    <h4>");
						jteOutput.setContext("h4", null);
						jteOutput.writeUserContent(e.getNome());
						jteOutput.writeContent("</h4>\r\n                    <p>");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(e.getEmail());
						jteOutput.writeContent("</p>\r\n                </div>\r\n            </div>\r\n        </article>\r\n        ");
					}
					jteOutput.writeContent("\r\n    </div>\r\n</div>\r\n    ");
				}
				jteOutput.writeContent("\r\n</section>\r\n\r\n");
			}
		});
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<EntrevistadorDTO> entrevistadores = (List<EntrevistadorDTO>)params.getOrDefault("entrevistadores", null);
		render(jteOutput, jteHtmlInterceptor, entrevistadores);
	}
}
