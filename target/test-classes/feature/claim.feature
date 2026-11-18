
Feature: Claim integration across Customer and Admin panels

   @cus
  Scenario Outline: Customer raises a claim, owner and admin approve it and customer sees final status
    Given user is clicking the sigin button
    And user logs in to the customer panel with "<email>" and "<password>"
    And user clicks the Explore button on header section
    And user clicks first business in the page and respective page should be open
    And user clicks claim button it displays claim ownership form
    When customer raises a claim with "<reason>" message
    Then claim is submitted successfully and claim id is captured 
    And user clicks logout
    Examples:
      |email|password|reason|
      |customer@infoez.com|Customer@123|poor service|

    
    
    Scenario Outline: To approve the claim by admin

    Given user logged in as admin 
    And the admin opens the account menu to reach the admin panel
    And clicks the claim module in the sidebar menu
    And user approves the claim in the admin panel 
    Then claim approval success message is displayed in the admin panel
    

    Examples:
      |email|password|reason|
      |customer@infoez.com|Customer@123|poor service|
      
      
      Scenario Outline: To validate the claim status
      Given user login as customer with "<email>" and "<passowrd>"
      And user selects notifications from menu bar 
      Then claim status should be changed and displayed 
      
      Examples:
      |email|password|
      |customer@infoez.com|Customer@123|
      

