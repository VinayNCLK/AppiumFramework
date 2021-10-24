package AppiumFramework.appium.Generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class AppiumGeneric {

	static String desDir = "";
	static SimpleDateFormat dateformat;

	public static void switch_NativetoWebview_Android(AndroidDriver<WebElement> mobiledriver) {
		Set<String> handles = mobiledriver.getContextHandles();

		for (String handlenames : handles) {
			// System.out.println(handlenames);
			if (handlenames.contains("WEBVIEW")) {
				// To switch the context from NATIVE TO WEBVIEW
				mobiledriver.context(handlenames);
				break;
			}
		}

	}

	public static void switch_WebtoNativeview_Android(AndroidDriver<WebElement> mobiledriver) {
		Set<String> handles = mobiledriver.getContextHandles();

		for (String handlenames : handles) {
			// System.out.println(handlenames);
			if (handlenames.contains("NATIVE")) {
				// To switch the context from NATIVE TO WEBVIEW
				mobiledriver.context(handlenames);
				break;
			}
		}

	}

	public static void switch_NativetoWebview_ios(IOSDriver<WebElement> mobiledriver) {
		Set<String> handles = mobiledriver.getContextHandles();

		for (String handlenames : handles) {
			// System.out.println(handlenames);
			if (handlenames.contains("WEBVIEW")) {
				// To switch the context from NATIVE TO WEBVIEW
				mobiledriver.context(handlenames);
				break;
			}
		}

	}

	public static void switch_WebtoNativeview_ios(IOSDriver<WebElement> mobiledriver) {
		Set<String> handles = mobiledriver.getContextHandles();

		for (String handlenames : handles) {
			// System.out.println(handlenames);
			if (handlenames.contains("NATIVE")) {
				// To switch the context from NATIVE TO WEBVIEW
				mobiledriver.context(handlenames);
				break;
			}
		}

	}

	public static void takeScreenshot(AppiumDriver<WebElement> mobiledriver2) {
		desDir = "screenshots";

		File srcFile = ((TakesScreenshot) mobiledriver2).getScreenshotAs(OutputType.FILE);

		new File(desDir).mkdirs();

		dateformat = new SimpleDateFormat("dd-MMM-yyyy_hh_mm_ss");

		String destFile = dateformat.format(new Date()) + ".png";

		try {
			FileUtils.copyFile(srcFile, new File(desDir + "/" + destFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getOrientation(AndroidDriver<WebElement> mobiledriver) {
		String currentOrientation = mobiledriver.getOrientation().name();
		return currentOrientation;
	}

	public String getCurrentHandle(AndroidDriver<WebElement> mobiledriver) {
		String currentContext = mobiledriver.getContext();
		return currentContext;
	}

	public static void swipping(AndroidDriver<WebElement> driver, int startx, int endx) {

		Dimension dis = driver.manage().window().getSize();
		int yaxis = dis.height / 2;
		TouchAction act = new TouchAction(driver);
		act.press(startx, yaxis).waitAction(Duration.ofMillis(5000)).moveTo(endx, yaxis).release().perform();
	}

	public static void scrolling(AndroidDriver<WebElement> driver, int starty, int endy) {
		Dimension dis = driver.manage().window().getSize();
		int xaxis = dis.width / 2;
		TouchAction act = new TouchAction(driver);
		act.press(xaxis, starty).waitAction(Duration.ofMillis(5000)).moveTo(xaxis, endy).release().perform();

	}

	// Scrolling at the particular y axis
	public static void swipping_withcoordinates(AndroidDriver<WebElement> driver, int startx, int endx, int yaxis) {
		TouchAction act = new TouchAction(driver);
		act.press(startx, yaxis).waitAction(Duration.ofMillis(5000)).moveTo(endx, yaxis).release().perform();

	}

	// Scrolling at the particular x axis
	public static void scrolling_withcoordinates(AndroidDriver<WebElement> driver, int starty, int endy, int xaxis) {
		TouchAction act = new TouchAction(driver);
		act.press(xaxis, starty).waitAction(Duration.ofMillis(5000)).moveTo(xaxis, endy).release().perform();

	}

}
