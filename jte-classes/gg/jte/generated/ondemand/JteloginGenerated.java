package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteloginGenerated {
	public static final String JTE_NAME = "login.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,14,14,28,28,30,30,38,38,38,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String error) {
		jteOutput.writeContent("<!DOCTYPE html>\n<html lang=\"pt-br\">\n\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <link rel=\"stylesheet\" href=\"/css/login.css\">\n    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\n    <title>Login</title>\n</head>\n\n<body>\n<div class=\"conteiner\">\n    ");
		jteOutput.writeContent("\n    <div class=\"caixa-de-formulario login\">\n        <form action=\"/login\" method=\"post\">\n            <h1>Log-in</h1>\n            <div class=\"caixa-de-input\">\n                <input type=\"text\" name=\"username\" required>\n                <i class='bx bxs-user'></i>\n            </div>\n            <div class=\"caixa-de-input\">\n                <input type=\"password\" name=\"password\" required>\n                <i class='bx bxs-lock-alt'></i>\n            </div>\n            <button type=\"submit\" class=\"btn\">Login</button>\n        </form>\n        ");
		if (error != null) {
			jteOutput.writeContent("\n            <div class=\"error-message\">Email ou senha incorretos</div>\n        ");
		}
		jteOutput.writeContent("\n    </div>\n\n</div>\n\n\n</body>\n\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String error = (String)params.get("error");
		render(jteOutput, jteHtmlInterceptor, error);
	}
}
