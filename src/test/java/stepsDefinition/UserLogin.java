package stepsDefinition;



import org.testng.Assert;
import org.testng.annotations.Test;

import basesTest.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class UserLogin extends TestBase {
	LoginPage loginObject;
	HomePage homeObject;


	@Given("the user in the login page")
	public void the_user_in_the_login_page() {

		//Assert.assertTrue(driver.getTitle().contains("Login"));

	}
	@When("I entred the user data {string} , {string}")
	public void i_entred_the_user_data(String userName, String password) {
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
	
		

	}

	@Then("the login done successfully")
	public void the_login_done_successfully() {

		homeObject = new HomePage(driver);
		Assert.assertTrue(homeObject.profileIcon.isDisplayed());
		



	}

}
