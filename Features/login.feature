Feature: Login feature

Scenario: Login Scenario
 
Given user enter the url "https://www.busonlineticket.com/booking/bus-tickets.aspx"
Then user verify login link is displayed
When user click on login link
Then user verify Email/UserID text field is displayed
When user enter the Email in text text field as "kalpesh@gmail.com"
Then user verify password text field is displayed
When user enter the password in the text field as "Kalpesh"
Then user verify the password show button is displayed
When user click on show password button
Then user verify the Login button is displayed
When user click on login button
Then user verify the forgot pass link
When user click on forgot password link
Then user verify reenter Email text field is displayed
When user reenter the Email as "Kalpesh@gmail.com"
Then user verify reenter password button is displayed
When user click on reenter password button
When user click on Ok option
Then user verify back to login button is displayed
When user click on back to login button
Then user verify login with google button is displayed
When user click on login with google button





