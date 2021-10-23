package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroDeProdutosTest {

	@Test
	public void testCadastroDeProdutoComSucesso() {

		// Executando o driver do google chrome
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver.exe");

		// Abrindo o navegaddor
		WebDriver driver = new ChromeDriver();

		// Maximizar o navegador
		driver.manage().window().maximize();

		// Acessar a página wen do sistema que será testada
		driver.get("http://exercteste01-001-site1.gtempurl.com/Home/Exercicio05");

		// Preencher nome do produto
		driver.findElement(By.xpath("//*[@id=\"nome\"]")).sendKeys("Notebook Dell");

		// Preencher o preço do produto
		driver.findElement(By.xpath("//*[@id=\"preco\"]")).sendKeys("3500");

		// Preencher o quantidadde do produto
		driver.findElement(By.xpath("//*[@id=\"quantidade\"]")).sendKeys("10");

		// Clicar no botão cadastrar produto
		driver.findElement(By.xpath("//*[@id=\"btnCadastro\"]")).click();

		// Capturar a mensagem obtida no sistema
		String mensagem = driver.findElement(By.xpath("//*[@id=\"mensagem\"]")).getText();

		// Comparando se a mensagem obtida no sistema é "Produto cadastrado com
		// sucesso."
		assertEquals(mensagem, "Produto cadastrado com sucesso.");

		// Fechar o navegador
		driver.close();
		driver.quit();

	}

}
