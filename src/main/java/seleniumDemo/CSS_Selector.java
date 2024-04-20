package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\EVA Q A\\\\driver\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		
//	WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();

	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(20, Timeout.se);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager"); // 4 types of syntax to find user id
	//driver.findElementByCssSelector("input[id^='use']").sendKeys("DemosalesManager");
	//driver.findElementByCssSelector("input[name$='E']").sendKeys("DemosalesManager");
	//driver.findElementByCssSelector(".top>input").sendKeys("DemosalesManager");
	driver.findElementByCssSelector("label[for='username']+input").sendKeys("DemosalesManager");
	driver.findElementByCssSelector("input#password").sendKeys("crmsfa");
	driver.findElementByCssSelector("input[value='Login']").click();
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
