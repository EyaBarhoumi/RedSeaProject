Feature: Test the logout feature

  Scenario: To logout from account
    Given User should be  logged in
    When User  logout
    Then User should be logged out