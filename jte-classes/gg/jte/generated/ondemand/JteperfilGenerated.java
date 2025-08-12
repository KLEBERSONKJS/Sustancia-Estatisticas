package gg.jte.generated.ondemand;
import com.ads.sustancia.dto.request.UsuarioDTO;
import java.time.format.DateTimeFormatter;
@SuppressWarnings("unchecked")
public final class JteperfilGenerated {
	public static final String JTE_NAME = "perfil.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,5,5,5,5,13,13,13,14,14,14,15,15,15,15,15,15,15,15,15,20,20,20,21,21,21,21,21,21,21,21,21,27,27,27,27,27,27,27,27,27,33,33,34,34,34,35,35,53,53,53,54,54,54,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsuarioDTO user) {
		jteOutput.writeContent("\r\n\r\n");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <div class=\"profile-card\">\r\n        <div class=\"card-header\">\r\n            <h3>Dados Pessoais</h3>\r\n        </div>\r\n        <div class=\"card-body\">\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Nome:</span>\r\n                <span class=\"field-value\" id=\"profileName\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(user.getNome());
				jteOutput.writeContent("</span>\r\n                <p >");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.getNome());
				jteOutput.writeContent("</p>\r\n                 <input class=\"field-input\" type=\"text\" id=\"editName\"");
				var __jte_html_attribute_0 = user.getNome();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" style=\"display: none;\">\r\n               \r\n            </div>\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Email:</span>\r\n                <span class=\"field-value\" id=\"profileEmail\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(user.getEmail());
				jteOutput.writeContent("</span>\r\n                 <input class=\"field-input\" type=\"email\" id=\"editEmail\"");
				var __jte_html_attribute_1 = user.getEmail();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" style=\"display: none;\">\r\n                \r\n            </div>\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Senha:</span>\r\n                <span class=\"field-value\" id=\"profilePassword\">••••••••</span>\r\n                <input class=\"field-input\" type=\"password\" id=\"editPassword\"");
				var __jte_html_attribute_2 = user.getSenha();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" style=\"display: none;\">\r\n                \r\n            </div>\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Nascimento:</span>\r\n                <span class=\"field-value\" id=\"profileBirthdate\">\r\n                    ");
				if (user.getDataNascimento()!=null) {
					jteOutput.writeContent("\r\n                        ");
					jteOutput.setContext("span", null);
					jteOutput.writeUserContent(user.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
					jteOutput.writeContent("\r\n                    ");
				}
				jteOutput.writeContent("\r\n                </span>\r\n                \r\n            </div>\r\n        </div>\r\n    </div>\r\n\r\n    <script>\r\n        function toggleVisibility(field) {\r\n            const span = document.getElementById(\"profile\" + field);\r\n            const input = document.getElementById(\"edit\" + field);\r\n            if (span.innerText === \"••••••••\" || span.innerText === \"*********\") {\r\n                span.innerText = input.value;\r\n            } else {\r\n                span.innerText = field === \"Password\" ? \"••••••••\" : \"*********\";\r\n            }\r\n        }\r\n    </script>\r\n");
			}
		});
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsuarioDTO user = (UsuarioDTO)params.get("user");
		render(jteOutput, jteHtmlInterceptor, user);
	}
}
