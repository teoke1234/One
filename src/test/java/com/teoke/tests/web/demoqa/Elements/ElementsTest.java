package com.teoke.tests.web.demoqa.Elements;


import com.codeborne.selenide.*;
import com.teoke.base.WebTestSetup;
import com.teoke.entity.EmployeeDetails;
import com.teoke.page.demoqa.HomePage;
import com.teoke.page.demoqa.elementspage.WebTablesPage;
import com.teoke.tags.testtype.DemoQATest;
import com.teoke.tags.testtype.WebTest;
import com.teoke.testdata.EmployeeTestData;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.codeborne.selenide.DragAndDropOptions.*;
import static com.codeborne.selenide.Selectors.*;

@DemoQATest
public class ElementsTest extends WebTestSetup{

    private final EmployeeDetails employeeDetails = EmployeeTestData.getRamdomEmployeeDetails();

    @WebTest
    void testElementTextBox(){
        HomePage.getInstance()
                .navigateToElementsPage()
                .navigateToTextBoxPage()
                .fillInfomation(employeeDetails)
                .checkWhetherOutputHavingInformation();
    }

    @WebTest
    void testElementCheckBox(){
        HomePage.getInstance()
                .navigateToElementsPage()
                .navigateToCheckBoxPage()
                .checkBox()
                .checkWhetherCheckBoxIsChecked();
    }

    @WebTest
    void testElementRadioYesButton(){
        HomePage.getInstance()
                .navigateToElementsPage()
                .navigateToRadioButtonPage()
                .checkYesAndCheckWhetherChecked();
    }

    @WebTest
    void testElementRadioNoButton(){
        HomePage.getInstance()
                .navigateToElementsPage()
                .navigateToRadioButtonPage()
                .checkWhetherNoIsDisable();
    }

    @WebTest
    void testElementWebTables(){
        HomePage.getInstance()
                .navigateToElementsPage()
                .navigateToRadioButtonPage()
                .checkImpressiveAndCheckWhetherChecked();
    }

    @WebTest
    void testElementRadioImpresiveButton(){
        HomePage.getInstance()
                .navigateToElementsPage()
                .navigateToRadioButtonPage()
                .checkImpressiveAndCheckWhetherChecked();
    }

    @WebTest
    void testElementWebtableDeleteData(){
        HomePage.getInstance()
                .navigateToElementsPage()
                .navigateToWebTablesPage()
                .deleteData()
                .checkWhetherAllDataIsDeleted();
    }

    @WebTest
    void testElementWebtableAddEmployee(){
        HomePage.getInstance()
                .navigateToElementsPage()
                .navigateToWebTablesPage()
                .addEmployee(employeeDetails)
                .checkEmployeeDataInTable(employeeDetails);

    }

}


