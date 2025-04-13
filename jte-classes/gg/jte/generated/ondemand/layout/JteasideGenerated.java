package gg.jte.generated.ondemand.layout;
@SuppressWarnings("unchecked")
public final class JteasideGenerated {
	public static final String JTE_NAME = "layout/aside.jte";
	public static final int[] JTE_LINE_INFO = {29,29,29,29,29,29,29,29,29,29,29,29};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\r\n    <nav id= \"menu\" class=\"barra-lateral\">\r\n\r\n        <div id=\"logo\" class=\"logo\">\r\n            <img id=\"logo\" src=\"/assets/icons/sustancia-logo.svg\" alt=\"Menu\">\r\n        </div>\r\n    \r\n        <ul>\r\n            <li><a href=\"/home\">\r\n                    <i class='bx bxs-home-circle' alt=\"Home Page\"></i>\r\n                    Home\r\n                </a></li>\r\n            <li><a href=\"/relatorio\">\r\n                    <i class='bx bxs-network-chart' alt=\"Visualizar Relatórios\"></i>\r\n                    Visualizar Relatórios\r\n                </a></li>\r\n            <li><a href=\"/coordenador/entrevistadores\">\r\n                    <i class='bx bxs-user-badge' alt=\"Entrevistadores\"></i>\r\n                    Entrevistadores\r\n                </a></li>\r\n            <li><a href=\"/coordenador/perfil\">\r\n                    <i class='bx bxs-user-detail'></i>\r\n                    Perfil\r\n                </a></li>\r\n            <li><a href=\"/logout\">\r\n                    <i class='bx bxs-exit' alt=\"Sair\"></i>\r\n                    Sair\r\n                </a></li>\r\n        </ul>\r\n    </nav>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
