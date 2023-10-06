package com.teoke.provider.mobile;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiDemosDemoAndroidProvider implements WebDriverProvider {
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("teoke1");
        options.setApp(System.getProperty("user.dir")+"/apps/ApiDemos-debug.apk");
        options.setUdid("ce061716b8c2b0390d7e"); //ce061716b8c2b0390d7e // R5CT22QF5DD
//        options.doesNoReset(MyDemoApp);
//        options.setFullReset(false);
        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
