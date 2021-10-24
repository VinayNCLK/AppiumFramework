package AppiumFramework.appium.Base;

public interface BaseConstants {

	//Generic constants
	public static final String fwPath = System.getProperty("user.dir");
	public static final String appPath = "";
	public static final Boolean fullReset = false;
	public static final Boolean noReset =  true;
	
	
	//Android constants
	public static final String android_platformName = "Android";
	public static final String android_platformVersion = "9";
	public static final String android_deviceName = "emulator-5554";
	public static final String android_automationName = "UIAutomator2";
	public static final String appPackage = "com.android.calculator2";
	public static final String appActivity = "com.android.calculator2.Calculator";


	//IOS Constants
	public static final String ios_platformName = "iOS";
	public static final String ios_platformVersion = "12.1";
	public static final String ios_deviceName = "iPhone XR";
	public static final String ios_automationName = "XCUITest";

}
