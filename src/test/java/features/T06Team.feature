Feature: Test the Team feature


  Scenario: user click on submit button without entering data
    Given User go to add new Team
    When User click directly on submit Team button
    Then Error messages should be displayed Team
    And User quit the add page Team


  Scenario: To Add a new Team
    Given User go to Team page
    And click on add new Team
    When User type Team new information
     # | name         | description      |
      | team created | team description |
    And click on submit button Team to confirm
    Then User should navigate to Team dashboard


  Scenario: To update Team
    Given User select Team to update
     # | name         |
      | team created |
    When User update Team information
    # | name         | description      |
      | team updated | team description  updated |
    Then User click on save Team update button


  Scenario: To delete Team
    Given User select Team to delete
    # | name         |
      | team updated |
    When User click the delete Team button
    Then User should navigate to Team dashboard

  #@SanityTest01
  Scenario: To export the list of Team
    Given User go to Team page
    When User click on export Team button
    Then User should navigate to Team dashboard


  @multiple
  Scenario: To add multiple Teams then delete them
    Given User go to Team page
    When Add multiple Teams
      | name       | description         |
      | teamTest01 | Team Description 01 |
      | teamTest02 | Team Description 02 |
      | teamTest03 | Team Description 03 |

    Then select the Teams added
    And Click on delete Teams button



