package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStoreAppPage extends BasePage{
    private WebElement loginButton;

    public BookStoreAppPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getLoginButton(){
        loginButton = getDriver().findElement(By.xpath("//*[@id=\"item-0\"]"));
        return loginButton;
    }
    public BookStoreAppPage open (){
        getDriver().get("https://demoqa.com/books");
        return this;
    }
}
