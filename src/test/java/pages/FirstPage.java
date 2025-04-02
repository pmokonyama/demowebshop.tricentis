package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstPage {
    WebDriver driver;

    By email = By.className("email");
    By password = By.xpath("//input[@class='password']");
    By logIn = By.xpath("//input[@class='button-1 login-button']");

    By computersLink = By.linkText("Computers");

    public FirstPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public void enterEmail(String text) {
        driver.findElement(email).sendKeys(text);
    }


    public void enterPassword(String text) {
        driver.findElement(password).sendKeys(text);
    }


    public void clickLogin() {
        driver.findElement(logIn).click();
    }

    public void clickComputers() {
        driver.findElement(computersLink).click();
    }


}


