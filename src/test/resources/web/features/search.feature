@Search
Feature: Search on google page

  Background:
    Given The client is on google page

  @Regression @Candidate @SearchLocators
  Scenario: The client search by "Locators"
    When The client search for word Locators
    Then The client verify that results are shown properly

  @Smoke @NoCandidate @SearchSelenium
  Scenario: The client search by "Selenium"
    When The client search for word Selenium
    Then The client verify that results are shown properly

  @Regression @ToBeAutomated @SearchCucumber
  Scenario: The client search by "Cucumber"
    When The client search for word Cucumber
    Then The client verify that results are shown properly

  @Smoke @Automated @SearchRepository
  Scenario: The client search by "Repository"
    When The client search for word Repository
    Then The client verify that results are shown properly