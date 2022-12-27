Feature: Add customer page

#Scenario: Add new customers
#
#Given user1 Lanch chrome browser
#When user1 opens URL "https://admin-demo.nopcommerce.com/login"
#When user1 enters Email as "admin@yourstore.com" and password as "admin"
#When Click on login1
#Then Homepage1 title should be "Dashboard / nopCommerce administration"
#Then user click on customer button
#Then click on customer sub menu button
#Then Click on add new customer
#Then fill all mondatary details
#Then click on save button
#Then Clocse the browser


Scenario Outline: Add new customers

Given user1 Lanch chrome browser
When user1 opens URL "https://admin-demo.nopcommerce.com/login"
When user1 enters Email as "<username>" and password as "<password>"
When Click on login1
Then Homepage1 title should be "Dashboard / nopCommerce administration"
Then user click on customer button
Then click on customer sub menu button
Then Click on add new customer
Then fill all mondatary details
Then click on save button
Then Clocse the browser

Examples:

| username            | password |
| safasfin@yotor.com  | addfmin  |
| admin@yourstore.com | admin123 |
| admin@yourstore.com | admin    |
