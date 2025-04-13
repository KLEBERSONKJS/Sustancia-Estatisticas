package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteloginGenerated {
	public static final String JTE_NAME = "login.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,14,14,28,28,30,30,38,38,38,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String error) {
		jteOutput.writeContent("<!DOCTYPE html>\r\n<html lang=\"pt-br\">\r\n\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <link rel=\"stylesheet\" href=\"/css/login.css\">\r\n    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\r\n    <title>Login</title>\r\n</head>\r\n\r\n<body>\r\n<div class=\"conteiner\">\r\n    ");
		jteOutput.writeContent("\r\n    <div class=\"caixa-de-formulario login\">\r\n        <form action=\"/login\" method=\"post\">\r\n            <h1>Log-in</h1>\r\n            <div class=\"caixa-de-input\">\r\n                <input type=\"text\" name=\"username\" required>\r\n                <i class='bx bxs-user'></i>\r\n            </div>\r\n            <div class=\"caixa-de-input\">\r\n                <input type=\"password\" name=\"password\" required>\r\n                <i class='bx bxs-lock-alt'></i>\r\n            </div>\r\n            <button type=\"submit\" class=\"btn\">Login</button>\r\n        </form>\r\n        ");
		if (error != null) {
			jteOutput.writeContent("\r\n            <div class=\"error-message\">Email ou senha incorretos</div>\r\n        ");
		}
		jteOutput.writeContent("\r\n    </div>\r\n\r\n</div>\r\n\r\n\r\n</body>\r\n\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String error = (String)params.get("error");
		render(jteOutput, jteHtmlInterceptor, error);
	}
}
