package learnCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTagNameCollection {

	public static void main(String[] args) {
		//List<Integer>ID =new ArrayList<Integer>();
		System.setProperty("webdriver.chrome.driver","C:\\EVA Q A\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// List<WebElement> findElements = driver.findElements(By.tagName(""));
		// System.out.println(findElements.size());
		// user name ,password , login button & click crm/sfa
		 driver.findElementById("username").sendKeys("DemosalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		// Find how many tag in this page ie a-tag,div-tag,h2-tag
		 List<WebElement> findElements = driver.findElements(By.tagName("a"));
		 List<WebElement> findElements2 = driver.findElements(By.tagName("div"));
		  List<WebElement> findElements3 = driver.findElements(By.tagName("h2"));
				 
		  System.out.println(findElements.size());
		  System.out.println(findElements2.size());
		  System.out.println(findElements3.size());
	}

}
