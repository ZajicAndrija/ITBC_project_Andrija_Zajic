package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTest{

    @Test
    public void scenario2id001() {
        getAlertsPage().open().getAlertButton().click();
        wait.until(ExpectedConditions.alertIsPresent());
        getAlertsPage().popUpMessage();
        }

    @Test
    public void scenario2id002(){
        getAlertsPage().open().getAlertButton5sec().click();
        wait.until(ExpectedConditions.alertIsPresent());
        getAlertsPage().popUpMessage();
    }
}
