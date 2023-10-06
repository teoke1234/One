package com.teoke.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.teoke.entity.EmployeeDetails;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EmployeeInformationPage {
    private static final SelenideElement ADD_EMPLOYEE_BUTTON = $(byTagAndText("a", "Add Employee"));

    private static final SelenideElement FIRST_NAME = $(byName("firstName"));
    private static final SelenideElement MIDDLE_NAME = $(byName("middleName"));
    private static final SelenideElement LAST_NAME = $(byName("lastName"));

    private static final SelenideElement SAVE_BUTTON = $(byText("Save"));
    private static final SelenideElement IMAGE = $(byXpath("//input[@type='file']"));
    private static final ElementsCollection SUCCESS_MESSAGE = $$(byText("Success"));

    public EmployeeInformationPage addNewEmployee(EmployeeDetails employeeDetails) {
        ADD_EMPLOYEE_BUTTON.shouldBe(visible).click();
        FIRST_NAME.shouldBe(visible).setValue(employeeDetails.getFirstname());
        MIDDLE_NAME.shouldBe(visible).setValue(employeeDetails.getMiddlename());
        LAST_NAME.shouldBe(visible).setValue(employeeDetails.getLastname());
        IMAGE.shouldBe(enabled).uploadFromClasspath(employeeDetails.getProfilePicturePath());
        SAVE_BUTTON.shouldBe(visible).click();
        return this;
    }

    public void checkWhetherEmployeeCreatedSuccessfully() {
        SUCCESS_MESSAGE.first().shouldHave(visible, text("Success"));
    }
}
