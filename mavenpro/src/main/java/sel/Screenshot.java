package sel;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try{
			
			FileUtils.copyFile(src,new File("Path"));
			
		}
		
		catch(Exception e){
			
			
		}
	}

}
