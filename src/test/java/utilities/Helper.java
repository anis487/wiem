package utilities;


import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Helper {

	
	//Create a method take screenshot when the testCase fail
	
	public static void captureScreenShot(WebDriver driver , String screenShatName) {
		
		Path dest = Paths.get("./ressources/screenshots",screenShatName+".png");
		try {
			Files.createDirectories(dest.getParent());
			FileOutputStream out = new FileOutputStream(dest.toString());
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} catch (Exception e) {
			System.out.println("Exception white taking Screenshot"+ e.getMessage());
		}
	}
}
