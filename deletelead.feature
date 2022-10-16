Feature: Delete Lead feature
Background: 
Given Launch the chrome browser
And Load the URL and maximize

Scenario Outline: Delete Lead positive flow
When Enter the USername as <username>
And Enter the Password as <password>
And Click on Login
Then Click on CRMSFA
And Click on Leads
And Click on Find Lead
And Click on phone
When Enter the phonenumber as <phonenum>
Then Click on findlead button
Given Click on innercellicon
Then Click on deletelink
And Click on Find Leads link
When Enter the leadid 
Then Click on deletefindlead button 
Then verify the record deletion
Then Close the browser

Examples:
|username|password|phonenum|
|'DemoSalesManager'|'crmsfa'|'9'|