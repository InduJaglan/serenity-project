Feature: Manage Display
  Background:
    Given I open url
    And user enters credential to login

      | emailId     | password |
      | automationdiplaynow@gmail.com| DiplayNow@123 |

  @AddGroups
  Scenario: Add Groups
   When Click on the Groups button
   And click on Add Group and Enter Group Details
    Then Verify that Group is added successfully

  @EditGroup
  Scenario: Edit Groups
    When Click on the Groups button
    When Click on the Edit Groups button
    And Edit the Groups Details
    Then Verify that Group is updated successfully

  @DeleteGroup
  Scenario: Delete Group
    When Click on the Groups button
    When Click on the Delete Group button
    Then Verify that Group is Deleted successfully
