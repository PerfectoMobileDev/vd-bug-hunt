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

        String host = "qatestlab.perfectomobile.com";
        capabilities.setCapability("securityToken", "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJpQzdvSVQyWk5hMzJSY0l5eWprS1lmS01LZlVqV0tGZWVfUGdab2g5M2RNIn0.eyJqdGkiOiI2MGEyNmM4ZC0yYjVmLTRjMTgtYTNiOS00OGQwNWEyN2NjYmYiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNTc5NjExODIzLCJpc3MiOiJodHRwczovL2F1dGgucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3FhdGVzdGxhYi1wZXJmZWN0b21vYmlsZS1jb20iLCJhdWQiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsInN1YiI6IjMxMGZkMzc0LTc5MWMtNGRiNS1iYjIzLTQ1YzNiZjcyMTczZiIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiNjFiOTM5OTktNGMzYS00ZmRiLWI0MmUtZjAyODRhYThkNTY1IiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiOGE0NDFjODktMTY1Ny00ZjJjLWE0ZjktMzJjMTRjMzkzMmVjIiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInJlc291cmNlX2FjY2VzcyI6eyJyZXBvcnRpdW0iOnsicm9sZXMiOlsiZXhlY3V0aW9uX2FkbWluIl19LCJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19fQ.NnRlUneMNj9jpKOKr_Vsuv0tlS-KzHM0EO3QTc_W1Yd1V_UED7b95SRyVg5_kOlJhIaFoUAbzC3UIYxAZIqJSqwkhLi2ojUtSYf-DCOcHaffvauAN-OGmn7OHkyW6Dx2-RT2Q3IqsYUEvtxlXMBEFPjiv53BqURS6pThVCZtIpSDvBYen0i0w5uRiBw0n8uwdmMWx4qJQH-b-PEQJnJ1U0kQqP_TxImhBZHApvlDebZHimFo-tDV_kY5rfYyVtNXE7Xhx22d9qz_D7akFigXL71QJjLLs2fCF0_b29wY38wItpKW1dvO34meLDanfJCSa0Otszt5hxVOz5MYzzvy1A");

        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("deviceName", "pixel 4");
        capabilities.setCapability("useVirtualDevice", true);
        capabilities.setCapability("platformVersion", "10");

//        capabilities.setCapability("appiumVersion", "1.20.2");
//        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("app", "PUBLIC:ExpenseAppVer1.0.apk");
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
