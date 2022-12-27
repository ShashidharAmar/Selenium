Feature: Login commerce page

#Scenario: Sccessful login with valid credantials
#
#Given user Lanch chrome browser
#When user opens URL "https://admin-demo.nopcommerce.com/login"
#When user enters Email as "admin@yourstore.com" and password as "admin"
#When Click on login
#Then Homepage title should be "Dashboard / nopCommerce administration"
#When user click on log out link 
#Then Loginpage should be "Your store. Login"
#And Close the browser


Scenario Outline: Sccessful login with valid credantials

Given user Lanch chrome browser
When user opens URL "https://admin-demo.nopcommerce.com/login"
When user enters Email as "<username>" and password as "<password>"
When Click on login
Then Homepage title should be "Dashboard / nopCommerce administration"
When user click on log out link 
Then Loginpage should be "Your store. Login"
And Close the browser

Examples:
| username | password |
| admin@yourstor.com | admin |
| admin@yourstore.com | admin123 |
| admin@yourstore.com | admin |



