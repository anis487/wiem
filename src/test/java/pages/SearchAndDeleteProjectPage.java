package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAndDeleteProjectPage extends PageBase {

	
	public SearchAndDeleteProjectPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "dataSearchFilter")
	WebElement searchProjectTxt;
	
	@FindBy(css="ul.collapsible")
	WebElement projectList ;
	
	
	public void ProjectSearch(String projectName) {
		
		setTxtElementTxt(searchProjectTxt, projectName);
		
	}
	
	
	
	

}
