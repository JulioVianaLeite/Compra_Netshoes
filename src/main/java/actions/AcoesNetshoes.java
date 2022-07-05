package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.PageNetshoes;
import utils.DriverContext;

public class AcoesNetshoes extends PageNetshoes {
	protected WebDriverWait wait;
	
	public AcoesNetshoes(){
		wait = new WebDriverWait(DriverContext.getDriver(), 60);
		}
	
	
	public void clickCategorias() {
		wait.until(ExpectedConditions.visibilityOf(clicarCategorias)).click();
	}
	
	public void clickNox() {
		wait.until(ExpectedConditions.visibilityOf(clicarNoX)).click();
	}

	public void clickTenis() {
		wait.until(ExpectedConditions.visibilityOf(clicarTenis)).click();
	}
	
	public void clickTamanhoTenis(String tamanho) {
		wait.until(ExpectedConditions.elementToBeClickable(clicarTamanhoTenis)).sendKeys(tamanho);
	}
	
	public void clickNoTamanhoTenis() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarNoTamanhoTenis)).click();
	}
	
	public void clickMarcaTenis(String marca) {
		wait.until(ExpectedConditions.elementToBeClickable(clicarMarcaTenis)).sendKeys(marca);
	}
	
	public void clickMarcaDoTenis() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarMarcaDoTenis)).click();
	}
	
	public void clickMaisPopulares() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarMaisPopulares)).click();
	}
	
	public void clickMaiorPreco() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarMaiorPreco)).click();
	}

	public void clickTenisEscolido() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarTenisEscolido)).click();
	}
	
	public void clickTamanhoDesejado() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarTamanhoDesejado)).click();
	}
	
	public void clickCEP(String cep) {
		wait.until(ExpectedConditions.elementToBeClickable(clicarCEP)).sendKeys(cep);
	}
	
	public void clickBotaoEnter() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarCEP)).sendKeys(Keys.RETURN);
	}
	
	
	public void clickCompra() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarCompra)).click();
	}
	
	public void clickFinalizar() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarFinalizar)).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
