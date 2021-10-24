package AppiumFramework.appium.Base;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base_Android implements BaseConstants{
	
	DesiredCapabilities capabilities = null;
	public static AndroidDriver<WebElement> mobiledriver =  null;
	
	@BeforeClass
	public void initialize() throws MalformedURLException {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, android_platformName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, android_platformVersion);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, android_deviceName);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, android_automationName);
		capabilities.setCapability("appPackage", appPackage);
		capabilities.setCapability("appActivity", appActivity);
		startServer();
		
		mobiledriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		Reporter.log("Appium server connection establised successfully",true);

	}
	
	
	@AfterClass
	public void teardown() {
		Reporter.log("Closed the appium server connection",true);
		stopServer();
	}
	
	
	public static void startServer() {
	    Runtime runtime = Runtime.getRuntime();
	    try {
	        runtime.exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723 --session-override -dc \"{\"\"noReset\"\": \"\"false\"\"}\"\"");
	        Thread.sleep(10000);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	}

	public static  void stopServer() {
	    Runtime runtime = Runtime.getRuntime();
	    try {
	        runtime.exec("taskkill /F /IM node.exe");
	        runtime.exec("taskkill /F /IM cmd.exe");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
}}
