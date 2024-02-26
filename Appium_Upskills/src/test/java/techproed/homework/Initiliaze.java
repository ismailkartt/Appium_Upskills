package techproed.homework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.sql.DriverManager;
import java.time.Duration;

public class Initiliaze {

    public static AndroidDriver driver;


    static AndroidDriver beforeMethod() throws MalformedURLException {
        String setApp= System.getProperty("user.dir"+
                File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources" + File.separator + "ApiDemos-debug.apk");
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setApp(setApp);

        URL url = new URL("http://0.0.0.0:4723");
         driver = new AndroidDriver(url,options);
        return driver;
    }
    static void back() throws MalformedURLException {
        beforeMethod().navigate().back();
    }

}
