package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Httpshandle {
	
	public static void main(String[] args) {
		
		FirefoxProfile Profile = new FirefoxProfile();
		
		Profile.setAcceptUntrustedCertificates(false);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("Url");
		
	
	}

}
