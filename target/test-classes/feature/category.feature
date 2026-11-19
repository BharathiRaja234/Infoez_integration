Feature: To  validate that new category can be added

Scenario: New category can be added by admin 

Given user has logged in as admin 
|admin@inofez.com|
|Admin@123|
And user clicks the profile menu and navigates to admin 
Then user clicks the categories on admin dashboard 
And user checks the count before adding a new category 
And user then enters category name and clicks the add button 
|five star chicken|
Then user checks the count after adding a category 
And admin logs out 
Then user switched as customer
|customer@infoez.com|
|Customer@123|
And user clicks explore on the header 
Then clicks the all categories dropdown 
And verifies that new category "five star chicken" is displayed 



