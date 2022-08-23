Feature: SignUp feature

Scenario: SignUp Scenario

Given user enter the url "https://www.busonlineticket.com/booking/bus-tickets.aspx"
Then user verify signup link is displayed
When user click on signup link
When user clik on signup option
Then user verify contry code text field is displayed
When user enter the country code "India"
And user select India country code
Then user verfy phone number text field is displayed
When user enter the phone number "1234567891"
Then user verify phone number button is displayed
When user click on phone number button
When user enter the otp
Then user verify the verify OTP button displayed
When user click on verify OTP button
When user click on Ok button

