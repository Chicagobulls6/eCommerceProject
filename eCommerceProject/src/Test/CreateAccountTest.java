package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CreateAccount;

public class CreateAccountTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u017826\\Desktop\\webdrivers\\chromedriver.exe");
		WebDriver def = new ChromeDriver();
		CreateAccount objCrtAccnt = new CreateAccount(def);
		
		def.get("http://automationpractice.com/index.php");
		def.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(2000);
		
		def.findElement(By.id("email_create")).sendKeys("automation100.qa100@gmail.com");
		def.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		def.manage().window().maximize();
		
		Thread.sleep(3000);
		// TC#1 - Create a New Account successfully
		objCrtAccnt.Title();
		objCrtAccnt.FirstName();
		objCrtAccnt.LastName();
		objCrtAccnt.Password();
		objCrtAccnt.DobDays();
		objCrtAccnt.DobMonths();
		objCrtAccnt.DobYears();
		//objCrtAccnt.AdrFN();
		//objCrtAccnt.AdrLN();
		objCrtAccnt.Adr();
		objCrtAccnt.City1();
		objCrtAccnt.Zip1();
		objCrtAccnt.State1();
		objCrtAccnt.City1();
		objCrtAccnt.Cell1();
		objCrtAccnt.Register();
		
		WebElement WelcmMsg = def.findElement(By.id("center_column"));
		String AcctMsg = WelcmMsg.getText();
				if (AcctMsg.contains("Welcome to your account.")) {
					System.out.println("TC#1 - Your account has been created successfully");
				}
		
	/*	WebElement errAccount = def.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li/text()"));
		if (errAccount.isDisplayed()) {
			String errMsg = errAccount.getText();
		
		//String errAccount = def.findElement(By.id("create_account_error")).getText();
		System.out.println(errMsg);
		Thread.sleep(2000);
		}
		/*if (errAccount.contains("email address has already been registered.")) {
			System.out.println("TC#2-Email already exist. You can't proceed");
		}
		
		else {
			objCrtAccnt.Title();
			objCrtAccnt.FirstName();
			objCrtAccnt.LastName();
		} */
		
		
	}

}


