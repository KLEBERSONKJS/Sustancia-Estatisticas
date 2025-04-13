package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JtepaginicialGenerated {
	public static final String JTE_NAME = "pag-inicial.jte";
	public static final int[] JTE_LINE_INFO = {10,10,10,10,10,10,10,35,40,40,40,40,40,40};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!DOCTYPE html>\r\n<html lang=\"pt-BR\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>Sustância - Pesquisa de Campo</title>\r\n    <link rel=\"stylesheet\" href=\"/css/pagInicial.css\">\r\n</head>\r\n<body>\r\n\r\n");
		jteOutput.writeContent("\r\n<section class=\"banner\">\r\n    <div class=\"conteudo\">\r\n        <div class=\"texto\">\r\n            <div class=\"circulo\">\r\n            </div>\r\n            <h1>Para uma alimentação melhor, comece com\r\n                <span class=\"carrossel-container\">\r\n                        <span class=\"carrossel\">\r\n                            <span class=\"palavra black\">a Sustância.</span>\r\n                            <span class=\"palavra\">o Café da Manhã.</span>\r\n                            <span class=\"palavra\">o Almoço.</span>\r\n                            <span class=\"palavra\">o Lanche.</span>\r\n                            <span class=\"palavra\">o Jantar.</span>\r\n                            <span class=\"palavra\">a Ceia.</span>\r\n                        </span>\r\n                    </span>\r\n            </h1>\r\n            <p>Alimentando pesquisas, promovendo saúde.</p>\r\n            <a href=\"/home\" class=\"botao\">Dê inicio a sua Experiência</a>\r\n        </div>\r\n        <div class=\"imagem\">\r\n            <img src=\"/assets/icons/prato-saudável.svg\" alt=\"Tigela de frutas\">\r\n        </div>\r\n    </div>\r\n    ");
		jteOutput.writeContent("\r\n    <script src=\"/js/pag-inicial.js\"></script>\r\n </section>\r\n</body>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
