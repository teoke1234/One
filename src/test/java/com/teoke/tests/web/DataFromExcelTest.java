//package com.teoke.tests.web;
//
//import com.teoke.base.WebTestSetup;
//import com.teoke.page.LoginPage;
//import com.teoke.screens.mydemo.HomeScreen;
//import com.teoke.tags.testtype.MobileTest;
//import com.teoke.testdata.TestData;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.MethodSource;
//
//public class DataFromExcelTest extends WebTestSetup{
//
//    @MobileTest
//    @ParameterizedTest(name = "fromExcel")
//    void fromExcel(TestData testData){
//        LoginPage.getInstance()
//                .loginToApplication2(testData.getUsername(),testData.getPassword());
//    }
//
//    @MobileTest
//    @ParameterizedTest(name = "fromExcel2")
//    void fromExcel2(TestData testData){
//        LoginPage.getInstance()
//                .loginToApplication2(testData.getUsername(),testData.getPassword());
//    }
//}
