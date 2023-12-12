package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	static WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"zoneProfile\"]/i")
	public WebElement profileIcon;
	
	@FindBy(xpath = "//*[@id='leftsidebar']/div/div/ul/li[3]/a")
	public WebElement dataGovernanceBtn;
	
	
	
	@FindBy(xpath = "//*[@id=\"leftsidebar\"]/div/div/ul/li[3]/ul/li[1]/a")
	WebElement projectBtn; 
	
	@FindBy(id = "bt")
	public WebElement newBtn ;
	
	
	@FindBy(className = "btn-hover.btn-border-radius.color-8-max.bt-bt10")
	WebElement detailsProjectBtn;
	
	
	public void dataGovernancePage() {
		//clickButton(dataGovernanceBtn);
		
		
	}
	
	public void projectPage() {
		clickButton(projectBtn);
	}
	
	public void newProjectBtn() {
		clickButton(newBtn);
	}
	
	public void detailsProject() {
		clickButton(detailsProjectBtn);
	}
	


}
