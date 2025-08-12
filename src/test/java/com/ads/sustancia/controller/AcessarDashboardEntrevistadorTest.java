package com.ads.sustancia.controller;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ActiveProfiles("test")
public class AcessarDashboardEntrevistadorTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    @Order(1)
    public void acessarDashNaoLogado() {
        driver.get("http://localhost:8080/home");

        // Espera até que a URL contenha "/login"
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.urlContains("/login"));

        assertTrue(driver.getCurrentUrl().contains("/login"),
                "Usuário não logado deveria ser redirecionado para página de login");
    }

    @Test
    @Order(2)
    public void acessarHomeComoEntrevistadorDeveSerForbidden() throws Exception {
        // Faz login como entrevistador no navegador
        loginComoEntrevistador();

        // Pega o cookie de sessão do Selenium
        Cookie jsessionid = driver.manage().getCookieNamed("JSESSIONID");

        // Faz requisição HTTP direta para /home com o cookie do login
        URL url = new URL("http://localhost:8080/home");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Cookie", "JSESSIONID=" + jsessionid.getValue());
        connection.connect();

        // Verifica que o status é 403 Forbidden
        assertEquals(403, connection.getResponseCode(),
                "Usuário entrevistador deveria receber HTTP 403 ao acessar /home");

        connection.disconnect();
    }

    private void loginComoEntrevistador() {
        driver.get("http://localhost:8080/login");
        driver.findElement(By.name("username")).sendKeys("entrevistador@gmail.com");
        driver.findElement(By.name("password")).sendKeys("entrevistador");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
