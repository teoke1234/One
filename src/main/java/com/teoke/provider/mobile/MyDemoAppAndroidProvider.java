package com.teoke.provider.mobile;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class MyDemoAppAndroidProvider implements WebDriverProvider {
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("teoke2");
        options.setApp(System.getProperty("user.dir")+"/apps/Android-MyDemoAppRN.1.3.0.build-244.apk");
//        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
//        options.setPlatformName("android");
//        options.setPlatformName("Android");
//        options.setPlatformVersion("7.1.1");
        options.setUdid("R5CT22QF5DD"); //ce061716b8c2b0390d7e // R5CT22QF5DD
//        options.doesNoReset(MyDemoApp);
//        options.setFullReset(false);
        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
