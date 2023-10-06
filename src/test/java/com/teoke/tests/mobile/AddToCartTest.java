package com.teoke.tests.mobile;

import com.codeborne.selenide.appium.ScreenObject;
import com.teoke.base.MobileTestSetup;
import com.teoke.screens.mydemo.HomeScreen;
import com.teoke.tags.testtype.MobileTest;

import static com.codeborne.selenide.appium.ScreenObject.screen;

public class AddToCartTest extends MobileTestSetup {

    @MobileTest
    void addToCartTest(){
        HomeScreen homeScreen = screen(HomeScreen.class);

        homeScreen
                .navigateToViewScreen()
                .checkWhetherAddToCartButtonIsPresent();

    }
}
