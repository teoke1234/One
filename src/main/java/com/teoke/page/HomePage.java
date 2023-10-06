package com.teoke.page;

import com.teoke.page.pagecomponent.LeftMenuComponent;

import static com.teoke.page.enums.LeftMenuComponentType.*;

public class HomePage {

    private final LeftMenuComponent leftMenuComponent;


    public HomePage() {
        this.leftMenuComponent = new LeftMenuComponent();
    }

    public LeftMenuComponent getLeftMenuComponent() {
        return leftMenuComponent;
    }

    public EmployeeInformationPage navigateToEmployeeInformationPage() {
        this.leftMenuComponent.selectAMenuFromLeftMenuBar(PIM);
        return new EmployeeInformationPage();
    }

}

