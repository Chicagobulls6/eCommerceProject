package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ContactUs;

public class ContactUsTest {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\u017826\\Desktop\\webdrivers\\chromedriver.exe");	
	WebDriver abc = new ChromeDriver();
	ContactUs objContactUs = new ContactUs(abc);
	
	abc.get("http://automationpractice.com/index.php");
	abc.findElement(By.linkText("Contact us")).click();
	Thread.sleep(3000);
	objContactUs.ContSubCustCare();
	objContactUs.ContEmail();
	objContactUs.ContFileUpload();
	objContactUs.ContMsg();
	objContactUs.ContSend();
    
	// TC#3 - Verify message is sent to customer team successfully
	WebElement ContSuccMsg = abc.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
	if (ContSuccMsg.isDisplayed()){
		String ContMsgVal = ContSuccMsg.getText();
		System.out.println("Displayed Message is:" + ContMsgVal);
		System.out.println("TC#3 - Message sent to Customer team successfully - Test Case PASS");
	}
	
	// Test Case#4 - Verify that message is sent to Webmaster successfully.
	
	abc.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span")).click();
	abc.findElement(By.linkText("Contact us")).click();
	Thread.sleep(3000);
	objContactUs.ContSubWebmaster();
	objContactUs.ContEmail();
	objContactUs.ContMsg();
	objContactUs.ContOrderNo();
	objContactUs.ContSend();
	
	WebElement ContSuccMsgWebmaster = abc.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
	if (ContSuccMsgWebmaster.isDisplayed()){
		String ContMsgVal1 = ContSuccMsgWebmaster.getText();
		System.out.println("Displayed Message is:" + ContMsgVal1);
		System.out.println("TC#4 - Message sent to Webmaster team successfully - Test Case PASS");
	}
	abc.close();
	
	}

}
