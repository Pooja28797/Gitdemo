package Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.annotations.Test;

public class LoginSteps {
        private WebDriver driver;

        @Test(invocationCount = 2)
        public void add()
        {
            System.out.println("addition is :");
        }

        @Given("I am on the Facebook login page")
        public void i_am_on_the_facebook_login_page() {
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");

            // Initialize the ChromeDriver
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
        }

        @When("I enter valid username and password")
        public void i_enter_valid_username_and_password() {
            WebElement usernameField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("pass"));

            usernameField.sendKeys("pujathombare2807@gmail.com");
            passwordField.sendKeys("Shriyan@2002");
        }

        @And("I click the login button")
        public void i_click_the_login_button() {
            WebElement loginButton = driver.findElement(By.name("login"));
            loginButton.click();
        }

        @Then("I should see the Facebook homepage")
        public void i_should_see_the_facebook_homepage() {
            String expectedTitle = "Facebook";
            String actualTitle = driver.getTitle();
            System.out.println(actualTitle);
            assertEquals(expectedTitle, actualTitle);
            driver.quit();
        }
    }


