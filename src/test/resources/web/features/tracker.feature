@tracker
Feature: Tracker

  Background:
    Given user is logged in Clockify with email anabelcaliri@gmail.com and password EzysE@7bY6_KAwX

  @goToProjects
  Scenario: Go to Projects
    When user clicks Projects in the side menu
    Then user is in Projects page to start creating projects

  @addNewTimeEntry
  Scenario Outline: Add new time entry
    When user inputs <start> time entry to indicate the start of the period
    And user inputs <end> time entry to indicate the end of the period
    And user inputs a description <description>
    And user clicks Add button to add a new time entry
    Then time entry with description <description> has been created
    Examples:
      | start | end   | description  |
      | 12:00 | 13:00 | Time Entry # |

  @updateATimeEntryDescription
  Scenario Outline: Update a time entry description
    Given user had set a time entry with description <description>, start time <start> and end time <end>
    When user updates the description to <new_description>
    Then time entry with description <new_description> has been updated
    Examples:
      | start | end   | description  | new_description |
      | 12:00 | 13:00 | Time Entry # | Time Entry ###  |


  @updateATimeEntryStartTime
  Scenario Outline: Update a time entry start time
    Given user had set a time entry with description <description>, start time <start> and end time <end>
    When user updates the start time to <new_start_time>
    Then time entry with start time <new_start_time> has been updated
    Examples:
      | start | end   | description  | new_start_time |
      | 10:00 | 11:00 | Time Entry # | 23:23          |

  @updateATimeEntryEndTime
  Scenario Outline: Update a time entry end time
    Given user had set a time entry with description <description>, start time <start> and end time <end>
    When user updates the end time to <new_end_time>
    Then time entry with end time <new_end_time> has been updated
    Examples:
      | start | end   | description  | new_end_time |
      | 10:00 | 11:00 | Time Entry # | 12:12        |
