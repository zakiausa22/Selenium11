package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		//Using WebDriver Manager
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 //driver.getwindowHandle()
		//driver.getWindowHandles();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.findElements(By.xpath("//a[text()='Try it Yourself ']")).click();
		driver.findElement(By.linkText("Try it Yourself »")).click();
			Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		for(String eachwin:allwin ) {
			System.out.println(eachwin);
			driver.switchTo().window(eachwin);
			System.out.println(driver.getTitle());
	
			
			
		}

		

	}

}
