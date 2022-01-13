Feature: Manage Display
Background: 
Given I open url
  And user enters credential to login
  
   | emailId     | password |
    | i6554jaglan@gmail.com | 1989@Indu |

    @AddFolder
 Scenario: Add Screen and Folder
 
   When Click on Add Screen
  And  Add Screen Name
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
