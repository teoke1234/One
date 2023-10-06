package tests.mobile;

import base.MobileTestSetup;
import com.codeborne.selenide.appium.ScreenObject;
import com.teoke.screens.apidemos.HomeScreen;
import tags.testtype.MobileTest;

public class ApiDemosTest extends MobileTestSetup {

    @MobileTest
    void scrollToElement(){
        HomeScreen homeScreen = ScreenObject.screen(HomeScreen.class);

        homeScreen.navigateToViewScreen()
                .scrollToBottomAndVerifyWebView3Displayed();
    }
}
