package stepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import basesTest.TestBase;
import io.cucumber.java.en.When;
import pages.AddNewProjectPage;
import pages.HomePage;

public class CreateNewProject extends TestBase{

	HomePage homeObject;
	AddNewProjectPage newProjectObject;
	String valeur_project_name;
	String valeur_definition ;
	public static WebDriverWait wait;



	@When("he adds a new project {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
	public void he_adds_a_new_project(String templateName, String projectName, String optionTemplate, String optionSystem, String optionEntities, String optionProjectManager, String optionStatus, String definition, String purpose, String requirement, String effectiveJour, String endJour, String optionDataLineage, String businessCase, String optionSuppliers, String optionParticipants, String optionConsumers) throws InterruptedException {


		homeObject = new HomePage(driver);
		newProjectObject = new AddNewProjectPage(driver); 
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homeObject.newProjectBtn(); 
		Thread.sleep(6000);
		Assert.assertTrue(newProjectObject.projectNameTxt.isDisplayed());

		newProjectObject.selectSystem();
		driver.findElement(By.xpath("//*[@ng-reflect-ng-item-label='"+optionSystem+"']")).click();
		newProjectObject.selectEntities();
		driver.findElement(By.xpath("//*[@ng-reflect-ng-item-label='"+optionEntities+"']")).click();


		newProjectObject.createProject(projectName);
		valeur_project_name = newProjectObject.projectNameTxt.getAttribute(projectName);
		Assert.assertNotEquals(valeur_project_name, "", "Le project name texte est requis et doit être rempli.");

		newProjectObject.effectiveDateDefinition();
		driver.findElement(By.xpath("//*[@data-date='"+effectiveJour+"']")).click();
		newProjectObject.okEffictiveDate();

		newProjectObject.selectProjectManger();
		driver.findElement(By.xpath("//*[@ng-reflect-ng-item-label='"+optionProjectManager+"']")).click();
		newProjectObject.selectStatus();
		driver.findElement(By.xpath("//*[@ng-reflect-ng-item-label='"+optionStatus+"']")).click();

		driver.switchTo().frame(1);
		newProjectObject.definition(definition);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		newProjectObject.purpose(purpose);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		newProjectObject.requirement(requirement);
		driver.switchTo().defaultContent();

		System.out.println("the project Name :" + newProjectObject.successNotification.getText());
		Assert.assertTrue(newProjectObject.successNotification.getText().contains("is available"));
		newProjectObject.nextDefinition();

		//WebElement desiredDate = datePicker.findElement(By.xpath("//td[@data-date='2023/12/02']"));
		/*
		 * WebElement datePicker = driver.findElement(By.className("dtp-picker"));
		 * String desiredDate = "2023/12/02"; String dateXPath =
		 * String.format("//td[@data-date='%s']", desiredDate);
		 * wait.until(ExpectedConditions.elementToBeClickable(datePicker.findElement(By.
		 * xpath(dateXPath)))); datePicker.findElement(By.xpath(dateXPath)).click();
		 */
		//desiredDateElement.click();
		/*
		 * System.out.println("Date Picker found");
		 * System.out.println("Desired date found");
		 */
		//wait.until(ExpectedConditions.elementToBeClickable(desiredDate));
		//desiredDate.click();

		/*
		 * newProjectObject.endDateDefinition();
		 * driver.findElement(By.xpath("//*[@data-date='"+endJour+"']")).click();
		 * newProjectObject.okEndDate();
		 */

		/*
		 * valeur_definition = newProjectObject.DefinitionTxt.getAttribute(definition);
		 * Assert.assertNotEquals(valeur_definition, "",
		 * "Le definition texte est requis et doit être rempli.");
		 */

		//Data Governance
		newProjectObject.selectDataLineage();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@ng-reflect-ng-item-label='"+optionDataLineage+"']")).click();
		newProjectObject.businessCase(businessCase);
		newProjectObject.addDataLineage();
		//Thread.sleep(3000);
		newProjectObject.nextDataGovernance();
		//Thread.sleep(3000);
		//DataModel
		newProjectObject.nextDataModel();
		// Suppliers
		newProjectObject.selectSuppliers();
		driver.findElement(By.xpath("//div[@role=\"option\"]/span[contains(text(),'"+optionSuppliers+"')]")).click();
		newProjectObject.checkTxtAddProject();
		//Thread.sleep(3000);
		newProjectObject.nextSupplier(); 
		//Thread.sleep(3000);
		//Participants 
		newProjectObject.selectParticipants();
		driver.findElement(By.xpath("//div[@role=\"option\"]/span[contains(text(),'"+optionParticipants+"')]")).click();
		newProjectObject.checkTxtAddProject();
		newProjectObject.nextParticipant();
		//Thread.sleep(5000);
		//Consumers
		newProjectObject.selectConsumers();
		driver.findElement(By.xpath("//div[@role=\"option\"]/span[contains(text(),'"+optionConsumers+"')]")).click();
		newProjectObject.checkTxtAddProject();
		newProjectObject.finishCreateProject();
		//Thread.sleep(4000);


		/*
		 * newProjectObject.addTemplate(); Thread.sleep(5000);
		 * Assert.assertTrue(newProjectObject.openTemplateSucess.isDisplayed());
		 * newProjectObject.cancelTemplate();
		 * Assert.assertTrue(newProjectObject.projectNameTxt.isDisplayed());
		 */

		/*
		 * newProjectObject.selectTemplate();
		 * driver.findElement(By.xpath("//*[@ng-reflect-ng-item-label='"+optionTemplate+
		 * "']")).click();
		 */ 

		/*
		 * newProjectObject.templateName(templateName); Thread.sleep(3000);
		 * newProjectObject.confirmTemplate(); Thread.sleep(6000);
		 */
		//Assert.assertTrue(newProjectObject.sucessTemplateName.getText().contains(templateName + " is available "));

	}



}
