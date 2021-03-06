package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class AddEmployeePageElements extends CommonMethods {

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "lastName")
	public WebElement lastName;

	@FindBy(xpath = "//input[@id='middleName']")
	public WebElement middleName;

	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "chkLogin")
	public WebElement checkboxLoginDetails;

	@FindBy(id = "user_name")
	public WebElement username;

	@FindBy(id = "user_password")
	public WebElement password;

	@FindBy(id = "re_password")
	public WebElement confirmPassword;

	@FindBy(id = "btnSave")
	public WebElement saveBtn;

	public AddEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}

	public void createEmpLoginCR(String uid, String pwd) {
		sendText(username,uid);
		sendText(password,pwd);
		sendText(confirmPassword, pwd);
		click(saveBtn);
	}
	public static void main(String[] args) {
		
		
		int array []= {10,20,30,40,50};	
		int x=array.length;
		do {
			x--;
			System.out.println(x);
			System.out.println("---");
			System.out.println(array[x]);
		}while (x>=0);
		System.out.println(x+"--");
		
		
}
}