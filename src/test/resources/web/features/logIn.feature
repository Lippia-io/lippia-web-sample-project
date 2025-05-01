@LogIn
Feature: Clockify log in

  @ToBeAutomated @LogInFromHomePage
  Scenario: Access to Log in from clockify home page successfully
    Given The client is on landing page
    When The client click on LogIn button
    Then The client get access to clockify LogIn page

  @Smoke @Candidate @LogInManually @Do
  Scenario: The client manually log in to clockify successfully
    Given The client is on clockify log in page
    When The client click on 'Log in manually'
    And the client set the email 'cfiguera83@gmail.com'
    And the client set the password 'Paty.2236'
    And the client click on LogIn button
    Then The client is on the time tracker page
