package com.ads.sustancia;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.ads.sustancia.model.Pessoa;
import com.ads.sustancia.repository.PessoaRepository;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
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
public class FormularioPesquisaE2ETest {

    private WebDriver driver;

    @Autowired
    private PessoaRepository pessoaRepository;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginComoEntrevistador();
    }

    private void loginComoEntrevistador() {
        driver.get("http://localhost:8080/login");

        driver.findElement(By.name("username")).sendKeys("entrevistador@gmail.com");
        driver.findElement(By.name("password")).sendKeys("entrevistador");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Pequena espera para garantir redirecionamento
        try { Thread.sleep(500); } catch (InterruptedException ignored) {}
    }

    @Test
    @Order(1)
    public void deveSalvarFormularioNoBanco() {
        driver.get("http://localhost:8080/formulario");

        // Preenchendo Questionário Socioeconômico
        driver.findElement(By.name("nome")).sendKeys("Teste Selenium");
        driver.findElement(By.name("idade")).sendKeys("30");
        driver.findElement(By.cssSelector("input[name='genero'][value='Masculino']")).click();
        driver.findElement(By.cssSelector("input[name='raca'][value='Branco']")).click();
        driver.findElement(By.name("escolaridade")).sendKeys("Ensino Médio");
        driver.findElement(By.cssSelector("input[name='estado_civil'][value='Solteiro']")).click();
        driver.findElement(By.cssSelector("input[name='emprego'][value='Meio período']")).click();
        driver.findElement(By.cssSelector("input[name='auxilios'][value='Bolsa familia']")).click();
        driver.findElement(By.cssSelector("input[name='familia'][value='Nenhum']")).click();
        driver.findElement(By.cssSelector("input[name='religiao'][value='Católico']")).click();

        // Coleta de Marcadores
        driver.findElement(By.cssSelector("input[name='refeicoes_com_tecnologia'][value='Sim']")).click();
        driver.findElement(By.cssSelector("input[name='refeicoes'][value='Café da manhã']")).click();
        driver.findElement(By.cssSelector("input[name='consumo'][value='Verduras e legumes']")).click();

        // EBIA
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                driver.findElement(By.cssSelector("input[name='ebia_" + i + "'][value='Sim']")).click();
            } else {
                driver.findElement(By.cssSelector("input[name='ebia_" + i + "'][value='Não']")).click();
            }
        }

        // Envia formulário
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Validação no banco H2
        Pessoa pessoa = pessoaRepository.findByNome("Teste Selenium").orElse(null);
        assertNotNull(pessoa, "Pessoa não foi salva no banco");
        assertEquals(30, pessoa.getIdade());
    }

    @Test
    @Order(2)
    public void deveExibirNoGraficoOsDadosInseridos() {
        driver.get("http://localhost:8080/relatorio");

        boolean temCanvas = driver.findElements(By.tagName("canvas")).size() > 0;
        assertTrue(temCanvas, "Nenhum gráfico foi encontrado na página de relatório");
    }

    @Test
    @Order(3)
    public void deveFiltrarDadosNoGrafico() {
        driver.get("http://localhost:8080/relatorio");

        driver.findElement(By.id("raca")).sendKeys("Branca");
        driver.findElement(By.className("botao-principal")).click();

        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}

        boolean temCanvasFiltrado = driver.findElements(By.tagName("canvas")).size() > 0;
        assertTrue(temCanvasFiltrado, "O gráfico não foi renderizado após o filtro");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}