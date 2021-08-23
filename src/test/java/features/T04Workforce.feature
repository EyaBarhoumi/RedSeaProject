Feature: Test the Workforce feature

  @SanityTest01
  Scenario: To Add a new workforce
    Given User go to workforce page
    And click on add new workforce
    When User type workforce new information
    And click on submit button to confirm
    Then User should navigate to workforce dashboard

  @SanityTest01
  Scenario: To update workforce
    Given User select workforce to update
    When User update workforce information
    Then User click on save workforce update button

  @SanityTest01
  Scenario: To delete workforce
    Given User select workforce to delete
    When User click the delete workforce button
    Then User should navigate to workforce dashboard

  @SanityTest01
  Scenario: To import workforce
    Given User go to workforce menu
    When User click on import workforce list
    Then User add the workforce list
  @SanityTest01
  Scenario: To export the list of workforce
    Given User go to workforce page
    When User click on export workforce button
    Then User should navigate to workforce dashboard

