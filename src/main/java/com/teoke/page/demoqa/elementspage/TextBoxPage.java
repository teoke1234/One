package com.teoke.page.demoqa.elementspage;

import com.codeborne.selenide.ClickMethod;
import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.teoke.entity.EmployeeDetails;
import com.teoke.page.demoqa.ElementsPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.*;

public class TextBoxPage {

    private static final SelenideElement FULL_NAME = $(id("userName"));
    private static final SelenideElement EMAIL = $(id("userEmail"));
    private static final SelenideElement CURRENT_ADDRESS = $(id("currentAddress"));
    private static final SelenideElement PERMANENT_ADDRESS = $(id("permanentAddress"));
    private static final SelenideElement SUBMIT_BUTTON = $(id("submit"));

    private static final SelenideElement OUTPUT_BOX = $(id("output"));

    public TextBoxPage fillInfomation(EmployeeDetails employeeDetails){
        FULL_NAME.shouldBe(Condition.visible).setValue(employeeDetails.getMiddlename()+employeeDetails.getFirstname());
        EMAIL.shouldBe(Condition.visible).setValue(employeeDetails.getEmail());
        CURRENT_ADDRESS.shouldBe(Condition.visible).setValue(employeeDetails.getAddress());
        PERMANENT_ADDRESS.shouldBe(Condition.visible).setValue(employeeDetails.getAddress());
        SUBMIT_BUTTON.scrollTo().shouldHave(Condition.visible).click();
        return this;

    }

    public void checkWhetherOutputHavingInformation(){
        OUTPUT_BOX.shouldHave(Condition.and("All information",
                Condition.text("Name:"),
                Condition.text("Email:"),
                Condition.text("Current Address :"),
                Condition.text("Permananet Address :")));
    }

}
