package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormElementos {

	
	@FindBy(how = How.ID, using = "make")
	protected WebElement marca;
	
	@FindBy(how = How.ID, using = "model")
	protected WebElement modelo;
	
	@FindBy(how = How.ID, using = "cylindercapacity")
	protected WebElement capacidade;
	
	@FindBy(how = How.ID, using = "engineperformance")
	protected WebElement performance;
	
	@FindBy(how = How.ID, using = "dateofmanufacture")
	protected WebElement dataFabricacao;
	
	@FindBy(how = How.ID, using = "numberofseats")
	protected WebElement lugares;
	
	@FindBy(how = How.ID, using = "numberofseatsmotorcycle")
	protected WebElement luagresMoto;
	
	@FindBy(how = How.ID, using = "fuel")
	protected WebElement combustivel;
	
	@FindBy(how = How.ID, using = "payload")
	protected WebElement cargaUtil;
	
	@FindBy(how = How.ID, using = "totalweight")
	protected WebElement pesoTotal;
	
	@FindBy(how = How.ID, using = "listprice")
	protected WebElement preco;
	
	@FindBy(how = How.ID, using = "annualmileage")
	protected WebElement annualmileage;
	
	//fim primeira pagina
	
	@FindBy(how = How.ID, using = "nextenterinsurantdata")
	protected WebElement btnNext;
	
	@FindBy(how = How.ID, using = "preventervehicledata")
	protected WebElement btnPrev;
	
	@FindBy(how = How.ID, using = "firstname")
	protected WebElement nome;
	
	@FindBy(how = How.ID, using = "lastname")
	protected WebElement sobrenome;

	@FindBy(how = How.ID, using = "birthdate")
	protected WebElement nascimento;
	
	@FindBy(how = How.ID, using = "gendermale")
	protected WebElement genero;
	
	@FindBy(how = How.ID, using = "country")
	protected WebElement pais;
	
	@FindBy(how = How.ID, using = "streetaddress")
	protected WebElement endereco;
	
	@FindBy(how = How.ID, using = "zipcode")
	protected WebElement cep;
	
	@FindBy(how = How.ID, using = "city")
	protected WebElement cidade;
	
	@FindBy(how = How.ID, using = "occupation")
	protected WebElement profissao;
	
	@FindBy(how = How.ID, using ="skydiving")
	protected WebElement skydiving;
	
	@FindBy(how = How.ID, using = "startdate")
	protected WebElement dataInicio;
	
	@FindBy(how = How.ID, using = "insurancesum")
	protected WebElement insurancesum;
	
	@FindBy(how = How.ID, using = "meritrating")
	protected WebElement meritrating;
	
	@FindBy(how = How.ID, using = "damageinsurance")
	protected WebElement damageinsurance;
	
	@FindBy(how = How.ID, using ="EuroProtection")
	protected WebElement optionProducts;
	
	@FindBy(how = How.ID, using = "courtesycar")
	protected WebElement courtesycar;
	
	@FindBy(how = How.ID, using = "selectultimate")
	protected WebElement selectPrice;
	
	@FindBy(how = How.ID, using = "email")
	protected WebElement email;
	
	@FindBy(how = How.ID, using = "phone")
	protected WebElement phone;
	
	@FindBy(how = How.ID, using = "username")
	protected WebElement username;
	
	@FindBy(how = How.ID, using = "password")
	protected WebElement password;
	
	@FindBy(how = How.ID, using = "confirmpassword")
	protected WebElement confirmpassword;
	
	@FindBy(how = How.ID, using = "sendemail")
	protected WebElement btnSendForm;
	
	@FindBy(how = How.ID, using = "confirm")
	protected WebElement btnOK;
}
