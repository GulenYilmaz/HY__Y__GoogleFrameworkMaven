package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.pages.GooglePageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.java.en.When;

public class GoogleExcel {
	
	
	@When("User adds multiple famous people name data from {string} excel sheet and clicks search")
	public void user_adds_multiple_famous_people_name_data_from_excel_sheet_and_clicks_search(String sheetName) {
	   
		List<Map<String,String>> excelList=ExcelUtility.excelIntoListOfMaps(Constants.TESTDATA_FILEPATH, sheetName);
		
		for(Map<String,String>  list:excelList) {
			
			CommonMethods.sendText(GooglePageElements.google.searchBox,list.get("Name"));	
			
			CommonMethods.click(GooglePageElements.google.searchClick);
			CommonMethods.driver.navigate().back();
			CommonMethods.wait(2);
		}
		
		
		
		
	}

}
