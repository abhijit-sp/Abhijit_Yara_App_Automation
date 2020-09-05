package project.pages.selectlanguage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import project.pages.BasePage;

import java.time.temporal.ChronoUnit;

public class SelectLanguagePage extends BasePage {

    public SelectLanguagePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "title_nav_bar_select_language")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement pageHeading;

    @AndroidFindBy(accessibility = "please_sel_language")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement pageSubHeading;

    //English Language Elements
    @AndroidFindBy(accessibility = "title_select_language_en")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement englishTitle;

    @AndroidFindBy(accessibility = "btnText_Select_select_language_en")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement englishSelectButton;

    //Hindi Language Elements
    @AndroidFindBy(accessibility = "title_select_language_hi")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement hindiTitle;

    @AndroidFindBy(accessibility = "subTitle_select_language_hi")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement hindiSubTitle;

    @AndroidFindBy(accessibility = "btnText_Select_select_language_hi")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement hindiSelectButton;

    //Tamil Language Elements
    @AndroidFindBy(accessibility = "title_select_language_ta")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement tamilTitle;

    @AndroidFindBy(accessibility = "subTitle_select_language_ta")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement tamilSubTitle;

    @AndroidFindBy(accessibility = "btnText_Select_select_language_ta")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement tamilSelectButton;

    public MobileElement getPageHeading() {
        return pageHeading;
    }

    public MobileElement getPageSubHeading() {
        return pageSubHeading;
    }

    public MobileElement getEnglishTitle() {
        return englishTitle;
    }

    public MobileElement getEnglishSelectButton() {
        return englishSelectButton;
    }

    public MobileElement getHindiTitle() {
        return hindiTitle;
    }

    public MobileElement getHindiSubTitle() {
        return hindiSubTitle;
    }

    public MobileElement getHindiSelectButton() {
        return hindiSelectButton;
    }

    public MobileElement getTamilTitle() {
        return tamilTitle;
    }

    public MobileElement getTamilSubTitle() {
        return tamilSubTitle;
    }

    public MobileElement getTamilSelectButton() {
        return tamilSelectButton;
    }
}
