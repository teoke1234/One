package com.teoke.page;

import com.codeborne.selenide.SelenideElement;
import com.teoke.entity.LoginDetails;

import java.time.Duration;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private LoginPage() {
    }

    public static LoginPage getInstance() {
        return new LoginPage();
    }

    private static final SelenideElement USERNAME = $(byName("username"));
    private static final SelenideElement PASSWORD = $(byAttribute("placeholder", "Password"));
    private static final SelenideElement LOGIN_BUTTON = $("[type='submit']");

    private static final SelenideElement FORGOT_YOUR_PASSWORD = $(withText("Forgot "));

    public HomePage loginToApplication(LoginDetails loginDetails) {
        USERNAME.shouldBe(visible).setValue(loginDetails.getUsername());
        PASSWORD.shouldBe(visible).setValue(loginDetails.getPassword());
        LOGIN_BUTTON.shouldBe(visible).click();
        return new HomePage();
    }

    public ResetPasswordPage navigateToResetPasswordPage(){
        FORGOT_YOUR_PASSWORD.shouldBe(interactable, Duration.ofSeconds(30)).click(usingJavaScript());
        return new ResetPasswordPage();
    }

    public HomePage loginToApplication2(String username, String password) {
        USERNAME.shouldBe(visible).setValue(username);
        PASSWORD.shouldBe(visible).setValue(password);
        LOGIN_BUTTON.shouldBe(visible).click();
        return new HomePage();
    }

}
