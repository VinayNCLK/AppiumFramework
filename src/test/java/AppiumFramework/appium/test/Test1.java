package AppiumFramework.appium.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeSuite
	public void beforeSiute() {
		System.out.println("This is Before Suite");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method");
	}
	
	@Test(priority=2,enabled=true, groups= {"functional"})
	public void test1() {
		//System.out.println("This is my first test case");
		String expected = "abc";
		String actual = "abc";
		//Assert.assertEquals(actual, expected,"Mismatch in the text");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		
		System.out.println("Finished first test case");
		
		
		sa.assertAll();
	}
	
	
	@Test(priority=1)
	public void test2() {
		System.out.println("This is my Second test case");
		//throw new SkipException("This test case is skipped");
	}
	
}
