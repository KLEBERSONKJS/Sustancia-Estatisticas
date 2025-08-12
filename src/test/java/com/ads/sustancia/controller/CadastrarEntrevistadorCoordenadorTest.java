package com.ads.sustancia.controller;

import com.ads.sustancia.repository.EntrevistadorRepository;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.datafaker.Faker;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ActiveProfiles("test")
public class CadastrarEntrevistadorCoordenadorTest {

    private WebDriver driver;

    @Autowired
    private EntrevistadorRepository entrevistadorRepository;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    @Order(1)
    public void cadastrarEntrevistadorSemLogar() {
        Faker faker = new Faker();

        driver.get("http://localhost:8080/entrevistador/entrevistadores");

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.urlContains("/login"));

        assertTrue(driver.getCurrentUrl().contains("/login"),
                "Usuário não logado deveria ser redirecionado para página de login");

    }

    @Test
    @Order(2)
    public void cadastrarEntrevistadorLogadoEVerificarBanco() {
        Faker faker = new Faker();

        loginComoCoordenador();

        driver.get("http://localhost:8080/entrevistador/entrevistadores");

        String nome = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String rawCpf = String.valueOf(faker.cpf());
        String cpfFormatado = rawCpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        driver.findElement(By.name("cpf")).sendKeys(cpfFormatado);

        String senha = "senha123";
        String dataNascimento = "1990-05-10";

        driver.findElement(By.name("nome")).sendKeys(nome);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("cpf")).sendKeys(cpfFormatado);
        driver.findElement(By.name("senha")).sendKeys(senha);
        driver.findElement(By.name("dataNascimento")).sendKeys(dataNascimento);

        driver.findElement(By.cssSelector("button.btn-salvar")).click();

        var entrevistadorOpt = entrevistadorRepository.findByEmail(email);

    }

    private void loginComoCoordenador() {
        driver.get("http://localhost:8080/login");
        driver.findElement(By.name("username")).sendKeys("coordenador@gmail.com");
        driver.findElement(By.name("password")).sendKeys("coordenador");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        driver.get("http://localhost:8080/home");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlContains("/home"));
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
