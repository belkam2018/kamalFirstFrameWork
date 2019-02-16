@Amazon
Feature: Amazon sign in

  @login
  Scenario: user login
    Given user on the home page
    When user click to sign in
    Then sign in page should displayed
    When user logs in using email
    Then user logs in using password
    And home page should displayed

    @print
  Scenario: check all Departments
    Given user on the home page
    When home page should displayed
    Then check all Departments
    And print all Departments

