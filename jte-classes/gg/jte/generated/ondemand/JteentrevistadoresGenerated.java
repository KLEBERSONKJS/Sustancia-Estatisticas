package gg.jte.generated.ondemand;
import com.ads.sustancia.dto.request.EntrevistadorDTO;
import java.util.List;;
@SuppressWarnings("unchecked")
public final class JteentrevistadoresGenerated {
	public static final String JTE_NAME = "entrevistadores.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,5,5,5,10,10,11,11,11,12,12,13,13,14,14,14,15,15,41,41,44,44,49,49,49,50,50,50,54,54,57,57,60,60,60,60,60,2,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<EntrevistadorDTO> entrevistadores, String error, String mensagem) {
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n<section class=\"entrevistador-container\">\n    <div class=\"entrevistadores-formulario-horizontal\">\n        <h3>Cadastrar Entrevistador</h3>\n        ");
				if (error!=null) {
					jteOutput.writeContent("\n        <p style=\"color:red\">");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(error);
					jteOutput.writeContent("</p>\n        ");
				}
				jteOutput.writeContent("\n        ");
				if (mensagem!=null) {
					jteOutput.writeContent("\n            <p style=\"color:red\">");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(mensagem);
					jteOutput.writeContent("</p>\n        ");
				}
				jteOutput.writeContent("\n        <form action=\"/entrevistador/cadastrar\" method=\"post\" class=\"formulario-horizontal\">\n            <div class=\"form-group\">\n                <label for=\"nome\">Nome:</label>\n                <input type=\"text\" id=\"nome\" name=\"nome\" required placeholder=\"Digite o Nome do Entrevistador\">\n            </div>\n\n            <div class=\"form-group\">\n                <label for=\"email\">Email:</label>\n                <input type=\"email\" id=\"email\" name=\"email\" required placeholder=\"Digite o email do Entrevistador\">\n            </div>\n\n            <div class=\"form-group\">\n                <label for=\"senha\">Senha:</label>\n                <input type=\"password\" id=\"senha\" name=\"senha\" required placeholder=\"Digite a senha\">\n            </div>\n\n            <div class=\"form-group\">\n                <label for=\"dataNascimento\">Data de Nascimento:</label>\n                <input type=\"date\" id=\"dataNascimento\" name=\"dataNascimento\" required>\n            </div>\n\n            <button type=\"submit\" class=\"btn-salvar\">Cadastrar Entrevistador</button>\n        </form>\n    </div>\n    \n    ");
				if (entrevistadores != null && !entrevistadores.isEmpty()) {
					jteOutput.writeContent("\n <div class=\"entrevistadores-cards\">    \n    <div class=\"cards\">\n        ");
					for (EntrevistadorDTO e: entrevistadores) {
						jteOutput.writeContent("\n        <article class=\"card\">\n            <div class=\"card-header\">\n                <img src=\"/assets/icons/portrait.svg\" alt=\"Entrevistador\" class=\"foto-entrevistador\">\n                <div class=\"info-entrevista\">\n                    <h2>");
						jteOutput.setContext("h2", null);
						jteOutput.writeUserContent(e.getNome());
						jteOutput.writeContent("</h2>\n                    <h1>");
						jteOutput.setContext("h1", null);
						jteOutput.writeUserContent(e.getEmail());
						jteOutput.writeContent("</h1>\n                </div>\n            </div>\n        </article>\n        ");
					}
					jteOutput.writeContent("\n    </div>\n</div>\n    ");
				}
				jteOutput.writeContent("\n</section>\n\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<EntrevistadorDTO> entrevistadores = (List<EntrevistadorDTO>)params.getOrDefault("entrevistadores", null);
		String error = (String)params.get("error");
		String mensagem = (String)params.get("mensagem");
		render(jteOutput, jteHtmlInterceptor, entrevistadores, error, mensagem);
	}
}
