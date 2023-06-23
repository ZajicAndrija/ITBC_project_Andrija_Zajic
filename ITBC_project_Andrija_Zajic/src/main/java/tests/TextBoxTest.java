package tests;


import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest{

    @Test
    public void scenario1id001(){
        getTextBoxPage().open();
        scrollDown(270);
        getTextBoxPage().getSubmitButton().click();
    }

    @Test
    public void scenario1id002(){
        getTextBoxPage().open();
        scrollDown(270);
        getTextBoxPage().fillTextBox();
        getTextBoxPage().checkData();
    }
}
