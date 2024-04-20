package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learntalert_simplehomework {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\EVA Q A\\\\driver\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load/open URL
	driver.get("http://leaftaps.com/crmsfa/control/mergeLeadsForm");
	//driver.getTitle();
		System.out.println(driver.getTitle());

		//Maximize window
		driver.manage().window().maximize();	
		
		//Implicitly wait
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	//Enter username as Demosalesmanager
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	//Enter password
	driver.findElementById("password").sendKeys("crmsfa");
	
	//Click Login button
	//driver.findElementByClassName("decorativeSubmit").click();
	//Click on Submit btn
		driver.findElementById("searchBtn").click();
		
		//Move your control to Alert window from main window
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);
		
		
			


	}

}
