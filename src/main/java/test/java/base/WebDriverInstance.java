package test.java.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebDriverInstance {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        if (driver.get() == null){
            try {
                driver.set(createDriver());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return driver.get();
    }

    public static WebDriver createDriver() throws IOException {
        WebDriver driver = null;

        Properties prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir") + "/src/test/java/resources/config.properties");
        prop.load(data);

        if (prop.getProperty("browser").equals("chrome")) {
            System.setProperty("WebDriver.chrome.driver",
                    System.getProperty("user.dir") + "/src/test/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (prop.getProperty("browser").equals("firefox")) {
            System.setProperty("WebDriver.gecko.driver",
                    System.getProperty("user.dir") + "/src/test/java/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("WebDriver.edge.driver",
                    System.getProperty("user.dir") + "/src/test/java/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }

    public static void cleanUpDriver(){
        driver.get().quit();
        driver.remove();
    }

}
