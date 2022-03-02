package com.myautomationwork.steps.apps.automationpractice;

import com.myautomationwork.apps.pages.automationPractice.ManagePlaylistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class ManagePlaylistSteps {
    ManagePlaylistPage managePlaylist;

    @When("Click on the PlayList button")
    public void clickPlayListButton() throws InterruptedException
    {
        managePlaylist.clickPlayList();
    }

    @And("click on Add PlayList and Enter PlayList Details")
    public void clickAddPlayListDetails() throws InterruptedException
    {
        managePlaylist.clickAddPlayList();
        managePlaylist.enterPlayListDetails();
    }

    @Then("Verify that PlayList is created successfully")
    public void verifyPlayList() throws InterruptedException
    {
        Assert.assertTrue(managePlaylist.verifyPlayListName());
    }

    @When("Click on the Change Group button")
    public void clickChangeGroupButton()throws InterruptedException
    {
        managePlaylist.clickChangeGroup();
    }

    @And("Edit the Change Group Details")
    public void editTheGroupDetails()throws InterruptedException
    {
        managePlaylist.clickChangeGroupDetails();

    }

    @Then("Verify that Change Group Playlist is updated successfully")
    public void validateUpdatedChangeGroup()throws InterruptedException
    {
        Assert.assertTrue(managePlaylist.validateUpdatedChangeGroupName());
    }

    @When("Click on the Edit PlayList button")
    public void clickEditPlayListButton() throws InterruptedException
    {

        managePlaylist.clickEditPlayList();
    }

    @And("Edit the PlayList Details")
    public void editThePlayListDetails()throws InterruptedException
    {
        managePlaylist.editPlayListDetails();
    }

    @Then("Verify that PlayList is updated successfully")
    public void validateUpdatedPlayList() throws InterruptedException
    {
        Assert.assertTrue(managePlaylist.validateUpdatedPlayListName());

    }

    @When("Click on the Delete PlayList button")
    public void clickDeletePlayListButton() throws InterruptedException {

        managePlaylist.clickDeletePlaylist();
    }

    @Then("Verify that PlayList is Deleted successfully")
    public void validateDeletedPlaylist()throws InterruptedException {
        Assert.assertFalse(managePlaylist.validateDeletedPlaylistName());
    }

    @When("Click on Broadcasts tab")
    public void clickBroadcastsTab()throws InterruptedException
    {
        managePlaylist.clickBroadcasts();
    }

    @And("click on Add Broadcast and Enter Broadcast Details")
    public void clickBroadcastDetails()throws InterruptedException
    {
        managePlaylist.enterBroadcastDetails();
    }

    @And("click on Add Broadcast and Enter Live immediately Broadcast Details")
    public void clickLiveImmediatelyBroadcastDetails() throws InterruptedException
    {
        managePlaylist.enterLiveBroadcastDetails();
    }

    @Then("Verify that Broadcast is created successfully")
    public void validateBroadcastCreatedSuccessfully()throws InterruptedException
    {
        Assert.assertTrue(managePlaylist.validateBroadcasts());
    }

    @When("Click on the Edit Broadcast button")
    public void clickEditBroadcastButton()throws InterruptedException
    {
        managePlaylist.clickEditBroadcast();

    }

    @And("Edit the Broadcast Details")
    public void editTheBroadcastDetails()throws InterruptedException
    {
        managePlaylist.editBroadcastDetails();

    }

    @Then("Verify that Broadcast is updated successfully")
    public void validateUpdatedBroadcast()throws InterruptedException {
        Assert.assertTrue(managePlaylist.validateUpdatedBroadcastName());
    }

    @When("Click on the Delete Broadcasts button")
    public void clickDeleteBroadcastsButton() throws InterruptedException
    {
        managePlaylist.clickDeleteBroadcast();
    }

    @Then("Verify that Broadcasts is Deleted successfully")
    public void validateDeletedBroadcasts() throws InterruptedException {
        Assert.assertFalse(managePlaylist.validateDeletedBroadcastName());
    }
}



