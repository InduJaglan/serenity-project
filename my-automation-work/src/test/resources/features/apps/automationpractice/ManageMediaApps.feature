Feature: Manage Display
  Background:
    Given I open url
    And user enters credential to login

      | emailId     | password |
      | automationdiplaynow@gmail.com| DiplayNow@123 |

 @MediaWebPageApp
Scenario: Add Web Page on Media App
When Click on the Media button
And Click on My Media tab
Then Verify that Customer is navigated on Media App Store
When click on Add WebPage and Enter App Details
Then Verify that App is created successfully

@MediaGoogleSlides
Scenario: Add GoogleSlides on Media App
When Click on the Media button
And Click on My Media tab
Then Verify that Customer is navigated on Media App Store
When click on Add GoogleSlides and Enter App Details
Then Verify that App is created successfully

@MediaImage
Scenario: Add Image on Media App
When Click on the Media button
And Click on My Media tab
Then Verify that Customer is navigated on Media App Store
When click on Add Image and Enter App Details
Then Verify that App is created successfully

  @MediaClock
  Scenario: Add Clock on Media App
    When Click on the Media button
    And Click on My Media tab
    Then Verify that Customer is navigated on Media App Store
    When click on Add Clock and Enter App Details
    Then Verify that App is created successfully

@MediaPdf
Scenario: Add Pdf on Media App
  When Click on the Media button
  And Click on My Media tab
  Then Verify that Customer is navigated on Media App Store
  When click on Add Pdf and Enter App Details
  Then Verify that App is created successfully

  @MediaWeather
  Scenario: Add Weather on Media App
    When Click on the Media button
    And Click on My Media tab
    Then Verify that Customer is navigated on Media App Store
    When click on Add Weather and Enter App Details
    Then Verify that App is created successfully

  @MediaCanva
  Scenario: Add Canva on Media App
    When Click on the Media button
    And Click on My Media tab
    Then  Verify that Customer is navigated on Media App Store
    When click on Add Canva and Enter App Details
    Then Verify that App is created successfully

 @MediaYouTube
 Scenario: Add YouTube on Media App
   When Click on the Media button
   And Click on My Media tab
   Then Verify that Customer is navigated on Media App Store
   When click on Add YouTube and Enter App Details
   Then Verify that App is created successfully

 @MediaVideo
  Scenario: Add Video on Media App
    When Click on the Media button
    And Click on My Media tab
    Then Verify that Customer is navigated on Media App Store
    When click on Add Video and Enter App Details
    Then Verify that App is created successfully


