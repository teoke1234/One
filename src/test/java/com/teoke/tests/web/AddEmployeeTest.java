package com.teoke.tests.web;


import com.teoke.base.WebTestSetup;
import com.teoke.entity.EmployeeDetails;
import com.teoke.entity.LoginDetails;
import com.teoke.page.LoginPage;
import com.teoke.testdata.EmployeeTestData;
import com.teoke.testdata.LoginTestData;
import com.teoke.tags.testtype.WebTest;

public class AddEmployeeTest extends WebTestSetup {

    private final LoginDetails loginDetails = LoginTestData.getEmloyeeDetails();
    private final EmployeeDetails employeeDetails = EmployeeTestData.getRamdomEmployeeDetails();

    @WebTest
    void testAddEmployee(){
        LoginPage.getInstance()
                .loginToApplication(loginDetails)
                .navigateToEmployeeInformationPage()
                .addNewEmployee(employeeDetails)
                .checkWhetherEmployeeCreatedSuccessfully();
    }

}
