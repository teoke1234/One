package tests.web;


import base.WebTestSetup;
import com.teoke.entity.EmployeeDetails;
import com.teoke.entity.LoginDetails;
import com.teoke.page.LoginPage;
import tags.testtype.WebTest;
import testdata.EmployeeTestData;
import testdata.LoginTestData;

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
