package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewProjectPage extends PageBase{


	public AddNewProjectPage(WebDriver driver) {
		super(driver);

	}

	//Definition

	@FindBy(id = "ModalAddTitle")
	public WebElement addProjectTxt;

	@FindBy( xpath = "//*[@id=\"template\"]/div/div/div[3]/input")
	WebElement templateComboBox ;

	@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[1]/div/div[1]/div[3]/div/div/ng-select/div/div/div[2]")
	WebElement systemComboBox ; 

	@FindBy(xpath = "//*[@id=\"entities\"]/div/div/div[2]/input")
	WebElement entitiesComboBox;

	@FindBy(id = "name")
	public WebElement projectNameTxt ;
	
	@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[1]/div/div[2]/div[1]/div/label[2]")
	public WebElement successNotification;

	@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[1]/div/div[2]/div[2]/div/span")
	WebElement advancementScroll;

	@FindBy(id = "effective")
	WebElement effictiveDate;

	@FindBy(className = "dtp-picker")
	public WebDriver calendrierEffictiveDate;


	@FindBy(xpath = "//*[@class=\"dtp-btn-ok btn btn-flat\"]")
	WebElement okEffectiveDateBtn;

	@ FindBy(xpath = "//*[@id=\"dtp_Mn1EC\"]/div/div[2]/button[3]")
	WebElement cancelEffectiveDateBtn;

	@FindBy(id = "end")
	WebElement endDate;

	@FindBy(xpath = "//*[@id=\"dtp_JXBgt\"]/div/div[2]/button[4]")
	WebElement okEndDateBtn;

	@FindBy(xpath = "//*[@id=\"dtp_JXBgt\"]/div/div[2]/button[3]")
	WebElement cancelEndDateBtn;

	@FindBy(xpath = "//*[@id=\"owner\"]/div/div/div[3]/input")
	WebElement projectManagerComboBox;

	@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[1]/div/div[3]/div[3]/div/div/ng-select/div/div/div[3]/input")
	WebElement statusComboBox;

	@FindBy(xpath = "/html/body/p")
	public WebElement DefinitionTxt;

	@FindBy(xpath = "/html/body/p")
	public WebElement purposeTxt;

	@FindBy(xpath = "/html/body/p")
	WebElement requirementTxt;

	@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[1]/div/div[11]/button")
	WebElement nextBtn;




	// Data Governance 

	@FindBy(xpath = "//*[@id=\"nameLineage\"]/div/div/div[2]/input")
	WebElement dataLineageComboBox;

	@FindBy(id = "projectName")
	WebElement dataOwnerTxt ;

	@FindBy(id = "lineageBusiness")
	WebElement businessCaseTxt;

	@FindBy(xpath = "//*[@id=\"lineage_animation\"]/div/div[1]/form/div/div[4]/div/button")
	WebElement addDataLineageBtn;

	@FindBy(xpath = "//*[@id=\"table_lineage_filter\"]/label/input")
	WebElement searchLineageTxt;

	@FindBy(xpath = "//*[@id=\"table_lineage\"]/tbody/tr/td[4]/div/button[1]")
	WebElement updateDataLineageBtn;

	@FindBy(xpath = "//*[@id=\"nameLineageEdit\"]/div/div/div[3]/input")
	WebElement editDataLineageOption;

	@FindBy(id = "lineageOwnerEdit")
	WebElement editDataOwnerTxt;

	@FindBy(id = "lineageBusinessEdit")
	WebElement editBunisessCaseTxt;

	@FindBy(xpath = "//*[@id=\"lineageModal\"]/div/div/div[2]/form/div[3]/button[2]")
	WebElement saveEditDataLineageBtn;

	@FindBy(xpath = "//*[@id=\"lineageModal\"]/div/div/div[2]/form/div[3]/button[1]")
	WebElement closeEditDataLineageBtn;

	@FindBy(xpath = "//*[@id=\"table_lineage\"]/tbody/tr/td[4]/div/button[2]")
	WebElement deleteDataLineageBtn;

	@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[2]/div/div/div[2]/button[2]")
	WebElement nextDataGovernanceBtn ;

	@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[2]/div/div/div[2]/button[1]")
	WebElement previousDataGovernanceBtn;

	//Data Model



	@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[3]/div/div/div[2]/button[2]")
	WebElement nextDataModelBtn;

	//Suppliers

	@FindBy(xpath = "//ng-select[@ng-reflect-placeholder=\"Select Suppliers\"]//input")
	WebElement selectSupplierComboBox;

	@FindBy(id = "table_supplier_filter")
	WebElement searchSupplierTxt;

	@FindBy(xpath = " //*[@ng-reflect-step-title=\"Suppliers\"]//div//button[contains(text(), 'Next')]")
	public WebElement nextSupplierBtn;

	@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[3]/div/div[3]/button[1]")
	WebElement previousSupplierBtn;



	//Participant 

	@FindBy(xpath = "//ng-select[@ng-reflect-placeholder=\"Select Participants\"]//input")
	WebElement selectParticipantComboBox;

	@FindBy(xpath = "//*[@id=\"table_participant_filter\"]/label/input")
	WebElement searchParticipantsTxt;

	@FindBy(xpath = "//*[@ng-reflect-step-title=\"Participants\"]//div//button[contains(text(), 'Next')]")
	WebElement nextParticipantBtn;

	@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[4]/div[3]/button[1]")
	WebElement previousParticipantBtn;

	//Consumers

	@FindBy(xpath = "//ng-select[@ng-reflect-placeholder=\"Select Consumers\"]//input")
	WebElement selectConsumersComboBox;
	@FindBy(xpath = "//*[@id=\"table_consumer_filter\"]/label/input")
	WebElement searchConsumersTxt;
	@FindBy(xpath = "//*[@ng-reflect-step-title=\"Consumers\"]//div//button[contains(text(), 'Finish')]")
	WebElement finishBtn ;
	@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[5]/div[3]/button[1]")
	WebElement previousConsumersBtn;
	
	//Template
		@FindBy(css = "i.fas.fa-plus")
		WebElement addTemplateBtn;

		@FindBy(xpath = "//*[@id=\"projectTemplate\"]/div/div/div[1]/h5")
		public WebElement openTemplateSucess;

		@FindBy(id = "templateName")
		WebElement templateNameTxt;

		@FindBy(xpath = "//*[@id=\"tool-bar col-xs-12 col-sm-12 col-md-12 col-lg-12\"]/div/label[2]/text()")
		public WebElement sucessTemplateName;

		@FindBy(xpath = "//*[@id=\"projectTemplate\"]/div/div/div[3]/div[2]/button[1]")
		WebElement confirmTemplateBtn;

		@FindBy(xpath = "//*[@id=\"projectTemplate\"]/div/div/div[3]/div[2]/button[2]")
		WebElement cancelTemplateBtn;

		@FindBy(xpath = "//*[@id=\"ModalAddProject\"]/div/div/div[2]/form/aw-wizard/div/aw-wizard-step[1]/div/div[1]/div[2]/button[2]")
		WebElement updateTemplateBtn;

		@FindBy(xpath = "//*[@id=\"projectTemplate\"]/div/div/div[3]/div[2]/button[1]")
		WebElement deleteTemplateBtn;

		@FindBy(xpath = "//*[@id=\"projectTemplate\"]/div/div/div[3]/div[2]/button[2]")
		WebElement cancelUpdateTemplate;

	//*******************************************************************************************************************************


	//Definition

	public void checkTxtAddProject() {
		clickButton(addProjectTxt);
	}

	public void selectTemplate() {
		clickButton(templateComboBox);
	}
	public void selectSystem() {
		clickButton(systemComboBox);
	}
	public void selectEntities() {
		clickButton(entitiesComboBox);
	}
	public void createProject(String projectName) {
		setTxtElementTxt(projectNameTxt, projectName);
	}
	public void advancementBtn() {

	}
	public void effectiveDateDefinition() {
		clickButton(effictiveDate);
	}
	public void chooseEffectiveDate(String jour) {

		clickButton(driver.findElement(By.xpath("//*[@data-date='\"+jour+\"']")));
	}

	public void okEffictiveDate() {
		clickButton(okEffectiveDateBtn);
	}
	public void cancelEffictiveDate() {
		clickButton(cancelEffectiveDateBtn);
	}
	public void endDateDefinition() {
		clickButton(endDate);
	}
	public void okEndDate() {
		clickButton(okEndDateBtn);
	}
	public void cancelEndDate() {
		clickButton(cancelEndDateBtn);
	}
	public void selectProjectManger() {
		clickButton(projectManagerComboBox);
	}
	public void selectStatus() {
		clickButton(statusComboBox);
	}
	public void definition(String definition) {
		setTxtElementTxt(DefinitionTxt, definition);
	}
	public void purpose(String purpose) {
		setTxtElementTxt(purposeTxt, purpose);
	}
	public void requirement(String requirement) {
		setTxtElementTxt(requirementTxt, requirement);
	}
	public void nextDefinition() {
		clickButton(nextBtn);	
	}

	//template
	public void addTemplate() {
		clickButton(addTemplateBtn);
	}
	public void templateName(String templateName) {
		setTxtElementTxt(templateNameTxt, templateName);
	}
	public void confirmTemplate() {
		clickButton(confirmTemplateBtn);
	}
	public void cancelTemplate() {
		clickButton(cancelTemplateBtn);
	}
	public void updateTemplate() {
		clickButton(updateTemplateBtn);
	}
	public void deleteTemplate() {
		clickButton(deleteTemplateBtn);
	}
	public void cancelUpdateTemplate() {
		clickButton(cancelUpdateTemplate);
	}

	//Data Governance 

	public void selectDataLineage() {
		clickButton(dataLineageComboBox);
	}

	public void dataOwner(String dataOwner) {
		setTxtElementTxt(dataOwnerTxt, dataOwner);
	}
	public void businessCase(String businessCase) {
		setTxtElementTxt(businessCaseTxt, businessCase);	
	}
	public void addDataLineage() {
		clickButton(addDataLineageBtn);
	}
	public void searchDataLineage(String dataLineage) {
		setTxtElementTxt(searchLineageTxt, dataLineage);
	}
	public void updateDataLineage() {
		clickButton(updateDataLineageBtn);
	}
	public void editDataLineage() {

	}
	public void editDataOwner(String editDataOwner ) {
		setTxtElementTxt(editDataOwnerTxt, editDataOwner);
	}
	public void editBusinessCase(String editBusinessCase) {
		setTxtElementTxt(editBunisessCaseTxt, editBusinessCase);
	}
	public void saveEditDataLineage() {
		clickButton(saveEditDataLineageBtn);
	}
	public void closeEditDataLineage() {
		clickButton(closeEditDataLineageBtn);
	}
	public void deleteDataLineage() {
		clickButton(deleteDataLineageBtn);
	}
	public void nextDataGovernance() {
		clickButton(nextDataGovernanceBtn);
	}
	public void previousDataGovernanceBtn() {
		clickButton(previousDataGovernanceBtn);
	}

	//Data Model

	public void nextDataModel() {
		clickButton(nextDataModelBtn);
	}

	//Suppliers

	public void selectSuppliers() {
		clickButton(selectSupplierComboBox);
	}
	public void searchSuppliers(String searchSupplier) {
		setTxtElementTxt(searchSupplierTxt, searchSupplier);
	}
	public void nextSupplier() {
		clickButton(nextSupplierBtn);
	}

	public void previousSupplier() {
		clickButton(previousSupplierBtn);
	}


	//Participants

	public void selectParticipants() {
		clickButton(selectParticipantComboBox);
	}
	public void searchParticipant(String searchParticipant) {
		setTxtElementTxt(searchParticipantsTxt, searchParticipant);
	}
	public void nextParticipant() {
		clickButton(nextParticipantBtn);
	}
	public void previousParticipant() {
		clickButton(previousParticipantBtn);
	}

	//Consumers

	public void selectConsumers() {
clickButton(selectConsumersComboBox);
	}
	public void searchConsumers(String searchConsumer) {
		setTxtElementTxt(searchConsumersTxt, searchConsumer);
	}
	public void finishCreateProject() {
		clickButton(finishBtn);
	}
	public void previousConsumers() {
		clickButton(previousConsumersBtn);
	}


}
