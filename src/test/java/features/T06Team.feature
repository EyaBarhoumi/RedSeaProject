Feature: Test the Team feature


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



  Scenario: user click on submit button without entering data
    Given User go to add new Team
    When User click directly on submit Team button
    Then Error messages should be displayed Team
    And User quit the add page Team