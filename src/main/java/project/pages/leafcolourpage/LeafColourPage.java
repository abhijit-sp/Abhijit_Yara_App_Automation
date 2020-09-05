package project.pages.leafcolourpage;

import framework.utils.wait.WaitHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.NoSuchElementException;
import project.pages.BasePage;

import java.nio.file.NoSuchFileException;
import java.security.SecureRandom;
import java.time.temporal.ChronoUnit;

public class LeafColourPage extends BasePage {

    public LeafColourPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "navBarLeftButton_mockLeafColorScreen")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement closeButton;

    @AndroidFindBy(accessibility = "title_mockLeafColorScreen")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement pageHeading;

    @AndroidFindBy(accessibility = "circledCheck_mockLeafColorScreen_2")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement leafColour_1;

    @AndroidFindBy(accessibility = "circledCheck_mockLeafColorScreen_3")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement leafColour_2;

    @AndroidFindBy(accessibility = "circledCheck_mockLeafColorScreen_4")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement leafColour_3;

    @AndroidFindBy(accessibility = "circledCheck_mockLeafColorScreen_5")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement leafColour_4;

    @AndroidFindBy(accessibility = "circleCheckedImg")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement selectionIndicator;

    @AndroidFindBy(accessibility = "btnText_btnNextLeaf")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement nextLeafButton;

    @AndroidFindBy(accessibility = "btnText_btnDone")
    @WithTimeout(time = 2, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement doneButton;

    public MobileElement getCloseButton() {
        return closeButton;
    }

    public MobileElement getPageHeading() {
        return pageHeading;
    }

    public MobileElement getLeafColour_1() {
        return leafColour_1;
    }

    public MobileElement getLeafColour_2() {
        return leafColour_2;
    }

    public MobileElement getLeafColour_3() {
        return leafColour_3;
    }

    public MobileElement getLeafColour_4() {
        return leafColour_4;
    }

    public MobileElement getSelectionIndicator() {
        return selectionIndicator;
    }

    public MobileElement getNextLeafButton() {
        MobileElement button = null;
        try {
            nextLeafButton.getCenter();
            button = nextLeafButton;
        } catch (NoSuchElementException e){e.printStackTrace();}

        return button;
    }

    public MobileElement getDoneButton() {
        return doneButton;
    }

    public void clickCloseButton(){
        closeButton.click();
    }

    public void clickLeafColour(MobileElement colour){
        colour.click();
    }

    public void selectRandomLeafColour(){
        SecureRandom secureRandom = new SecureRandom();
        int colourIndex = secureRandom.nextInt(4);
        switch (colourIndex){
            case 0 : clickLeafColour(leafColour_1);
            break;
            case 1 : clickLeafColour(leafColour_2);
            break;
            case 2 : clickLeafColour(leafColour_3);
            break;
            case 3 : clickLeafColour(leafColour_4);
            break;
        }
    }

    public void randomlyMakeAll10Selections(){
       for (int i=0; i<10; i++){
           selectRandomLeafColour();
           WaitHelper.sleep(200);
           if (i<9) getNextLeafButton().click();
       }
       getDoneButton().click();
    }
}
