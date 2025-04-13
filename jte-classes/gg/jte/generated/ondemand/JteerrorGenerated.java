package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteerrorGenerated {
	public static final String JTE_NAME = "error.jte";
	public static final int[] JTE_LINE_INFO = {10,10,10,10,10,10,10,36,40,40,40,40,40,40};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!DOCTYPE html>\n<html lang=\"en\" >\n<head>\n  <meta charset=\"UTF-8\">\n  <title>404 page</title>\n  <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css'>\n<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Arvo'><link rel=\"stylesheet\" href=\"/css/error.css\">\n\n</head>\n<body>\n");
		jteOutput.writeContent("\n<section class=\"page_404\">\n\t<div class=\"container\">\n\t\t<div class=\"row\">\t\n\t\t<div class=\"col-sm-12 \">\n\t\t<div class=\"col-sm-10 col-sm-offset-1  text-center\">\n\t\t<div class=\"four_zero_four_bg\">\n\t\t\t<h1 class=\"text-center \">404</h1>\n\t\t\n\t\t\n\t\t</div>\n\t\t\n\t\t<div class=\"contant_box_404\">\n\t\t<h3 class=\"h2\">\n\t\tParece que você está perdido.\n\t\t</h3>\n\t\t\n\t\t<p>A página que você está procurando não está disponivel!</p>\n\t\t\n\t\t<a href=\"/auth\" class=\"link_404\">Home</a>\n\t</div>\n\t\t</div>\n\t\t</div>\n\t\t</div>\n\t</div>\n</section>\n");
		jteOutput.writeContent("\n  \n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
