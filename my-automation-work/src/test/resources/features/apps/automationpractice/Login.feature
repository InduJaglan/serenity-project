Feature: Login verification

  Scenario: Login with invalid credential
    Given I open url
    When I click on Login button
    And user enters credential to login
      | emailId     | password |
      | abc@abc.com | xyz      |