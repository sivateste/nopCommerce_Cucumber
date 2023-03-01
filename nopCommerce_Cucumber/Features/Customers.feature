Feature: Customer

Background: Below are common steps for every scenario
Given user launch chrome browser
When  user opens URL "https://admin-demo.nopcommerce.com/login" 
And  user enter email as "admin@yourstore.com" and password as "admin"
And click login
Then user can view Dashboard

@tag
Scenario: Add A new Customer
When user click on customers menu
And click on customer menu items
And click on Add new button
Then use can view add new customer page
When user enter customer info
And click Save button
Then user can see confirmation message "The new customer has been added successfully"
And close browser

@tag1
Scenario: Search customer by EmailId
When user click on customers menu
And click on customer menu items
And Enter customer Email
When Click on search button
Then User should found email in the Search table
And close browser 

@tag1
Scenario: Search customer by Name
When user click on customers menu
And click on customer menu items
And Enter Customer FirstName
And Enter Customer LastName
When Click on search button
Then User should found Name in the Search table
And close browser 