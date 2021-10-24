package AppiumFramework.appium.Base;

import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base_IOS implements BaseConstants{

	DesiredCapabilities capabilities = null;
	public static IOSDriver<WebElement> mobiledriver =  null;
	
	@BeforeClass
	public void initialize() {
		try {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ios_platformName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ios_platformVersion);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ios_deviceName);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ios_automationName);
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
		mobiledriver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		Reporter.log("Appium server connection establised successfully");
		} catch (Exception e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("Appium server connection failed "+e);
		}
	}
	
	
	@AfterClass
	public void teardown() {
		Reporter.log("Closed the appium server connection");
	}
	
}
