package StepsDefinitions;
import Pages._01_LoginPageElements;
import Pages._02_HomePageElements;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
public class _03_PurchaseForeignCurrencySteps {
  _02_HomePageElements hp = new _02_HomePageElements();
  @Then("Click purchase foreign currency")
  public void clickPurchaseForeignCurrency() {
    hp.findAndClick("purchaseForeignCurr");
  }
  @When("User select a currency")
  public void userSelectACurrency() {
    hp.findAndSelect("selectCurr","NOK");
  }
  @When("User enter amount {string}")
  public void userEnterAmount(String currAmount) {
    hp.findAndSend("amountCurr",currAmount);
    hp.findAndClear(currAmount);

  }
  @Then("User select a USD button")
  public void userSelectAUSDButton() {
    hp.findAndClick("radioDollars");
  }
  @Then("Click calculate the cost")
  public void clickCalculateTheCost() {
    hp.findAndClick("calculateCurr");
  }
  @And("Conversion Amount should be displayed")
  public void conversionAmountShouldBeDisplayed() {
    hp.findAndValidate("calculateCurrResult","dollar");
  }
  @When("Click purchase button")
  public void clickPurchaseButton() {
    hp.findAndClick("purchaseButton");
  }
  @And("Alert message should be pop-up")
  public void alertMessageShouldBePopUp() {
    Alert alert = BaseDriver.setupDriver().switchTo().alert();
    alert.accept();
  }
  @When("User did not select a currency")
  public void userDidNotSelectACurrency() {
    hp.findAndSelect("selectCurr","");
  }
  @When("User did not enter amount {string}")
  public void userDidNotEnterAmount(String currAmount) {
    hp.findAndSend("amountCurr",currAmount);
  }
  @Then("User did not select a USD button")
  public void userDidNotSelectAUSDButton() {
  }
}
