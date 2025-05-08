@GoogleSearch
Feature: Search on google page

  Background:
    Given The client is on google page

  @Regression @Candidate @SearchCrowdarAcademy
  Scenario: The client search by "Crowdar Academy"
    When The client search for word Crowdar Academy
    Then The client verify that results are shown properly

  @Smoke @NoCandidate @SearchCalidad
  Scenario: The client search by "Calidad"
    When The client search for word Calidad
    Then The client verify that results are shown properly

  @Regression @ToBeAutomated @SearchSoftware
  Scenario: The client search by "Software"
    When The client search for word Software
    Then The client verify that results are shown properly

  @Smoke @Automated @SearchTesting
  Scenario: The client search by "Testing"
    When The client search for word Testing
    Then The client verify that results are shown properly