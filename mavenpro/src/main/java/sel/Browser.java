package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
public static void main(String[] args) {
	
//	WebDriver wd = new FirefoxDriver();
//	
//	wd.manage().window().maximize();
//		
//	}
	

	System.setProperty("webdriver.chrome.driver","E:\\Pro\\testone\\lib\\Chromedriver.exe");
	
	WebDriver wd = new ChromeDriver();
	
	wd.manage().window().maximize();
	
	wd.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	
	
	wd.get("https://www.google.com/");
	
}

}

