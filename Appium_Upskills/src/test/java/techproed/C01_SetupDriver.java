package techproed;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class C01_SetupDriver {


    @Test
    public void testDesiredCabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","android");
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("app","C:\\Users\\mstf-\\Desktop\\Appium\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk");
//        capabilities.setCapability("appPackage","io.appium.android.apis");
//        capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");


        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,capabilities);


    }


    @Test
    public void testuiAutomator2Options() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setUdid("emulator-5554")
                .setApp("C:\\Users\\mstf-\\Desktop\\Appium\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk")
//                .setAppPackage("io.appium.android.apis")
//                .setAppActivity("io.appium.android.apis.ApiDemos")
        ;


        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,options);

    }

    @Test
    public void testDesiredCabilities1() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","android");
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");



        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,capabilities);


    }


    @Test
    public void testuiAutomator2Options1() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setUdid("emulator-5554")
                .setApp("C:\\Users\\mstf-\\Desktop\\Appium\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk")
                .setAppPackage("com.google.android.calculator")
                .setAppActivity("com.android.calculator2.Calculator")


        ;


        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,options);

    }



}
