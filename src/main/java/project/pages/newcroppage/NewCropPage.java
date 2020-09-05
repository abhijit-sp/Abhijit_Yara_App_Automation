package project.pages.newcroppage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import project.pages.BasePage;

import java.time.temporal.ChronoUnit;

public class NewCropPage extends BasePage {

    public NewCropPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "image_add_crop")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement addCropImage;

    @AndroidFindBy(accessibility = "txt_add_crop_first")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement text1;

    @AndroidFindBy(accessibility = "txt_add_crop_second")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement text2;

    @AndroidFindBy(accessibility = "txt_add_crop_third")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement text3;

    @AndroidFindBy(accessibility = "btnText_add_crop")
    @WithTimeout(time = 3, chronoUnit = ChronoUnit.SECONDS)
    private MobileElement addCropButton;

    public MobileElement getAddCropImage() {
        return addCropImage;
    }

    public MobileElement getText1() {
        return text1;
    }

    public MobileElement getText2() {
        return text2;
    }

    public MobileElement getText3() {
        return text3;
    }

    public MobileElement getAddCropButton() {
        return addCropButton;
    }
}
