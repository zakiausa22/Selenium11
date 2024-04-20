package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTesthomework {

	public static void main(String[] args) {
		//1.Launch/open Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\EVA Q A\\driver\\chromedriver.exe");
				//syntax of Object creation: ClassName Object = new ClassName();
				ChromeDriver driver = new ChromeDriver();
				
				//2.Load/open URL of TestLeaf
				driver.get("http://leaftaps.com/opentaps/control/login");
				//driver.navigate().to("http://leaftaps.com/opentaps/control/login");
				
				
				//driver.getTitle();
				System.out.println(driver.getTitle());
								
				//3.Maximize window
				driver.manage().window().maximize();
				//Implicitly wait	
				driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
				//Enter UserName
				driver.findElementById("username").sendKeys("DemoSalesManager");
				//Enter password
				driver.findElementById("password").sendKeys("crmsfa");
				//Click Login button
				driver.findElementByClassName("decorativeSubmit").click();
				//driver.findElementByClassName("decorativeSudmit").click();
				//Click CRM/SFA link
				driver.findElementByLinkText("CRM/SFA").click();
				//Click Leads link
				driver.findElementByLinkText("Leads").click();
				//click Create Lead link
				driver.findElementByLinkText("Create Lead").click();
				//enter company name
				driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
				//Enter FirstName
				driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
				//Enter lastName
				driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
				//enter Title
				driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
				//enter description
				driver.findElementById("createLeadForm_description").sendKeys("It is a traing software");
				
				//enter FirstName local
				driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ma");
				//enter LastName local
				driver.findElementById("createLeadForm_lastNameLocal").sendKeys("mal");
				//enter Salution
				driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr.");
				//enter Title
				driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Manager");
				//enter Annual Revenue
				driver.findElementById("createLeadForm_annualRevenue").sendKeys("123");
				//enter Important Note
				driver.findElementById("createLeadForm_importantNote").sendKeys("Note");
				//enterAreacode
				driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("11001");
				//enterPhone no.
				driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234");
				//enter Attention Name
				driver.findElementById("createLeadForm_generalAttnName").sendKeys("Na");
				//enter City
				driver.findElementById("createLeadForm_generalCity").sendKeys("NY");
				
				//click CreateLead btn
				driver.findElementByName("submitButton").click();	
				
				//Close browser
				driver.close();
				
	}

}
