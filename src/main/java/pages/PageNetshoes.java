package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.DriverContext;

//Classe onde estar�o os mapeamentos da p�gina

public class PageNetshoes{
	
	
	//Construtor
	public PageNetshoes(){
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Todas as categorias')]")
	protected WebElement clicarCategorias;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"Layer_1\"]")
	protected WebElement clicarNoX;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"header-content\"]/header/div[2]/div/div[2]/div/div[3]/ul[1]/li[7]/a")
	protected WebElement clicarTenis;
	
	@FindBy(how=How.XPATH, using="//body/main[@id='content']/section[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[3]/div[2]/input[1]")
	protected WebElement clicarTamanhoTenis;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"filter-aggregation\"]/div/div[2]/div[2]/div[3]/ul[2]/li[1]/label")
	protected WebElement clicarNoTamanhoTenis;
	
	@FindBy(how=How.XPATH, using="//body/main[@id='content']/section[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[4]/div[2]/input[1]")
	protected WebElement clicarMarcaTenis;
	
	@FindBy(how=How.XPATH, using="//body/main[@id='content']/section[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[4]/ul[2]/li[1]/a[1]/label[1]")
	protected WebElement clicarMarcaDoTenis;
	
	@FindBy(how=How.XPATH, using="//body/main[@id='content']/section[1]/section[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	protected WebElement clicarMaisPopulares;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Maior Preço')]")
	protected WebElement clicarMaiorPreco;
	
	@FindBy(how=How.XPATH, using="//body/main[@id='content']/section[1]/section[2]/div[4]/div[1]/a[2]/div[1]/div[1]/div[2]/img[1]")
	protected WebElement clicarTenisEscolido;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'41')]")
	protected WebElement clicarTamanhoDesejado;

	@FindBy(how=How.XPATH, using="//body/main[@id='content']/div[2]/section[1]/section[2]/section[4]/form[1]/div[1]/div[1]/div[1]/input[1]")
	protected WebElement clicarCEP;
	
	@FindBy(how=How.XPATH, using="//body/main[@id='content']/div[2]/section[1]/section[2]/section[4]/form[1]/div[1]/div[1]/div[1]/input[1]")
	protected WebElement clicarEnter;
	
	@FindBy(how=How.XPATH, using="//body[1]/main[1]/div[2]/section[1]/section[2]/section[3]/div[1]/button[1]/span[1]")
	protected WebElement clicarCompra;
	
	@FindBy(how=How.XPATH, using="//body/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/button[1]")
	protected WebElement clicarFinalizar;
	
	
	
	

	
	
	
	
}
