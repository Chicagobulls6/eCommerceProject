package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\u017826\\Desktop\\webdrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\u017826\\Desktop\\webdrivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.quit();
	}

}
