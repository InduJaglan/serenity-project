package com.myautomationwork.apps.pages.automationPractice;

import java.util.List;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.myautomationwork.utilities.CommonMethods;
import com.myautomationwork.utilities.RandomGenerator;

import net.thucydides.core.pages.PageObject;

public class ManageDisplayScreensPage extends PageObject {

    @FindBy(xpath = "//*[@class='btn']")
    WebElement addScreen;

    @FindBy(xpath = "//*[@name='displayName']")
    WebElement screenName;

    @FindBy(xpath = "//*[@name='playerType']")
    WebElement selectPlayer;

    @FindBy(xpath = "//*[@value='ADD_DISPLAY_WEB_BROWSER_PLAYER']")
    WebElement selectPlayerType;

    @FindBy(xpath = "//*[contains(@class,'btn add')]")
    WebElement addNewScreen;

    //@FindBy(xpath = "(//button[contains(@class,'btn cancel')])[1]")
   // WebElement cancelScreen;

    @FindBy(xpath = "(//*[@class='dropdown-btn'])[2]")
    WebElement selectPlaylistFolder;

    @FindBy(xpath = "(//*[@class='item2'])[2]")
    WebElement selectPlaylistFolderType;

    @FindBy(xpath = "//*[@class='btn dark-btn']")
    WebElement addFolder;


    @FindBy(xpath = "//*[@name='folderName']")
    WebElement folderName;

    @FindBy(xpath = "//*[@class='dropdown-btn']")
    WebElement selectScreen;

    @FindBy(xpath = "//*[@class='item2']")
    WebElement screenType;

    @FindBy(xpath = "//*[@name='add']")
    WebElement addNewFolder;

    @FindBy(xpath = "//*[contains(@id,'custom-panel-')]//h5")
    List<WebElement> newAddedFolder;

    @FindBy(xpath = "//*[contains(@id,'custom-panel-')]//table//tr//td[1]//a")
    List<WebElement> newAddedScreen;

    @FindBy(xpath = "(//button[contains(@class,'btn view')])[1]")
    WebElement viewAllFolder;

    @FindBy(xpath = "(//button[contains(@class,'btn view')])[2]")
    WebElement viewAllScreen;

    @FindBy(xpath = "//*[@id='custom-panel-0-header']//div/div//button[1]")
    WebElement editFolder;

    @FindBy(xpath = "//*[@id='custom-panel-0-header']//div/div//button[2]")
    WebElement deleteFolder;

    @FindBy(xpath = "//button[contains(@class,'delete')]")
    WebElement deleteFolderConfirmation;

    @FindBy(xpath = "(//button[contains(@class,'btn toggleall')])[2]")
    WebElement CollapseAll;

    @FindBy(xpath = "(//button[contains(@class,'btn toggleall')])[1]")
    WebElement ExpandAll;

    @FindBy(xpath = "//*[@role='tabpanel']")
    WebElement ViewExpandCollapseFolder;

    @FindBy(xpath = "//*[@placeholder='Search']")
    WebElement SearchTextbox;

    @FindBy(xpath ="//*[@class='heading']")
    WebElement pairCode;

    @FindBy(xpath ="//*[@name='displayCode']")
    WebElement activationCode;

    @FindBy(xpath ="(//button[contains(@id,'sidebarCollapse')])[1]")
    WebElement sideBar;

    @FindBy(xpath = "(//*[@class='nav-link ng-tns-c8-0 disabled'])[1]")
    WebElement refreshCode;

    @FindBy(xpath ="(//*[@class='nav-link ng-tns-c8-0'])[2]")
    WebElement rotatePage;

    @FindBy(xpath ="//*[@name='Landscape']")
    WebElement rotateLandscape;

    @FindBy(xpath ="//*[@name='Rotate 90']")
    WebElement rotate90;

    @FindBy(xpath ="//*[@name='Rotate 180']")
    WebElement rotate180;

    @FindBy(xpath ="//*[@name='Rotate 270']")
    WebElement rotate270;

    @FindBy(xpath ="//*[@class='btn cancel px-0']")
    WebElement cancelRotate;

    @FindBy(xpath ="(//*[@class='nav-link ng-tns-c8-0 disabled'])[2]")
    WebElement unpairCode;

    @FindBy(xpath = "//*[@class='inputbox_searchbtn']")
    WebElement SearchResultBtn;

    @FindBy(xpath = "//*[contains(@id,'custom-panel-')]//table//tr//td[4]//a")
    List<WebElement> SearchNextBtn;

    public CommonMethods _commonMethods;

    public String pairCodeValue=null;
    public String newFolderName = null;
    public String newScreenName = null;
    public String updatedFolderName = null;
    public String searchParam = null;
    String toBedeletedFolderName = null;


    public ManageDisplayScreensPage() {

        _commonMethods = new CommonMethods();
    }

    private void switchOnDisplayManagePage() {
        waitForCondition().withTimeoutOf(200).seconds().until(ExpectedConditions.visibilityOf(addFolder));
    }

    public void clickAddScreen() {
        this.switchOnDisplayManagePage();
        addScreen.click();
    }

    public void getPairCode()
    {
        waitABit(5000);
        System.out.println("Pair Code>>"+pairCode.getText());
        pairCodeValue=pairCode.getText();
        _commonMethods.switchToTab("old");
    }

    public void enterScreenDetails() throws InterruptedException {
        newScreenName = RandomGenerator.generateString(5);
        screenName.sendKeys(newScreenName);
        waitABit(5000);
        selectPlayer.click();
        waitABit(2000);
        selectPlayerType.click();
        activationCode.click();
        activationCode.sendKeys(pairCodeValue);
        waitABit(2000);
        selectPlaylistFolder.click();
        waitABit(2000);
        selectPlaylistFolderType.click();
        waitABit(3000);
        addNewScreen.click();
    }

    public void clickAddFolder() throws InterruptedException {
        waitABit(10000);
        addFolder.click();

    }

    public void enterFolderDetails() throws InterruptedException {

        newFolderName = RandomGenerator.generateString(5);
        folderName.sendKeys(newFolderName);
        selectScreen.click();
        waitABit(2000);
        screenType.click();
        waitABit(3000);
        folderName.click();
        waitABit(2000);
        addNewFolder.click();

    }

    public Boolean validateScreenName() throws InterruptedException {
        Boolean match = false;

        waitABit(5000);
        for (int i = 0; i <= 10; i++) {
            if (_commonMethods.isElementPresent(viewAllScreen)) {
                waitABit(2000);
                _commonMethods.scrollToViewElement(viewAllScreen);
                waitABit(2000);
                viewAllScreen.click();
            } else {
                break;
            }
        }
        waitABit(2000);

        for (WebElement newScreen : newAddedScreen) {

            if (newScreenName.equals(newScreen.getText())) {
                match = true;
                break;
            }
        }
        return match;
    }

    public Boolean validateFolderName() throws InterruptedException {
        Boolean match = false;

        waitABit(5000);
        _commonMethods.scrollToViewElement(viewAllFolder);
        waitABit(2000);
        viewAllFolder.click();
        waitABit(2000);
        for (WebElement newFolder : newAddedFolder) {

            if (newFolderName.equals(newFolder.getText())) {
                match = true;
                break;
            }
        }
        return match;
    }

    public void clickEditFolder() throws InterruptedException {
        this.switchOnDisplayManagePage();
        waitABit(2000);
        editFolder.click();

    }

    public void editFolderDetails() throws InterruptedException {

        updatedFolderName = RandomGenerator.generateString(5);
        waitABit(2000);
        folderName.clear();
        waitABit(2000);
        folderName.sendKeys(updatedFolderName);
        waitABit(5000);
        addNewFolder.click();

    }


    public void clickDeleteFolder() throws InterruptedException {
        this.switchOnDisplayManagePage();
        waitABit(2000);
        toBedeletedFolderName = newAddedFolder.get(0).getText();
        deleteFolder.click();
        deleteFolderConfirmation.click();
    }

    public Boolean validateUpdatedFolderName() throws InterruptedException {
        Boolean match = false;

        waitABit(5000);
        _commonMethods.scrollToViewElement(viewAllFolder);
        waitABit(2000);
        viewAllFolder.click();
        waitABit(3000);

        for (WebElement newFolder : newAddedFolder) {

            if (updatedFolderName.equals(newFolder.getText())) {
                match = true;
                break;
            }

        }
        return match;

    }

    public Boolean validateDeletedFolderName() throws InterruptedException {
        Boolean match = false;

        waitABit(5000);
        _commonMethods.scrollToViewElement(viewAllFolder);
        waitABit(2000);
        viewAllFolder.click();
        waitABit(3000);
        for (WebElement newFolder : newAddedFolder) {

            if (toBedeletedFolderName.equals(newFolder.getText()))

                match = true;
        }
        return match;
    }

    public void clickCollapseAll() {
        this.switchOnDisplayManagePage();
        CollapseAll.click();

    }

    public void clickExpandAllButton() {
        this.switchOnDisplayManagePage();
        ExpandAll.click();

    }

    public boolean validateAllFolder() throws InterruptedException {
        waitABit(2000);
        if (_commonMethods.isElementPresent(ViewExpandCollapseFolder))
            return true;
        else
            return false;
    }

    public void enterSearchValue(DataTable dataTable) throws InterruptedException {
        searchParam = dataTable.asMaps(String.class, String.class).get(0).get("searchValue").toString();
        waitABit(7000);
        SearchTextbox.click();
        SearchTextbox.clear();
        waitABit(4000);
        SearchTextbox.sendKeys(searchParam);
    }

    public void clickSearchButton() {
        waitABit(4000);
        SearchResultBtn.click();
    }

    public boolean ValidateSearchScreenData() {
        boolean match = false;
        waitABit(4000);
        for (WebElement newScreen : newAddedScreen) {

            if (searchParam.equals(newScreen.getText()))
                match = true;

            else
                match = false;
        }
        return match;
    }

    public boolean ValidateSecondData() {
        boolean match = false;
        waitABit(6000);
        for (WebElement newScreen : SearchNextBtn) {

            if (searchParam.equals(newScreen.getText()))
                match = true;

            else
                match = false;
        }
        return match;
    }
}
