package Framework.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriveManager {

    private  static WebDriver driver;

    private static WebDriver GetManagerDrive(TypeBrowser type){

        switch (type){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                options.addArguments("--incognito");
                driver = new ChromeDriver(options);
                break;


                case EDGE:
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeoptions = new EdgeOptions();
                edgeoptions.addArguments("--start-maximized");
                edgeoptions.addArguments("--incognito");
                driver = new EdgeDriver(edgeoptions);
                break;

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

            case HEADLESS:
                WebDriverManager.chromedriver().setup();
                ChromeOptions headlessoptions = new ChromeOptions();
                headlessoptions.addArguments("--start-maximized");
                headlessoptions.addArguments("--windon()");
                driver = new ChromeDriver(headlessoptions);
                break;

        }
        return driver;


    }
    public static WebDriver getDriver(TypeBrowser type){
        if(driver == null){
            driver = GetManagerDrive(type);

        }
        return driver;
    }

    public  static void fecharDriver(){
        if (driver !=null){
            driver.quit();
            driver = null;
        }
    }
}
