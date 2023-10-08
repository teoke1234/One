package com.teoke.page.demoqa;

import com.teoke.page.demoqa.elementspage.CheckBoxPage;
import com.teoke.page.demoqa.elementspage.RadioButtonPage;
import com.teoke.page.demoqa.elementspage.TextBoxPage;
import com.teoke.page.demoqa.pagecomonent.Elements;

import static com.teoke.page.demoqa.enums.ElementsType.*;

public class ElementsPage {

    private final Elements elements;


    public ElementsPage() {
        this.elements = new Elements();
    }

    public TextBoxPage navigateToTextBoxPage(){
        this.elements.selectComponentOfElements(TEXT_BOX);
        return new TextBoxPage();
    }

    public CheckBoxPage navigateToCheckBoxPage(){
        this.elements.selectComponentOfElements(CHECK_BOX);
        return new CheckBoxPage();
    }

    public RadioButtonPage navigateToRadioButtonPage(){
        this.elements.selectComponentOfElements(RADIO_BUTTON);
        return new RadioButtonPage();
    }

}
