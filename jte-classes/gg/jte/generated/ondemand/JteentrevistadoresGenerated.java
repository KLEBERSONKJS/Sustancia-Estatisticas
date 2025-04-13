package gg.jte.generated.ondemand;
import com.ads.sustancia.dto.request.EntrevistadorDTO;
import java.util.List;;
@SuppressWarnings("unchecked")
public final class JteentrevistadoresGenerated {
	public static final String JTE_NAME = "entrevistadores.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,4,4,4,4,6,6,8,9,9,14,14,14,15,15,15,19,19,20,20,24,24,24,25,25,25,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<EntrevistadorDTO> entrevistadores) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n    ");
				if (entrevistadores!= null && !entrevistadores.isEmpty()) {
					jteOutput.writeContent("\n        <div class=\"cards\">\n        ");
					jteOutput.writeContent("\n        ");
					for (EntrevistadorDTO e: entrevistadores) {
						jteOutput.writeContent("\n            <article class=\"card\">\n                <div class=\"card-header\">\n                    <img src=\"/assets/icons/portrait.svg\" alt=\"Entrevistador\" class=\"foto-entrevistador\">\n                    <div class=\"info-entrevista\">\n                        <h4>");
						jteOutput.setContext("h4", null);
						jteOutput.writeUserContent(e.getNome());
						jteOutput.writeContent("</h4>\n                        <p>");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(e.getEmail());
						jteOutput.writeContent("</p>\n                    </div>\n                </div>\n            </article>\n        ");
					}
					jteOutput.writeContent("\n    ");
				}
				jteOutput.writeContent("\n    </div>\n    </section>\n\n");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<EntrevistadorDTO> entrevistadores = (List<EntrevistadorDTO>)params.getOrDefault("entrevistadores", null);
		render(jteOutput, jteHtmlInterceptor, entrevistadores);
	}
}
