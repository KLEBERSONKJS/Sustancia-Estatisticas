package gg.jte.generated.ondemand;
import com.ads.sustancia.model.Usuario;
import java.time.format.DateTimeFormatter;
@SuppressWarnings("unchecked")
public final class JteperfilGenerated {
	public static final String JTE_NAME = "perfil.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,3,3,3,11,11,11,12,12,12,12,12,12,12,12,12,17,17,17,18,18,18,18,18,18,18,18,18,24,24,24,24,24,24,24,24,24,29,29,29,60,60,60,61,61,61,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Usuario user) {
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <div class=\"profile-card\">\r\n        <div class=\"card-header\">\r\n            <h3>Dados Pessoais</h3>\r\n        </div>\r\n        <div class=\"card-body\">\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Nome:</span>\r\n                <span class=\"field-value\" id=\"profileName\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(user.getNome());
				jteOutput.writeContent("</span>\r\n                 <input class=\"field-input\" type=\"text\" id=\"editName\"");
				var __jte_html_attribute_0 = user.getNome();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" style=\"display: none;\">\r\n                <button onclick=\"toggleEdit('Name')\">✏️</button>\r\n            </div>\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Email:</span>\r\n                <span class=\"field-value\" id=\"profileEmail\">");
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
				jteOutput.writeContent(" style=\"display: none;\">\r\n                <button onclick=\"toggleEdit('Email')\">✏️</button>\r\n            </div>\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Senha:</span>\r\n                <span class=\"field-value\" id=\"profilePassword\">••••••••</span>\r\n                <input class=\"field-input\" type=\"password\" id=\"editPassword\"");
				var __jte_html_attribute_2 = user.getSenha();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" style=\"display: none;\">\r\n                <button onclick=\"toggleVisibility('Password')\">👁️</button>\r\n            </div>\r\n            <div class=\"profile-field\">\r\n                <span class=\"field-label\">Nascimento:</span>\r\n                <span class=\"field-value\" id=\"profileBirthdate\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(user.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				jteOutput.writeContent("</span>\r\n                \r\n            </div>\r\n        </div>\r\n    </div>\r\n     <script>\r\n        function toggleVisibility(field) {\r\n            const span = document.getElementById(\"profile\" + field);\r\n            const input = document.getElementById(\"edit\" + field);\r\n            if (span.innerText === \"••••••••\" || span.innerText === \"*********\") {\r\n                span.innerText = input.value;\r\n            } else {\r\n                span.innerText = field === \"Password\" ? \"••••••••\" : \"*********\";\r\n            }\r\n        }\r\n\r\n        function toggleEdit(field) {\r\n            const span = document.getElementById(\"profile\" + field);\r\n            const input = document.getElementById(\"edit\" + field);\r\n            const isEditing = input.style.display === \"inline\";\r\n\r\n            if (isEditing) {\r\n                span.innerText = input.value;\r\n                input.style.display = \"none\";\r\n                span.style.display = \"inline\";\r\n            } else {\r\n                input.style.display = \"inline\";\r\n                span.style.display = \"none\";\r\n            }\r\n        }\r\n    </script>\r\n");
			}
		});
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Usuario user = (Usuario)params.get("user");
		render(jteOutput, jteHtmlInterceptor, user);
	}
}
