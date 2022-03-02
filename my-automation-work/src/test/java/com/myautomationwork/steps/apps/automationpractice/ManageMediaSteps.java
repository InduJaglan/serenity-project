package com.myautomationwork.steps.apps.automationpractice;

import com.myautomationwork.apps.pages.automationPractice.ManageMediaPage;
import org.junit.Assert;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;


public class ManageMediaSteps {
    ManageMediaPage manageMedia;

    @When("Click on the Media button")
    public void clickMediaOption() throws InterruptedException {
        manageMedia.clickMediaOption();
    }

    @And("Click on My Media tab")
    public void clickMyMediatab() throws InterruptedException {
        manageMedia.clickMyMediatab();
    }

    @Then("Verify that Customer is navigated on Media App Store")
    public void verifyMediaApp() throws InterruptedException {
        Assert.assertTrue(manageMedia.verifyMediaApp());
    }

    @When("click on Add WebPage and Enter App Details")
    public void clickAddWebPageDetails() throws InterruptedException {
        manageMedia.clickAddWebPage();
        manageMedia.enterAppDetails();
    }

    @Then("Verify that App is created successfully")
    public void verifyWebPage() throws InterruptedException {
        Assert.assertTrue(manageMedia.verifyWebPage());
    }

    @When("click on Add GoogleSlides and Enter App Details")
    public void clickAddGoogleSlidesDetails() throws InterruptedException
    {
        manageMedia.clickAddGoogleSlides();
        manageMedia.enterAppDetails();
    }

    @When("click on Add Image and Enter App Details")
    public void clickAddImageDetails() throws InterruptedException, AWTException {
        manageMedia.clickAddImage();
        manageMedia.addImageDetails();
    }

    @When("click on Add Pdf and Enter App Details")
    public void clickAddPdfDetails()throws InterruptedException, AWTException
    {
        manageMedia.clickAddPdf();
        manageMedia.addPdfDetails();
    }

    @When("click on Add Clock and Enter App Details")
    public void clickAddClockDetails()throws InterruptedException
    {
        manageMedia.clickAddClock();
        manageMedia.addClockDetails();

    }

    @When("click on Add Weather and Enter App Details")
    public void clickAddWeatherDetails() throws InterruptedException {
        manageMedia.clickAddWeather();
        manageMedia.addWeatherDetails();
    }

    @When("click on Add Canva and Enter App Details")
    public void clickAddCanvaDetails() throws InterruptedException {
        manageMedia.clickAddCanva();
        manageMedia.addCanvaDetails();
    }

    @When("click on Add YouTube and Enter App Details")
    public void clickAddYouTubeDetails()throws InterruptedException
    {
        manageMedia.clickAddYouTube();
        manageMedia.addYouTubeDetails();
    }

    @When("click on Add Video and Enter App Details")
    public void clickAddVideoDetails() throws InterruptedException, AWTException {
        manageMedia.clickAddVideo();
        manageMedia.addVideoDetails();
    }
}


