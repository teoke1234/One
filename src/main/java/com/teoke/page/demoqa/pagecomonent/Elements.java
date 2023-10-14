package com.teoke.page.demoqa.pagecomonent;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.teoke.page.demoqa.enums.ElementsType;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public final class Elements {

    public Elements selectComponentOfElements(ElementsType elementsType){
        Selenide.$(byText(elementsType.getelementsName())).shouldBe(Condition.enabled)
                .click();
        return this;
    }

}
