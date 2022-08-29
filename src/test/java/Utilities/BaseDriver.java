package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BaseDriver {
  public static WebDriver driver;
  public static WebDriver setupDriver() {
    if (driver == null) { // always open clean browser
      Logger.getLogger("").setLevel(Level.SEVERE);
      System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
      System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
//     WebDriverManager.firefoxdriver().setup();
//     driver=new FirefoxDriver();
    }
    return driver;
  }
  public static void quitDriver() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    if (driver != null) { // if there is driver
      driver.quit();
      driver = null;
    }
  }
  public static void threadSleep(int sec) {
    try {
      Thread.sleep(sec * 1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
