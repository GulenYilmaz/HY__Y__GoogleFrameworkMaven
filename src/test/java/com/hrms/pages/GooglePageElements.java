package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class GooglePageElements extends CommonMethods {

	
	@FindBy(xpath="//input[@class='gLFyf gsfi']")
    public WebElement searchBox;
	
	
	@FindBy(xpath="//input[@class='gNO89b']")
	public WebElement searchClick;
	
	public GooglePageElements () {
		
		PageFactory.initElements(driver, this);
		
		
		
		
	}
}
