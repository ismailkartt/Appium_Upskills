package techproed.day02;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

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


        // 1-) AccessibilityId
        WebElement element = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        System.out.println("Accessibility Id: " + element.getText());

        // 2-) id (ResourcesId)
        element = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
        System.out.println("Accessibility Id: " + element.getText());

        // 3-) className
        element = driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
        System.out.println("ClassName : " + element.getText());

        // 4-) androidUIAutamator
        WebElement element4 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")"));
        System.out.println("Android UI Automator "+ element4.getText());

        //5- xpath
        WebElement element5 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
        WebElement element6 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Accessibility\"]"));
        System.out.println("xpath content-desc:  "+ element5.getText());
        System.out.println("xpath text:  "+ element6.getText());



    }

    @Test
    public void testuiAutomator2OptionsHomeWork() throws MalformedURLException {

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
        AndroidDriver driver = new AndroidDriver(url, options);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 1-) AccessibilityId
        WebElement element = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        element.click();


        // Accessibility Node Provider
        WebElement nodeProviderElement = driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider"));
        nodeProviderElement.click();
        driver.navigate().back();

        // Accessibility Node Querying
        WebElement nodeQueryingElement = driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying"));
        nodeQueryingElement.click();
        driver.navigate().back();

        // Accessibility Service
        WebElement serviceElement = driver.findElement(AppiumBy.accessibilityId("Accessibility Service"));
        serviceElement.click();
        driver.navigate().back();

        // Custom View
        WebElement customViewElement = driver.findElement(AppiumBy.accessibilityId("Custom View"));
        customViewElement.click();
        driver.navigate().back();

        //

//        // 2-) id (ResourcesId)
//        WebElement contentELement = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
//        System.out.println("Accessibility Id: " + contentELement.getText());
//
//        // 3-) className
//        WebElement mediaElement = driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
//        System.out.println("ClassName : " + mediaElement.getText());





    }


}
