
# Author
#******for simple

Feature: feature to test login functionality

  Scenario: Cheack login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to home page

    
    # ******if we use parameterization then useScenario Outline
    #@smoketest
     #Scenario Outline: Cheack login is successful with valid credentials
    #Given user is on login page
    #When user enters <username> and <password>
    #And click on login button
    #Then user is navigated to home page
    #
    #Examples:
    #|username|password|
    #|user1|pass1|
    #|user2|pass2|
    
    