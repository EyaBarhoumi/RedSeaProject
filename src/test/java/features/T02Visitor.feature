Feature: Test the Visitor feature


  Scenario: To Add a new visitor
    Given User go to visitor page
    And click on add new visitor
    When User type visitor information
    And click on button to confirm
    Then User should navigate to visitor dashboard


  Scenario: To update visitor
    Given User select visitor to update
    When User update information
    Then User click on save update button


  Scenario: To delete visitor
    Given User select visitor to delete
    When User click the delete button
    Then User should navigate to visitor dashboard


  Scenario: To import visitor
    Given User go to visitor menu
    When User click on import visitors list
    Then User add the visitors list

  Scenario: To export the list of visitors
    Given User go to visitor page
    When User click on export button
    Then User should navigate to visitor dashboard


  Scenario: user click on submit button without entering data
    Given User go to add new visitor
    When User click directly on submit button
    Then Error messages should be displayed
    And User quit the page






