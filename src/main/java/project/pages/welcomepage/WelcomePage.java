package project.pages.welcomepage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import project.pages.BasePage;

import java.time.temporal.ChronoUnit;

public class WelcomePage extends BasePage {

    public WelcomePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "text_welcome_to")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement welcomeMessage1;

    @AndroidFindBy(accessibility = "txtLeafColorChart")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement welcomeMessage2;

    @AndroidFindBy(accessibility = "txt_smart_way_to_measure")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement welcomeSubMessage;

    @AndroidFindBy(accessibility = "btnText_welcome_screen_continue")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement agreeAndContinueButton;

    public MobileElement getWelcomeMessage1() {
        return welcomeMessage1;
    }

    public MobileElement getWelcomeMessage2() {
        return welcomeMessage2;
    }

    public MobileElement getWelcomeSubMessage() {
        return welcomeSubMessage;
    }

    public MobileElement getAgreeAndContinueButton() {
        return agreeAndContinueButton;
    }
}
