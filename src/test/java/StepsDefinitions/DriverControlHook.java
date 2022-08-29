package StepsDefinitions;

import Utilities.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverControlHook extends BaseDriver {

  @After
  public void quitDriverAfter() {
    quitDriver();
  }
}
