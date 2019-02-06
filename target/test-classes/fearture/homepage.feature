@register
Feature: Home page

  Scenario: register as users
    When users click on sign in / register
    Then register page should displayed
    And the tittle should be correct
