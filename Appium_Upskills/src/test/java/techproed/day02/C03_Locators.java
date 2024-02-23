package techproed.day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C03_Locators {

    @Test
    public void testuiAutomator2Options() throws MalformedURLException {

        String appUrl = System.getProperty("user.dir") +
                File.separator + "src" +
                File.separator + "test" +
                File.separator + "resources" +
                File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options();

        options.setUdid("emulator-5554")
                //   .setApp("C:\\Users\\mstf-\\Desktop\\Appium\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk")
                .setApp(appUrl)
//                .setAppPackage("io.appium.android.apis")
//                .setAppActivity("io.appium.android.apis.ApiDemos")
        ;


        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,options);

    }



}
