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

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ActiveProfiles("test")
class LoginControllerTest {


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
    @DisplayName("SUSCESSO - LOGIN EFETUADO - O SISTEMA DEVE REDIRECIONAR PAR A RAIZ(/)")
     void loginSuscesso() {
        logincCredenciasCorretas();
        //endpoint que so pode ser acessado por usuario logado
        driver.get("http://localhost:8080/home");


        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.urlContains("/home"));

        assertTrue(driver.getCurrentUrl().contains("/home"),
                "Erro no login, deve ser redirecionado para página de login novamente");
    }

    @Test
    @Order(1)
    @DisplayName("SUSCESSO - LOGIN EFETUADO - O SISTEMA DEVE REDIRECIONAR PAR A RAIZ(/)")
     void loginFalha() {
        logincCredenciasIncorretas();

        // Espera até que a URL contenha "/login"
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.urlContains("/login"));

        assertTrue(driver.getCurrentUrl().contains("/login"),
                "Erro no login, deve ser redirecionado para página de login novamente");
    }


    private void logincCredenciasCorretas() {
        driver.get("http://localhost:8080/login");
        driver.findElement(By.name("username")).sendKeys("admin@gmail.com");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    private void logincCredenciasIncorretas() {
        driver.get("http://localhost:8080/login");
        driver.findElement(By.name("username")).sendKeys("dsdasd@gmail.com");
        driver.findElement(By.name("password")).sendKeys("sdasda");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}