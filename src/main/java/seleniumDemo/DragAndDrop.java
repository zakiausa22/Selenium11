package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\EVA Q A\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	 driver.get("https://jqueryui.com/droppable/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.switchTo().frame(0);
	 WebElement draganddrop = driver.findElementByXPath("//div[@id='draggable']");
	 WebElement draganddrop1 = driver.findElementByXPath("//div[@id='droppable']");
	 Actions action= new Actions (driver);
	 action.dragAndDrop(draganddrop, draganddrop1).perform();
	 driver.switchTo().defaultContent();
	 driver.switchTo().parentFrame();
	 Thread.sleep(4000);
	 driver.findElementByXPath("//a[text()='Selectable']").click();

	}

}
