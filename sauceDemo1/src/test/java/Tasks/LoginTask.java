package Tasks;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginTask {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTask(WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }

    public void efetuarLogin() throws InterruptedException {

        loginPage.getUserNameInput().sendKeys("standart_user");
        loginPage.getPasswordInput().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();
    }
}
