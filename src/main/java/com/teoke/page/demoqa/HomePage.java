package com.teoke.page.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private HomePage(){}

    public static HomePage getInstance() {
        return new HomePage();
    }
    private static final SelenideElement ELEMENTS = $(byText("Elements"));

    public ElementsPage navigateToElementsPage(){
        $(ELEMENTS).scrollTo()
                .shouldBe(visible)
                .click();
        return new ElementsPage();

    }

}
