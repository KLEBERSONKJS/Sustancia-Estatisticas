package gg.jte.generated.ondemand;
import com.ads.sustancia.dto.request.EntrevistadorDTO;
import java.util.List;;
@SuppressWarnings("unchecked")
public final class JteentrevistadoresGenerated {
	public static final String JTE_NAME = "entrevistadores.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,4,4,4,4,6,6,8,9,9,14,14,14,15,15,15,22,22,23,23,27,27,27,28,28,28,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<EntrevistadorDTO> entrevistadores) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n    ");
				if (entrevistadores!= null && !entrevistadores.isEmpty()) {
					jteOutput.writeContent("\r\n        <div class=\"cards\">\r\n        ");
					jteOutput.writeContent("\r\n        ");
					for (EntrevistadorDTO e: entrevistadores) {
						jteOutput.writeContent("\r\n            <article class=\"card\">\r\n                <div class=\"card-header\">\r\n                    <img src=\"/assets/icons/portrait.svg\" alt=\"Entrevistador\" class=\"foto-entrevistador\">\r\n                    <div class=\"info-entrevista\">\r\n                        <h4>");
						jteOutput.setContext("h4", null);
						jteOutput.writeUserContent(e.getNome());
						jteOutput.writeContent("</h4>\r\n                        <p>");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(e.getEmail());
						jteOutput.writeContent("</p>\r\n                    </div>\r\n                </div>\r\n            </article>\r\n\r\n            <div class=\"retangulo-arredondado\"> Botão </div>\r\n\r\n        ");
					}
					jteOutput.writeContent("\r\n    ");
				}
				jteOutput.writeContent("\r\n    </div>\r\n    </section>\r\n\r\n");
			}
		});
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<EntrevistadorDTO> entrevistadores = (List<EntrevistadorDTO>)params.getOrDefault("entrevistadores", null);
		render(jteOutput, jteHtmlInterceptor, entrevistadores);
	}
}
