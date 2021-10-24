package AppiumFramework.appium.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import AppiumFramework.appium.Base.Base_Android;
import AppiumFramework.appium.PO.CalculatorHomePO;

public class Test_Calculator extends Base_Android{

	
	@Test(priority = 1)
	public void simpleMultiplication() {
		
		CalculatorHomePO ch = new CalculatorHomePO(mobiledriver);
		ch.digi_5();
		Reporter.log("Digit 5 is clicked");
		ch.digi_x();
		Reporter.log("Digit X is clicked");
		ch.digi_7();
		Reporter.log("Digit 7 is clicked");
		ch.digi_eq();
		Reporter.log("Digit = is clicked");	
		Assert.assertEquals(ch.result(), "35","Obtined the wrong result");
		
	}
	
	
	
}
