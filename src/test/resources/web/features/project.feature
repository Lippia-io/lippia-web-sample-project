@project
Feature: Project

  Background:
    Given user is logged in Clockify with email anabelcaliri@gmail.com and password EzysE@7bY6_KAwX

  @goToManageProjects @smoke @success
  Scenario: Go to manage workspaces
    When user clicks Projects in the side menu
    Then user is in Projects page to start creating projects


  @createNewProject @smoke @success
  Scenario Outline: Create new project
    When user clicks Projects in the side menu
    And user is in Projects page to start creating projects
    When user clicks Create new project button to go to create new project
    And user inputs project name <name>
    And user clicks Create to create the project
    Then project with name <name> has been created
    Examples:
      | name      |
      | Project # |


