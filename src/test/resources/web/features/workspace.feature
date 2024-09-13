@workspace
Feature: Workspace

  Background:
    Given user is logged in Clockify with email anabelcaliri@gmail.com and password EzysE@7bY6_KAwX

  @goToManageWorkspaces @smoke @success
  Scenario Outline: Go to manage workspaces
    When user clicks workspace dropdown to see workspace options
    And user clicks manage workspaces to go to workspaces
    Then user is in workspaces page <url>
    Examples:
      | url                                |
      | https://app.clockify.me/workspaces |

  @addNewWorkspace @smoke @success
  Scenario Outline: Add new workspace
    When user clicks workspace dropdown to see workspace options
    And user clicks manage workspaces to go to workspaces
    And user clicks Create new workspace to go to create new workspace
    And user inputs workspace name <name>
    And user clicks Create to create the workspace
    Then workspace with name <name> has been created
    Examples:
      | name                   |
      | Lippia Web Workspace # |

  @updateWorkspaceName @success
  Scenario Outline: Update workspace name
    When user clicks workspace dropdown to see workspace options
    And user clicks workspace settings to go to workspace settings
    And user updates the workspace name to <new_name>
    Then workspace with name <new_name> has been updated
    Examples:
      | new_name |
      | Updated  |