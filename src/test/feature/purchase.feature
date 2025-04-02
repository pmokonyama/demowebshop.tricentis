Feature:Testing login in functionality

  Scenario: Successful details
    Given the user is on login page
    When the user enters correct details email "mbale@gmail.com" and password "Testing"
    #above information is for Testing purposes only- its made up information
    And the user clicks the login button
    Then the user is in Homepage

    When the user clicks on Computers
    When the user selects Desktop
    And user adds item to cart
