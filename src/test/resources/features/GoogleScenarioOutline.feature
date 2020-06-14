#Author: gulen@google.com
Feature: Google

  @google
  Scenario: Google Search
    When I enter in Google Search box "Paris"
    And I click search button
    Then I see Paris - Wikipedia at first outcome
  
  # for each info, open browser and navigate and search the info
  @googleInfo  
    Scenario Outline: Google  Multiple Search
    When I enter in Google Search box "<info>"
    And I click search button
    Then I see "<info>" - Wikipedia at first outcome

    Examples: 
      | info     |
      | Istanbul |
      | Tokyo    |
      | NewYork  |

      