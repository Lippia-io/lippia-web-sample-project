@Update
  Feature: Update

    @Smoke @Automated
    Scenario Outline: Update workspace name
      Given The client is on clockify page
      And The client click on 'Log in manually'
      And The client set the email pruebaacademy@outlook.com
      And The client set the password prueba1234
      And The client click on Login button
      When The client click on three points button
      And The client click on 'Manage workspaces'
      And The client click on 'SETTINGS'
      And The client set the new name '<name>'
      And The client click on 'PROJECTS'
      Then The system shows a successfully updated info notification

      Examples:

        | name    |
        | Crowdar |
        | Academy |
        | Test    |
