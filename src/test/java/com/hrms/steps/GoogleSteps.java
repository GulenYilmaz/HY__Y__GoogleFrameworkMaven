package com.hrms.steps;



import com.hrms.pages.GooglePageElements;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.*;

public class GoogleSteps {

	@When("I enter in Google Search box {string}")
	public void i_enter_in_Google_Search_box(String info) {
	    CommonMethods.sendText(GooglePageElements.google.searchBox, info);
	}


	@When("I click search button")
	public void i_click_search_button() {
	   CommonMethods.jsClick(GooglePageElements.google.searchClick);
	}

	@Then("I see Paris - Wikipedia at first outcome")
	public void i_see_Paris_Wikipedia_at_first_outcome() {
	   
		CommonMethods.takeScreenshot("Paris");
		
	}

	@Then("I see {string} - Wikipedia at first outcome")
	public void i_see_Wikipedia_at_first_outcome(String string) {
	    CommonMethods.takeScreenshot(string);
	}

	
}
