package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class GoogleCucumberDataTableSteps extends CommonMethods{
	
	
	
	@When("User enters multiple items and clicks google search button")
	public void user_enters_multiple_items_and_clicks_google_search_button(DataTable dataTable) {
		
		/*
		 * Feature: Google Cucumber DataTable

  @googleAnimal
  Scenario: User able to search multiple items
    When User enters multiple items and clicks google search button
      | Yunus Emre |
      | Lion       |
      | Dog        |
      | Cat        |
      | Horse      |
		 */
		//no header multiple data / value with List
		List <String> Kings= dataTable.asList();
		
		for (String king : Kings) {
			sendText(google.searchBox, king);
			jsClick(google.searchClick);
			takeScreenshot("kings");
			wait(1);
			driver.navigate().back();
			wait(1);
		}
		
		
		/*
		 * Feature: Google Cucumber DataTable
  @googleAnimal
  Scenario: User able to search multiple items
    When User enters multiple items and clicks google search button
      | info  |
      | Lion  |
      | Dog   |
      | Cat   |
      | Horse |
		 */
//	     header and multiple data/ value with List<Map<K,V>>
//		List<Map<String,String>> animals=dataTable.asMaps();
//		
//		for (Map<String, String> animal : animals) {
//			sendText(google.searchBox, animal.get("info"));---> we can get the key and find the value
//			jsClick(google.searchClick);
//			takeScreenshot("animal");
//			wait(1);
//			driver.navigate().back();
//			wait(1);
//		}
		
		
		
	}
}
