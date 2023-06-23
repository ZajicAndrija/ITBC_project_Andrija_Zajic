package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TextBoxPage extends BasePage{
    private WebElement fullNameField;
    private WebElement emailField;
    private WebElement currentAddressField;
    private WebElement permanentAddressField;
    private WebElement submitButton;
    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getFullNameField(){
        fullNameField = getDriver().findElement(By.id("userName"));
        return fullNameField;
    }
    public WebElement getEmailField(){
        emailField = getDriver().findElement(By.id("userEmail"));
        return emailField;
    }
    public WebElement getCurrentAddressField(){
        currentAddressField = getDriver().findElement(By.id("currentAddress"));
        return currentAddressField;
    }
    public WebElement getPermanentAddressField(){
        permanentAddressField = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddressField;
    }
    public WebElement getSubmitButton(){
        submitButton = getDriver().findElement(By.id("submit"));
        return submitButton;
    }
    public TextBoxPage open (){
        getDriver().get("https://demoqa.com/text-box");
        return this;
    }
    public void fillTextBox(){
        getFullNameField().sendKeys("Andrija");
        getEmailField().sendKeys("email@field.com");
        getCurrentAddressField().sendKeys("Krusevac");
        getPermanentAddressField().sendKeys("Beograd");
        getSubmitButton().click();
    }
    public void checkData(){
        Assert.assertTrue(getDriver().findElement(By.id("name")).getText().contains(fullNameField.getText()));
        Assert.assertTrue(getDriver().findElement(By.id("email")).getText().contains(emailField.getText()));
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#currentAddress")).getText().contains(currentAddressField.getText()));
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#permanentAddress")).getText().contains(permanentAddressField.getText()));
    }
}
