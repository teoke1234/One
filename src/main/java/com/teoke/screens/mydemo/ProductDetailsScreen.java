package com.teoke.screens.mydemo;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.appium.AppiumSelectors;
import com.codeborne.selenide.appium.selector.CombinedBy;
import com.teoke.screens.apidemos.ViewScreen;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductDetailsScreen {

    @AndroidFindBy(accessibility = "Add To Cart button")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Add To Cart'")
    private WebElement addToCart;

    private static final CombinedBy ADD_TO_CART_BUTTON = CombinedBy.android(AppiumBy.accessibilityId("Add To Cart button"))
            .ios(AppiumBy.iOSNsPredicateString("label == 'Add To Cart'"));

    public void checkWhetherAddToCartButtonIsPresent() {
        $(ADD_TO_CART_BUTTON).shouldBe(visible).click();
    }
}
