import dataproviders.TestData;
import framework.utils.wait.WaitHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.addcroppage.AddCropPage;
import project.pages.howtousleafcolourchartpage.HowToUseLeafColourChartPage;
import project.pages.leafcolourpage.LeafColourPage;
import project.pages.newcroppage.NewCropPage;
import project.pages.selectlanguage.SelectLanguagePage;
import project.pages.welcomepage.WelcomePage;

import java.io.IOException;

public class YaraTests extends BaseTest {

    // Verify UI elements and text on the select language page
    @Test(priority = 0, dataProviderClass = TestData.class, dataProvider = "selectLanguagePageData")
    public void verifySelectLanguagePage(
            String pageHeading
            , String pageSubHeading
            , String englishText
            , String englishButtonText
            , String hindiText
            , String hindiSubText
            , String hindiButtonText
            , String tamilText
            , String tamilSubText
            , String tamilButtonText) throws IOException {
        SelectLanguagePage selectLanguagePage = new SelectLanguagePage(driver);
        Assert.assertEquals(selectLanguagePage.getPageHeading().getText(), pageHeading);
        Assert.assertEquals(selectLanguagePage.getPageSubHeading().getText(), pageSubHeading);
        Assert.assertEquals(selectLanguagePage.getEnglishTitle().getText(), englishText);
        Assert.assertEquals(selectLanguagePage.getEnglishSelectButton().getText(), englishButtonText);
        Assert.assertEquals(selectLanguagePage.getHindiTitle().getText(), hindiText);
        Assert.assertEquals(selectLanguagePage.getHindiSubTitle().getText(), hindiSubText);
        Assert.assertEquals(selectLanguagePage.getHindiSelectButton().getText(), hindiButtonText);
        Assert.assertEquals(selectLanguagePage.getTamilTitle().getText(), tamilText);
        Assert.assertEquals(selectLanguagePage.getTamilSubTitle().getText(), tamilSubText);
        Assert.assertEquals(selectLanguagePage.getTamilSelectButton().getText(), tamilButtonText);
    }

    // Verify if Welcome page is displayed when a language is selected.
    @Test(priority = 1)
    public void verifySelectingEnglishLanguage() {
        SelectLanguagePage selectLanguagePage = new SelectLanguagePage(driver);
        selectLanguagePage.getEnglishSelectButton().click();
        Assert.assertTrue(new WelcomePage(driver).getWelcomeMessage1().isDisplayed());
    }

    // Verify Welcome page elements and their text.
    @Test(priority = 2, dataProviderClass = TestData.class, dataProvider = "welcomePageData")
    public void verifyWelcomePage(
            String message1
            , String message2
            , String subMessage
            , String buttonText) {
        System.out.println("Button TEXT+"+buttonText);
        WelcomePage welcomePage = new WelcomePage(driver);
        Assert.assertEquals(welcomePage.getWelcomeMessage1().getText(), message1);
        Assert.assertEquals(welcomePage.getWelcomeMessage2().getText(), message2);
        Assert.assertEquals(welcomePage.getWelcomeSubMessage().getText(), subMessage);
        Assert.assertEquals(welcomePage.getAgreeAndContinueButton().getText(), buttonText);
    }

    // Verify if New Crop page is displayed when Agree & Continue button is clicked
    @Test(priority = 3)
    public void verifyClickingOnAgreeAndContinue() {
       new WelcomePage(driver).getAgreeAndContinueButton().click();
       Assert.assertTrue(new NewCropPage(driver).getAddCropButton().isDisplayed());
    }

    // Verify UI elements and text on the new crop page
    @Test(priority = 4, dataProviderClass = TestData.class, dataProvider = "newCropPageData")
    public void verifyNewCropPage(
            String text1
            , String text2
            , String text3
            , String buttonText) throws IOException {
        NewCropPage newCropPage = new NewCropPage(driver);
        Assert.assertTrue(newCropPage.getAddCropImage().isDisplayed());
        Assert.assertEquals(newCropPage.getText1().getText(), text1);
        Assert.assertEquals(newCropPage.getText2().getText(), text2);
        Assert.assertEquals(newCropPage.getText3().getText(), text3);
        Assert.assertEquals(newCropPage.getAddCropButton().getText(), buttonText);
    }

    // Verify if clicking on add crop button takes the user to the Add Crop page
    @Test(priority = 5)
    public void verifyClickingOnAddCropButton() {
        new NewCropPage(driver).getAddCropButton().click();
        Assert.assertTrue(new AddCropPage(driver).getPageHeading().isDisplayed());
    }

    // Verify if validation message is displayed when save is clicked without entering farm name.
    @Test(priority = 6)
    public void verifyAddingACropWithoutFarmName(){
        AddCropPage addCropPage = new AddCropPage(driver);
        addCropPage.getSaveButton().click();
        Assert.assertTrue(addCropPage.getNoFarmNameValidationMessage().isDisplayed());
        addCropPage.getBackButton().click();
        new NewCropPage(driver).getAddCropButton().click();
    }

    // Verify Adding a crop and doing a sample.
    @Test(priority = 7)
    public void addCropWithDefaultValuesAndDoLeafSampling(){
        AddCropPage addCropPage = new AddCropPage(driver);
        addCropPage.typeInFarmNameField("Abhijit's Farm");
        addCropPage.getFarmSize_moreThan5Acres().click();
        addCropPage.getSaveButton().click();
        HowToUseLeafColourChartPage howToUseLeafColourChartPage = new HowToUseLeafColourChartPage(driver);
        howToUseLeafColourChartPage.getSkipButton().click();
        LeafColourPage leafColourPage = new LeafColourPage(driver);
        leafColourPage.randomlyMakeAll10Selections();
        leafColourPage.clickCloseButton();
    }
}
