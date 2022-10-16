Feature: Edit Lead feature
Background: 
Given Launch the chrome browser
And Load the URL and maximize

Scenario Outline: Edit Lead positive flow
When Enter the USername as <username>
And Enter the Password as <password>
And Click on Login
Then Click on CRMSFA
And Click on Leads
And Click on Find Lead
And Click on phone
When Enter the phonenumber as <phonenum>
Then Click on findlead button and innericon
Then click on Edit link
When Enter the editcompanyname as <company>
Then click on editleadsubmitbutton 
Then Close the browser

Examples:
|username|password|phonenum|company|
|'DemoSalesManager'|'crmsfa'|'9'|'TCS'|