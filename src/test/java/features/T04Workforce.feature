Feature: Test the Workforce feature


  Scenario: user click on submit button without entering data
    Given User go to add new workforce
    When User click directly on submit button
    Then Error messages should be displayed
    And User quit the page workforce

  @workforce
  Scenario: To Add a new workforce
    Given User go to workforce page
    And click on add new workforce
    When User type workforce new information
      | workforce Test | wftest01@gmail.com | 523611000 | 523611000 | 12252020 | profile | vehicle | file123 | C:\Users\Eyaba\Desktop\file.pdf |
    And click on submit button to confirm
    Then User should navigate to workforce dashboard

  #@workforce
  Scenario: To update workforce
    Given User select workforce to update
    # |workforce name |
      | workforce Test |
    When User update workforce information
      | workforceTestTest | workforcetesttest@gmail.com | 12252021 | 523698009 |
    Then User click on save workforce update button

  #@workforce
  Scenario: To delete workforce
    Given User select workforce to delete
     # |workforce name |
      | workforceTestTest |
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


  #@multiple
  Scenario: To add multiple workforces then delete them
    Given User go to workforce page
    When Add multiple workforces

      | fullName          | email               | Number    | birthdate | idPassport | Workforceprofile | vehicle | fileName | fileLocation                    |
      | workforce Test001 | wftest001@gmail.com | 523611001 | 11252020  | 523611001  | profile          | vehicle | file123  | C:\Users\Eyaba\Desktop\file.pdf |
      | workforce Test002 | wftest002@gmail.com | 523611002 | 10252020  | 523611002  | profile          | vehicle | file123  | C:\Users\Eyaba\Desktop\file.pdf |
      | workforce Test003 | wftest003@gmail.com | 523611003 | 10252020  | 523611003  | profile          | vehicle | file123  | C:\Users\Eyaba\Desktop\file.pdf |
      | workforce Test004 | wftest004@gmail.com | 523611004 | 1152020   | 523611004  | profile          | vehicle | file123  | C:\Users\Eyaba\Desktop\file.pdf |

    Then select the workforces added
    And Click on delete workforces button







