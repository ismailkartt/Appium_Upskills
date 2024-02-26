package techproed.homework;

import io.appium.java_client.AppiumBy;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import java.net.MalformedURLException;

import static techproed.homework.Initiliaze.back;
import static techproed.homework.Initiliaze.beforeMethod;


public class Accessibility {
    WebElement element;

    @Test
    public void testaccessibilityId() throws MalformedURLException {
     //   System.out.println(beforeMethod().currentActivity());

//         element = beforeMethod().findElement(AppiumBy.accessibilityId("API Demos"));
//         element.click();
         element = beforeMethod().findElement(AppiumBy.accessibilityId("Accessibility"));
        element.click();
        back();
    }

    @Test
    public void manageAccessibilityOptions() throws MalformedURLException {
        //accessibilityId element
        element = beforeMethod().findElement(AppiumBy.accessibilityId("Accessibility"));
        element.click();
        back();
        element = beforeMethod().findElement(AppiumBy.accessibilityId("Accessibility Node Provider"));
       element.click();
       back();
       element = beforeMethod().findElement(AppiumBy.accessibilityId("Accessibility Node Querying"));
       element.click();
        back();
        element = beforeMethod().findElement(AppiumBy.accessibilityId("Accessibility Service"));
        element.click();
        back();
        element = beforeMethod().findElement(AppiumBy.accessibilityId("Custom View"));
        element.click();
        back();
        back();
    }

    @Test
    public void manageContentOptions() throws MalformedURLException {
        //id element (resource-id element)
        element =beforeMethod().findElements(AppiumBy.id("android:id/text1")).get(4);
        element.click();
        element =beforeMethod().findElements(AppiumBy.id("android:id/text1")).get(0);
        element.click();
        back();
        element =beforeMethod().findElements(AppiumBy.id("android:id/text1")).get(1);
        element.click();
        back();
        element =beforeMethod().findElements(AppiumBy.id("android:id/text1")).get(2);
        element.click();
        back();
        element =beforeMethod().findElements(AppiumBy.id("android:id/text1")).get(3);
        element.click();
        back();
        element =beforeMethod().findElements(AppiumBy.id("android:id/text1")).get(4);
        element.click();
        back();
        element =beforeMethod().findElements(AppiumBy.id("android:id/text1")).get(5);
        element.click();
        back();
        back();
    }

    @Test
    public void manageMediaOptions() throws MalformedURLException {
        //ClassName Element
        element = beforeMethod().findElements(AppiumBy.className("android.widget.TextView")).get(7);
        element.click();
        WebElement element2 = beforeMethod().findElements(AppiumBy.className("android.widget.TextView")).get(2);
        element2.click();
        back();
         element2 = beforeMethod().findElements(AppiumBy.className("android.widget.TextView")).get(3);
        element2.click();
        back();
        element2 = beforeMethod().findElements(AppiumBy.className("android.widget.TextView")).get(1);
        element2.click();
        back();


    }

    @Test
    public void androidUIAutomator() throws MalformedURLException {
        element = beforeMethod().findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"NFC\")"));
        element.click();
         element = beforeMethod().findElements(AppiumBy.androidUIAutomator("new UiSelector().text(\"ForegroundDispatch\").className(\"android.widget.TextView\")")).get(0);
        element.click();
        back();
        element = beforeMethod().findElements(AppiumBy.androidUIAutomator("new UiSelector().text(\"TechFilter\")")).get(0);
        element.click();
        back();
        element = beforeMethod().findElements(AppiumBy.androidUIAutomator("new UiSelector().text(\"ForegroundNdefPush\")")).get(0);
        element.click();
        back();

    }
    @Test
    public void osXpath() throws MalformedURLException {
        element = beforeMethod().findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"OS\"]"));
        element.click();
//        element = beforeMethod().findElements(AppiumBy.androidUIAutomator("new UiSelector().text(\"\")"));
         element = beforeMethod().findElements(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Morse Code\"]")).get(0);
        element.click();
        back();
        element = beforeMethod().findElements(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Rotation Vector\"]")).get(0);
        element.click();
        back();
        element = beforeMethod().findElements(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Sensors\"]")).get(0);
        element.click();
        back();
        element = beforeMethod().findElements(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"SMS Messaging\"]")).get(0);
        element.click();
        back();

    }

}
