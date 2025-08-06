package gg.jte.generated.ondemand.layout;
@SuppressWarnings("unchecked")
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,19,19,19,20,20,22,22,22,45,45,45,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, gg.jte.Content content) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"pt-BR\">\r\n\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>Sustância - Home Page</title>\r\n    <link href=\"https://fonts.googleapis.com/css2?family=Outfit:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n    <link rel=\"stylesheet\" href=\"/css/style.css\">\r\n    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\r\n    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200&icon_names=menu\" />\r\n    <script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>\r\n</head>\r\n\r\n<body>\r\n\r\n    <div class=\"wrapper\">\r\n    ");
		gg.jte.generated.ondemand.layout.JteasideGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n    ");
		gg.jte.generated.ondemand.layout.JteheaderGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\r\n        <div class=\"main container\">\r\n            ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n        </div>\r\n    </div>\r\n\r\n<script src=\"/js/menu.js\"></script>\r\n\r\n<script>\r\n    document.addEventListener('DOMContentLoaded', function () {\r\n        const cpfInputs = document.querySelectorAll('input[name=\"cpf\"]');\r\n        cpfInputs.forEach(input => {\r\n            input.addEventListener('input', function (e) {\r\n                let value = e.target.value.replace(/\\D/g, '');\r\n                if (value.length > 11) value = value.slice(0, 11);\r\n                value = value.replace(/(\\d{3})(\\d)/, '$1.$2');\r\n                value = value.replace(/(\\d{3})(\\d)/, '$1.$2');\r\n                value = value.replace(/(\\d{3})(\\d{1,2})$/, '$1-$2');\r\n                e.target.value = value;\r\n            });\r\n        });\r\n    });\r\n</script>\r\n</body>\r\n\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		gg.jte.Content content = (gg.jte.Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
