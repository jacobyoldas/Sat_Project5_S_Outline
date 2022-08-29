package StepsDefinitions;

import Pages._01_LoginPageElements;
import Pages._02_HomePageElements;
import Utilities.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps  {

  _01_LoginPageElements lp = new _01_LoginPageElements();
  _02_HomePageElements hp = new _02_HomePageElements();

  @Given("User navigate to website")
  public void userNavigateToWebsite() {
    BaseDriver.setupDriver().get("http://zero.webappsecurity.com/login.html");
    BaseDriver.setupDriver().manage().window().maximize();
  }

  @When("User enter valid {string} and {string}")
  public void userEnterValidAnd(String username, String password) {

    lp.findAndSend("username", username);
    lp.findAndSend("password", password);
    lp.findAndClick("sigIn");
    BaseDriver.setupDriver().navigate().back();
  }

  @Then("User should login successfully")
  public void userShouldLoginSuccessfully() {

    hp.findAndValidate("loginSuccessMessage", "Zero Bank");
  }

  @When("User enter valid {string} or invalid {string}")
  public void userEnterValidAndInvalid(String username, String password) {
    lp.findAndSend("username", username);
    lp.findAndSend("password", password);
    lp.findAndClick("sigIn");
  }

  @Then("User should NOT login and receive error message")
  public void userShouldNOTLoginAndReceived() {
    lp.findAndValidate("errorMessage", "Login and/or password are wrong.");
  }
}
