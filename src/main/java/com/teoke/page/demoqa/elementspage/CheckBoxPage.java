package com.teoke.page.demoqa.elementspage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.teoke.entity.EmployeeDetails;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

public class CheckBoxPage {

    private static final SelenideElement CHECK_BOX = $(className("rct-checkbox"));
    private static final SelenideElement RESULT = $(id("result"));

    public CheckBoxPage checkBox(){
        CHECK_BOX.shouldHave(Condition.visible).click();
        return this;

    }

    public void checkWhetherCheckBoxIsChecked(){
        RESULT.shouldBe(Condition.text("You have selected :\n"));
    }

}
