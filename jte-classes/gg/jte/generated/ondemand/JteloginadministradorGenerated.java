package gg.jte.generated.ondemand;
import com.ads.sustancia.dto.request.LoginDTO;
import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.dto.response.ErrorResponse;
@SuppressWarnings("unchecked")
public final class JteloginadministradorGenerated {
	public static final String JTE_NAME = "login-administrador.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,3,17,17,34,34,35,35,35,35,35,35,36,36,41,66,99,99,99,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ErrorResponse error) {
		jteOutput.writeContent("    <!DOCTYPE html>\r\n    <html lang=\"pt-br\">\r\n\r\n    <head>\r\n        <meta charset=\"UTF-8\">\r\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n        <link rel=\"stylesheet\" href=\"/css/login.css\">\r\n        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\r\n        <title>Login</title>\r\n    </head>\r\n\r\n    <body>\r\n        <div class=\"conteiner\">\r\n            ");
		jteOutput.writeContent("\r\n            <div class=\"caixa-de-formulario login\">\r\n                <form action=\"/auth\" method=\"post\">\r\n                    <h1>Log-in</h1>\r\n                    <div class=\"caixa-de-input\">\r\n                        <input type=\"text\" placeholder=\"Usuário\" name=\"email\" id=\"email\" value required>\r\n                        <i class='bx bxs-user'></i>\r\n                    </div>\r\n                    <div class=\"caixa-de-input\">\r\n                        <input type=\"password\" name=\"senha\" id=\"senha\" placeholder=\"Senha\" required>\r\n                        <i class='bx bxs-lock-alt'></i>\r\n                    </div>\r\n                    <div class=\"esqueceu-senha\">\r\n                        <a href=\"esCliente.html\">Esqueceu a senha?</a>\r\n                    </div>\r\n                    <div class=\"esqueceu-senha\">\r\n                    </div>\r\n                    ");
		if (error != null) {
			jteOutput.writeContent("\r\n                        <p>");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(error.getField());
			jteOutput.writeContent(" ");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(error.getMessage());
			jteOutput.writeContent("</p>\r\n                        ");
		}
		jteOutput.writeContent("\r\n                    <button type=\"submit\" class=\"btn\">Login</button>\r\n                </form>\r\n            </div>\r\n\r\n            ");
		jteOutput.writeContent("\r\n            <div class=\"caixa-de-formulario cadastro\">\r\n                <form action=\"/coordenador/cadastrar\" method=\"post\">\r\n                    <h1>Cadastre-se</h1>\r\n                    <div class=\"caixa-de-input\">\r\n                        <input type=\"text\" placeholder=\"Usuário\" name=\"nome\" id=\"nome\" required>\r\n                        <i class='bx bxs-user'></i>\r\n                    </div>\r\n                    <div class=\"caixa-de-input\">\r\n                        <input type=\"email\" placeholder=\"Email\" name=\"email\" id=\"email\" required>\r\n                        <i class='bx bxs-envelope'></i>\r\n                    </div>\r\n                    <div class=\"caixa-de-input\">\r\n                        <input type=\"password\" placeholder=\"Senha\" name=\"senha\" id=\"senha\" required>\r\n                        <i class='bx bxs-lock-alt'></i>\r\n                    </div>\r\n                    <div class=\"caixa-de-input\">\r\n                        <input type=\"date\" placeholder=\"Data de Nascimento\" name=\"dataNascimento\" id=\"dataNascimento\"\r\n                            required>\r\n                        <i class='bx bxs-lock-alt'></i>\r\n                    </div>\r\n                    <button type=\"submit\" class=\"btn\">Faça a Diferença!</button>\r\n                </form>\r\n            </div>\r\n\r\n            ");
		jteOutput.writeContent("\r\n            <div class=\"toggle-box\">\r\n                <div class=\"toggle-panel toggle-esquerdo\">\r\n                    <h1>Olá, Bem-Vindo!</h1>\r\n                    <p>Não tem uma conta ainda?</p>\r\n                    <button class=\"btn botao-cadastro\">Cadastre-se</button>\r\n                </div>\r\n\r\n                <div class=\"toggle-panel toggle-direito\">\r\n                    <h1>Bem vindo de Volta!</h1>\r\n                    <p>Já tem uma conta?</p>\r\n                    <button class=\"btn botao-de-login\">Login</button>\r\n                </div>\r\n            </div>\r\n        </div>\r\n\r\n\r\n        <script>\r\n            const conteiner = document.querySelector('.conteiner');\r\n            const btnCadastro = document.querySelector('.botao-cadastro');\r\n            const btnLogin = document.querySelector('.botao-de-login');\r\n\r\n            btnCadastro.addEventListener('click', () => {\r\n                conteiner.classList.add('ativo');\r\n            });\r\n\r\n            btnLogin.addEventListener('click', () => {\r\n                conteiner.classList.remove('ativo');\r\n            });\r\n\r\n        </script>\r\n    </body>\r\n\r\n    </html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ErrorResponse error = (ErrorResponse)params.getOrDefault("error", new ErrorResponse());
		render(jteOutput, jteHtmlInterceptor, error);
	}
}
