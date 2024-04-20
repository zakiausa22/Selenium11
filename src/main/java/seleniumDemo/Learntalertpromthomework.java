package seleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learntalertpromthomework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\EVA Q A\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load/open URL
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//driver.getTitle();
		System.out.println(driver.getTitle());

		//Maximize window
		driver.manage().window().maximize();	
		
		//Implicitly wait
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// Click on 'Click for JS Prompt'
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		
		//Move your control to Alert window from main window - way-2 (using Alert Class)
	  Alert promptAlert = driver.switchTo().alert();
	  promptAlert.getText();
		System.out.println(promptAlert.getText());
		
		Thread.sleep(3000);
	//	Type text into the box
		promptAlert.sendKeys("I am a Human");
		
		//Click on OK
		promptAlert.accept();
		
		

	}

}
