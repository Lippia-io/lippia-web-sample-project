@LogOut
Feature: Clockify log out

  @Smoke @Automated @Do
  Scenario: Log out successfully
    Given The client is on clockify page
    And The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    When The client click on 'user button'
    And The client click on 'Log out' button
    Then The system get you out from clockify