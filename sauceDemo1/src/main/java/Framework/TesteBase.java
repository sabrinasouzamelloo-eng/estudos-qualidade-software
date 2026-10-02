package Framework;

import Framework.Browser.DriveManager;
import Framework.Browser.TypeBrowser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TesteBase extends DriveManager {

    private static WebDriver driver;
    private static String URL = "https://share.google/TUd7XW8bUybQJupI1";

    public static WebDriver getDriveManeger(){

        driver = getDriver(TypeBrowser.CHROME);
        return driver;
    }

    @BeforeEach
    public void setup(){
        getDriveManeger().get(URL);
    }

    @AfterEach
    public void finish(){
        fecharDriver();
    }
}
