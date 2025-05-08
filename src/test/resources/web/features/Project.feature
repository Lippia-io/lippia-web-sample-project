@Project
  Feature:Create project

  @Some @Clockify @Automated
  Scenario: Create project successfully
    Given The client is on clockify page
    And The client click on 'Log in manually'
    And The client set the email pruebaacademy@outlook.com
    And The client set the password prueba1234
    And The client click on Login button
    When The client click on 'Project'
    And The client click on 'Create new project'
    And The client set the project name 'Crowdar Academy'
    And The client click on 'Create Project'
    Then The system show success message