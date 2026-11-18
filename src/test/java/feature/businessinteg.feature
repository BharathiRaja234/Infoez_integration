Feature: To validate the integration flow for add business

  Scenario Outline: Verify that business can be added
    Given user sigin as business with "<email>" and "<password>"
    And user clicks signin button
    And user clicks add business and business details should be displayed
    Then user enters "<business name>" and "<description>"
    And user had selected the "<category>" in category 
    When user had given "<price>" in price 
    Then user entered  the "<city>"
    And user has entered the "<address>"
    And user is  entered the "<phone>"
    Then entered the "<Email>" in email 
    Then user has given the "<website>"
    And user is giving the "<hours>"
    And user filled in  the "<services>"
    When user clicks the create business button and business is created 
    Then user shoulbe logged out 

    Examples:
      | email            | password  | business name | description | city    | address | phone     | Email             | category     | website  | hours | services | price |
      | owner@infoez.com | Owner@123 | bharu cafe    | good food   | chennai | navalur | 971509876 | bhar123@gmail.com | Beauty & Spa | cafe.com | 9-11  | food     | $$    |

    Scenario Outline: To verify that added business is displayed for customer
      Given user clicked the signin 
      And  user loggedin as admin with "<email>" and "<password>"
      And user clicks admin button on menu 
      When user clicks pending button 
      And user approves a pending business business shold be approved 
       Examples:
       |email|password|
       |admin@infoez.com|Admin@123|
       
       @cus
       Scenario Outline: To validate that added business is displayed to the customer 
        Given user signin as customer with "<email>" and "<password>" 
        And customer clicks the explore 
        Then customer verifies that approved business is displayed 
        
        Examples:
        |email|password|
        |customer@infoez.com|Customer@123|
 


