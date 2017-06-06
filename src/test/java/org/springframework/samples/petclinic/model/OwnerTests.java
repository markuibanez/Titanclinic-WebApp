package com.test.SeleniumTest;

//import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;


public class OwnerTests {
 WebDriver driver;
 
 @Before
 public void setup() throws Exception {
  //Set phantomjs.exe executable file path using DesiredCapabilities.
  DesiredCapabilities capability = new DesiredCapabilities();  
  capability.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "libs/phantomjs.exe");
  driver = new PhantomJSDriver(capability);
  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
 }
 
 @Test
 public void phantomTest() throws IOException{
  driver.get("http://localhost:9008/titanclinic/");
  //Get current page title using javascript executor.
    JavascriptExecutor javascript = (JavascriptExecutor) driver;
    String pagetitle=(String)javascript.executeScript("return document.title");  
    System.out.println("Functional Testing for "+pagetitle);    
    
	System.out.println("Successfully navigated to Homepage of Titanclinic");   
    driver.navigate().to("http://localhost:9008/titanclinic/owners/find.html");
    System.out.println("Successfully navigated to Find Titans Page of Titanclinic");  
    driver.navigate().to("http://localhost:9008/titanclinic/owners.html?lastName=");
    System.out.println("Successfully listed all Corps of Titanclinic");  
    driver.navigate().to("http://localhost:9008/titanclinic/vets.html");
    System.out.println("Successfully navigated to Find Corps page of Titanclinic");  
    driver.navigate().to("http://localhost:9008/titanclinic/oups.html");
    System.out.println("Successfully navigated to SC error page of Titanclinic"); 
    driver.navigate().to("http://localhost:9008/titanclinic/#");
    System.out.println("Successfully navigated to Help Page of Titanclinic");  
    driver.navigate().to("http://localhost:9008/titanclinic/");
    System.out.println("Successfully navigated back to Homepage of Titanclinic");
    
    
  //  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 //   FileUtils.copyFile(scrFile, new File("C:/Users/marvin.j.a.salazar/Desktop/"),true);

  
 }
}