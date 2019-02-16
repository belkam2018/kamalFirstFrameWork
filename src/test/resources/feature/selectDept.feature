@select
Feature: select Dept

  Scenario: select computer
    Given user on the home page
    When check all Departments
    Then select computer option
    And computer page should displayed