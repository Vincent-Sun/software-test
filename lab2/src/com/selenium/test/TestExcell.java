package com.selenium.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import java.nio.charset.Charset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

public class TestExcell {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  String driverPath = "C:\\java\\geckodriver\\geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
	  baseUrl = "http://121.193.130.195:8800";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test
  public void testBaidu() throws Exception {
	TestXlsx test = new TestXlsx();
	test.getarray();
	String a[][] = new String[145][4];
	System.arraycopy(test.getarray(),0,a,0,test.getarray().length);
    driver.get(baseUrl + "/");
    for(int i = 2; i < 145; i++) {
        WebElement input_name = driver.findElement(By.name("id"));
        input_name.clear();
        input_name.sendKeys(a[i][1]);
        WebElement input_pwd = driver.findElement(By.name("password"));
        input_pwd.clear();
        input_pwd.sendKeys(a[i][1].substring(4));
        WebElement btn = driver.findElement(By.id("btn_login"));
        btn.click();
        assertEquals(a[i][1], driver.findElement(By.id("student-id")).getText());
    	assertEquals(a[i][2], driver.findElement(By.id("student-name")).getText());
    	assertEquals(a[i][3], driver.findElement(By.id("student-git")).getText());
    	driver.findElement(By.id("btn_logout")).click();
    	driver.findElement(By.id("btn_return")).click();
    } 
  }
  
  @After
  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

