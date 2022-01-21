package com.myautomationwork.steps.apps.automationpractice;

import org.junit.Assert;

import com.myautomationwork.apps.pages.automationPractice.DisplayManagePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageDisplaySteps
{
    DisplayManagePage managePage;
    
    @When("Click on Add Screen")
    public void addScreen()
    {
        managePage.clickAddScreen();
    }
    @And("Add Screen Name")
    public void addScreenDetails() throws InterruptedException {
        managePage.enterScreenDetails();
    }
    @When("Click on Add Folder")
    public void addFolder() throws InterruptedException {
        managePage.clickAddFolder();
    }
    @And("Add Folder Detail")
    public void addFolderDetails() throws InterruptedException {
        managePage.enterFolderDetails();
    }

    @When("Click on the Edit button")
    public void editFolder() throws InterruptedException {
        managePage.clickEditFolder();
    }
    @And("Edit the folder details")
    public void editFolderDetails() throws InterruptedException {
        managePage.editFolderDetails();
    }
    
    @When("Click on the Delete button")
    public void deleteFolder() throws InterruptedException {
        managePage.clickDeleteFolder();
    }
    
    @Then("Verify that folder is added successfully")
    public void validateFolder() throws InterruptedException
    {
    	Assert.assertTrue(managePage.validateFolderName());
    }
    
    @Then("Verify that folder is updated successfully")
    public void validateUpdatedFolder() throws InterruptedException
    {
    	Assert.assertTrue(managePage.validateUpdatedFolderName());
    }
    
    @Then("Verify that folder is deleted successfully")
    public void validateDeletedFolder() throws InterruptedException
    {
    	Assert.assertFalse(managePage.validateDeletedFolderName());
    }
    
    //Add Media Step def
    
    @When("Click on the Media button")
    public void clickMediaOption() throws InterruptedException {
        managePage.clickMediaOption();
    }
    
    @And("Click on My Media tab")
    public void clickMyMediatab() throws InterruptedException {
        managePage.clickMyMediatab();
    }
    
    @Then("Verify that Customer is naviagted on Media App Store")
    public void verifyMediaApp() throws InterruptedException {
    	Assert.assertTrue(managePage.verifyMediaApp());
    }
    
    @When("click on Add WebPage and Enter Web Page Details")
    public void clickAddWebPageDetails() throws InterruptedException {
        managePage.addWebPageDetails();
    }
    
    @Then("Verify that Web Page is created succesfully")
    public void verifyWebPage() throws InterruptedException {
    	Assert.assertTrue(managePage.verifyWebPage());
    }



}

