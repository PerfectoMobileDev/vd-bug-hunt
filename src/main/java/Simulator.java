import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Simulator {

    protected static IOSDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        System.out.println("start test ");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        String host = "ps.perfectomobile.com";
        capabilities.setCapability("securityToken", "");

        capabilities.setCapability("platformName", "iOS");

        capabilities.setCapability("deviceName", "iPhone 12");
        capabilities.setCapability("platformVersion", "14.3");
        capabilities.setCapability("useVirtualDevice", true);

//        capabilities.setCapability("appiumVersion", "1.20.2");
//        capabilities.setCapability("browserName", "Safari");
        capabilities.setCapability("scriptName", "bug-hunt-sim-test");
        capabilities.setCapability("app", "PUBLIC:TestApp.zip");

        driver = new IOSDriver(new URL("https://" + host + "/nexperience/perfectomobile/wd/hub"), capabilities);

       String sessionId = driver.getSessionId().toString();
        System.out.println("SessionID: " + sessionId);

//        driver.get("http://automationpractice.com/");

        Thread.sleep(5000);

        System.out.println("END");

        driver.quit();
    }

}
