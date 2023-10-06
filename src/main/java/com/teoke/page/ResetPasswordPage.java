package com.teoke.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ResetPasswordPage {

    private static final SelenideElement USER_NAME = $(byName("username"));
    private static final SelenideElement RESET_PASSWORD_BUTTON = $(byCssSelector("[type='submit']"));

    private static final ElementsCollection RESET_SUCCESS_MESSAGE = $$(By.xpath("//h6"));
    public ResetPasswordPage resetPassword(){
        USER_NAME.shouldBe(visible).setValue("Admin");
        RESET_PASSWORD_BUTTON.shouldBe(interactable).click();
        return this;
    }

    public void checkWhetherPasswordResetMessageIsDisplayed() {
        RESET_SUCCESS_MESSAGE.get(0).shouldHave(text("Reset Password link sent successfully"));
    }

}
