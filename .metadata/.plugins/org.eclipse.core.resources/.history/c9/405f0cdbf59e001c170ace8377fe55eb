Feature: Login Page Tests

  Background: 
    Given User navigated to Login page of Bugizilla

  Scenario: Login with valid username and Password
    Then user enters valid username and password
    Then clicks on login
    Then user should land on EnterBugPage

  Scenario Outline: validate with valid creds
    And Enter username <Username> Password and <Password> click Login
    Then Users should be able to login to Bugzilla successfully
    And click on Logout link
    Then Redirected to Homepage

    Examples: 
      | Username                    | Password  |
      | chandra_nemani@hotmail.com  | Password1 |
      | nemani.sureshbabu@gmail.com | Password3 |
