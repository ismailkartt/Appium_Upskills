package techproed;

import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class C01_SetupDriver {


    @Test
    public void testDesiredCabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","uiautomator2");

    }


    @Test
    public void testuiAutomator2Options() {
        UiAutomator2Options options = new UiAutomator2Options();

    }
}
