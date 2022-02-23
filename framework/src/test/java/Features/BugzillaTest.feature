Feature: Bugzilla Login Test

Scenario: Bugzilla sign in from Login page
Given user is on Home page
When user clicks on EnterBug link
Then user lands on the Login page
And user enters valid username and password
And clicks on login
Then user should land on EnterBugPage