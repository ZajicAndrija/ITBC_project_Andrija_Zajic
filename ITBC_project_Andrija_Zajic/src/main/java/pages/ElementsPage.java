package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends BasePage{
    private WebElement textBoxButton;

    public ElementsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getTextBoxButton(){
        textBoxButton = getDriver().findElement(By.xpath("//*[@id=\"item-0\"]"));
        return textBoxButton;
    }
    public ElementsPage open(){
        getDriver().get("https://demoqa.com/elements");
        return this;
    }
}
