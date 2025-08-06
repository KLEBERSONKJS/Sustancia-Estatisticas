package gg.jte.generated.ondemand;
import com.ads.sustancia.dto.request.CoordenadorDTO;
import java.util.List;;
@SuppressWarnings("unchecked")
public final class JtecoordenadoresGenerated {
	public static final String JTE_NAME = "coordenadores.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,2,5,5,5,10,10,11,11,11,12,12,13,13,14,14,14,15,15,65,65,68,68,74,74,74,74,75,75,75,76,76,76,77,77,77,78,78,79,79,79,80,80,83,83,83,83,84,84,84,84,90,90,90,90,92,92,92,92,92,92,92,92,92,94,94,94,94,94,94,94,94,94,96,96,96,96,96,96,96,96,96,100,100,100,100,100,100,100,100,100,102,102,102,102,102,102,102,102,102,104,104,104,104,110,110,113,113,118,118,118,118,118,2,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, List<CoordenadorDTO> coordenadores, String error, String mensagem) {
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n\r\n<section class=\"entrevistador-container\">\r\n    <div class=\"entrevistadores-formulario-horizontal\">\r\n        <h3>Cadastrar Coordenador</h3>\r\n        ");
				if (error!=null) {
					jteOutput.writeContent("\r\n            <p style=\"color:red\">");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(error);
					jteOutput.writeContent("</p>\r\n        ");
				}
				jteOutput.writeContent("\r\n        ");
				if (mensagem!=null) {
					jteOutput.writeContent("\r\n            <p id=\"msg\" style=\"color:red; transition: opacity 0.5s ease;\">");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(mensagem);
					jteOutput.writeContent("</p>\r\n        ");
				}
				jteOutput.writeContent("\r\n        <form action=\"/coordenador/cadastrar\" method=\"post\" class=\"formulario-horizontal\">\r\n            <div class=\"form-group\">\r\n                <label for=\"nome\">Nome:</label>\r\n                <input type=\"text\" id=\"nome\" name=\"nome\" required placeholder=\"Digite o Nome do Coordenador\">\r\n            </div>\r\n\r\n            <div class=\"form-group\">\r\n                <label for=\"email\">Email:</label>\r\n                <input type=\"email\" id=\"email\" name=\"email\" required placeholder=\"Digite o email do Coordenador\">\r\n            </div>\r\n\r\n            <div class=\"form-group\">\r\n                <label for=\"cpf\">CPF:</label>\r\n                <input type=\"text\" id=\"cpf\" name=\"cpf\"\r\n                       placeholder=\"ex:000.000.000-00\"\r\n                       pattern=\"\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}\"\r\n                       title=\"Digite o CPF no formato 000.000.000-00\">\r\n            </div>\r\n            <div class=\"form-group\">\r\n                <label for=\"senha\">Senha:</label>\r\n                <input type=\"password\" id=\"senha\" name=\"senha\" required placeholder=\"Digite a senha\">\r\n            </div>\r\n\r\n            <div class=\"form-group\">\r\n                <label for=\"dataNascimento\">Data de Nascimento:</label>\r\n                <input type=\"date\" id=\"dataNascimento\" name=\"dataNascimento\" required>\r\n            </div>\r\n\r\n            <button type=\"submit\" class=\"btn-salvar\">Cadastrar Coordenador</button>\r\n        </form>\r\n    </div>\r\n\r\n    <div class=\"card-busca\">\r\n        <form action=\"/coordenador/buscar\" method=\"get\" style=\"margin: 30px 0;\">\r\n            <h3>Buscar por Nome</h3>\r\n            <input type=\"text\" name=\"nome\" placeholder=\"Buscar por nome\" style=\"padding: 5px; width: 250px;\">\r\n            <button type=\"submit\" class=\"btn-salvar\" style=\"padding: 5px 10px;\">Buscar</button>\r\n        </form>\r\n\r\n        <form action=\"/coordenador/buscarPorCpf\" method=\"get\" style=\"margin: 30px 0;\">\r\n            <h3>Buscar por CPF</h3>\r\n            <input type=\"text\" name=\"cpf\" placeholder=\"Buscar por CPF (ex: 000.000.000-00)\"\r\n                   style=\"padding: 5px; width: 250px;\"\r\n                   pattern=\"\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}\"\r\n                   title=\"Digite o CPF no formato 000.000.000-00\">\r\n            <button type=\"submit\" class=\"btn-salvar\" style=\"padding: 5px 10px;\">Buscar</button>\r\n        </form>\r\n    </div>\r\n\r\n    ");
				if (coordenadores != null && !coordenadores.isEmpty()) {
					jteOutput.writeContent("\r\n    <div class=\"entrevistadores-cards\">\r\n        <div class=\"cards\">\r\n            ");
					for (CoordenadorDTO c : coordenadores) {
						jteOutput.writeContent("\r\n            <article class=\"card\">\r\n                <div class=\"card-header\">\r\n                    <img src=\"/assets/icons/portrait.svg\" alt=\"Coordenador\" class=\"foto-entrevistador\">\r\n                        <div class=\"info-entrevista\">\r\n\r\n                            <div id=\"view-");
						jteOutput.setContext("div", "id");
						jteOutput.writeUserContent(c.getId());
						jteOutput.setContext("div", null);
						jteOutput.writeContent("\" class=\"view-mode\">\r\n                                <h2>");
						jteOutput.setContext("h2", null);
						jteOutput.writeUserContent(c.getNome());
						jteOutput.writeContent("</h2>\r\n                                <p>Email: ");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(c.getEmail());
						jteOutput.writeContent("</p>\r\n                                <p>CPF: ");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(c.getCpf());
						jteOutput.writeContent("</p>\r\n                                ");
						if (c.getDataNascimento() != null) {
							jteOutput.writeContent("\r\n                                    <p>Data de Nascimento: ");
							jteOutput.setContext("p", null);
							jteOutput.writeUserContent(c.getDataNascimento().toString());
							jteOutput.writeContent("</p>\r\n                                ");
						}
						jteOutput.writeContent("\r\n\r\n                                <div class=\"secao-edit\">\r\n                                    <button class=\"btn-editar\" onclick=\"toggleEdit('");
						jteOutput.setContext("button", "onclick");
						jteOutput.writeUserContent(c.getId());
						jteOutput.setContext("button", null);
						jteOutput.writeContent("')\">✏️ Editar</button>\r\n                                    <a href=\"/coordenador/delete?id=");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(c.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\" class=\"btn-excluir\" onclick=\"return confirm('Tem certeza que deseja excluir?')\">\r\n                                        🗑️ Excluir\r\n                                    </a>\r\n                                </div>\r\n                            </div>\r\n\r\n                            <div id=\"edit-");
						jteOutput.setContext("div", "id");
						jteOutput.writeUserContent(c.getId());
						jteOutput.setContext("div", null);
						jteOutput.writeContent("\" class=\"edit-mode\" style=\"display: none;\">\r\n                                <form action=\"/coordenador/atualizar\" method=\"post\" class=\"form-editar\">\r\n                                    <input type=\"hidden\" name=\"id\"");
						var __jte_html_attribute_0 = c.getId();
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_0);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">\r\n                                    <label>Nome:</label>\r\n                                    <input type=\"text\" name=\"nome\"");
						var __jte_html_attribute_1 = c.getNome();
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_1);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" required>\r\n                                    <label>Email:</label>\r\n                                    <input type=\"email\" name=\"email\"");
						var __jte_html_attribute_2 = c.getEmail();
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_2);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" required>\r\n                                    <label>Senha:</label>\r\n                                    <input type=\"password\" name=\"senha\" placeholder=\"Digite a nova senha\">\r\n                                    <label>CPF:</label>\r\n                                    <input type=\"text\" name=\"cpf\"");
						var __jte_html_attribute_3 = c.getCpf();
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_3);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" pattern=\"\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}\" required>\r\n                                    <label>Data de Nascimento:</label>\r\n                                    <input type=\"date\" name=\"dataNascimento\"");
						var __jte_html_attribute_4 = c.getDataNascimento() != null ? c.getDataNascimento().toString().substring(0, 10) : "";
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_4);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" required>\r\n                                    <button type=\"submit\">💾 Salvar</button>\r\n                                    <button type=\"button\" onclick=\"toggleEdit('");
						jteOutput.setContext("button", "onclick");
						jteOutput.writeUserContent(c.getId());
						jteOutput.setContext("button", null);
						jteOutput.writeContent("')\">❌ Cancelar</button>\r\n                                </form>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n            </article>\r\n            ");
					}
					jteOutput.writeContent("\r\n        </div>\r\n    </div>\r\n    ");
				}
				jteOutput.writeContent("\r\n    <script src=\"/js/editar-card.js\"></script>\r\n    <script src=\"/js/fade-msg.js\"></script>\r\n</section>\r\n\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		List<CoordenadorDTO> coordenadores = (List<CoordenadorDTO>)params.getOrDefault("coordenadores", null);
		String error = (String)params.get("error");
		String mensagem = (String)params.get("mensagem");
		render(jteOutput, jteHtmlInterceptor, coordenadores, error, mensagem);
	}
}
