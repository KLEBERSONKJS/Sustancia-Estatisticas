package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JtecadastrEntrevistadorGenerated {
	public static final String JTE_NAME = "cadastrEntrevistador.jte";
	public static final int[] JTE_LINE_INFO = {14,14,14,14,14,14,14,39,39,39,39,39,39};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"pt-br\">\r\n\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <link rel=\"stylesheet\" href=\"/css/login.css\">\r\n    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\r\n    <title>Login</title>\r\n</head>\r\n\r\n<body>\r\n<div class=\"conteiner\">\r\n    ");
		jteOutput.writeContent("\r\n    <div class=\"caixa-de-formulario login\">\r\n        <form action=\"/entrevistador/cadastrar\" method=\"post\">\r\n            <h1>Log-in</h1>\r\n            <div class=\"caixa-de-input\">\r\n                <input type=\"text\" name=\"nome\" required>\r\n                <i class='bx bxs-user'></i>\r\n            </div>\r\n            <div class=\"caixa-de-input\">\r\n                <input type=\"email\" name=\"email\" required>\r\n                <i class='bx bxs-user'></i>\r\n            </div>\r\n            <div class=\"caixa-de-input\">\r\n                <input type=\"password\" name=\"senha\" required>\r\n                <i class='bx bxs-lock-alt'></i>\r\n            </div>\r\n            <button type=\"submit\" class=\"btn\">Login</button>\r\n        </form>\r\n    </div>\r\n\r\n</div>\r\n\r\n\r\n</body>\r\n\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
