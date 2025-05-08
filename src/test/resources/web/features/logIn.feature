@LogIn
Feature: Clockify log in

  @ToBeAutomated @AccessToLogIn @Automated
  Scenario: The client get access to Log in from clockify home page successfully
    Given The client is on landing page
    When The client click on LogIn button
    Then The client get access to clockify LogIn page

  @Smoke @LogInManually @Automated
  Scenario: The client manually log in to clockify successfully
    Given The client is on clockify log in page
    When The client click on 'Log in manually'
    And The client set the email 'pruebaacademy@outlook.com'
    And The client set the password 'prueba1234'
    And The client click on Login button
    Then The client is on clockify dashboard page

  @WrongEmail @Invalid @InvalidEmail @Automated
  Scenario: The client try failure manually log in with a wrong Email
    Given The client is on clockify log in page
    When The client click on 'Log in manually'
    And The client set the email 'xxxxxxxxxx'
    And The client click on password
    Then The system notified error message

