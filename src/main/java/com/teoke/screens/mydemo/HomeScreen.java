package com.teoke.screens.mydemo;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.appium.AppiumSelectors;
import com.codeborne.selenide.appium.SelenideAppium;
import com.teoke.screens.apidemos.ViewScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.appium.ScreenObject.screen;

public class HomeScreen {

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"store item\"])[1]")
    private WebElement product;

    public ProductDetailsScreen navigateToViewScreen() {
        $(product).shouldBe(visible).click();
        return screen(ProductDetailsScreen.class);
    }
}
