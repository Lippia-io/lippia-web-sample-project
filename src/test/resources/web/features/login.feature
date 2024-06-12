@manual_login
Feature: Manual login

  @successfulAccessToManualLogin @smoke @success
  Scenario Outline: Successful access to manual login
    Given user is in login page <login_url>
    When user clicks "Log in manually" button to log in manually
    Then user is in manual login page <login_url>
    Examples:
      | login_url                        |
      | https://app.clockify.me/en/login |

  @successfulManualLogin @smoke @success
  Scenario Outline: Successful manual login
    Given user is in login page <login_url>
    When user clicks "Log in manually" button to log in manually
    And user inputs email <email>
    And user inputs password <password>
    And user clicks "Log In" button to log in
    Then user is in tracker page <tracker_url> to start tracking work
    Examples:
      | login_url                        | email                  | password        | tracker_url                     |
      | https://app.clockify.me/en/login | anabelcaliri@gmail.com | EzysE@7bY6_KAwX | https://app.clockify.me/tracker |


  @unsuccessfulManualLogin @fail @smoke
  Scenario Outline: Unsuccessful manual login due to <reason> input
    Given user is in login page <login_url>
    When user clicks "Log in manually" button to log in manually
    And user inputs email <email>
    And user inputs password <password>
    And user clicks <login_button> button to log in
    Then invalid credentials error <error_message> is displayed
    And <login_button> button is <attribute>
    Examples:
      | reason         | login_url                        | email               | password        | login_button | attribute | error_message             |
      | wrong password | https://app.clockify.me/en/login | belcaliri@gmail.com | EzysE@7bY6_KAwJ | Log In       | disabled  | Invalid email or password |
      | wrong email    | https://app.clockify.me/en/login | acaliri@gmail.com   | EzysE@7bY6_KAwX | Log In       | disabled  | Invalid email or password |


  @UnsuccessfulManualLoginDueToInvalidPassword @fail
  Scenario Outline: Unsuccessful manual login due to invalid password
    Given user is in login page <login_url>
    When user clicks <manual_login_button> button to log in manually
    And user inputs email <email>
    And user inputs password <password>
    And user clicks <login_button> button to log in
    Then <login_button> button is <attribute>
    And invalid password error <error_message> is displayed
    Examples:
      | login_url                        | manual_login_button | email                  | password | login_button | attribute | error_message         |
      | https://app.clockify.me/en/login | Log in manually     | anabelcaliri@gmail.com | x        | Log In       | disabled  | Password is not valid |

  @showPasswordSuccessfully @success @smoke
  Scenario Outline: Show password successfully
    Given user is in login page <login_url>
    When user clicks <manual_login_button> button to log in manually
    And user inputs password <password>
    And user clicks <show> button to show password
    Then password <password> is displayed
    Examples:
      | login_url                        | manual_login_button | password        | show |
      | https://app.clockify.me/en/login | Log in manually     | EzysE@7bYjhfAwX | eye  |


  @hidePasswordSuccessfully @success
  Scenario Outline: Hide password successfully
    Given user is in login page <login_url>
    When user clicks <manual_login_button> button to log in manually
    And user inputs password <password>
    And user clicks <show> button to show password
    And user clicks <hide> button to hide password
    Then password <password> is hidden
    Examples:
      | login_url                        | manual_login_button | password        | show | hide |
      | https://app.clockify.me/en/login | Log in manually     | EzysE@7bYjhfAwX | eye  | eye  |

  @goToResetPassword @success @smoke
  Scenario Outline: Go to reset password
    Given user is in login page <login_url>
    When user clicks <manual_login_button> button to log in manually
    And user clicks <reset_button> button to reset password
    Then user is in <reset_password_url> to reset the password
    Examples:
      | login_url                        | manual_login_button | reset_button     | reset_password_url                        |
      | https://app.clockify.me/en/login | Log in manually     | Forgot password? | https://app.clockify.me/reset-password?t= |