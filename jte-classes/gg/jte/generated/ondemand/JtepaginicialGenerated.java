package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JtepaginicialGenerated {
	public static final String JTE_NAME = "pag-inicial.jte";
	public static final int[] JTE_LINE_INFO = {10,10,10,10,10,10,10,35,40,40,40,40,40,40};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!DOCTYPE html>\n<html lang=\"pt-BR\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Sustância - Pesquisa de Campo</title>\n    <link rel=\"stylesheet\" href=\"/css/pagInicial.css\">\n</head>\n<body>\n\n");
		jteOutput.writeContent("\n<section class=\"banner\">\n    <div class=\"conteudo\">\n        <div class=\"texto\">\n            <div class=\"circulo\">\n            </div>\n            <h1>Para uma alimentação melhor, comece com\n                <span class=\"carrossel-container\">\n                        <span class=\"carrossel\">\n                            <span class=\"palavra black\">a Sustância.</span>\n                            <span class=\"palavra\">o Café da Manhã.</span>\n                            <span class=\"palavra\">o Almoço.</span>\n                            <span class=\"palavra\">o Lanche.</span>\n                            <span class=\"palavra\">o Jantar.</span>\n                            <span class=\"palavra\">a Ceia.</span>\n                        </span>\n                    </span>\n            </h1>\n            <p>Alimentando pesquisas, promovendo saúde.</p>\n            <a href=\"/home\" class=\"botao\">Dê inicio a sua Experiência</a>\n        </div>\n        <div class=\"imagem\">\n            <img src=\"/assets/icons/prato-saudável.svg\" alt=\"Tigela de frutas\">\n        </div>\n    </div>\n    ");
		jteOutput.writeContent("\n    <script src=\"/js/pag-inicial.js\"></script>\n </section>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
