package project.pages.howtousleafcolourchartpage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import project.pages.BasePage;

import java.time.temporal.ChronoUnit;

public class HowToUseLeafColourChartPage extends BasePage {

    public HowToUseLeafColourChartPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "btnText_skipButton")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement skipButton;

    @AndroidFindBy(accessibility = "btnText_nextButton")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement nextButton;

    public MobileElement getSkipButton() {
        return skipButton;
    }

    public MobileElement getNextButton() {
        return nextButton;
    }
}
