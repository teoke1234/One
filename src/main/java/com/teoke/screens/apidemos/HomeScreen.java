package com.teoke.screens.apidemos;

import com.codeborne.selenide.appium.AppiumSelectors;
import com.codeborne.selenide.appium.SelenideAppium;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.appium.ScreenObject.screen;

public class HomeScreen {

    private static final By VIEW = AppiumSelectors.byContentDescription("Views");

    public ViewScreen navigateToViewScreen(){
        SelenideAppium.$(VIEW).shouldBe(visible).click();
        return screen(ViewScreen.class);
    }
}
