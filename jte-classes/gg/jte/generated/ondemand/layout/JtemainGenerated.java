package gg.jte.generated.ondemand.layout;
@SuppressWarnings("unchecked")
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,21,21,21,23,23,23,29,29,29,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, gg.jte.Content content) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"pt-BR\">\n\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Sustância - Home Page</title>\n    <link href=\"https://fonts.googleapis.com/css2?family=Outfit:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\n    <link rel=\"stylesheet\" href=\"/css/style.css\">\n    <link rel=\"stylesheet\" href=\"/css/relatorio.css\">\n    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\n    <link rel=\"stylesheet\"\n        href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200&icon_names=menu\" />\n    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\n</head>\n\n<body>\n\n    <div class=\"wrapper\">\n    ");
		gg.jte.generated.ondemand.layout.JteasideGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n        <div class=\"main container\">\n            ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n        </div>\n    </div>\n\n</body>\n\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		gg.jte.Content content = (gg.jte.Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
