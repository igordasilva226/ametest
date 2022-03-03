package pages;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CodeBase;

public class FormularioPage extends CodeBase {
	

	@FindBy(xpath = "(//input[@class='whsOnd zHQkBf'])[1]")
	WebElement nomeFormulario;
	
	@FindBy(xpath = "(//input[@class='whsOnd zHQkBf'])[2]")
	WebElement emailFormulario;
	
	@FindBy(xpath = "//div[@data-value=\"Vermelho\"]")
	WebElement corVermelho;
	
	@FindBy(xpath = "//div[@data-value=\"Azul\"]")
	WebElement corAzul;
	
	@FindBy(xpath = "//div[@data-value=\"Verde\"]")
	WebElement corVerde;
	
	@FindBy(xpath = "//div[@aria-label=\"Sorvete\"]")
	WebElement sobremesaSorvete;
	
	@FindBy(xpath = "//div[@aria-label=\"Bolo\"]")
	WebElement sobremesaBolo;
	
	@FindBy(xpath = "//div[@aria-label=\"Fruta\"]")
	WebElement sobremesaFruta;
	
	@FindBy(xpath = "//div[@aria-label=\"Outro:\"]")
	WebElement sobremesaOutro;
	
	@FindBy(xpath = "//input[@aria-label=\"Outra resposta\"]")
	WebElement digitarSobremesa;
	
	@FindBy(xpath = "//span[normalize-space()='Escolher']")
	WebElement escolherComida;
	
	@FindBy(xpath = "//div[@role='option']//span[@class='vRMGwf oJeWuf'][normalize-space()='Carnes']")
	WebElement comidaCarnes;
	
	@FindBy(xpath = "//div[@role='option']//span[@class='vRMGwf oJeWuf'][normalize-space()='Massas']")
	WebElement comidaMassas;

	@FindBy(xpath = "//div[@role='option']//span[@class='vRMGwf oJeWuf'][normalize-space()='Todas']")
	WebElement comidaTodas;
	
	@FindBy(xpath = "//div[@role='option']//span[@class='vRMGwf oJeWuf'][normalize-space()='Legumes']")
	WebElement comidaLegumes;
	
	
	@FindBy(xpath = "//div[@aria-label=\"1\"]")
	WebElement notaUmParaGostoDeAnimais;
	
	@FindBy(xpath = "//div[@aria-label=\"2\"]")
	WebElement notaDoisParaGostoDeAnimais;
	
	@FindBy(xpath = "//div[@aria-label=\"3\"]")
	WebElement notaTresParaGostoDeAnimais;
	
	@FindBy(xpath = "//div[@aria-label=\"4\"]")
	WebElement notaQuatroParaGostoDeAnimais;
	
	@FindBy(xpath = "//div[@aria-label=\"5\"]")
	WebElement notaCincoParaGostoDeAnimais;
	
	@FindBy(xpath = "//div[@aria-label=\"6\"]")
	WebElement notaSeisParaGostoDeAnimais;
	
	@FindBy(xpath = "//div[@aria-label=\"7\"]")
	WebElement notaSeteParaGostoDeAnimais;
	
	@FindBy(xpath = "//div[@aria-label=\"8\"]")
	WebElement notaOitoParaGostoDeAnimais;
	
	@FindBy(xpath = "//div[@aria-label=\"9\"]")
	WebElement notaNoveParaGostoDeAnimais;
	
	@FindBy(xpath = "//div[@aria-label=\"10\"]")
	WebElement notaDezParaGostoDeAnimais;
	
	@FindBy(xpath = "(//div[@data-value=\"Ruim\"])[1]")
	WebElement selecionarRuimPrimeiraColuna;
	
	@FindBy(xpath= "(//div[@data-value=\"Mediano\"])[2]")
	WebElement selecionarMedianoSegundaColuna;
	
	@FindBy(xpath = "(//div[@data-value=\"Bom\"])[3]")
	WebElement selecionarBomTerceiraColuna;
	
	@FindBy(xpath = "(//div[@data-value=\"Ótimo\"])[4]")
	WebElement selecionarOtimoQuartaColuna;
	
	@FindBy(xpath = "//div[@aria-label=\"Pão, resposta para Xburguer\"]")
	WebElement paoParaXburguer;
	
	@FindBy(xpath = "//div[@aria-label=\"Pão, resposta para Hamburguer\"]")
	WebElement paoParaHamburguer;
	
	@FindBy(xpath = "//div[@aria-label=\"Pão, resposta para Vegetariano\"]")
	WebElement paoParaVegetariano;
	
	@FindBy(xpath = "//div[@aria-label=\"Pão, resposta para EggXburger\"]")
	WebElement paoParaEggXburguer;

	@FindBy(xpath = "//div[@aria-label=\"Carne, resposta para Xburguer\"]")
	WebElement carneParaXburguer;
	
	@FindBy(xpath = "//div[@aria-label=\"Carne, resposta para Hamburguer\"]")
	WebElement carneParaHamburguer;
	
	@FindBy(xpath = "//div[@aria-label=\"Carne, resposta para EggXburger\"]")
	WebElement carneParaEggXburguer;
	
	@FindBy(xpath = "//div[@aria-label=\"Queijo, resposta para Xburguer\"]")
	WebElement queijoParaXburguer;

	@FindBy(xpath = "//div[@aria-label=\"Queijo, resposta para Vegetariano\"]")
	WebElement queijoParaVegetariano;
	
	@FindBy(xpath = "//div[@aria-label=\"Queijo, resposta para EggXburger\"]")
	WebElement queijoParaEggXburguer;
	
	@FindBy(xpath = "//div[@aria-label=\"Ovo, resposta para Vegetariano\"]")
	WebElement ovoParaVegetariano;
	
	@FindBy(xpath = "//div[@aria-label=\"Ovo, resposta para EggXburger\"]")
	WebElement ovoParaEggXburguer;
	
	@FindBy(xpath = "//div[@aria-label=\"Salada, resposta para Vegetariano\"]")
	WebElement saladaParaVegetariano;
	
	@FindBy(xpath = "//div[@aria-label=\"Salada, resposta para EggXburger\"]")
	WebElement saladaParaEggXburguer;
	
	@FindBy(xpath = "//input[@aria-labelledby=\"i59\"]")
	WebElement digitarDataDeHoje;
	
	@FindBy(xpath = "//input[@aria-label=\"Hora\"]")
	WebElement horasDaquiUmaHora;
	
	@FindBy(xpath = "//input[@aria-label=\"Minuto\"]")
	WebElement minutosDaquiUmaHora;
	
	@FindBy(xpath = "//span[contains(text(), 'Enviar')]")
	WebElement btnEnviar;
	
	@FindBy(xpath = "//div[contains(text(), 'Sua resposta foi registrada')]")
	WebElement txtRespostaRegistrada;
	
	public FormularioPage () {
		PageFactory.initElements(driver, this);
	}
	
	public void digitarNome (String nome) throws Exception {
		nomeFormulario.click();
		nomeFormulario.sendKeys(nome);
		Thread.sleep(1000);
	}
	
	public void digitarEmail (String email) {
		emailFormulario.sendKeys(email);
	}
	
	public void selecionarCorVerde() {
		corVerde.click();
	}
	
	public void selecionarCorAzul() {
		corAzul.click();
	}
	
	public void selecionarCorVermelha() {
		corVermelho.click();
	}
	
	public void selecionarSobremesaSorvete() {
		sobremesaSorvete.click();
	}
	
	public void selecionarSobremesaBolo() {
		sobremesaBolo.click();
	}
	
	public void selecionarSobremesaFruta() {
		sobremesaFruta.click();
	}
	
	public void selecionarSobremesaOutro() {
		sobremesaOutro.click();
	}
	
	public void digitarOutraSobremesa(String sobremesa) {
		digitarSobremesa.sendKeys(sobremesa);
	}
	
	public void selecionarCarnes() throws Exception {
		escolherComida.click();
		Thread.sleep(3000);
		comidaCarnes.click();
	}
	
	public void selecionarTodas() throws Exception {
		escolherComida.click();
		Thread.sleep(3000);
		comidaTodas.click();
	}
	public void selecionarLegumes() throws Exception {
		escolherComida.click();
		Thread.sleep(3000);
		comidaLegumes.click();
	}
	public void selecionarMassas() throws Exception {
		escolherComida.click();
		Thread.sleep(3000);
		comidaMassas.click();
	}
	
	
	public void avaliarOsEsportes() {
		selecionarRuimPrimeiraColuna.click();
		selecionarMedianoSegundaColuna.click();
		selecionarBomTerceiraColuna.click();
		selecionarOtimoQuartaColuna.click();
	}
	
	public void montarLancheXburguer() {
		paoParaXburguer.click();
		carneParaXburguer.click();
		queijoParaXburguer.click();
	}
	
	public void montarLancheEggXburguer() {
		paoParaEggXburguer.click();
		carneParaEggXburguer.click();
		ovoParaEggXburguer.click();
		queijoParaEggXburguer.click();
	}
	
	public void montarLancheVegetariano() {
		paoParaVegetariano.click();
		queijoParaVegetariano.click();
		saladaParaVegetariano.click();
		ovoParaVegetariano.click();
	}
	
	public void montarLancheHamburguer() {
		paoParaHamburguer.click();
		carneParaHamburguer.click();
	}
	
	public void digitarDataDeHoje() {
		LocalDate todaysDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String hoje = todaysDate.format(formatter);
		digitarDataDeHoje.sendKeys(hoje);
	}
	
	public void horarioDaquiUmaHora() {
		LocalTime todaysHours = LocalTime.now();
		int horas = todaysHours.plusHours(1).getHour();
		int minutos = todaysHours.getMinute();
		String hora = Integer.toString(horas);
		String minuto = Integer.toString(minutos);
		horasDaquiUmaHora.sendKeys(hora);
		minutosDaquiUmaHora.sendKeys(minuto);
	}
	
	public void notaUmParaAnimal() {
		notaUmParaGostoDeAnimais.click();
	}
	public void notaDoisParaAnimal() {
		notaDoisParaGostoDeAnimais.click();
	}
	public void notaTresParaAnimal() {
		notaTresParaGostoDeAnimais.click();
	}
	public void notaQuatroParaAnimal() {
		notaQuatroParaGostoDeAnimais.click();
	}
	public void notaCincoParaAnimal() {
		notaCincoParaGostoDeAnimais.click();
	}
	public void notaSeisParaAnimal() {
		notaSeisParaGostoDeAnimais.click();
	}
	public void notaSeteParaAnimal() {
		notaSeteParaGostoDeAnimais.click();
	}
	public void notaOitoParaAnimal() {
		notaOitoParaGostoDeAnimais.click();
	}
	public void notaNoveParaAnimal() {
		notaNoveParaGostoDeAnimais.click();
	}
	public void notaDezParaAnimal() {
		notaDezParaGostoDeAnimais.click();
	}
	
	public void btnEnviar() throws InterruptedException {
		btnEnviar.click();
		Thread.sleep(5000);
		String esperado = "Sua resposta foi registrada.";
		Assert.assertEquals(txtRespostaRegistrada.getText(), esperado);
	}
	
	
}
