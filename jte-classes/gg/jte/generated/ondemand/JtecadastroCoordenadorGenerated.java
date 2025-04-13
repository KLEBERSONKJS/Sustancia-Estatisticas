package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JtecadastroCoordenadorGenerated {
	public static final String JTE_NAME = "cadastroCoordenador.jte";
	public static final int[] JTE_LINE_INFO = {14,14,14,14,14,14,14,39,39,39,39,39,39};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"pt-br\">\n\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <link rel=\"stylesheet\" href=\"/css/login.css\">\n    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\n    <title>Login</title>\n</head>\n\n<body>\n<div class=\"conteiner\">\n    ");
		jteOutput.writeContent("\n    <div class=\"caixa-de-formulario login\">\n        <form action=\"/coordenador/cadastrar\" method=\"post\">\n            <h1>Log-in</h1>\n            <div class=\"caixa-de-input\">\n                <input type=\"text\" name=\"nome\" required>\n                <i class='bx bxs-user'></i>\n            </div>\n            <div class=\"caixa-de-input\">\n                <input type=\"email\" name=\"email\" required>\n                <i class='bx bxs-user'></i>\n            </div>\n            <div class=\"caixa-de-input\">\n                <input type=\"password\" name=\"senha\" required>\n                <i class='bx bxs-lock-alt'></i>\n            </div>\n            <button type=\"submit\" class=\"btn\">Login</button>\n        </form>\n    </div>\n\n</div>\n\n\n</body>\n\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
