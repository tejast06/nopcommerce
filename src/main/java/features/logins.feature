Feature: login 
Scenario: successfull login with valid credentials
  Given user launch the browser
  When users open url "https://admin-demo.nopcommerce.com/login"
  And user enters email as "admin@yourstore.com" and password as "admin"
  And click on login
  Then page title should be "Dashboard / nopCommerce administration"
  And click on logout


  Scenario Outline: login with data driven
    Given user launch the browser
    When users open url "https://admin-demo.nopcommerce.com/login"
    And user enters email as "<email>" and password as "<password>"
    And click on login
    Then page title should be "Dashboard / nopCommerce administration"
    And click on logout
    Examples:
      |email  |password|
      |admin@yourstore.com |admin|
      |admin@yourstore.com |admin123|




