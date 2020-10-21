package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount {
	
	WebDriver driver;
	
	By Title = By.id("id_gender1");
	By FName = By.id("customer_firstname");
	By LName = By.id("customer_lastname");
	By Passwd = By.id("passwd");
	By Days = By.name("days");
	By Months = By.name("months");
	By Years = By.name("years");
	By NewsCheckBox = By.id("newsletter");
	By SpeOffrBox = By.id("optin");
	By FNameAdd = By.id("firstname");
	By LNameAdd = By.id("Lastname");
	By Address1 = By.id("address1");
	By City = By.id("city");
	By State = By.id("id_state");
	By ZipCode = By.id("postcode");
	By Country = By.id("id_country");
	By Cell = By.id("phone_mobile");
	By RegistorButtn = By.xpath("//*[@id=\"submitAccount\"]/span");
	
	
	public CreateAccount (WebDriver driver){
		this.driver = driver;
	} 

	public void Title() {
		driver.findElement(Title).click();
	}
	
	public void FirstName() {
		driver.findElement(FName).sendKeys("asdf");
	}

	public void LastName() {
		driver.findElement(LName).sendKeys("qwer");
	}
	
	public void Password() {
		driver.findElement(Passwd).sendKeys("automation123");
	}
	
	public void DobDays() {
		driver.findElement(Days).sendKeys("1");
	}
	
	public void DobMonths() {
		driver.findElement(Months).sendKeys("January");
	}
	
	public void DobYears() {
		driver.findElement(Years).sendKeys("1986");
	}
	
	public void AdrFN() {
		driver.findElement(FNameAdd).sendKeys("automation1");
		}
	public void AdrLN() {
		driver.findElement(LNameAdd).sendKeys("qa1");
	}
	
	public void Adr() {
		driver.findElement(Address1).sendKeys("123 Heaven Street");
	}
	
	public void City1() {
		driver.findElement(City).sendKeys("McKinney");
	}
	
	public void Zip1() {
		driver.findElement(ZipCode).sendKeys("75071");
	}
	
	public void State1() {
		driver.findElement(State).sendKeys("Texas");
	}
	
	public void Cell1(){
		driver.findElement(Cell).sendKeys("1111111111");
	}
	
	public void Register() {
		driver.findElement(RegistorButtn).click();
	}
}
