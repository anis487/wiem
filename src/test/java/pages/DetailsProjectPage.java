package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsProjectPage extends PageBase {
	
	public DetailsProjectPage(WebDriver driver) {
		super(driver);
	
	}

	@FindBy(xpath = "//*[@id=\"deleteApp0\"]")
	WebElement deleteProjectBtn;
	
    @FindBy(xpath = "//*[@id=\"body63b7e0f15a112f68e6602da2\"]/div/div/div/div/div/div/div[1]/div[2]/div/button[1]")
    WebElement editProjectBtn;
    
    @FindBy(xpath = "//*[@id=\"bt1_Architecture Systnaps\"]")
    WebElement backProjectBtn;
    
    @FindBy(css = "button.swal2-confirm.swal2-styled")
    WebElement confirmDeleteProjectBtn;
    
    @FindBy(xpath = "//h2[text()=\"Success!\"]" )
    public WebElement alertDelete;
    
    public void deleteProject() {
		clickButton(deleteProjectBtn);
	}
    
    public void confirmDeleteProject() {
		clickButton(confirmDeleteProjectBtn);
	}
    
    public boolean handleAlert(String alertText) {
        System.out.println(alertText);
        return alertText.contains("Project delete.");
    }

}
