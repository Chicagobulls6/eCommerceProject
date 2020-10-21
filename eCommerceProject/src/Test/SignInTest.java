package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Signin;

public class SignInTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\u017826\\Desktop\\webdrivers\\chromedriver.exe");
		WebDriver abc = new ChromeDriver();
		Signin objLogon = new Signin(abc);
		abc.get("http://automationpractice.com/index.php");
		abc.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		// Test Case #2 - Ensure successful Sign in using credential
		objLogon.enterEmail();
		objLogon.enterPass();
		objLogon.signButton();
		Thread.sleep(4000);
		
		String myAccount = abc.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
		if (myAccount.contains("MY ACCOUNT")) {
			System.out.println("TC#1 - You have successfully logged into the account");
		}
		
		abc.quit();
					
	}

}
