@Workspace
Feature: Workspace

  @Smoke @Clockify @Automated
  Scenario: Create workspace successfully
    Given The client is on clockify page
    And The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    When The client click on three points button
    And The client click on 'Manage workspaces'
    And The client click on 'CREATE NEW WORKSPACE'
    And The client set the new workspace name 'AcademyTest'
    And The client click on 'Create'
    Then The system shown the new workspace created

  @Smoke @Clockify @DeleteWorkspace @Automated
  Scenario: Delete workspace successfully
    Given The client is on clockify page
    And The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    When The client click on three points button
    And The client click on 'Manage workspaces'
    And The client click on 'X'
    And The client set 'DELETE'
    And The client click on 'DELETE WORKSPACE'
    Then The system shown the new workspace deleted