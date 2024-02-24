package techproed.day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class C02_Capabilities {

    @Test
    public void testuiAutomator2Options() throws MalformedURLException {

        String appUrl = System.getProperty("user.dir") +
                File.separator + "src" +
                File.separator + "test" +
                File.separator + "resources" +
                File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options();

        options
                //.setUdid("emulator-5554")
                .setApp(appUrl)
               // .setAppPackage("io.appium.android.apis")
               // .setAppActivity("io.appium.android.apis.ApiDemos")
                .setAvd("Pixel_4")
                .setAvdLaunchTimeout(Duration.ofMinutes(5)) // Emülatörün açılışında süre tanımlaması yapmak için
        ;


        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,options);

    }


}
