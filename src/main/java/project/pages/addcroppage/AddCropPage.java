package project.pages.addcroppage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.apache.poi.hssf.record.UserSViewEnd;
import project.pages.BasePage;

import java.time.temporal.ChronoUnit;

public class AddCropPage extends BasePage {

    public AddCropPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "navBarLeftButton_nbNavBar")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement backButton;

    @AndroidFindBy(accessibility = "title_nbNavBar")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement pageHeading;

    @AndroidFindBy(accessibility = "subtitle_nbNavBar")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement pageSubHeading;

    @AndroidFindBy(accessibility = "roundedButtonText_nbNavBar")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement saveButton;

    @AndroidFindBy(accessibility = "textInput_txtFarmName")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement farmNameEditTextBox;

    @AndroidFindBy(accessibility = "subText_txtFarmName")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement noFarmNameValidationMessage;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().textContains(\"Non-basmatic\"));")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement riceVariety_nonBasmatic;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().textContains(\"Basmatic\"));")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement riceVariety_basmatic;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().textContains(\"Boro\"));")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement riceVariety_boro;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().textContains(\"Direct-seeded\"));")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement riceVariety_directSeeded;

    @AndroidFindBy(accessibility = "txtDisplayDate_dtSowingdate")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement dateText;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().textContains(\"Long\"));")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement growingPeriod_long;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().textContains(\"Medium\"));")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement growingPeriod_medium;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().textContains(\"Short\"));")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement growingPeriod_shot;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().textContains(\"1 acre\"));")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement farmSize_1Acre;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().textContains(\"1–5 acres\"));")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement farmSize_1to5Acres;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(new UiSelector().textContains(\">5 acres\"));")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement farmSize_moreThan5Acres;


    public MobileElement getBackButton() {
        return backButton;
    }

    public MobileElement getPageHeading() {
        return pageHeading;
    }

    public MobileElement getPageSubHeading() {
        return pageSubHeading;
    }

    public MobileElement getSaveButton() {
        return saveButton;
    }

    public MobileElement getFarmNameEditTextBox() {
        return farmNameEditTextBox;
    }

    public MobileElement getRiceVariety_nonBasmatic() {
        return riceVariety_nonBasmatic;
    }

    public MobileElement getRiceVariety_basmatic() {
        return riceVariety_basmatic;
    }

    public MobileElement getRiceVariety_boro() {
        return riceVariety_boro;
    }

    public MobileElement getRiceVariety_directSeeded() {
        return riceVariety_directSeeded;
    }

    public MobileElement getDateText() {
        return dateText;
    }

    public MobileElement getGrowingPeriod_long() {
        return growingPeriod_long;
    }

    public MobileElement getGrowingPeriod_medium() {
        return growingPeriod_medium;
    }

    public MobileElement getGrowingPeriod_shot() {
        return growingPeriod_shot;
    }

    public MobileElement getFarmSize_1Acre() {
        return farmSize_1Acre;
    }

    public MobileElement getFarmSize_1to5Acres() {
        return farmSize_1to5Acres;
    }

    public MobileElement getFarmSize_moreThan5Acres() {
        return farmSize_moreThan5Acres;
    }

    public MobileElement getNoFarmNameValidationMessage() {
        return noFarmNameValidationMessage;
    }

    public void typeInFarmNameField(String farmName){
        farmNameEditTextBox.sendKeys(farmName);
    }
}
