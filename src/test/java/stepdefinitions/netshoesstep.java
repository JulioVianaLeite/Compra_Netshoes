package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverPrincipal;
import actions.AcoesNetshoes;

public class netshoesstep {
	
	DriverPrincipal principal = new DriverPrincipal();
	WebDriver driver = principal.AbrirUrl();
	AcoesNetshoes acoes = PageFactory.initElements(driver, AcoesNetshoes.class);
	
	public netshoesstep() throws Exception {

	}
	
	
	@Given("{string} e aberto")
	public void e_aberto(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	
	@And("abra todas as categorias, click em Tenis a aba masculina")
	public void abra_todas_as_categorias_click_em_tenis_a_aba_masculina() throws InterruptedException {
		acoes.clickCategorias();
		Thread.sleep(5000);
		acoes.clickNox();
		Thread.sleep(2000);
		acoes.clickTenis();
	}

	@And("escolha tamanho {string}, marca do tenis {string} e ordena por maior preco")
	public void escolha_tamanho_marca_do_tenis_e_ordena_por_maior_preco(String string, String string2) throws InterruptedException {
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
		
	}

	@When("o site apresenta os tenis, ele pode escolher o tenis desejado")
	public void o_site_apresenta_os_tenis_ele_pode_escolher_o_tenis_desejado() throws InterruptedException {
		Thread.sleep(4000);
		acoes.clickTenisEscolido();
		Thread.sleep(4000);
	}

	@And("escolha o tamanho, consulte o prazo de entrega {string}")
	public void escolha_o_tamanho_consulte_o_prazo_de_entrega(String string) throws InterruptedException {
		acoes.clickTamanhoDesejado();
		Thread.sleep(4000);
		acoes.clickCEP("08253-520");
		Thread.sleep(4000);
		acoes.clickBotaoEnter();
}

	@Then("podera continuar com o processo de compra e finaliza-lo")
	public void podera_continuar_com_o_processo_de_compra_e_finaliza_lo() throws InterruptedException {
		Thread.sleep(2000);
		acoes.clickCompra();
		Thread.sleep(3000);
		acoes.clickFinalizar();
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
