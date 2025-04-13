package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteerrorGenerated {
	public static final String JTE_NAME = "error.jte";
	public static final int[] JTE_LINE_INFO = {10,10,10,10,10,10,10,36,40,40,40,40,40,40};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!DOCTYPE html>\r\n<html lang=\"en\" >\r\n<head>\r\n  <meta charset=\"UTF-8\">\r\n  <title>404 page</title>\r\n  <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css'>\r\n<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Arvo'><link rel=\"stylesheet\" href=\"/css/error.css\">\r\n\r\n</head>\r\n<body>\r\n");
		jteOutput.writeContent("\r\n<section class=\"page_404\">\r\n\t<div class=\"container\">\r\n\t\t<div class=\"row\">\t\r\n\t\t<div class=\"col-sm-12 \">\r\n\t\t<div class=\"col-sm-10 col-sm-offset-1  text-center\">\r\n\t\t<div class=\"four_zero_four_bg\">\r\n\t\t\t<h1 class=\"text-center \">404</h1>\r\n\t\t\r\n\t\t\r\n\t\t</div>\r\n\t\t\r\n\t\t<div class=\"contant_box_404\">\r\n\t\t<h3 class=\"h2\">\r\n\t\tParece que você está perdido.\r\n\t\t</h3>\r\n\t\t\r\n\t\t<p>A página que você está procurando não está disponivel!</p>\r\n\t\t\r\n\t\t<a href=\"/auth\" class=\"link_404\">Home</a>\r\n\t</div>\r\n\t\t</div>\r\n\t\t</div>\r\n\t\t</div>\r\n\t</div>\r\n</section>\r\n");
		jteOutput.writeContent("\r\n  \r\n</body>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
