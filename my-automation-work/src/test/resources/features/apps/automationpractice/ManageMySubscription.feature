Feature: Manage Display
  Background:

    Given I open url
    And user enters credential to login

      | emailId     | password |
      | automationdiplaynow@gmail.com| DiplayNow@123 |

  @UpdateSubscription
  Scenario: Update Subscription
   When Click on the My Subscription button
    And click on Update Plan and Enter Details
    Then Verify that Subscription is updated successfully