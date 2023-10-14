package com.teoke.page.demoqa.elementspage;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.HoverOptions;
import com.codeborne.selenide.SelenideElement;
import com.teoke.entity.EmployeeDetails;
import com.teoke.ulties.DynamicXpath;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.teoke.ulties.DynamicXpath.*;
import static org.openqa.selenium.By.*;

public final class WebTablesPage {

    private static final SelenideElement ACTION_DELETE = $(xpath("//span[@title='Delete']"));
    private static final SelenideElement NO_ROW_DATA = $(className("rt-noData"));
    private static final SelenideElement ADD_BUTTON = $(id("addNewRecordButton"));
    private static final SelenideElement FIRST_NAME_INPUT = $(xpath("//input[@placeholder='First Name']"));
    private static final SelenideElement LAST_NAME_INPUT = $(xpath("//input[@placeholder='Last Name']"));
    private static final SelenideElement EMAIL_NAME_INPUT = $(xpath("//input[@placeholder='name@example.com']"));
    private static final SelenideElement AGE_NAME_INPUT = $(xpath("//input[@placeholder='Age']"));
    private static final SelenideElement SALARY_NAME_INPUT = $(xpath("//input[@placeholder='Salary']"));
    private static final SelenideElement DEPARTMENT_NAME_INPUT = $(xpath("//input[@placeholder='Department']"));
    private static final SelenideElement SUBMIT = $(id("submit"));

    private static final String TABLE_ROW = "//div[@class='rt-tr-group']";
    private static final String TABLE_COLUMN = "//div[@class='rt-td'][%s]";

    public WebTablesPage deleteData(){
        while (ACTION_DELETE.isDisplayed())
        {
            ACTION_DELETE.click();
        }
        return this;
    }

    public void checkWhetherAllDataIsDeleted(){
        NO_ROW_DATA.shouldBe(Condition.visible);
    }

    public WebTablesPage addEmployee(EmployeeDetails employeeDetails){
        deleteData();
        ADD_BUTTON.should(Condition.visible).click();
        FIRST_NAME_INPUT.shouldBe(Condition.visible).setValue(employeeDetails.getFirstname());
        LAST_NAME_INPUT.shouldBe(Condition.visible).setValue(employeeDetails.getLastname());
        EMAIL_NAME_INPUT.shouldBe(Condition.visible).setValue(employeeDetails.getEmail());
        AGE_NAME_INPUT.shouldBe(Condition.visible).setValue(String.valueOf(employeeDetails.getAge()));
        SALARY_NAME_INPUT.shouldBe(Condition.visible).setValue(String.valueOf(employeeDetails.getSalary()));
        DEPARTMENT_NAME_INPUT.shouldBe(Condition.visible).setValue(String.valueOf(employeeDetails.getDepartment()));
        SUBMIT.shouldBe(Condition.visible).click();
        return this;
    }

    public void checkEmployeeDataInTable(EmployeeDetails employeeDetails){
        $$x(TABLE_ROW).get(0)
                .shouldHave(Condition.text(employeeDetails.getFirstname())
                        ,Condition.text(employeeDetails.getLastname())
                        ,Condition.text(employeeDetails.getEmail())
                        ,Condition.text(String.valueOf(employeeDetails.getAge()))
                        ,Condition.text(String.valueOf(employeeDetails.getSalary()))
                        ,Condition.text(employeeDetails.getDepartment()));
    }

}
