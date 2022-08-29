package Pages;
import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class _02_HomePageElements extends ParentFunctions {
  public _02_HomePageElements() {
    PageFactory.initElements(BaseDriver.setupDriver(), this);
  }
  @FindBy(css = "a[class='brand']")
  private WebElement loginSuccessMessage;
  @FindBy(id = "onlineBankingMenu")
  private WebElement onlineBankingMenu;
  @FindBy(id = "pay_bills_link")
  private WebElement payBills;
  @FindBy(xpath = "//a[text()='Add New Payee']")
  private WebElement addNewPayee;
  @FindBy(xpath = "//input[@id='np_new_payee_name']")
  private WebElement payeeName;
  @FindBy(xpath = "//textarea[@id='np_new_payee_address']")
  private WebElement payeeAddress;
  @FindBy(xpath = "//input[@id='np_new_payee_account']")
  private WebElement account;
  @FindBy(xpath = "//input[@id='np_new_payee_details']")
  private WebElement payeeDetails;
  @FindBy(id = "add_new_payee")
  private WebElement addButton;
  @FindBy(css = "div[id='alert_content']")
  private WebElement successMessage;//div[@id="ui-tabs-2"]//h2
  @FindBy(xpath = "//div[@id='ui-tabs-2']//h2")
  private WebElement errorMessageAddPayee;
  @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
  private WebElement purchaseForeignCurr;
  @FindBy(css = "select[name='currency']")
  private WebElement selectCurr;
  @FindBy(css = "div[class='controls']>input#pc_amount")
  private WebElement amountCurr;
  @FindBy(id = "pc_inDollars_true")
  private WebElement radioDollars;
  @FindBy(id = "pc_calculate_costs")
  private WebElement calculateCurr;
  @FindBy(id = "pc_conversion_amount")
  private WebElement calculateCurrResult;
  @FindBy(id = "purchase_cash")
  private WebElement purchaseButton;
  @FindBy(xpath = "//a[text()='Transfer Funds']")
  private WebElement transferFunds;
  @FindBy(css = "select[name='fromAccountId']")
  private WebElement fromAccountId;
  @FindBy(css = "select[name='toAccountId']")
  private WebElement toAccountId;
  @FindBy(css = "input[class='input-small']")
  private WebElement inputAmount;
  @FindBy(css = "input[class='input-xlarge']")
  private WebElement inputDescription;
  @FindBy(id = "btn_submit")
  private WebElement continueButton;
  @FindBy(css = "div[class='alert alert-success']")
  private WebElement transferSuccess;
  @FindBy(xpath = "//div[@class='controls']//p")
  private WebElement errorTransfer;
  WebElement myElement;
  public void findAndClick(String element) {
    switch (element) {
      case "onlineBankingMenu":   myElement = onlineBankingMenu; break;
      case "payBills":            myElement = payBills;        break;
      case "addNewPayee":         myElement = addNewPayee;        break;
      case "addButton":           myElement = addButton;        break;
      case "purchaseForeignCurr": myElement = purchaseForeignCurr;        break;
      case "radioDollars":        myElement = radioDollars;        break;
      case "calculateCurr":       myElement = calculateCurr;        break;
      case "purchaseButton":      myElement = purchaseButton;        break;
      case "transferFunds":       myElement = transferFunds;        break;
      case "continueButton":      myElement = continueButton;        break;
    }
    clickFunction(myElement);
  }
  public void findAndSend(String element,  String value) {//I can call the web element from the String name
    switch (element) {
      case "payeeName":     myElement = payeeName; break;
      case "payeeAddress":  myElement = payeeAddress; break;
      case "account":       myElement = account;   break;
      case "payeeDetails":  myElement = payeeDetails; break;
      case "amountCurr":    myElement = amountCurr;   break;
      case "inputAmount":   myElement = inputAmount;   break;
      case "inputDescription":myElement = inputDescription; break;
    }
    sendKeysFunction(myElement, value);
  }
  public void findAndValidate(String element, String text) {
    switch (element) {
      case "loginSuccessMessage":  myElement = loginSuccessMessage; break;
      case "successMessage":       myElement = successMessage;  break;
      case "calculateCurrResult":  myElement = calculateCurrResult; break;
      case "transferSuccess":      myElement = transferSuccess;  break;
      case "errorTransfer":        myElement = errorTransfer;  break;
      case "errorMessageAddPayee":  myElement = errorMessageAddPayee;   break;
    }
    validationText(myElement, text);
  }
  public void findAndSelect(String element, String text) {
    switch (element) {
      case "selectCurr":     myElement = selectCurr;  break;
      case "fromAccountId":  myElement = fromAccountId;   break;
      case "toAccountId":    myElement = toAccountId;    break;
    }
    selectFunction(myElement, text);
  }

  public void findAndClear(String element) {
    switch (element) {
      case "amountCurr":     myElement = amountCurr;  break;
    }
    clearFunction(myElement);
  }
}

















