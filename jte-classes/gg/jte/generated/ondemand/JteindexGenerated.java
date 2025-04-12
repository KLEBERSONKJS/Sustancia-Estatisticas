package gg.jte.generated.ondemand;
import com.ads.sustancia.enums.*;
import com.ads.sustancia.dto.request.FiltroDTO;
import com.ads.sustancia.model.Resposta;
import com.ads.sustancia.dto.response.DadosGraficoDTO;
import java.util.Objects;
@SuppressWarnings("unchecked")
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,6,6,6,6,8,8,8,8,10,23,23,23,23,23,6,6,6,6};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, FiltroDTO filtro) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n    ");
				jteOutput.writeContent("\r\n    <div class=\"graficos-grid\">\r\n        <article class=\"grafico-article\">\r\n            <h3 class=\"grafico-titulo\">Você já passou por insegurança alimentar?</h3>\r\n            <canvas id=\"chart0\" class=\"grafico-canvas\"></canvas>\r\n        </article>\r\n\r\n        <article class=\"grafico-article\">\r\n            <h3 class=\"grafico-titulo\">Com que frequência você consome frutas?</h3>\r\n            <canvas id=\"chart1\" class=\"grafico-canvas\"></canvas>\r\n        </article>\r\n    </div>\r\n\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		FiltroDTO filtro = (FiltroDTO)params.get("filtro");
		render(jteOutput, jteHtmlInterceptor, filtro);
	}
}
