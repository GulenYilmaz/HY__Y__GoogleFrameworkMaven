package com.hrms.pages;



	import java.util.ArrayList;
	import java.util.LinkedHashMap;
	import java.util.List;
	import java.util.Map;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.hrms.testbase.BaseClass;

	public class ViewEmployeePageElements {

		@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[3]")
		public WebElement awesome;
		
		
		@FindBy(xpath="(//a[text()='Qualifications'])[2]")
		public WebElement qualification;
		
		@FindBy(id="addLanguage")
		public WebElement languageADD;
		
		@FindBy(xpath="//select[@id='language_code']")
		public WebElement selectLanguage;
		
		@FindBy(xpath="//input[@id='btnLanguageSave']")
		public WebElement saveSelect;
		
		
		@FindBy(xpath="//select[@id='language_lang_type']")
		public WebElement selectFluency;
		
		@FindBy(xpath="//select[@id='language_competency']")
		public WebElement selectCompetency;
		
		@FindBy(xpath="//table[@id='lang_data_table']/tbody/tr")
		public  List<WebElement> LanguagesTable;
		
		@FindBy(xpath="//table[@id='lang_data_table']/tbody/tr[3]/td[2]")
		public  WebElement LanguagesTurkcee;
		
		@FindBy(xpath="//table[@id='recordsListTable']/tbody/tr/td/a")
		public List<WebElement> languageList;
		
		
		
		
		
		
		
		@FindBy(id = "empsearch_employee_name_empName")
		public WebElement empName;

		@FindBy(id = "empsearch_id")
		public WebElement empID;

		@FindBy(id = "searchBtn")
		public WebElement searchBtn;
		
		@FindBy(xpath = "//table[@id = 'resultTable']")
		public WebElement employeesTable;
		
		@FindBy(xpath = "//table[@id = 'resultTable']//tbody/tr/td[3]")
		public List<WebElement> tableFirstName;
		/**
		 * this method will check if employees table is diplayed
		 * @return
		 */
		public boolean isTableDisplayed() {
			return employeesTable.isDisplayed();
		}
		
		public List<Map<String, String>> getFirstNameFromTable() {
			List<Map<String, String>> uiName = new ArrayList<>();
			for (WebElement row : tableFirstName) {
				Map<String, String> storeUiNames = new LinkedHashMap<>();
				String tableName = row.getText();
				storeUiNames.put("emp_firstname", tableName);
				uiName.add(storeUiNames);
			}
			return uiName;
		}

		public ViewEmployeePageElements() {
			PageFactory.initElements(BaseClass.driver, this);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	