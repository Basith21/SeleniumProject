package demoClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice1 {

public static void main(String[] args) {
	
     
      // public void main  practice1() {
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\basit\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Load Url
		driver.get("http://leaftaps.com/opentaps");

	  // Maximize window
		driver.manage().window().maximize();

		//Implicitly wait
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		//enter username
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		//driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager");

		//enter password
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");

		//click login btn
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("//input[@value='Login']").click();

		//click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

		//click leads link
		//driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[text()='Leads']").click();

		//click Create lead link
		//driver.findElementByLinkText("Create Lead").click();
		//driver.findElementByPartialLinkText("Create").click();
		//driver.findElementByXPath("//a[text()='Create Lead']").click();


		//close browser
		driver.close();



	}

}
