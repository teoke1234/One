package com.teoke.page.pagecomponent;

import com.teoke.page.enums.LeftMenuComponentType;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LeftMenuComponent {
    public LeftMenuComponent selectAMenuFromLeftMenuBar(LeftMenuComponentType menuType) {
        $(byText(menuType.getMenuName())).shouldBe(enabled)
                .click();
        return this;
    }

}
