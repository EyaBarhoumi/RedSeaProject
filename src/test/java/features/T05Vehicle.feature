Feature: Test the Vehicle feature


  Scenario: user click on submit button without entering data
    Given User go to add new vehicle
    When User click directly on submit vehicle button
    Then Error messages should be displayed vehicle
    And User quit the add page vehicle


  Scenario: To Add a new vehicle
    Given User go to vehicle page
    And click on add new vehicle
    When User type vehicle new information
     # | vehicleID | plateNumber |
      | 123654789 | 123654789 |
    And click on submit button vehicle to confirm
    Then User should navigate to vehicle dashboard


  Scenario: To update vehicle
    Given User select vehicle to update
    #|vehicleId|
      | 123654789 |
    When User update vehicle information
    #|vehicleId|
      | 123654789 |
    Then User click on save vehicle update button


  Scenario: To delete vehicle
    Given User select vehicle to delete
    #|vehicleId|
      | 123654788 |
    When User click the delete vehicle button
    Then User should navigate to vehicle dashboard


  Scenario: To import vehicle
    Given User go to vehicle menu
    When User click on import vehicle list
    Then User add the vehicle list


  Scenario: To export the list of vehicle
    Given User go to vehicle page
    When User click on export vehicle button
    Then User should navigate to vehicle dashboard


 # @multiple
  Scenario: To add multiple vehicles then delete them
    Given User go to vehicle page
    When Add multiple vehicles
      | vehicleID | plateNumber |
      | 789654123 | 789654123   |
      | 963258741 | 963258741   |
      | 632145897 | 632145897   |

    Then select the vehicles added
    And Click on delete vehicles button

