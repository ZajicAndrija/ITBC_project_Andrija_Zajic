package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class BaseTest {

    private JavascriptExecutor js;
    private WebDriver driver;
    public WebDriverWait wait;
    private HomePage homePage;
    private ElementsPage elementsPage;
    private BookStoreAppPage bookStoreAppPage;
    private AlertsFrameWindowsPage alertsFrameWindowsPage;
    private TextBoxPage textBoxPage;
    private LoginPage loginPage;
    private AlertsPage alertsPage;
    private SliderPage sliderPage;
    public JavascriptExecutor getJs() {
        return js;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
    public HomePage getHomePage(){
        return homePage;
    }
    public ElementsPage getElementsPage(){
        return elementsPage;
    }
    public BookStoreAppPage getBookStoreAppPage(){
        return bookStoreAppPage;
    }
    public AlertsFrameWindowsPage getAlertsFrameWindowsPage(){
        return alertsFrameWindowsPage;
    }
    public TextBoxPage getTextBoxPage(){
        return textBoxPage;
    }
    public LoginPage getLoginPage(){
        return loginPage;
    }
    public AlertsPage getAlertsPage(){
        return alertsPage;
    }
    public SliderPage getSliderPage(){
        return sliderPage;
    }

    public void assertVisibilityOfElement(WebElement element) {
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }
    public void scrollDown(int numberOfPixels) {
        getJs().executeScript("window.scrollBy(0," + numberOfPixels + ")", "");
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//rilak//OneDrive//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver, wait);
        elementsPage = new ElementsPage(driver, wait);
        bookStoreAppPage = new BookStoreAppPage(driver, wait);
        alertsFrameWindowsPage = new AlertsFrameWindowsPage(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        alertsPage = new AlertsPage(driver, wait);
        sliderPage = new SliderPage(driver,wait);
        js = (JavascriptExecutor) driver;
        getDriver().manage().window().maximize();
    }
    @BeforeMethod
    public void beforeEachTest(){
        getDriver().navigate().refresh();
    }
    @AfterClass
    public void close(){
        getDriver().close();
    }
}
