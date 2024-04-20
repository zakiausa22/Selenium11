package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardKeysEvent {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","C:\\EVA Q A\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		
		//Using WebDriver Manager
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver()

		
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		//keydown
		WebElement item1 = driver.findElement(By.xpath("(//ol[@id='selectable'])/li[1]"));
		Actions action= new Actions(driver);
		action.keyDown(Keys.CONTROL).click(item1).release().perform();
		
		
		
	}

}
