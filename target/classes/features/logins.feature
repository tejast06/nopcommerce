Feature: login 
Scenario: successfull login with valid credentials
  Given user launch the browser
  When users open url "https://admin-demo.nopcommerce.com/login"
  And user enters email as "admin@yourstore.com" and password as "admin"
  And click on login
  Then page title should be "Dashboard / nopCommerce administration"
  And click on logout