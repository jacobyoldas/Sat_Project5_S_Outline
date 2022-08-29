package Pages;

import Utilities.BaseDriver;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ParentFunctions {

  WebDriverWait wait;

  public void sendKeysFunction(WebElement element, String value) {
    waitUntilClickable(element);
    waitUntilVisible(element);
    element.sendKeys(value);
  }

  public void waitUntilVisible(WebElement element) {
    wait = new WebDriverWait(BaseDriver.setupDriver(), Duration.ofSeconds(35));
    wait.until(ExpectedConditions.visibilityOf(element));
  }

  public void scrollToElement(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) BaseDriver.setupDriver();
    js.executeScript("arguments[0].scrollIntoView();", element);
  }

  public void clickFunction(WebElement element) {
    element.click();
  }

  public void waitUntilClickable(WebElement element) {
    wait = new WebDriverWait(BaseDriver.setupDriver(), Duration.ofSeconds(35));
    wait.until(ExpectedConditions.elementToBeClickable(element));
  }

  public void validationText(WebElement element, String text) {
    waitUntilVisible(element);
    Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
  }
}


