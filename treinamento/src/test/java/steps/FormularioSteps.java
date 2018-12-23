package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generics.GenericMethods;
import pages.PageObject;

public class FormularioSteps extends PageObject {
	GenericMethods gem;
	public FormularioSteps(WebDriver driver) {
	
			super(driver);
			gem = new GenericMethods(driver);
		}

	@Given ("eu acesso o site")
	public void acessarSite() {
		
	}
    @And ("acesso  o formulario de pesquisa")
    public void acessoFormulario() {
    	
    }
    @When ("eu completo o cadastro")
    public void cadastrar() {
    	
    }
    @Then ("envio minhas repostas")
    public void enviarRespostas() {
    	
    }
}
