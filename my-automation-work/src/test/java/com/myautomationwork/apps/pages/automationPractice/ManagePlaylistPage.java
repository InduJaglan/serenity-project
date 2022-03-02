package com.myautomationwork.apps.pages.automationPractice;

import com.myautomationwork.utilities.CommonMethods;
import com.myautomationwork.utilities.RandomGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ManagePlaylistPage extends ManageMediaPage {

    @FindBy(xpath = "(//*[@class='list-item'])[2]")
    WebElement playlistOption;

    @FindBy(xpath = "//input[@name='displayListName']")
    WebElement playListName;

    @FindBy(xpath = "(//*[@class='dropdown-btn'])[1]")
    WebElement selectMediaShow;

    @FindBy(xpath = "(//*[@class='item2'])[1]")
    WebElement selectMediaShowType;

    @FindBy(xpath = "(//*[@class='dropdown-btn'])[2]")
    WebElement selectPlaylistScreen;

    @FindBy(xpath = "(//*[@class='item2'])[2]")
    WebElement selectPlaylistScreenType;

    @FindBy(xpath = "//*[@type='submit'][1]")
    WebElement addNewPlayList;

    @FindBy(xpath = "//*[contains(@class,'table-wrapper')]//table//tr//td[1]")
    List<WebElement> newAddedPlayList;

   @FindBy(xpath = "(//button[contains(@class,'table-btn')])[1]")
    WebElement changeGroupPlayList;

    @FindBy(xpath = "(//button[contains(@class,'table-btn')])[3]")
    WebElement editPlayList;

    @FindBy(xpath = "(//button[contains(@class,'table-btn')])[4]")
    WebElement deletePlayList;

    @FindBy(xpath = "//*[@class='nav-link']")
    WebElement broadcastApp;

    @FindBy(xpath = "(//button[contains(@class,'table-btn')])[1]")
    WebElement editBroadcast;

    @FindBy(xpath = "(//button[contains(@class,'table-btn')])[2]")
    WebElement deleteBroadcast;

    @FindBy(xpath = "//button[contains(@class,'delete')]")
    WebElement deletePlaylistConfirmation;

    @FindBy(xpath = "//input[@name='name']")
    WebElement BroadcastName;

    @FindBy(xpath = "//*[@name='userMediaAppId']")
    WebElement SelectBroadcastApp;

    @FindBy(xpath = "//*[@name='userMediaAppId']//option[2]")
    WebElement SelectBroadcastAppType;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement addBroadcast;

    @FindBy(xpath = "(//input[@name='tempEndDateTime'])[1]")
    WebElement startDateType;

    @FindBy(xpath ="//*[@name='startDateType']")
    WebElement dateStart;

    //@FindBy(xpath ="(//*[@name='startDateType']//option[1]")
   // WebElement startDate;

    @FindBy(xpath = "//*[@name='startDateType']//option[2]")
    WebElement selectDateType;

    @FindBy(xpath = "(//input[@name='tempEndDateTime'])[2]")
    WebElement endDateType;

    @FindBy(xpath = "//*[@name='groupId']")
    WebElement SelectNewGroup;

    @FindBy(xpath = "//*[@name='groupId']//option[3]")
    WebElement SelectNewGroupType;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement addNewGroup;

    @FindBy(xpath = "(//*[@class='item-name item-name-secondary'][1])")
    List<WebElement> updatedChangeGroupName;

    public CommonMethods _commonMethods;
    public String updatedPlaylistName = null;
    public String newWebPageName = null;
    public String newGroupPlaylistName = null;
    String toBedeletedPlaylistName = null;


    public ManagePlaylistPage() {

        _commonMethods = new CommonMethods();
    }

    private void switchOnDisplayManagePage() {
        waitForCondition().withTimeoutOf(200).seconds().until(ExpectedConditions.visibilityOf(addFolder));
    }

    public void clickPlayList() throws InterruptedException {
        waitABit(7000);
        playlistOption.click();
    }

    public void clickAddPlayList() throws InterruptedException {
        waitABit(4000);
        addMedia.click();
    }

    public void enterPlayListDetails() throws InterruptedException {
        waitABit(4000);
        newWebPageName = RandomGenerator.generateString(5);
        playListName.click();
        playListName.clear();
        waitABit(5000);
        playListName.sendKeys(newWebPageName);
        waitABit(4000);
        selectMediaShow.click();
        waitABit(4000);
        selectMediaShowType.click();
        waitABit(3000);
        playListName.click();
        waitABit(2000);
        selectPlaylistScreen.click();
        waitABit(2000);
        selectPlaylistScreenType.click();
        waitABit(2000);
        playListName.click();
        waitABit(2000);
        addNewPlayList.click();
    }

    public boolean verifyPlayListName() throws InterruptedException {
        Boolean match = false;

        waitABit(4000);
        myMediaApp.click();
        waitABit(3000);
        for (WebElement newpage : newAddedPlayList) {

            if (newWebPageName.equals(newpage.getText()))

                match = true;
        }
        return match;

    }
    public void clickChangeGroup()throws InterruptedException
    {
        waitABit(4000);
        changeGroupPlayList.click();
    }

    public void clickChangeGroupDetails()throws InterruptedException
    {
        waitABit(4000);
        SelectNewGroup.click();
        waitABit(4000);
        SelectNewGroupType.click();
        waitABit(2000);
        SelectNewGroup.click();
        waitABit(3000);
        addNewGroup.click();
    }

    public boolean validateUpdatedChangeGroupName() {
        Boolean match = false;
        waitABit(20000);
        for (WebElement newgroup : updatedChangeGroupName) {

            if (newGroupPlaylistName.equals(newgroup.getText()))

                match = true;
        }
        return match;

    }

    public void clickEditPlayList() throws InterruptedException {

        waitABit(4000);
        editPlayList.click();
    }

    public void editPlayListDetails() throws InterruptedException {
        waitABit(4000);
        updatedPlaylistName = RandomGenerator.generateString(5);
        playListName.click();
        playListName.clear();
        waitABit(5000);
        playListName.sendKeys(updatedPlaylistName);
        waitABit(4000);
        selectMediaShow.click();
        waitABit(4000);
        selectMediaShowType.click();
        waitABit(3000);
        playListName.click();
        waitABit(2000);
        selectPlaylistScreen.click();
        waitABit(2000);
        selectPlaylistScreenType.click();
        waitABit(2000);
        playListName.click();
        waitABit(2000);
        addNewPlayList.click();

    }

    public boolean validateUpdatedPlayListName() throws InterruptedException {
        Boolean match = false;

        waitABit(4000);
        myMediaApp.click();
        waitABit(3000);
        for (WebElement newpage : newAddedPlayList) {

            if (updatedPlaylistName.equals(newpage.getText()))

                match = true;
        }
        return match;

    }

    public void clickDeletePlaylist() throws InterruptedException {
        waitABit(3000);
        toBedeletedPlaylistName = newAddedPlayList.get(0).getText();
        deletePlayList.click();
        deletePlaylistConfirmation.click();
    }

    public boolean validateDeletedPlaylistName() {
        Boolean match = false;

        waitABit(4000);
        myMediaApp.click();
        waitABit(3000);
        for (WebElement newpage : newAddedPlayList)
        {

            if (toBedeletedPlaylistName.equals(newpage.getText()))

                match = true;
        }
        return match;
    }

    public void clickBroadcasts() throws InterruptedException {
        waitABit(4000);
        broadcastApp.click();
    }

    public void enterBroadcastDetails() throws InterruptedException {
        waitABit(3000);
        addMedia.click();
        waitABit(4000);
        newWebPageName = RandomGenerator.generateString(5);
        BroadcastName.click();
        BroadcastName.clear();
        waitABit(5000);
        BroadcastName.sendKeys(newWebPageName);
        waitABit(4000);
        SelectBroadcastApp.click();
        waitABit(3000);
        SelectBroadcastAppType.click();
        waitABit(3000);
        BroadcastName.click();
        waitABit(3000);
        selectMediaShow.click();
        waitABit(4000);
        selectMediaShowType.click();
        waitABit(3000);
        BroadcastName.click();
        waitABit(2000);
        startDateType.click();
        //startDateType.click();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm aa");
        Date date = new Date();
        String startDate = formatter.format(date.getTime() + 3600000);
        startDateType.sendKeys(startDate);
        waitABit(2000);
        endDateType.click();
        String endDate = formatter.format(date.getTime() + 7200000);
        endDateType.sendKeys(endDate);
        waitABit(2000);
        addBroadcast.click();
    }
    public void enterLiveBroadcastDetails() throws InterruptedException
    {
        waitABit(3000);
        addMedia.click();
        waitABit(4000);
        newWebPageName = RandomGenerator.generateString(5);
        BroadcastName.click();
        BroadcastName.clear();
        waitABit(5000);
        BroadcastName.sendKeys(newWebPageName);
        waitABit(4000);
        SelectBroadcastApp.click();
        waitABit(3000);
        SelectBroadcastAppType.click();
        waitABit(3000);
        BroadcastName.click();
        waitABit(3000);
        selectMediaShow.click();
        waitABit(4000);
        selectMediaShowType.click();
        waitABit(3000);
        BroadcastName.click();
        waitABit(4000);
        dateStart.click();
        waitABit(3000);
        selectDateType.click();
        waitABit(3000);
        BroadcastName.click();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm aa");
        Date date = new Date();
        String startDate = formatter.format(date.getTime() + 300000);
        startDateType.sendKeys(startDate);
        waitABit(2000);
        addBroadcast.click();
    }

    public boolean validateBroadcasts() throws InterruptedException {
        Boolean match = false;

        waitABit(4000);
        mediaApp.click();
        waitABit(3000);
        for (WebElement newpage : newAddedPlayList) {

            if (newWebPageName.equals(newpage.getText()))

                match = true;
        }
        return match;
    }

    public void clickEditBroadcast() throws InterruptedException {
        waitABit(3000);
        broadcastApp.click();
        waitABit(2000);
        editBroadcast.click();
    }

    public void editBroadcastDetails() throws InterruptedException {
        waitABit(4000);
        updatedPlaylistName = RandomGenerator.generateString(5);
        BroadcastName.click();
        BroadcastName.clear();
        waitABit(5000);
        BroadcastName.sendKeys(updatedPlaylistName);
        waitABit(4000);
        SelectBroadcastApp.click();
        waitABit(3000);
        SelectBroadcastAppType.click();
        waitABit(3000);
        BroadcastName.click();
        waitABit(3000);
        selectMediaShow.click();
        waitABit(4000);
        selectMediaShowType.click();
        waitABit(3000);
        BroadcastName.click();
        waitABit(2000);
        addBroadcast.click();

    }

    public boolean validateUpdatedBroadcastName() {

        Boolean match = false;

        waitABit(4000);
        mediaApp.click();
        waitABit(3000);
        for (WebElement newpage : newAddedPlayList) {

            if (updatedPlaylistName.equals(newpage.getText()))

                match = true;
        }
        return match;
    }

    public void clickDeleteBroadcast() throws InterruptedException {
        waitABit(3000);
        broadcastApp.click();
        toBedeletedPlaylistName = newAddedPlayList.get(0).getText();
        deleteBroadcast.click();
    }
    public boolean validateDeletedBroadcastName() {

        Boolean match = false;
        waitABit(4000);
        mediaApp.click();
        waitABit(6000);
        for (WebElement newpage : newAddedPlayList) {

            if (toBedeletedPlaylistName.equals(newpage.getText()))


                match = true;
        }
        return match;
    }

}