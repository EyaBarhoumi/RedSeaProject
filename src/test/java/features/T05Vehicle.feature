Feature: Test the Vehicle feature

  @SanityTest01
  Scenario: To Add a new vehicle
    Given User go to vehicle page
    And click on add new vehicle
    When User type vehicle new information
    And click on submit button vehicle to confirm
    Then User should navigate to vehicle dashboard

  @SanityTest01
  Scenario: To update vehicle
    Given User select vehicle to update
    When User update vehicle information
    Then User click on save vehicle update button

  @SanityTest01
  Scenario: To delete vehicle
    Given User select vehicle to delete
    When User click the delete vehicle button
    Then User should navigate to vehicle dashboard

  @SanityTest01
  Scenario: To import vehicle
    Given User go to vehicle menu
    When User click on import vehicle list
    Then User add the vehicle list

  @SanityTest01
  Scenario: To export the list of vehicle
    Given User go to vehicle page
    When User click on export vehicle button
    Then User should navigate to vehicle dashboard

