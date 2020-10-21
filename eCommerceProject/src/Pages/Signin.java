package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {
	WebDriver driver;
	
	By emailAdd = By.id("email");
	By pwd = By.id("passwd");
	By signButton = By.id("SubmitLogin");
	
	public Signin(WebDriver driver){
		this.driver = driver;
	} 
	
	public void enterEmail() {
		driver.findElement(emailAdd).sendKeys("automation.qa@gmail.com");
	}
	
	public void enterPass() {
		driver.findElement(pwd).sendKeys("automation123");
	}
	
	public void signButton() {
		driver.findElement(signButton).click();
		}
	

	}
