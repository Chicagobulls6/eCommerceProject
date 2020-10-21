package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {

	WebDriver driver;
		
		By ContactUs = By.xpath("//*[@id=\"contact-link\"]/a");
		By Subject = By.id("id_contact");
		By ContactEmail = By.id("email");
		By FileUpload = By.id("fileUpload");
		By ContactMsg = By.id("message");
		By SendKey = By.xpath("//*[@id=\"submitMessage\"]/span");
		By OrderRef = By.id("id_order");
		
	public  ContactUs (WebDriver driver) {
		this.driver = driver;
	}
	
	public void ContSubCustCare() {
		driver.findElement(Subject).sendKeys("Customer Service");
		
	}
	
	public void ContSubWebmaster() {
		driver.findElement(Subject).sendKeys("Webmaster");
		
	}
	
	public void ContEmail() {
		driver.findElement(ContactEmail).sendKeys("automation2.qa2@gmail.com");
	}
	
	public void ContFileUpload() {
		WebElement uploadElement = driver.findElement(FileUpload);
		uploadElement.sendKeys("C:\\Users\\u017826\\Desktop\\test123.docx");
	}
	
	public void ContMsg() {
		driver.findElement(ContactMsg).sendKeys("TEST");
	}
	
	public void ContSend() {
		driver.findElement(SendKey).click();
	}
	
	public void ContOrderNo() {
		driver.findElement(OrderRef).sendKeys("ABCDEF");
	}
	
	}


