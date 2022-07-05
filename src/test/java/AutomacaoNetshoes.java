import static org.junit.


jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.AcoesNetshoes;
import utils.Constantes;
import utils.DriverContext;

class AutomacaoNetshoes {

	WebDriver driver;
	AcoesNetshoes acoes;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constantes.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("https://www.netshoes.com.br/");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		acoes = new AcoesNetshoes();
	}

	@Test
	void test() throws InterruptedException {
		acoes.clickCategorias();
		Thread.sleep(5000);
		acoes.clickNox();
		Thread.sleep(2000);
		acoes.clickTenis();
		Thread.sleep(2000);
		acoes.clickTamanhoTenis("41");
		Thread.sleep(5000);
		acoes.clickNoTamanhoTenis();
		Thread.sleep(5000);
		acoes.clickMarcaTenis("Adidas");
		Thread.sleep(5000);
		acoes.clickMarcaDoTenis();
		Thread.sleep(5000);
		acoes.clickMaisPopulares();
		Thread.sleep(2000);
		acoes.clickMaiorPreco();
		Thread.sleep(2000);
		acoes.clickTenisEscolido();
		Thread.sleep(2000);
		acoes.clickTamanhoDesejado();
		Thread.sleep(2000);
		acoes.clickCEP("08253-520");
		Thread.sleep(2000);
		acoes.clickBotaoEnter();
		Thread.sleep(3000);
		acoes.clickCompra();
		Thread.sleep(3000);
		acoes.clickFinalizar();
		
	
		
		
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}
