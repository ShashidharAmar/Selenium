Feature: Base Login

#@Login
Scenario: login to the application

Given user4 Lanch chrome browser
When user4 opens URL "https://admin-demo.nopcommerce.com/login"
When user4 enters Email as "admin@yourstore.com" and password as "admin"
When Click on login4
Then Homepage4 title should be "Dashboard / nopCommerce administration"
Then click on customer button
Then click on customer sub menu button4
Then Click on add new customer4
Then fill all mondatary detail
Then click on save button4
Then Clocse the browser4
