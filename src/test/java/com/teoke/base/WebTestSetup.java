package com.teoke.base;

import com.teoke.config.FrameWorkConfig;
import com.teoke.config.factory.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class WebTestSetup extends TestSetup{

    private final static FrameWorkConfig CONFIG = ConfigFactory.config();
    private final static String URL = CONFIG.webURL();

    @BeforeEach
    void setUp() {
        open(URL);
    }

    @AfterEach
    void quit() {
        closeWindow();
        closeWebDriver();
    }
}
