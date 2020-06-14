Feature: Google Cucumber DataTable
  @googleAnimal
  Scenario: User able to search multiple items
    When User enters multiple items and clicks google search button
      | info  |
      | Lion  |
      | Dog   |
      | Cat   |
      | Horse |
    
    