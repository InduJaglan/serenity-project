Feature: Login credential

  Scenario: Login with credential
    Given I open url
    And user enters credential to login
    | emailId     | password |
     | automationdiplaynow@gmail.com| DiplayNow@123 |
#
#  @LoginFailed
#  Scenario: Login with invalid credential
#    Given I open url
#    And user enters credential to login
#
#      | emailId     | password |
#      | automationdiplaynow@gmail.com| DiplayNow@23 |
#    Then Verify that Incorrect Message should be displayed
