package gg.jte.generated.ondemand;
import com.ads.sustancia.record.LoginDTO;
import com.ads.sustancia.record.CadastroCoordenadorDTO;
import com.ads.sustancia.record.ErrorResponse;
@SuppressWarnings("unchecked")
public final class JtecadastrocoordenadorGenerated {
	public static final String JTE_NAME = "cadastro-coordenador.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,3,16,16,37,58,58,59,59,59,59,59,59,60,60,65,99,99,99,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ErrorResponse error) {
		jteOutput.writeContent("<!DOCTYPE html>\n<html lang=\"pt-br\">\n\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <link rel=\"stylesheet\" href=\"/css/login.css\">\n    <title>Login</title>\n</head>\n\n<body>\n    <div class=\"conteiner\">\n        ");
		jteOutput.writeContent("\n        <div class=\"caixa-de-formulario login\">\n            <form action=\"/auth\" method=\"post\">\n                <h1>Log-in</h1>\n                <div class=\"caixa-de-input\">\n                    <input type=\"text\" placeholder=\"Usuário\" name=\"email\" id=\"email\" value required>\n                    <i class='bx bxs-user'></i>\n                </div>\n                <div class=\"caixa-de-input\">\n                    <input type=\"password\" name=\"senha\" id=\"senha\" placeholder=\"Senha\" required>\n                    <i class='bx bxs-lock-alt'></i>\n                </div>\n                <div class=\"esqueceu-senha\">\n                    <a href=\"esCliente.html\">Esqueceu a senha?</a>\n                </div>\n                <div class=\"esqueceu-senha\">\n                </div>\n                <button type=\"submit\" class=\"btn\">Login</button>\n            </form>\n        </div>\n\n        ");
		jteOutput.writeContent("\n        <div class=\"caixa-de-formulario cadastro\">\n            <form action=\"/coordenador/cadastrar\" method=\"post\">\n                <h1>Cadastre-se</h1>\n                <div class=\"caixa-de-input\">\n                    <input type=\"text\" placeholder=\"Usuário\" name=\"nome\" id=\"nome\" required>\n                    <i class='bx bxs-user'></i>\n                </div>\n                <div class=\"caixa-de-input\">\n                    <input type=\"email\" placeholder=\"Email\" name=\"email\" id=\"email\" required>\n                    <i class='bx bxs-envelope'></i>\n                </div>\n                <div class=\"caixa-de-input\">\n                    <input type=\"password\" placeholder=\"Senha\" name=\"senha\" id=\"senha\" required>\n                    <i class='bx bxs-lock-alt'></i>\n                </div>\n                <div class=\"caixa-de-input\">\n                    <input type=\"date\" placeholder=\"Data de Nascimento\" name=\"dataNascimento\" id=\"dataNascimento\"\n                        required>\n                    <i class='bx bxs-lock-alt'></i>\n                </div>\n                ");
		if (error != null) {
			jteOutput.writeContent("\n                <p>");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(error.getField());
			jteOutput.writeContent(" ");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(error.getMessage());
			jteOutput.writeContent("</p>\n                ");
		}
		jteOutput.writeContent("\n                <button type=\"submit\" class=\"btn\">Faça a Diferença!</button>\n            </form>\n        </div>\n\n        ");
		jteOutput.writeContent("\n        <div class=\"toggle-box\">\n            <div class=\"toggle-panel toggle-esquerdo\">\n                <h1>Olá, Bem-Vindo!</h1>\n                <p>Não tem uma conta ainda?</p>\n                <button class=\"btn botao-cadastro\">Cadastre-se</button>\n            </div>\n\n            <div class=\"toggle-panel toggle-direito\">\n                <h1>Bem vindo de Volta!</h1>\n                <p>Já tem uma conta?</p>\n                <button class=\"btn botao-de-login\">Login</button>\n            </div>\n        </div>\n    </div>\n\n\n    <script>\n        const conteiner = document.querySelector('.conteiner');\n        const btnCadastro = document.querySelector('.botao-cadastro');\n        const btnLogin = document.querySelector('.botao-de-login');\n\n        conteiner.classList.add('ativo');\n        btnCadastro.addEventListener('click', () => {\n            conteiner.classList.add('ativo');\n        });\n\n        btnLogin.addEventListener('click', () => {\n            conteiner.classList.remove('ativo');\n        });\n\n    </script>\n</body>\n\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ErrorResponse error = (ErrorResponse)params.getOrDefault("error", new ErrorResponse());
		render(jteOutput, jteHtmlInterceptor, error);
	}
}
