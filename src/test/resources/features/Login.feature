Feature: Login feature

  Scenario: Positive Login Scenario
    Given User opens browser
    And User opens Koel Login Page
    When User enters email "india.messam@testpro.io"
    And  User enters password "Testing123"
    And User clicks submit
    Then User should be logged in