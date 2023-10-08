package com.teoke.base;

import com.codeborne.selenide.appium.SelenideAppium;
import org.junit.jupiter.api.BeforeEach;

public class MobileTestSetup extends TestSetup{

    @BeforeEach
    void launch(){
        SelenideAppium.launchApp();
    }
}
