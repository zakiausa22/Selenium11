package seleniumDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\\\EVA Q A\\\\driver\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	
	//Click create lead link
	driver.findElementByLinkText("Create Lead").click();
	
	//enter company name
	driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
	//Enter FirstName
	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	//Enter lastName
	driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
	
	//Drop-down -source
	//Choose 'Website' from Source drop-down
	WebElement src = driver.findElementById("createLeadForm_dataSourceId");
	
	//Create object of select class and pass variable
	Select dd = new Select (src);
	//dd.selectByVisibleText("Website");
	//dd.selectByValue("LEAD_TRADESHOW");
	//dd.selectByIndex(11); // Website
	
	//Choose 'Demo Marketing Campaign'  from Marketing Campaign - mkt
	WebElement mkt = driver.findElementById("createLeadForm_marketingCampaignId");
	
	//Create object of select class and pass variable
	//Mkt Campaign
	Select dd1 = new Select (mkt);
	dd1.selectByVisibleText("Demo Marketing Campaign");
	
	//Industry
	WebElement ind = driver.findElementById("createLeadForm_industryEnumId");

	Select dd2 = new Select(ind);
	//dd2.selectByValue("IND_HEALTH_CARE");
	dd2.selectByIndex(7);
	
	//driver.close();
	
	
	
	
	
	
	
	}

}
