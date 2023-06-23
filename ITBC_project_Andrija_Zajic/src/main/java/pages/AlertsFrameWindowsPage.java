package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsFrameWindowsPage extends BasePage{

    private WebElement alertsButton;
    public AlertsFrameWindowsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getAlertsButton(){
        alertsButton = getDriver().findElement(By.xpath("//*[@id=\"item-1\"]"));
        return alertsButton;
    }
}
