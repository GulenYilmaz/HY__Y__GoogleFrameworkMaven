
Feature: Name validations against DB 

 # from addemployee.feature
 # Background: 
 #   Given user is logged with valid admin credentials
 #   And user navigates to AddEmployeePage

#from login old feature
#previously written test
#  Scenario: valid admin login
#    When user enter valid admin username and password
#    And user click on login button
#    Then admin user is successfully logged in

#from search emloyee feature
#And user navigate to employee list page

Scenario: First Name validation against DB 
	Given user is logged with valid admin credentials
	And user navigate to employee list page
	When user enters valid employee id "14589" 
	                                    #-->method parameter
  
  
  And click on search button
  Then verify table is displayed 
  And get first name from table 
  When get first name from db 
  Then validate first name from ui against db
  
