package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SliderPage extends BasePage{
    private WebElement slider;
    private WebElement result;
    Actions actions = new Actions(getDriver());
    public SliderPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getSlider(){
        slider = getDriver().findElement(By.cssSelector("#sliderContainer > div.col-9 > span > input"));
        return slider;
    }
    public WebElement getResult(){
        result = getDriver().findElement(By.id("sliderValue"));
        return result;
    }
    public void moveSlider(){
        actions.moveToElement(getSlider()).dragAndDropBy(slider, 40, 0).build().perform();
        Assert.assertEquals(getSlider().getAttribute("value"), getResult().getAttribute("value"));
    }
    public SliderPage open(){
        getDriver().get("https://demoqa.com/slider");
        return this;
    }
}
