package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends BasePage{
    private WebElement alertButton;
    private WebElement alertButton5sec;
    public AlertsPage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getAlertButton(){
        alertButton = getDriver().findElement(By.id("alertButton"));
        return alertButton;
    }
    public WebElement getAlertButton5sec(){
        alertButton5sec = getDriver().findElement(By.id("timerAlertButton"));
        return alertButton5sec;
    }
    public AlertsPage popUpMessage(){
        getDriver().switchTo().alert().accept();
        return this;
    }
    public AlertsPage open(){
        getDriver().get("https://demoqa.com/alerts");
        return this;
    }
}
