package Pages;
import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class _01_LoginPageElements extends ParentFunctions {
  public _01_LoginPageElements() {
    PageFactory.initElements(BaseDriver.setupDriver(), this);
  }
  @FindBy(css = "input[name='user_login']")
  private WebElement username;

  @FindBy(css = "input[name='user_password']")
  private WebElement password;

  @FindBy(css = "input[name='submit']")
  private WebElement sigIn;
  @FindBy(css = "form[id='login_form']>div")
  private WebElement errorMessage;
  WebElement myElement;
  public void findAndSend(String element,
      String value) {//I can call the web element from the String name
    switch (element) {
      case "username": myElement = username; break;
      case "password": myElement = password; break;
    }
    sendKeysFunction(myElement, value);
  }
  public void findAndClick(String element) {
    if ("sigIn".equals(element)) {
      myElement = sigIn; }
    clickFunction(myElement);
  }
  public void findAndValidate(String element, String text) {
    switch (element) {
      case "errorMessage": myElement = errorMessage; break;
    }
    validationText(myElement, text);
  }
}
