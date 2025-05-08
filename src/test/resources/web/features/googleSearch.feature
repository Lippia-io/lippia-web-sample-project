Feature: As a potential client i need to search in google to find a web site

  @Smoke
  Scenario: The client search by "Crowdar Academy"
    Given The client is on google page
    When The client search for word Crowdar Academy
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "Calidad"
    Given The client is on google page
    When The client search for word Calidad
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "Software"
    Given The client is on google page
    When The client search for word Software
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "Testing"
    Given The client is on google page
    When The client search for word Testing
    Then The client verify that results are shown properly