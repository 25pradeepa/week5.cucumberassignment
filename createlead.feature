Feature: Create Lead feature
Background: 
Given Launch the chrome browser
And Load the URL and maximize

Scenario Outline: Create Lead positive flow
When Enter the USername as <username>
And Enter the Password as <password>
And Click on Login
Then Click on CRMSFA
And Click on Leads
And Click on Create Lead
When Enter the companyname as <compname>
When Enter the Firstname as <firstname>
And Enter the Lastname as <lastname>
Then Click on submit button
Then Close the browser

Examples:
|username|password|compname|firstname|lastname|
|'DemoSalesManager'|'crmsfa'|'HCL'|'TestLeaf'|'Deepa'|