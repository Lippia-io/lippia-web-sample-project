@logout
Feature: Log out
  Background:
    Given user is logged in Clockify with email anabelcaliri@gmail.com and password EzysE@7bY6_KAwX

  @successfulLogout @smoke @success
  Scenario Outline: Successful log out
    When user clicks avatar button
    And user clicks <logout_button> button to log out
    Then user is in login page <login_url>
    Examples:
      |   logout_button | login_url                        |
      |   Log Out       | https://app.clockify.me/en/login |

