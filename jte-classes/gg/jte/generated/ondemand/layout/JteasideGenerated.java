package gg.jte.generated.ondemand.layout;
@SuppressWarnings("unchecked")
public final class JteasideGenerated {
	public static final String JTE_NAME = "layout/aside.jte";
	public static final int[] JTE_LINE_INFO = {35,35,35,35,35,35,35,35,35,35,35,35};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\n    <nav id= \"menu\" class=\"barra-lateral\">\n\n        <div id=\"logo\" class=\"logo\">\n            <img id=\"logo\" src=\"/assets/icons/sustancia-logo.svg\" alt=\"Menu\">\n        </div>\n    \n        <ul>\n            <li><a href=\"/home\">\n                    <i class='bx bxs-home-circle' alt=\"Home Page\"></i>\n                    Home\n                </a></li>\n            <li><a href=\"/relatorio\">\n                    <i class='bx bxs-network-chart' alt=\"Visualizar Relatórios\"></i>\n                    Visualizar Relatórios\n                </a></li>\n            <li><a href=\"/entrevistador\">\n                    <i class='bx bxs-user-badge' alt=\"Entrevistadores\"></i>\n                    Entrevistadores\n                </a></li>\n            <li><a href=\"/coordenador/perfil?email=mauricio@email.com\">\n                    <i class='bx bxs-user-detail'></i>\n                    Perfil\n                </a></li>\n            <li><a href=\"/graficos\">\n                    <i class='bx bxs-pie-chart-alt-2' alt=\"Editar Perfil\"></i>\n                    Graficos\n                </a></li>\n            <li>\n                <a  class=\"sair\" href=\"#sair\">\n                    <img src=\"/assets/icons/botao-sair.svg\" alt=\"Sair\">\n                    Sair\n                </a>\n            </li>\n        </ul>\n    </nav>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
