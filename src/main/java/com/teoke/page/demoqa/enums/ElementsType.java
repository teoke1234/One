package com.teoke.page.demoqa.enums;

public enum ElementsType {
    TEXT_BOX("Text Box"),
    CHECK_BOX("Check Box"),
    RADIO_BUTTON("Radio Button"),
    BUTTON("Button"),
    WEB_TABLES("Web Tables"),
    LINK("Link"),
    BROKEN_LINKS("Broken Links - Images"),
    UPLOAD_AND_DOWNLOAD("Upload and Download"),
    DYNAMIC_PROPERTIES("Dynamic Properties");

    private final String elementsName;

    public String getelementsName() {
        return elementsName;
    }

    ElementsType(String elementsName) {
        this.elementsName = elementsName;
    }
}
