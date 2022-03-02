Feature: Manage Display
  Background:
    Given I open url
    And user enters credential to login

      | emailId     | password |
      | automationdiplaynow@gmail.com| DiplayNow@123 |

   @AddPlayLists
   Scenario: Add PlayLists
   When Click on the PlayList button
    And click on Add PlayList and Enter PlayList Details
    Then Verify that PlayList is created successfully

   @ChangePlayListsGroup
    Scenario: Change PlayLists Group
    When Click on the PlayList button
    When Click on the Change Group button
     And Edit the Change Group Details
    Then Verify that Change Group Playlist is updated successfully

  @EditPlayLists
  Scenario: Edit PlayLists
    When Click on the PlayList button
    When Click on the Edit PlayList button
    And Edit the PlayList Details
    Then Verify that PlayList is updated successfully

  @DeletePlayLists
  Scenario: Delete PlayLists
    When Click on the PlayList button
    When Click on the Delete PlayList button
    Then Verify that PlayList is Deleted successfully

  @AddBroadcasts
  Scenario: Add Broadcasts
    When Click on the PlayList button
    When Click on Broadcasts tab
   And  click on Add Broadcast and Enter Broadcast Details
    Then Verify that Broadcast is created successfully
    And  click on Add Broadcast and Enter Live immediately Broadcast Details
    Then Verify that Broadcast is created successfully

  @EditBroadcasts
  Scenario: Edit Broadcasts
    When Click on the PlayList button
    When Click on the Edit Broadcast button
    And Edit the Broadcast Details
    Then Verify that Broadcast is updated successfully

  @DeleteBroadcasts
  Scenario: Delete Broadcasts
    When Click on the PlayList button
    When Click on the Delete Broadcasts button
    Then Verify that Broadcasts is Deleted successfully
