package com.teoke.page.demoqa.elementspage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.teoke.entity.EmployeeDetails;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

public final class RadioButtonPage {

    private static final SelenideElement YES = $(byText("Yes"));
    private static final SelenideElement YES_BUTTON = $(id("yesRadio"));
    private static final SelenideElement IMPRESSIVE_BUTTON = $(id("impressiveRadio"));
    private static final SelenideElement IMPRESSIVE = $(byText("Impressive"));
    private static final SelenideElement NO = $(id("noRadio"));
    private static final SelenideElement RESULT = $(className("text-success"));

    public void checkYesAndCheckWhetherChecked(){
        YES.click();
        YES_BUTTON.shouldBe(Condition.selected);
    }

    public void checkImpressiveAndCheckWhetherChecked(){
        IMPRESSIVE.shouldHave(Condition.interactable).click();
        IMPRESSIVE_BUTTON.shouldBe(Condition.selected);
    }

    public void checkWhetherNoIsDisable(){
        NO.shouldBe(Condition.disabled);
    }

}
