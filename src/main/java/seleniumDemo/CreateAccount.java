package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\EVA Q A\\driver\\chromedriver.exe");
		//syntax of Object creation: ClassName Object = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		
		
		//	WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();

			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			
			//Create account
			driver.findElementByLinkText("Create Account").click();
			driver.findElementById("accountName").sendKeys("CBC3");
			driver.findElementByName("officeSiteName").sendKeys("ABC.com");
			
			//enter Annual Revenue
			driver.findElementById("annualRevenue").sendKeys("123");
			//enter Descriptoin
			driver.findElementById("description").sendKeys("I M Creat Account");
			//enter Important Note
			driver.findElementByName("importantNote").sendKeys("Note");
			//enter Area Code
			driver.findElementById("primaryPhoneAreaCode").sendKeys("100");
			//enter Extension
			driver.findElementById("primaryPhoneExtension").sendKeys("12");
			//enter email
			driver.findElementById("primaryEmail").sendKeys("zakia.usa18@gmail.com");
			
			
			//click Create Account
			driver.findElementByClassName("smallSubmit").click();
			
			//Get Title of the page
			System.out.println(driver.getTitle());
			
			//Get current url of the page
			System.out.println(driver.getCurrentUrl());
		
	}

}
