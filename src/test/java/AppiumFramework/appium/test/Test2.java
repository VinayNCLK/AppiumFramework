package AppiumFramework.appium.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
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

public class Test2{


	
	@Test(groups= {"functional","regression"})
	public void test3() {
		System.out.println("This is my first test case");
	}
	
	
	@Test(groups= {"regression"})
	public void test4() {
		System.out.println("This is my Second test case");
	}
	
}
