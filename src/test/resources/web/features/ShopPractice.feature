@Shop
Feature: Shop

  Background:
    Given The client is on automation practice page
    And user clicks on "Shop"

  @DefaultSorting
  Scenario Outline: Sort by <sorting>
    Given user selects <sorting>
    Then user must see the top element <top>

    Examples:
      | sorting             | top                               |
      | popularity          | Android Quick Start Guide         |
      | average rating      | Selenium Ruby                     |
      | newness             | HTML5 WebApp Develpment           |
      | price: low to high  | JS Data Structures and Algorithm  |