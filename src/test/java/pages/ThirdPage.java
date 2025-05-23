package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ThirdPage {
    WebDriver driver;
    WebDriverWait wait;


    By buildCheapComputer = By.xpath("//*[.='Build your own cheap computer']/parent::h2/parent::div//div[@class='add-info']//div[@class='buttons']//input");

    public ThirdPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void clickAddToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(buildCheapComputer));
        wait.until(ExpectedConditions.elementToBeClickable(buildCheapComputer)).click();
    }
}
