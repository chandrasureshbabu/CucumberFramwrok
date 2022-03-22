Feature: Create a bug

  Background: Login to Bugzilla
    Given user is on Home page
    When user clicks on EnterBug link
    Then user lands on the Login page
    And user enters valid username and password
    And clicks on login
    And user is on EnterBug page "Bugzilla – Enter Bug: TestProduct"

  Scenario: Create a bloker Issue
    Given user selects severity  as "blocker"
    And user Select Hardware "PC" and Operating System "Windows"
    And user Enter Summary "Summary" and Description  "Description"
    And Clicks Submit
    Then user is on Bug additional details page
    And user enters Additional Comments "Additional Comments"
    And save Changes
    Then user is on Bugzilla Bug page
    Then user can see "Changes Submitted" for bug Number is Displayed
    And Logout link is displayed

  Scenario: Create a Critical Issue
    Given user selects severity  as "critical"
    And user Select Hardware "Other" and Operating System "Linux"
    And user Enter Summary "Summary" and Description  "Description"
    And Clicks Submit
    Then user is on Bug additional details page
    And user enters Additional Comments "Additional Comments"
    And save Changes
    Then user is on Bugzilla Bug page
    Then user can see "Changes Submitted" for bug Number is Displayed
    And Logout link is displayed

  Scenario: Create a major Issue
    Given user selects severity  as "major"
    And user Select Hardware "All" and Operating System "Other"
    And user Enter Summary "Summary" and Description  "Description"
    And Clicks Submit
    Then user is on Bug additional details page
    And user enters Additional Comments "Additional Comments"
    And save Changes
    Then user is on Bugzilla Bug page
    Then user can see "Changes Submitted" for bug Number is Displayed
    And Logout link is displayed
