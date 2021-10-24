package AppiumFramework.appium.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorHomePO {

	
	AndroidDriver<WebElement> mobiledriver =  null;
	public CalculatorHomePO(AndroidDriver<WebElement> mobiledriver) {
		this.mobiledriver= mobiledriver;
		PageFactory.initElements(mobiledriver, this);
	}
	
	@FindBy(xpath="//android.widget.Button[contains(@text,'7') or @resource-id='com.android.calculator2:id/digit7']")
	private WebElement digi_7;
	
	@FindBy(xpath="//android.widget.Button[contains(@text,'x') or @resource-id='com.android.calculator2:id/op_mul']")
	private WebElement digi_x;
	

	@FindBy(xpath="//android.widget.Button[@text='5' and @resource-id='com.android.calculator2:id/digit_5']")
	private WebElement digi_5;
	
	
	@FindBy(xpath="//android.widget.Button[@text='=' and @resource-id='com.android.calculator2:id/eq']")
	private WebElement digi_eq;
	
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.android.calculator2:id/result']")
	private WebElement result;
	
	
	public void digi_7() {
		Assert.assertEquals(digi_7.isEnabled(), true);
		Reporter.log("Digi 7 button is enabled");
		digi_7.click();
	}
	
	public void digi_x() {
		Assert.assertEquals(digi_x.isEnabled(), true);
		Reporter.log("Digi x button is enabled");
		digi_x.click();
	}
	
	public void digi_5() {
		Assert.assertEquals(digi_5.isEnabled(), true);
		Reporter.log("Digi 5 button is enabled");
		digi_5.click();
	}
	
	public void digi_eq() {
		Assert.assertEquals(digi_eq.isEnabled(), true);
		Reporter.log("Digi eq button is enabled");
		digi_eq.click();
	}
	
	
	public String result() {
		Assert.assertEquals(result.isDisplayed(), true);
		Reporter.log("Result displayed is "+result.getText());
		return result.getText();
	}
	
}
