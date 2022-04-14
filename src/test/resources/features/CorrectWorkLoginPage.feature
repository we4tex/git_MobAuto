Feature: Correct work forms to Login Page

  @ValidCredentials
  Scenario: Work Login Page Scenario
    Given User open App and tab Login Page
    When User clicks on tab Sign Up
    Then Check correct loading Sign Up
    When User clicks on tab Login forms
    Then Check correct loading login forms