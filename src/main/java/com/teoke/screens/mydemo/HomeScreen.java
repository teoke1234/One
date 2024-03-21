package com.teoke.screens.mydemo;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.appium.ScreenObject.screen;

public class HomeScreen {

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"store item\"])[1]")
    private WebElement product;

    private final By products = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='store item']");

    public ProductDetailsScreen navigateToViewScreen(int productIndex) {
//        $(product).shouldBe(visible).click();
        $$(products).get(productIndex).click();
        return screen(ProductDetailsScreen.class);
    }
}
