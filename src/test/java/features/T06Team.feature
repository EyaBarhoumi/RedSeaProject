Feature: Test the Team feature

  @SanityTest01
  Scenario: To Add a new Team
    Given User go to Team page
    And click on add new Team
    When User type Team new information
    And click on submit button Team to confirm
    Then User should navigate to Team dashboard


  Scenario: To update Team
    Given User select Team to update
    When User update Team information
    Then User click on save Team update button


  Scenario: To delete Team
    Given User select Team to delete
    When User click the delete Team button
    Then User should navigate to Team dashboard