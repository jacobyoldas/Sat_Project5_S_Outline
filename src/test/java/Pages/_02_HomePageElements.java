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
  private WebElement newPayeeSuccessMessage;

  WebElement myElement;

  public void findAndClick(String element) {
    switch (element) {

      case "onlineBankingMenu":
        myElement = onlineBankingMenu; break;
        case "payBills":
        myElement = payBills;
        break;
      case "addNewPayee":
        myElement = addNewPayee;
        break;
      case "addButton":
        myElement = addButton;
        break;
    }
    clickFunction(myElement);
  }

  public void findAndSend(String element,  String value) {//I can call the web element from the String name
    switch (element) {
      case "payeeName":
        myElement = payeeName; break;
      case "payeeAddress":
        myElement = payeeAddress;
        break;
      case "account":
        myElement = account;
        break;
      case "payeeDetails":
        myElement = payeeDetails;
        break;

    }
    sendKeysFunction(myElement, value);
  }

  public void findAndValidate(String element, String text) {
    switch (element) {
      case "loginSuccessMessage":
        myElement = loginSuccessMessage;
        break;
      case "newPayeeSuccessMessage":
        myElement = newPayeeSuccessMessage;
        break;

    }
    validationText(myElement, text);
  }











}





















