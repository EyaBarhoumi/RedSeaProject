Feature: Test the login feature

  @SanityTest01 @workforce @multiple
  Scenario: To login with  email and pw
    Given User open the website and go to login page
    When User fill email as "eya.barhoumi@esprit.tn" and pw as "Eya@2307"
    And click on login button
    Then User should navigate to home page