$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Customers.feature");
formatter.feature({
  "line": 1,
  "name": "Customer",
  "description": "",
  "id": "customer",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1838452400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are common steps for every scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 109616000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 1945942600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 59
    }
  ],
  "location": "Steps.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 267888700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_login()"
});
formatter.result({
  "duration": 3887092600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 8363400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Add A new Customer",
  "description": "",
  "id": "customer;add-a-new-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click on customer menu items",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "use can view add new customer page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enter customer info",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "click Save button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user can see confirmation message \"The new customer has been added successfully\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_customers_menu()"
});
formatter.result({
  "duration": 2112731300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_customer_menu_items()"
});
formatter.result({
  "duration": 3285583200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Add_new_button()"
});
formatter.result({
  "duration": 1204671400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.use_can_view_add_new_customer_page()"
});
formatter.result({
  "duration": 19153500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enter_customer_info()"
});
formatter.result({
  "duration": 5111792000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_Save_button()"
});
formatter.result({
  "duration": 3437326400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully",
      "offset": 35
    }
  ],
  "location": "Steps.user_can_see_confirmation_message(String)"
});
formatter.result({
  "duration": 221303400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 208151000,
  "status": "passed"
});
formatter.before({
  "duration": 1162828000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are common steps for every scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 180900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 1076615300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 59
    }
  ],
  "location": "Steps.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 285652800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_login()"
});
formatter.result({
  "duration": 4747464800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 4424900,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Search customer by EmailId",
  "description": "",
  "id": "customer;search-customer-by-emailid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "click on customer menu items",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Enter customer Email",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on search button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User should found email in the Search table",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_customers_menu()"
});
formatter.result({
  "duration": 2085236700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_customer_menu_items()"
});
formatter.result({
  "duration": 3330720800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_customer_Email()"
});
formatter.result({
  "duration": 191471100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "duration": 2073175900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_found_email_in_the_Search_table()"
});
formatter.result({
  "duration": 101288600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 165548600,
  "status": "passed"
});
formatter.before({
  "duration": 1208526900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Below are common steps for every scenario",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 179500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 1982901600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 59
    }
  ],
  "location": "Steps.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 268589200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_login()"
});
formatter.result({
  "duration": 4642919000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 3303300,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Search customer by Name",
  "description": "",
  "id": "customer;search-customer-by-name",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user click on customers menu",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "click on customer menu items",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Enter Customer FirstName",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Enter Customer LastName",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Click on search button",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User should found Name in the Search table",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_click_on_customers_menu()"
});
formatter.result({
  "duration": 2158901200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_customer_menu_items()"
});
formatter.result({
  "duration": 3344835900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_Customer_FirstName()"
});
formatter.result({
  "duration": 166233600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_Customer_LastName()"
});
formatter.result({
  "duration": 146189400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "duration": 2060911900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_found_Name_in_the_Search_table()"
});
formatter.result({
  "duration": 86059300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "duration": 161459200,
  "status": "passed"
});
});