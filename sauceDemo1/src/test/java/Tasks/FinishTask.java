package Tasks;

import PageObjects.FinishPage;
import org.openqa.selenium.WebDriver;

public class FinishTask {

    private WebDriver driver;
    private FinishPage finishPage;

    public FinishTask(WebDriver driver){
        this.driver = driver;
        finishPage = new FinishPage(this.driver);

    }
    public void finalizarCompra(){

    }
}
