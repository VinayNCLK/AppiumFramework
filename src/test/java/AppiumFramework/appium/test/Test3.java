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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3{


	
	@Test(dataProvider = "data")
	public void test3(String username, String pwd) {
		try {
			System.out.println("This is my first test case with "+username+" "+pwd);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	@DataProvider
	public Object[][] data() {
		Object[][] data = new Object[2][2];
		data[0][0] = "user1";
		data[0][1] = "pwd1";
		data[1][0] = "user2";
		data[1][1] = "pwd2";
		return data;	
	}
	
	
}
