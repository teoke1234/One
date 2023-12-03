package com.teoke.tests.web;

import com.teoke.base.WebTestSetup;
import com.teoke.page.LoginPage;
import com.teoke.tags.testtype.WebTest;

public class ResetPasswordTest extends WebTestSetup {

    @WebTest
    void testResetPassWord() {
        LoginPage.getInstance()
                .navigateToResetPasswordPage()
                .resetPassword()
                .checkWhetherPasswordResetMessageIsDisplayed();
    }

    @WebTest
    void testResetPassWord1() {
        LoginPage.getInstance()
                .navigateToResetPasswordPage()
                .resetPassword()
                .checkWhetherPasswordResetMessageIsDisplayed();
    }

    @WebTest
    void testResetPassWord2() {
        LoginPage.getInstance()
                .navigateToResetPasswordPage()
                .resetPassword()
                .checkWhetherPasswordResetMessageIsDisplayed();
    }

    @WebTest
    void testResetPassWord3() {
        LoginPage.getInstance()
                .navigateToResetPasswordPage()
                .resetPassword()
                .checkWhetherPasswordResetMessageIsDisplayed();
    }
}
