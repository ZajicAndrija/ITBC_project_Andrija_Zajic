package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    private WebElement elementsButton;
    private WebElement alertsFrameWindowsButton;
    private WebElement bookStoreAppButton;
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getElementsButton(){
        elementsButton = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
        return elementsButton;
    }
    public WebElement getAlertsFrameWindowsButton(){
        alertsFrameWindowsButton = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
        return alertsFrameWindowsButton;
    }
    public WebElement getBookStoreAppButton(){
        bookStoreAppButton = getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]"));
        return bookStoreAppButton;
    }
    public HomePage open(){
        getDriver().get("https://demoqa.com/");
        return this;
    }
}
