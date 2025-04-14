package gg.jte.generated.ondemand.layout;
@SuppressWarnings("unchecked")
public final class JteheaderGenerated {
	public static final String JTE_NAME = "layout/header.jte";
	public static final int[] JTE_LINE_INFO = {5,5,5,5,5,5,5,5,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<header>\n    <button class=\"menu-toggle\" id=\"menu-toggle\" onclick=\"toggleMenu()\">\n        <i class='bx bx-menu' alt=\"menu\"></i>\n    </button>\n</header>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
