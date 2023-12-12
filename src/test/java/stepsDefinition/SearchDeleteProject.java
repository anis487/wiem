package stepsDefinition;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import basesTest.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DetailsProjectPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PageBase;
import pages.SearchAndDeleteProjectPage;

public class SearchDeleteProject extends TestBase{
	PageBase pageBaseObject;
	LoginPage loginObject;
	HomePage homeObject; 
	DetailsProjectPage detailsProjectObject;
	public static WebDriverWait wait;
	SearchAndDeleteProjectPage searchDeleteObject;

	@Given("user is logged in {string} , {string}")
	public void user_is_logged_in(String userName, String password) throws InterruptedException {
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		Thread.sleep(3000);
		Assert.assertTrue(loginObject.userNameShowed.getText().contains(userName));


	}
	@When("user is in the project list")
	public void user_is_in_the_project_list() throws InterruptedException {
		homeObject = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(homeObject.dataGovernanceBtn));
		executor.executeScript("arguments[0].click();", homeObject.dataGovernanceBtn);
		homeObject.projectPage();
		Thread.sleep(6000);
		//Assert.assertTrue(homeObject.newBtn.isDisplayed());
	}
	@When("he searches for {string}")
	public void he_searches_for(String projectName) throws InterruptedException {

		searchDeleteObject = new SearchAndDeleteProjectPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		searchDeleteObject.ProjectSearch(projectName); 
		Assert.assertEquals(projectName, driver.findElement(By.xpath("//div[@class='col-lg-2 col-md-2 col-sm-2 col-xs-2' and text()='"+projectName+"']")).getText());

	}
	@When("he enters on details {string}")
	public void he_enters_on_details(String projectName) {
		//homeObject.detailsProject();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id='bt_"+projectName+"']")).click();
	}
	@Then("he deletes the project")
	public void he_deletes_the_project() throws InterruptedException {
		detailsProjectObject = new DetailsProjectPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		detailsProjectObject.deleteProject();
		detailsProjectObject.confirmDeleteProject();
		/*
		 * Alert alert = driver.switchTo().alert(); String alertText = alert.getText();
		 * Assert.assertTrue(detailsProjectObject.handleAlert(alertText)
		 * ,"Project delete.");
		 */
		Assert.assertTrue(detailsProjectObject.alertDelete.isDisplayed());

	}

}
