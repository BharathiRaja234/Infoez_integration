Feature: To validate that admin can change the role of customer

Scenario Outline: To verify that user can login as customer
Given user has clicked the signin button
Then user clicks the create account button
And user log in as customer with email and password and name
|bharathi|
|bharathi123@gmail.com|
|Bharu@123|      
Then user clicks the button           
And user verifies his role as customer and logs out 
And user clicked the header sigin 
Then user switches his role to admin 
|admin@infoez.com|
|Admin@123|
And user clicks profile menu and navigate to admin 
Then user clicks user
And user changes the role of customer to business 
Then user verifies that role is changed 
And user switches as customer
|bharathi123@gmail.com|
|Bharu@123|
Then validate that role is changed 
