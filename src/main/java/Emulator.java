import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Emulator {

    protected static AndroidDriver<AndroidElement> driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        System.out.println("start test ");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        String host = "ps.perfectomobile.com";
        capabilities.setCapability("securityToken", "");

        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("deviceName", "pixel 4");
        capabilities.setCapability("useVirtualDevice", true);
        capabilities.setCapability("platformVersion", "10");

//        capabilities.setCapability("appiumVersion", "1.20.2");
//        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("app", "PUBLIC:ExpenseTracker/Native/android/ExpenseAppVer1.0.apk");
        capabilities.setCapability("scriptName", "bug-hunt-emu-test");

        driver = new AndroidDriver<>(new URL("https://" + host + "/nexperience/perfectomobile/wd/hub"), capabilities);

        String sessionId = driver.getSessionId().toString();
        System.out.println("SessionID: " + sessionId);

//        driver.get("http://automationpractice.com/");

        Thread.sleep(5000);

        System.out.println("END");

        driver.quit();

    }

}
