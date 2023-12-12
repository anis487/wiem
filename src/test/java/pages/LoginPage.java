package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "username")
	WebElement userNameTxtBtn;
	
	@FindBy(id = "password")
	WebElement passwordTxtBtn;
	
	@FindBy(id = "login_submit")
	WebElement loginBtn;
	
	@FindBy(css = "div.sidebar-userpic-name")
	public WebElement userNameShowed;
	
	public void userLogin(String username, String password) {
		
		setTxtElementTxt(userNameTxtBtn, username);
		setTxtElementTxt(passwordTxtBtn, password);
		clickButton(loginBtn);
	
	}

}
