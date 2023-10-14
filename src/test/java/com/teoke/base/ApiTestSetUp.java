package com.teoke.base;

import com.teoke.base.TestSetup;
import com.teoke.config.FrameWorkConfig;
import com.teoke.config.factory.ConfigFactory;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class ApiTestSetUp extends TestSetup {

    private static final FrameWorkConfig CONFIG = ConfigFactory.config();

    @BeforeEach
    void apiSetup(){
        RestAssured.baseURI = CONFIG.baseApiUrl();
    }


}
