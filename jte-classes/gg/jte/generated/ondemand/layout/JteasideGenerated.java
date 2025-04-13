package gg.jte.generated.ondemand.layout;
@SuppressWarnings("unchecked")
public final class JteasideGenerated {
	public static final String JTE_NAME = "layout/aside.jte";
	public static final int[] JTE_LINE_INFO = {37,37,37,37,37,37,37,37,37,37,37,37};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\n    <nav id= \"menu\" class=\"barra-lateral\">\n\n        <div id=\"logo\" class=\"logo\">\n            <img id=\"logo\" src=\"/assets/icons/sustancia-logo.svg\" alt=\"Menu\">\n        </div>\n    \n        <ul>\n            <li><a href=\"/home\">\n                    <i class='bx bxs-home-circle' alt=\"Home Page\"></i>\n                    Home\n                </a></li>\n            <li><a href=\"/relatorio\">\n                    <i class='bx bxs-network-chart' alt=\"Visualizar Relatórios\"></i>\n                    Visualizar Relatórios\n                </a></li>\n            <li><a href=\"/coordenador/entrevistadores\">\n                    <i class='bx bxs-user-badge' alt=\"Entrevistadores\"></i>\n                    Entrevistadores\n                </a></li>\n            <li><a href=\"/coordenador/admin\">\n                    <i class='bx bxs-user-badge' alt=\"Coordenados\"></i>\n                    Coordenadores\n                </a></li>\n            <li><a href=\"/coordenador/perfil\">\n                    <i class='bx bxs-user-detail'></i>\n                    Perfil\n                </a></li>\n            <li><a href=\"/formulario\">\n                    <i class='bx bxs-user-detail'></i>\n                    Meu Relatorío\n                </a></li>\n            <li><a href=\"/logout\">\n                    <i class='bx bxs-exit' alt=\"Sair\"></i>\n                    Sair\n                </a></li>\n        </ul>\n    </nav>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
