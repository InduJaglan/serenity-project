Feature: Manage Display
 Background:

  Given I open url
  And user enters credential to login

   | emailId     | password |
   | automationdiplaynow@gmail.com| DiplayNow@123 |

 @AddScreen
  Scenario: Add Screen
  When Click on Add Screen
  Given I open Pair url
  And Get Pair code
  And  Add Screen Name
  Then Verify that screen is added successfully

 @refreshCode
 Scenario: Add Screen
  When Click on Add Screen
  Given I open Pair url
  And Get Pair code
  And  Add Screen Name
  Then Verify that screen is added successfully

  @AddFolder
  Scenario: Add Folder
  When Click on Add Folder
  And  Add Folder Detail
  Then Verify that folder is added successfully


    @EditFolder
    Scenario: Edit Folder
    When Click on the Edit button
    And Edit the folder details
    Then Verify that folder is updated successfully

    @DeleteFolder
    Scenario: Delete Folder
    When Click on the Delete button
    Then Verify that folder is deleted successfully

  @ExpandCollapseAllFolder
  Scenario: Collapse and Expand Folder
  When Click on the Collapse all button
   Then Verify that all the folders Collapsed successfully
   When Click on the Expand all button
  Then Verify that all the folders Expand successfully

 @SearchField
 Scenario: Search Field
  When Search Screen data by Search Parameters
  |searchValue|
   |abcde|
  Then Verify that screen data Search successfully
  When Search Screen data by Search Parameters
   |searchValue|
  Then Verify that second data Search successfully
