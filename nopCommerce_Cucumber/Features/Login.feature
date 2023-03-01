Feature: Login

Scenario: successful Login with valid Credentials
Given user launch chrome browser
When  user opens URL "https://admin-demo.nopcommerce.com/login" 
And  user enter email as "admin@yourstore.com" and password as "admin"
And click login
Then  page title should be "Dashboard / nopCommerce administration"
When user click on logout link
Then page title should be "Your store. Login"
And close browser

Scenario Outline: Add Datat Driven 
Given user launch chrome browser
When  user opens URL "https://admin-demo.nopcommerce.com/login" 
And  user enter email as "<username>" and password as "<password>"
And click login
Then  page title should be "Dashboard / nopCommerce administration"
When user click on logout link
Then page title should be "Your store. Login"
And close browser

Examples:
|username|password|
|admin@yourstore.com|xyz|
|admin2@yourstore.com|admi|