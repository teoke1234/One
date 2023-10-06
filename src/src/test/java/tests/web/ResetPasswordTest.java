package tests.web;

import base.WebTestSetup;
import com.teoke.page.LoginPage;
import tags.testtype.WebTest;

public class ResetPasswordTest extends WebTestSetup {

    @WebTest
    void testResetPassWord() {
        LoginPage.getInstance()
                .navigateToResetPasswordPage()
                .resetPassword()
                .checkWhetherPasswordResetMessageIsDisplayed();
    }
}
