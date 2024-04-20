package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aui_ConMousehoveron {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\EVA Q A\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	 
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
			WebElement src = driver.findElementByXPath("//a[@class='menulink']");	
			Actions action= new Actions(driver);
	       action.moveToElement(src).perform();
			//Then click the Articles element
			driver.findElementByXPath("(//a[text()='Articles'])[1]").click();
			

	}

}
