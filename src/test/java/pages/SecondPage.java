package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecondPage {
    WebDriver driver;


    WebDriverWait wait;



    By desktopsLink = By.xpath("//a[.//img[@alt='Picture for category Desktops']]");


    public SecondPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void clickDesktops() {

        wait.until(ExpectedConditions.elementToBeClickable(desktopsLink)).click();
    }

}
