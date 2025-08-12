package com.ads.sustancia.controller;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ActiveProfiles("test")
public class AcessarDashboardAdminTest {

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
    @DisplayName("FALHA - ADMINSTRADOR NÃO ESTÁ LOGADO E TENTA ACESSAR A DASHBOARD- O SISTEMA DEVE REDIRECIONAR A PAGINA DE LOGIN")
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
    @DisplayName("SUSCESSO - ADMINSTRADOR FAZ LOGIN E TENTA ACESSAR A DASHBOARD - O SISTEMA DEVE DEVER PERMITIR QUE O USUARIO ACESSSE A DASHBOARD")
    public void acessarHomeComoAdmin() throws Exception {
        // Faz login como entrevistador no navegador
        loginComoAdmin();
        driver.get("http://localhost:8080/home");
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.urlContains("/home"));

        assertTrue(driver.getCurrentUrl().contains("/home"),
                "Coordenador logado deveria acessar /home sem ser redirecionado para login");
    }

    private void loginComoAdmin() {
        driver.get("http://localhost:8080/login");
        driver.findElement(By.name("username")).sendKeys("admin@gmail.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
