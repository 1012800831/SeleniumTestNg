import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMultipleThreads {

    @Test
    public void loadTestThisWebsite() {
        System.setProperty ( "webdriver.firefox.bin" , "C:/Program Files/Mozilla Firefox/firefox.exe" );
        System.setProperty("webdriver.gecko.driver","D:/wangdi_workspace/workspace/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.yiibai.com");
        System.out.println("Page Title is " + driver.getTitle());
        driver.quit();

    }
}