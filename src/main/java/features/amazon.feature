Feature: search functionality
  Scenario: validate search functionality
    Given user launches the browser
    When user opens  url "https://www.amazon.in/"
    Then search field should be displayed
    When user enters "Yoga met" in search and click on search button
    Then the page title should be "Amazon.in : Yoga mat"
    And close the browser
