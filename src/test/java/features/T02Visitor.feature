Feature: Test the Visitor feature


  @SanityTest01
  Scenario: user click on submit button without entering data
    Given User go to add new visitor
    When User click directly on submit visitor button
    Then Error messages should be displayed visitor
    And User quit the add page visitor

  @SanityTest01
  Scenario: To Add a new visitor
    Given User go to visitor page
    And click on add new visitor
    When User type visitor information
      | visitorTest | 523698000 | 523698000 | 09252017 | 0345PM | 09252020 | 0245PM | file123 | C:\Users\Eyaba\Desktop\file.pdf |
    And click on button to confirm
    Then User should navigate to visitor dashboard

  @SanityTest01
  Scenario: To update visitor
    Given User select visitor to update
    # |Visitor name |
      | visitorTest |
    When User update information
      | visitorTestTest | 523698015 | 523698015 | 09252021 | 0245PM |
    Then User click on save update button

  @SanityTest01
  Scenario: To delete visitor
    Given User select visitor to delete
    # |Visitor name |
      | visitorTestTest |
    When User click the delete button
    Then User should navigate to visitor dashboard

  @SanityTest01
  Scenario: To import visitor
    Given User go to visitor menu
    When User click on import visitors list
    Then User add the visitors list
    # |file location |
      | C:\Users\Eyaba\Desktop\Visitorlist.xlsx |

  @SanityTest01
  Scenario: To export the list of visitors
    Given User go to visitor page
    When User click on export button
    Then User should navigate to visitor dashboard








