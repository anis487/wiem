package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

	protected WebDriver driver;
	public static WebDriverWait wait;
	

	//Create Constructor
	public PageBase (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public static void clickButton(WebElement button) {	
        try {
            wait.until(ExpectedConditions.elementToBeClickable(button));
            button.click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
	
	
	
	public static void setTxtElementTxt(WebElement textelement, String value) {
        {
            try {
                wait.until(ExpectedConditions.visibilityOf(textelement)).clear();
                textelement.sendKeys(value);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

}
