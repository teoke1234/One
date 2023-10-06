package com.teoke.screens.apidemos;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.appium.SelenideAppium;

import static com.codeborne.selenide.appium.ScreenObject.screen;

public class ViewScreen {

    private static final String WEBVIEW3 = "//android.widget.TextView[@content-desc=\"WebView3\"]";

    public ViewScreen scrollToBottomAndVerifyWebView3Displayed(){
        SelenideAppium.$x(WEBVIEW3)
                .scrollTo()
                .shouldBe(Condition.visible);
        return screen(ViewScreen.class);
    }
}
