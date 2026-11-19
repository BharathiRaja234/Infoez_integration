Feature: To validate that admin can edit the verfification status of a businesss


Scenario: To validate that admin can edit the status of a business

Given user launches by clicking signin 
And user launched the application as admin
|admin@infoez.com|
|Admin@123|
Then user navigates to admin in the profile menu 
And clicks the business 
Then changes the verify status and clicks logout 
And user switches role as customer
|customer@infoez.com|
|Customer@123|
And user clicks explore and selects a business 
Then checks the card for verifiation status 