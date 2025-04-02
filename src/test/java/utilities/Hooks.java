package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;




public class Hooks {

    @Before
    public void setup() {
        DriverManager.getDriver();
    }

    @After
    public void tearDown() {
      DriverManager.quitDriver();
   }

    public static WebDriver getDriver() {
        return DriverManager.getDriver();
    }
}

