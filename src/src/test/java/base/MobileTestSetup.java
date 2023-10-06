package base;

import com.codeborne.selenide.appium.SelenideAppium;
import org.junit.jupiter.api.BeforeEach;

public class MobileTestSetup {

    @BeforeEach
    void launch(){
        SelenideAppium.launchApp();
    }
}
