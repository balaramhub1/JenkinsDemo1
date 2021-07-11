package smoke;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SmokeTestOne {

  @Test
  public void SmokeTestOneMethodOne() {
      
      System.out.println("Class - SmokeTestOne : and Method is SmokeTestOneMethodOne()");
      Assert.assertEquals(true, true);
  }
  
  @Test
  public void SmokeTestOneMethodTwo() {
      
      System.out.println("Class - SmokeTestOne : and Method is SmokeTestOneMethodTwo()");
      Assert.assertEquals(true, true);
  }
  
  @Test
  public void SmokeTestOneMethodThree() {
      
      System.out.println("Class - SmokeTestOne : and Method is SmokeTestOneMethodThree()");
      Assert.assertEquals(true, true);
  }
  
  @Test
  public void SmokeTestOneMethodFour() {
      
      System.out.println("Class - SmokeTestOne : and Method is SmokeTestOneMethodFour()");
      Assert.assertEquals(true, true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
      System.out.println("Class - SmokeTestOne : and Method is beforeMethod()");
      Assert.assertEquals(true, true);
  }

  @AfterMethod
  public void afterMethod() {
      System.out.println("Class - SmokeTestOne : and Method is afterMethod()");
      Assert.assertEquals(true, true);
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("Class - SmokeTestOne : and Method is beforeClass()");
      Assert.assertEquals(true, true);
  }

  @AfterClass
  public void afterClass() {
      System.out.println("Class - SmokeTestOne : and Method is afterClass()");
      Assert.assertEquals(true, true);
  }

  @BeforeTest
  public void beforeTest() {
      System.out.println("Class - SmokeTestOne : and Method is beforeTest()");
      Assert.assertEquals(true, true);
  }

  @AfterTest
  public void afterTest() {
      System.out.println("Class - SmokeTestOne : and Method is afterTest()");
      Assert.assertEquals(true, true);
  }

  @BeforeSuite
  public void beforeSuite() {
      System.out.println("Class - SmokeTestOne : and Method is beforeSuite()");
      Assert.assertEquals(true, true);
  }

  @AfterSuite
  public void afterSuite() {
      System.out.println("Class - SmokeTestOne : and Method is afterSuite()");
      Assert.assertEquals(true, true);
  }

}
