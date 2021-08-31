Feature: Test the Workforce feature


  Scenario: user click on submit button without entering data
    Given User go to add new workforce
    When User click directly on submit button
    Then Error messages should be displayed
    And User quit the page workforce

  Scenario: To Add a new workforce
    Given User go to workforce page
    And click on add new workforce
    When User type workforce new information
      | workforce Test | wftest01@gmail.com | 523611000 | 523611000 | 12252020 | profile | vehicle | file123 | C:\Users\Eyaba\Desktop\file.pdf |
    And click on submit button to confirm
    Then User should navigate to workforce dashboard


  Scenario: To update workforce
    Given User select workforce to update
    When User update workforce information
    Then User click on save workforce update button


  Scenario: To delete workforce
    Given User select workforce to delete
    When User click the delete workforce button
    Then User should navigate to workforce dashboard


  Scenario: To import workforce
    Given User go to workforce menu
    When User click on import workforce list
    Then User add the workforce list

  Scenario: To export the list of workforce
    Given User go to workforce page
    When User click on export workforce button
    Then User should navigate to workforce dashboard



