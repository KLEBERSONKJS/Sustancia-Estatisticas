package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {1,1,1,1,1,1,1,1,1,4,4,4,6,6,6,6,6,6};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\r\n    ");
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
<<<<<<< Updated upstream
				jteOutput.writeContent("\r\n    <p> SEJA BEM VINDO!</p>\r\n        <p>Coloque aqui a nossa logo ou alguma imagem que remete a nós</p>\r\n    ");
=======
				jteOutput.writeContent("\r\n        <img src=\"/assets/icons/cactinho.svg\" class=\"cactus\">\r\n\r\n    ");
>>>>>>> Stashed changes
			}
		});
		jteOutput.writeContent("\r\n\r\n   ");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
