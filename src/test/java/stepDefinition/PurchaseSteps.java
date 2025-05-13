package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SecondPage;
import pages.FirstPage;

import pages.ThirdPage;
import utilities.DriverManager;



public class PurchaseSteps {

    WebDriver driver = DriverManager.getDriver();

    FirstPage login;
    SecondPage computers;
    ThirdPage desktop;

// Test change to trigger Jenkins build

    @Given("the user is on login page")
    public void login_page() {
       
        driver.get("https://demowebshop.tricentis.com/login");

        login = new FirstPage(driver);


    }
    @When("the user enters correct details email {string} and password {string}")

    public void user_enters_email_and_password(String email, String password) {
        login.enterEmail(email);
        login.enterPassword(password);


    }
    @And("the user clicks the login button")
    public void click_login() {
        login.clickLogin();


    }
    @Then("the user is in Homepage")
    public void home_page() {

    }


    @When("the user clicks on Computers")
    public void click_computers() {

        computers = new SecondPage(driver);
        login.clickComputers();

    }

    @When("the user selects Desktop")
    public void selects_desktop() {

        computers.clickDesktops();
    }
    @And("user adds item to cart")
    public void add_to_cart() {
        desktop = new ThirdPage(driver);
        desktop.clickAddToCart();
    }



}
