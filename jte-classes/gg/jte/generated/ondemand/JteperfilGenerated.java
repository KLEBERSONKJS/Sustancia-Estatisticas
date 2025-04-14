package gg.jte.generated.ondemand;
import com.ads.sustancia.model.Usuario;
import java.time.format.DateTimeFormatter;
@SuppressWarnings("unchecked")
public final class JteperfilGenerated {
	public static final String JTE_NAME = "perfil.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,3,3,3,11,11,11,15,15,15,23,23,23,27,27,27,28,28,28,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Usuario user) {
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <div class=\"profile-card\">\r\n        <div class=\"card-header\">\r\n            <h3>Dados Pessoais</h3>\r\n        </div>\r\n        <div class=\"card-body\">\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Nome:</span>\r\n                <span class=\"field-value\" id=\"profileName\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(user.getNome());
				jteOutput.writeContent("</span>\r\n            </div>\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Email:</span>\r\n                <span class=\"field-value\" id=\"profileEmail\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(user.getEmail());
				jteOutput.writeContent("</span>\r\n            </div>\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Senha:</span>\r\n                <span class=\"field-value\" id=\"profilePassword\">••••••••</span>\r\n            </div>\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Nascimento:</span>\r\n                <span class=\"field-value\" id=\"profileBirthdate\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(user.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				jteOutput.writeContent("</span>\r\n            </div>\r\n        </div>\r\n    </div>\r\n");
			}
		});
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Usuario user = (Usuario)params.get("user");
		render(jteOutput, jteHtmlInterceptor, user);
	}
}
