Feature: Login to Bugzilla using Different Set of Logins

  Scenario Outline: SignTo to Bugzilla
    Given Open Bugzilla HomePage in the Browser
    When Click on LoginLink on Homepage
    And username and Password fields appears on Homepage
    And Enter username <Username> Password and <Password> click Login
    Then Users should be able to login to Bugzilla successfully
    And Click on Logout link
    Then Redirected to Homepage

    Examples: 
      | Username                    | Password  |
      | chandra_nemani@hotmail.com  | Password1 |
      | nemani.sureshbabu@gmail.com | Password3 |

  Scenario Outline: Validate to Bugzilla Login
    Given Open Bugzilla HomePage in the Browser
    When Click on LoginLink on Homepage
    And username and Password fields appears on Homepage
    And Enter username <Username> Password and <Password> click Login
    And or Else redirected to InavalidUsernameandPasswordpage
    And Page title should "Bugzilla – Invalid Username Or Password"
    And ErrorMessage should be "The username or password you entered is not valid."

    Examples: 
      | Username                    | Password  |
      | nemani.sureshbabu@gmail.com | Password  |
      | chandra_nemani@hotmail.com  | Password4 |
      | nemani.sureshbabu@gmail.com | Password5 |
