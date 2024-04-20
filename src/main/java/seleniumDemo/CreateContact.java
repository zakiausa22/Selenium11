package seleniumDemo;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;



public class CreateContact {

	
	public static void main(String[] args) {
	
	
	//public void createContact() {
	System.setProperty("webdriver.chrome.driver", "C:\\EVA Q A\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\EVA Q A\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();

	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	
	
	//click create contact link				
/*	driver.findElementByLinkText("Create Contact").click();
	
	//Get Title of Crate Contact page
	System.out.println(driver.getTitle());
	
	driver.findElementById("firstNameField").sendKeys("Hema");
	
	driver.findElementById("lastNameField").sendKeys("Mali");
					
	
	
	//click create contact btn
/*	driver.findElementByName("submitButton").click();
	
	//Get title of View Contact page
	System.out.println(driver.getTitle());
	

//	WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();

	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	
	
	//click create contact link				
	driver.findElementByLinkText("Create Contact").click();
	
	//Get Title of Crate Contact page
	System.out.println(driver.getTitle());
	
	driver.findElementById("firstNameField").sendKeys("Hema");
	
	driver.findElementById("lastNameField").sendKeys("Mali");*/
	
	/*driver.findElementById("createContactForm_firstNameLocal").sendKeys("Ma");
	driver.findElementById("createContactForm_lastNameLocal").sendKeys("mal");
	driver.findElementById("createContactForm_personalTitle").sendKeys("Mr");
	driver.findElementById("createContactForm_generalProfTitle").sendKeys("Manager");
	driver.findElementById("createContactForm_description").sendKeys("I m creating contact");
	driver.findElementById("createContactForm_importantNote").sendKeys("Note");
	driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("11");
	driver.findElementByName("primaryPhoneExtension").sendKeys("12");
	driver.findElementById("createContactForm_primaryEmail").sendKeys("zakia.usa22@gmail.com");
	driver.findElementByName("generalToName").sendKeys("HemaMali");
	driver.findElementById("createContactForm_generalAddress1").sendKeys("abc");
	driver.findElementById("createContactForm_generalCity").sendKeys("NY");
	driver.findElementById("createContactForm_generalPostalCode").sendKeys("11001");
	driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("11");
	driver.findElementById("createContactForm_departmentName").sendKeys("Account");
	driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("4567");
	driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Hemu");
	driver.findElementByName("generalAttnName").sendKeys("Hemu");
	driver.findElementByName("generalAddress2").sendKeys("park");

	
	
	//click create contact btn
	driver.findElementByName("submitButton").click();
	
	
	//Get title of View Contact page
	System.out.println(driver.getTitle());*/
	
	}

}
