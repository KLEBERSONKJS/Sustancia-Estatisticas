package gg.jte.generated.ondemand;
import com.ads.sustancia.dto.request.EntrevistadorDTO;
import java.util.List;;
@SuppressWarnings("unchecked")
public final class JteentrevistadoresGenerated {
	public static final String JTE_NAME = "entrevistadores.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,4,4,4,4,36,36,38,39,39,44,44,44,45,45,45,50,50,51,51,55,55,55,56,56,56,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<EntrevistadorDTO> entrevistadores) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n        <div class=\"form-container\">\n            <h3>Cadastrar Entrevistador</h3>\n            <form method=\"post\" action=\"/entrevistador/cadastrar\" class=\"entrevistador-form\">\n                <input type=\"hidden\" id=\"entrevistador-id\" name=\"id\">\n\n                <div class=\"form-group\">\n                    <label for=\"nome\">Nome</label>\n                    <input type=\"text\" id=\"nome\" name=\"nome\" placeholder=\"Digite o nome\" required>\n                </div>\n\n                <div class=\"form-group\">\n                    <label for=\"email\">Email</label>\n                    <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Digite o email\" required>\n                </div>\n\n                <div class=\"form-group\">\n                    <label for=\"senha\">Senha</label>\n                    <input type=\"password\" id=\"senha\" name=\"senha\" placeholder=\"Digite a senha\" required>\n                </div>\n\n                <div class=\"form-group\">\n                    <label for=\"dataNascimento\">Data de Nascimento</label>\n                    <input type=\"date\" id=\"dataNascimento\" name=\"dataNascimento\" required>\n                </div>\n\n                <button type=\"submit\" class=\"btn-salvar\">Salvar</button>\n            </form>\n        </div>\n\n        <section class=\"entrevistador-container\">\n        ");
				if (entrevistadores!= null && !entrevistadores.isEmpty()) {
					jteOutput.writeContent("\n        <div class=\"cards\">\n            ");
					jteOutput.writeContent("\n            ");
					for (EntrevistadorDTO e: entrevistadores) {
						jteOutput.writeContent("\n                <article class=\"card\">\n                    <div class=\"card-header\">\n                        <img src=\"/assets/icons/portrait.svg\" alt=\"Entrevistador\" class=\"foto-entrevistador\">\n                        <div class=\"info-entrevista\">\n                            <h4>");
						jteOutput.setContext("h4", null);
						jteOutput.writeUserContent(e.getNome());
						jteOutput.writeContent("</h4>\n                            <p>");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(e.getEmail());
						jteOutput.writeContent("</p>\n                        </div>\n                    </div>\n                </article>\n\n            ");
					}
					jteOutput.writeContent("\n            ");
				}
				jteOutput.writeContent("\n        </div>\n    </section>\n\n");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<EntrevistadorDTO> entrevistadores = (List<EntrevistadorDTO>)params.getOrDefault("entrevistadores", null);
		render(jteOutput, jteHtmlInterceptor, entrevistadores);
	}
}
