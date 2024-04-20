package xpathpractise;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateleadXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\EVA Q A\\driver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
			driver.findElementByXPath("//input[contains(@type,'p')]").sendKeys("crmsfa");
			driver.findElementByXPath("//input[@value='Login']").click();
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByXPath("//a[text()='Leads']").click();
			driver.findElementByXPath("//a[contains(text(),'My Leads')]").click();
			driver.findElementByXPath("//a[text()='Create Lead']").click();
					
					               
					              

		 
	}

}
