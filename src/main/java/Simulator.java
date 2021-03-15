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
        capabilities.setCapability("securityToken", "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICIyODhhNDIyNS1jOTE1LTQwZDctOTc2YS04MDhiMWE3YTFmODYifQ.eyJqdGkiOiJhYzAwM2FlOC1hYTY3LTQ0ZDMtOTgzYi01ZTg4MmU2NmM5MzAiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNjEzNTAxMTIwLCJpc3MiOiJodHRwczovL2F1dGgucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3BzLXBlcmZlY3RvbW9iaWxlLWNvbSIsImF1ZCI6Imh0dHBzOi8vYXV0aC5wZXJmZWN0b21vYmlsZS5jb20vYXV0aC9yZWFsbXMvcHMtcGVyZmVjdG9tb2JpbGUtY29tIiwic3ViIjoiZmQ3YjEzMzAtMmFhYS00NTA2LWE2MDItNjMzOTVmZDY1NGM3IiwidHlwIjoiT2ZmbGluZSIsImF6cCI6Im9mZmxpbmUtdG9rZW4tZ2VuZXJhdG9yIiwibm9uY2UiOiIwMjNkZmIwZC02MzBmLTQxZjYtODVhZC00NDU1Mzg3MmNiYzMiLCJhdXRoX3RpbWUiOjAsInNlc3Npb25fc3RhdGUiOiI3YTE2YzQyNy1jMTQ5LTQ0MjktYjc5Yy1jNzg5YWQyZGZiMmQiLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsib2ZmbGluZV9hY2Nlc3MiXX0sInJlc291cmNlX2FjY2VzcyI6eyJyZXBvcnRpdW0iOnsicm9sZXMiOlsiYWRtaW5pc3RyYXRvciJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQgb2ZmbGluZV9hY2Nlc3MifQ.6bifckN-2QO9lTGtJnp4hGGz1JHRzTgUvKDJZQlusJc");

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
