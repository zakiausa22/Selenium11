package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert_Simple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\EVA Q A\\\\driver\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load/open URL
		   // driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		    
				//driver.getTitle();
		  		System.out.println(driver.getTitle());
		
		  		//Maximize window
		  		driver.manage().window().maximize();	
		  		
		  		//Implicitly wait
		  		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  		
		  		//Click on Submit btn
		  		driver.findElementById("searchBtn").click();
		  		
		  		//Move your control to Alert window from main window
		  		String simpleAlert = driver.switchTo().alert().getText();
		  		System.out.println(simpleAlert);
		  		
		  		//Click on OK btn
		  		driver.switchTo().alert().accept();

	}

}
