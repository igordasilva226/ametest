package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.FormularioPage;

public class FormularioSteps {
	
	
	FormularioPage formulario;

	
	@Dado("que estou na pagina de formulario") 
	public void verificarPaginaDeFormulario() {
		formulario = new FormularioPage();
	}
	
	@E("preencho o campo de nome {string}") 
	public void preencherCampoDeNome(String nome) throws Exception {
		formulario.digitarNome(nome);
	}
	
	@E("preencho o campo de email {string}") 
	public void preencherCampoDeEmail(String email) {
		formulario.digitarEmail(email);
	}
	
	@E("seleciono a minha cor favorita {string}")
		public void selecionarCorFavorita(String cor) {
			switch(cor) {
			case "Azul":
				formulario.selecionarCorAzul();
				break;
			case "Verde":
				formulario.selecionarCorVerde();
 				break;
			case "Vermelho":
				formulario.selecionarCorVermelha();
				break;
			}
			
		}
	
	@E("seleciono ou digito uma sobremesa {string}")
	public void selecionarOuDigitarUmaSobremesa(String sobremesa) {
		switch(sobremesa) {
		case "Sorvete":
			formulario.selecionarSobremesaSorvete();
			break;
		case "Bolo":
			formulario.selecionarSobremesaBolo();
				break;
		case "Fruta":
			formulario.selecionarSobremesaFruta();
			break;
		default:
			formulario.selecionarSobremesaOutro();
			formulario.digitarOutraSobremesa(sobremesa);
		}
		
	}
	
	@E("seleciono a comida favorita {string}")
	public void selecionarComidaFavorita(String comida) throws Exception {
		switch(comida) {
		case "Todas":
			formulario.selecionarTodas();
			break;
		case "Carnes":
			formulario.selecionarCarnes();
				break;
		case "Legumes":
			formulario.selecionarLegumes();
			break;
		case "Massas":
			formulario.selecionarMassas();
			break;
		
		
	}
		Thread.sleep(2000);
	}
	
	
	@E("avalio os esportes")
	public void avaliarOsEsportes() throws InterruptedException {
		formulario.avaliarOsEsportes();
	}
	
	@E("montar os lanches com os respectivos ingredientes")
	public void montarOsLanchesComRespectivosIngredientes() {
		formulario.montarLancheEggXburguer();
		formulario.montarLancheXburguer();
		formulario.montarLancheVegetariano();
		formulario.montarLancheHamburguer();
	}
	
	@E("informar a data de hoje")
	public void informarDataDeHoje() {
		formulario.digitarDataDeHoje();
	}
	
	@Quando("informar o horario adicionando uma hora")
	public void informarOHorarioAdicinandoUmaHora() {
		formulario.horarioDaquiUmaHora();
		System.out.println();
	}
	
	@E("seleciono a nota referente ao meu gosto por animais {string}")
	public void selecionarOQuantoGostoDeAnimaisAtravesDeUmNumero(String numero) throws Exception {
		switch(numero) {
		case "1":
			formulario.notaUmParaAnimal();
			break;
		case "2":
			formulario.notaDoisParaAnimal();;
				break;
		case "3":
			formulario.notaTresParaAnimal();
			break;
		case "4":
			formulario.notaQuatroParaAnimal();
			break;
		case "5":
			formulario.notaCincoParaAnimal();
			break;
		case "6":
			formulario.notaSeisParaAnimal();
				break;
		case "7":
			formulario.notaSeteParaAnimal();
			break;
		case "8":
			formulario.notaOitoParaAnimal();
			break;
		case "9":
			formulario.notaNoveParaAnimal();
			break;
		case "10":
			formulario.notaDezParaAnimal();
			break;
		
	}
	}
	
	@Entao("clico no botao enviar")
	public void clicarNoBotaoEnviar() throws InterruptedException {
		formulario.btnEnviar();
	}
	
}