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
				jteOutput.writeContent("\n    <div class=\"profile-card\">\n        <div class=\"card-header\">\n            <h3>Dados Pessoais</h3>\n        </div>\n        <div class=\"card-body\">\n            <div class=\"profile-field\">\n                <span class=\"field-label\">Nome:</span>\n                <span class=\"field-value\" id=\"profileName\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(user.getNome());
				jteOutput.writeContent("</span>\n                 <input class=\"field-input\" type=\"text\" id=\"editName\"");
				var __jte_html_attribute_0 = user.getNome();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" style=\"display: none;\">\n                <button onclick=\"toggleEdit('Name')\">✏️</button>\n            </div>\n            <div class=\"profile-field\">\n                <span class=\"field-label\">Email:</span>\n                <span class=\"field-value\" id=\"profileEmail\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(user.getEmail());
				jteOutput.writeContent("</span>\n                 <input class=\"field-input\" type=\"email\" id=\"editEmail\"");
				var __jte_html_attribute_1 = user.getEmail();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" style=\"display: none;\">\n                <button onclick=\"toggleEdit('Email')\">✏️</button>\n            </div>\n            <div class=\"profile-field\">\n                <span class=\"field-label\">Senha:</span>\n                <span class=\"field-value\" id=\"profilePassword\">••••••••</span>\n                <input class=\"field-input\" type=\"password\" id=\"editPassword\"");
				var __jte_html_attribute_2 = user.getSenha();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" style=\"display: none;\">\n                <button onclick=\"toggleVisibility('Password')\">👁️</button>\n            </div>\n            <div class=\"profile-field\">\n                <span class=\"field-label\">Nascimento:</span>\n                <span class=\"field-value\" id=\"profileBirthdate\">");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(user.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				jteOutput.writeContent("</span>\n                \n            </div>\n        </div>\n    </div>\n     <script>\n        function toggleVisibility(field) {\n            const span = document.getElementById(\"profile\" + field);\n            const input = document.getElementById(\"edit\" + field);\n            if (span.innerText === \"••••••••\" || span.innerText === \"*********\") {\n                span.innerText = input.value;\n            } else {\n                span.innerText = field === \"Password\" ? \"••••••••\" : \"*********\";\n            }\n        }\n\n        function toggleEdit(field) {\n            const span = document.getElementById(\"profile\" + field);\n            const input = document.getElementById(\"edit\" + field);\n            const isEditing = input.style.display === \"inline\";\n\n            if (isEditing) {\n                span.innerText = input.value;\n                input.style.display = \"none\";\n                span.style.display = \"inline\";\n            } else {\n                input.style.display = \"inline\";\n                span.style.display = \"none\";\n            }\n        }\n    </script>\n");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Usuario user = (Usuario)params.get("user");
		render(jteOutput, jteHtmlInterceptor, user);
	}
}
