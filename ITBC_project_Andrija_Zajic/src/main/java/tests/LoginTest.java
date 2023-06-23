package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void scenario3id001() throws InterruptedException {
        getLoginPage().open().getNewUserButton().click();
        scrollDown(200);
        getLoginPage().fillData();
        getLoginPage().getCaptchaBox().click();
        Thread.sleep(10000);//manuelno resavanje captcha-e
        getLoginPage().getRegisterButton().click();
    }

    @Test
    public void scenario3id002() throws InterruptedException {
        getLoginPage().open()
                .getUserNameField().sendKeys("invalidUserName");
        getLoginPage().getPasswordField().sendKeys("sifraNijeBitna23#");
        getLoginPage().getLoginButton().click();
        scrollDown(100);
        Thread.sleep(2000);
        Assert.assertTrue(getLoginPage().getInvalidMessage().isDisplayed());
    }

    @Test
    public void scenario3id003() throws InterruptedException {
        getLoginPage().open()
                .getUserNameField().sendKeys("Zaja93");
        getLoginPage().getPasswordField().sendKeys("invalidPassword");
        getLoginPage().getLoginButton().click();
        scrollDown(100);
        Thread.sleep(2000);
        Assert.assertTrue(getLoginPage().getInvalidMessage().isDisplayed());
    }

    @Test
    public void scenario3id004(){
        getLoginPage().open()
                .getUserNameField().sendKeys("Zaja93");
        getLoginPage().getPasswordField().sendKeys("sifraNijeBitna23#");
        getLoginPage().getLoginButton().click();
        wait.until(ExpectedConditions.urlContains("profile"));
        Assert.assertTrue(getDriver().getCurrentUrl().contains("profile"));
    }
}
