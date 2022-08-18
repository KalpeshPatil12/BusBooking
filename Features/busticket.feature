Feature: Online ticket booking feature

Scenario: Online ticket booking Scenario

Given user enter url "https://www.busonlineticket.com/booking/bus-tickets.aspx"
Then user verify the home page title
Then user verify origin text field is displayed
When user enter origin point in text field
Then user verify destination text field is displayed
When user enter destination point in text field
Then user verify Depart Date text field is displayed
When user select the next month date
Then user verfy search button is displayed
When user click on search bus
Then user verify cheapest button is displayed
When user select cheapest option
Then user verify select option is visible
When user click on select option
Then user verify seat is available or not
When user select one seat
Then user verify proceed button is displayed
When user click on proceed button
Then user verify full name text field displayed
When user enter full name as "Kalpesh Patil"
Then user verify mobile number text field is displayed
When user enter mobile number as "8530515733"
Then user verify email text field is displayed
When user enter email as "kalpesh@gmail.com"
When user click on next button
When user select credit cart for payment
When user select creditcard paymenet field
Then user verify proceed to payment button is displayed
When user click on proceed to payment
Then user verify pan number text field is displayed
When user enter the pan number as "12345678"
Then user verify continue button is displayed
When user click continue payment


