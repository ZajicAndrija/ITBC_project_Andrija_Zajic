package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
    Faker faker = new Faker();
    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement loginButton;
    private WebElement newUserButton;
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement captchaBox;
    private WebElement registerButton;
    private WebElement invalidMessage;
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getUserNameField(){
        userNameField = getDriver().findElement(By.cssSelector("#userName"));
        return userNameField;
    }
    public WebElement getPasswordField(){
        passwordField = getDriver().findElement(By.cssSelector("#password"));
        return passwordField;
    }
    public WebElement getLoginButton(){
        loginButton = getDriver().findElement(By.cssSelector("#login"));
        return loginButton;
    }
    public WebElement getNewUserButton(){
        newUserButton = getDriver().findElement(By.id("newUser"));
        return newUserButton;
    }
    public WebElement getFirstNameField(){
        firstNameField = getDriver().findElement(By.cssSelector("#firstname"));
        return firstNameField;
    }
    public WebElement getLastNameField(){
        lastNameField = getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/input"));
        return lastNameField;
    }
    public WebElement getCaptchaBox(){
        captchaBox = getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div"));
        return captchaBox;
    }
    public WebElement getRegisterButton(){
        registerButton = getDriver().findElement(By.id("register"));
        return registerButton;
    }
    public WebElement getInvalidMessage(){
        invalidMessage = getDriver().findElement(By.xpath("//p[contains(text(), \"Invalid username or password!\")]"));
        return invalidMessage;
    }
    public LoginPage open(){
        getDriver().get("https://demoqa.com/login");
        return this;
    }
    public void fillData(){
        getFirstNameField().sendKeys(faker.name().firstName());
        getLastNameField().sendKeys(faker.name().lastName());
        getUserNameField().sendKeys(faker.name().username());
        getPasswordField().sendKeys("sifraNijeBitna23#");
    }
}
