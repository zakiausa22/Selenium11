package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		//1.Launch/open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\EVA Q A\\driver\\chromedriver.exe");
		//syntax of Object creation: ClassName Object = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		
		//2.Load/open URL of TestLeaf
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//3.Maximize window
		driver.manage().window().maximize();
		
		//4.Close browser
		driver.close();
		
		
		
		
		

	}

}
