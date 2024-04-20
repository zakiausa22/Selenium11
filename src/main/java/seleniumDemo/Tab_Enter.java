package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_Enter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\EVA Q A\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='email']").sendKeys("zakia.usa22@gmail.com");
		Actions action= new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys("1234").build().perform();
		//action.sendKeys(Keys.ENTER).perform();Note:ENTER will take me to the next page.Tab will continue the page.
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		
		
		
		

	}

}
