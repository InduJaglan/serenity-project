Feature: Manage Display
  Background:
    Given I open url
    And user enters credential to login

      | emailId     | password |
      | automationdiplaynow@gmail.com| DiplayNow@123 |

  @EndtoEndFlow
  Scenario: Add Screen folder media playlist Broadcast
    When Click on Add Screen
    Given I open Pair url
    And Get Pair code
    And  Add Screen Name
    When Click on Add Folder
    And  Add Folder Detail
    When Click on the Media button
    And Click on My Media tab
    Then Verify that Customer is navigated on Media App Store
    When click on Add Weather and Enter App Details
    When click on Add Video and Enter App Details
    When Click on the PlayList button
    And click on Add PlayList and Enter PlayList Details
    When Click on Broadcasts tab
    And  click on Add Broadcast and Enter Live immediately Broadcast Details
    And  click on Add Broadcast and Enter Broadcast Details
    When Click on Broadcasts tab
    When Click on the Groups button
    And click on Add Group and Enter Group Details
    Then Verify that Group is added successfully
