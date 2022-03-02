package com.myautomationwork.apps.pages.automationPractice;

import com.myautomationwork.utilities.CommonMethods;
import com.myautomationwork.utilities.RandomGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.List;

public class ManageMediaPage<Public, newpageDuration> extends ManageDisplayScreensPage {

    @FindBy(xpath = "(//*[@class='list-item'])[1]")
    WebElement mediaOption;

    @FindBy(xpath = "//button[@class='btn']")
    WebElement addMedia;

    @FindBy(xpath = "//*[@id='ngb-nav-0']")
    WebElement myMediaApp;

    @FindBy(xpath = "//*[@id='ngb-nav-1']")
    WebElement mediaApp;


    //@FindBy(xpath = "(//p[contains(text(),'Add a web')]/parent::div//button")
    //WebElement addWebPage;

    @FindBy(xpath = "(//button[contains(@class,'btn float')])[1]")
    WebElement addWebPage;

    @FindBy(xpath = "//input[@name='title']")
    WebElement webPageName;

    @FindBy(xpath = "//input[@name='url']")
    WebElement newWebPageURL;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement addNewWebPage;

    @FindBy(xpath = "//*[contains(@class,'media-nav-tab-table')]//table//tr//td[1]")
    List<WebElement> newAddedWebPage;

    //@FindBy(xpath = "(//p[contains(text(),'Add a Google')]/parent::div//button")
    //WebElement addGoogleSlides;

    @FindBy(xpath = "(//button[contains(@class,'btn float')])[2]")
    WebElement addGoogleSlides;

    @FindBy(xpath = "(//button[contains(@class,'btn float')])[3]")
    WebElement addImage;

    @FindBy(xpath = "//button[@class='btn btn-sm cancel']")
    WebElement chooseFile;

    @FindBy(xpath = "(//button[contains(@class,'btn float')])[4]")
    WebElement addClock;

    @FindBy(xpath = "(//button[contains(@class,'btn float')])[5]")
    WebElement addPdf;

    @FindBy(xpath = "//*[@name='pageChangeDuration']")
    WebElement pageDuration;

    @FindBy(xpath = "(//input[@name='is24HoursFormat'])[1]")
    WebElement ClockTimeFormat;

    @FindBy(xpath = "(//input[@name='isAutoDetect'])[1]")
    WebElement ClockTimeZone;

    @FindBy(xpath = "(//button[contains(@class,'btn float')])[6]")
    WebElement addWeather;

    @FindBy(xpath = "(//input[@name='temperatureFormat'])[1]")
    WebElement TempFormat;

    @FindBy(xpath = "(//button[contains(@class,'btn float')])[7]")
    WebElement addCanva;

    @FindBy(xpath = "(//button[contains(@class,'btn float')])[8]")
    WebElement addYouTube;

    @FindBy(xpath = "(//button[contains(@class,'btn float')])[9]")
    WebElement addVideo;

    public CommonMethods _commonMethods;
    public String oldName = null;
    public String newWebPageName = null;
    public String newWebPageurl = null;

    public ManageMediaPage() {

        _commonMethods = new CommonMethods();
    }

    private void switchOnDisplayManagePage() {
        waitForCondition().withTimeoutOf(200).seconds().until(ExpectedConditions.visibilityOf(addFolder));
    }

    public void clickMediaOption() throws InterruptedException {
        waitABit(6000);
        this.switchOnDisplayManagePage();
        mediaOption.click();
    }

    public void clickMyMediatab() throws InterruptedException {

        waitABit(3000);
        addMedia.click();

    }

    public Boolean verifyMediaApp() throws InterruptedException {
        waitABit(6000);
        if (mediaApp.getAttribute("aria-selected").equals("true"))
            return true;
        else
            return false;
    }

    public void clickAddWebPage() throws InterruptedException {
        waitABit(3000);
        addWebPage.click();
    }

    public void enterAppDetails() throws InterruptedException {
        waitABit(4000);
        newWebPageName = RandomGenerator.generateString(5);
        webPageName.click();
        webPageName.clear();
        waitABit(5000);
        webPageName.sendKeys(newWebPageName);
        newWebPageurl = "https://www." + RandomGenerator.generateString(10) + "@automation.com";
        newWebPageURL.sendKeys(newWebPageurl);
        waitABit(4000);
        selectScreen.click();
        waitABit(2000);
        screenType.click();
        waitABit(2000);
        webPageName.click();
        waitABit(2000);
        addNewWebPage.click();
    }

    public Boolean verifyWebPage() throws InterruptedException {
        Boolean match = false;

        waitABit(6000);
        myMediaApp.click();
        waitABit(2000);
        for (WebElement newpage : newAddedWebPage) {

            if (newWebPageName.equals(newpage.getText()))

                match = true;
        }
        return match;
    }

    public void clickAddGoogleSlides() throws InterruptedException {
        waitABit(3000);
        addGoogleSlides.click();
    }

    public void clickAddImage() throws InterruptedException {
        waitABit(2000);
        addImage.click();
    }

    public void addImageDetails() throws InterruptedException, AWTException {

        waitABit(2000);
        newWebPageName = RandomGenerator.generateString(5);
        webPageName.click();
        webPageName.clear();
        waitABit(2000);
        webPageName.sendKeys(newWebPageName);
        chooseFile.click();
        waitABit(2000);
        StringSelection s = new StringSelection(System.getProperty("user.dir") + "\\" + "fileAttachments" + "\\" + "DNow.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Robot robot = new Robot();
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
        robot.keyPress(java.awt.event.KeyEvent.VK_V);
        robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
        waitABit(3000);
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        waitABit(2000);
        selectScreen.click();
        waitABit(2000);
        screenType.click();
        waitABit(2000);
        webPageName.click();
        waitABit(2000);
        addNewWebPage.click();

    }

    public void clickAddPdf() throws InterruptedException {
        waitABit(3000);
        _commonMethods.scrollDown();
        waitABit(3000);
        addPdf.click();
    }

    public void addPdfDetails() throws InterruptedException, AWTException {

        waitABit(2000);
        newWebPageName = RandomGenerator.generateString(5);
        webPageName.click();
        webPageName.clear();
        waitABit(2000);
        webPageName.sendKeys(newWebPageName);
        chooseFile.click();
        waitABit(2000);
        StringSelection s = new StringSelection(System.getProperty("user.dir") + "\\" + "fileAttachments" + "\\" + "sample.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Robot robot = new Robot();
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
        robot.keyPress(java.awt.event.KeyEvent.VK_V);
        robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
        waitABit(3000);
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        waitABit(2000);
        pageDuration.click();
        pageDuration.clear();
        waitABit(2000);
        pageDuration.sendKeys("2");
        selectScreen.click();
        waitABit(2000);
        screenType.click();
        waitABit(2000);
        webPageName.click();
        waitABit(2000);
        addNewWebPage.click();
        waitABit(2000);
        _commonMethods.scrollUp();
        waitABit(2000);
        _commonMethods.scrollUp();
    }

    public void clickAddClock() throws InterruptedException {
        waitABit(2000);
        _commonMethods.scrollDown();
        waitABit(3000);
        addClock.click();
    }

    public void addClockDetails() throws InterruptedException {
        waitABit(4000);
        newWebPageName = RandomGenerator.generateString(5);
        webPageName.click();
        webPageName.clear();
        waitABit(5000);
        webPageName.sendKeys(newWebPageName);
        waitABit(4000);
        ClockTimeFormat.click();
        waitABit(2000);
        ClockTimeZone.click();
        waitABit(2000);
        selectScreen.click();
        waitABit(2000);
        screenType.click();
        waitABit(2000);
        webPageName.click();
        waitABit(2000);
        addNewWebPage.click();
        waitABit(2000);
        _commonMethods.scrollUp();
    }

    public void clickAddWeather() throws InterruptedException {
        waitABit(2000);
        _commonMethods.scrollDown();
        waitABit(3000);
        addWeather.click();
    }

    public void addWeatherDetails() throws InterruptedException {
        waitABit(4000);
        newWebPageName = RandomGenerator.generateString(5);
        webPageName.click();
        webPageName.clear();
        waitABit(5000);
        webPageName.sendKeys(newWebPageName);
        waitABit(4000);
        TempFormat.click();
        waitABit(2000);
        selectScreen.click();
        waitABit(2000);
        screenType.click();
        waitABit(2000);
        webPageName.click();
        waitABit(2000);
        addNewWebPage.click();
        waitABit(2000);
        _commonMethods.scrollUp();
    }

    public void clickAddCanva() throws InterruptedException {
        waitABit(2000);
        _commonMethods.scrollDown();
        waitABit(2000);
        _commonMethods.scrollDown();
        waitABit(3000);
        addCanva.click();
    }

    public void addCanvaDetails() throws InterruptedException {
        waitABit(4000);
        newWebPageName = RandomGenerator.generateString(5);
        webPageName.click();
        webPageName.clear();
        waitABit(5000);
        webPageName.sendKeys(newWebPageName);
        newWebPageurl = "https://www." + RandomGenerator.generateString(10) + "@automation.com";
        newWebPageURL.sendKeys(newWebPageurl);
        waitABit(4000);
        selectScreen.click();
        waitABit(2000);
        screenType.click();
        waitABit(2000);
        webPageName.click();
        waitABit(2000);
        addNewWebPage.click();
        waitABit(2000);
        _commonMethods.scrollUp();
        waitABit(2000);
        _commonMethods.scrollUp();
    }

    public void clickAddYouTube() throws InterruptedException {
        waitABit(2000);
        _commonMethods.scrollDown();
        waitABit(2000);
        _commonMethods.scrollDown();
        waitABit(3000);
        addYouTube.click();
    }


    public void addYouTubeDetails() throws InterruptedException {
        waitABit(4000);
        newWebPageName = RandomGenerator.generateString(5);
        webPageName.click();
        webPageName.clear();
        waitABit(5000);
        webPageName.sendKeys(newWebPageName);
        newWebPageurl = "https://www." + RandomGenerator.generateString(10) + "@automation.com";
        newWebPageURL.sendKeys(newWebPageurl);
        waitABit(4000);
        selectScreen.click();
        waitABit(2000);
        screenType.click();
        waitABit(2000);
        webPageName.click();
        waitABit(2000);
        addNewWebPage.click();
        waitABit(2000);
        _commonMethods.scrollUp();
        waitABit(2000);
        _commonMethods.scrollUp();

    }

    public void clickAddVideo() throws InterruptedException {
        waitABit(2000);
        _commonMethods.scrollDown();
        waitABit(3000);
        _commonMethods.scrollDown();
        waitABit(3000);
        _commonMethods.scrollDown();
        waitABit(3000);
        addVideo.click();
    }

    public void addVideoDetails() throws InterruptedException, AWTException {
        waitABit(2000);
        newWebPageName = RandomGenerator.generateString(5);
        webPageName.click();
        webPageName.clear();
        waitABit(2000);
        webPageName.sendKeys(newWebPageName);
        chooseFile.click();
        waitABit(6000);
        StringSelection s = new StringSelection(System.getProperty("user.dir") + "\\" + "fileAttachments" + "\\" + "Flower.mp4");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
        Robot robot = new Robot();
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
        robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
        robot.keyPress(java.awt.event.KeyEvent.VK_V);
        robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
        waitABit(4000);
        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
        waitABit(2000);
        selectScreen.click();
        waitABit(2000);
        screenType.click();
        waitABit(2000);
        webPageName.click();
        waitABit(2000);
        addNewWebPage.click();
        waitABit(2000);
        _commonMethods.scrollUp();
        waitABit(2000);
        _commonMethods.scrollUp();
        waitABit(2000);
        _commonMethods.scrollUp();
    }

}