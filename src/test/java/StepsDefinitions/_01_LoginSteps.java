package StepsDefinitions;
import Pages._01_LoginPageElements;
import Pages._02_HomePageElements;
import Utilities.BaseDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class _01_LoginSteps {
  _01_LoginPageElements lp= new _01_LoginPageElements();
  _02_HomePageElements hp = new _02_HomePageElements();
  @Given("User navigate to website")
  public void userNavigateToWebsite() {
    BaseDriver.setupDriver().get("http://zero.webappsecurity.com/login.html");
    BaseDriver.setupDriver().manage().window().maximize();
  }
  @When("User enter valid username and password")
  public void userEnterValidAnd(DataTable dataTable) {
    List<List<String>> testData= dataTable.asLists(String.class);
    for (int i=0; i<testData.size(); i++)
      lp.findAndSend(testData.get(i).get(0),testData.get(i).get(1));

//    lp.findAndSend("username", username);
//    lp.findAndSend("password", password);
//    lp.findAndClick("sigIn");
//    BaseDriver.setupDriver().navigate().back();
  }
  @Then("User should login successfully")
  public void userShouldLoginSuccessfully() {
    hp.findAndValidate("loginSuccessMessage", "Zero Bank");
  }
  @When("User enter invalid username or invalid password")
  public void userEnterInValidUsernameOrInvalidPassword(DataTable dataTable) {

    List<List<String>> testData= dataTable.asLists(String.class);
    for (int i=0; i<testData.size(); i++)
      lp.findAndSend(testData.get(i).get(0),testData.get(i).get(1));
  }

  @Then("User should NOT login and receive error message")
  public void userShouldNOTLoginAndReceived() {
    lp.findAndValidate("errorMessage", "Login and/or password are wrong.");
  }

//  @When("User enter valid {string} or invalid {string}")
//  public void userEnterValidAndInvalid(String username, String password) {
//    lp.findAndSend("username", username);
//    lp.findAndSend("password", password);
//    lp.findAndClick("sigIn");
//  }
}
