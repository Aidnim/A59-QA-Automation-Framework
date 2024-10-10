Feature: Change username

  Scenario: Positive change username Scenario
    Given I am logged into to Koel music application
    When I click on the user icon
    And click on the current password field
    And Enter the current password in the current password field
    And click on the name field
    And clear the name field
    And type in new username "India" into empty name field
    And click the save button
    And a successful profile updated message should be seen
    Then I should had successfully changed the user name
