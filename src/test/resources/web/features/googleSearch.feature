@Pruebas
Feature: As a potential client i need to search in google to find a web site
Background:
  Given The client is on google page

  @SearchCrowdarAcademy
  Scenario: The client search by "Crowdar Academy"
    When The client search for word Crowdar Academy
    Then The client verify that results are shown properly

   @SearchCalidad
  Scenario: The client search by "Calidad"
    When The client search for word Calidad
    Then The client verify that results are shown properly

  @SearchSoftware
  Scenario: The client search by "Software"
    When The client search for word Software
    Then The client verify that results are shown properly

  @SearchTesting
  Scenario: The client search by "Testing"
    When The client search for word Testing
    Then The client verify that results are shown properly