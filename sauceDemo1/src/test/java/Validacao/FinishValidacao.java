package Validacao;

import PageObjects.FinishPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class FinishValidacao {
    private WebDriver driver;
    private FinishValidacao finishValidacao;

    public FinishValidacao(WebDriver driver){
        this.driver = driver;
        finishPage = new FinishPage(this.driver);
    }

    public void validationSucessoCompra(){
        try {
            Assertions.assertEquals("Thank you for your order!",finishPage.getFinishTextLabel());
        }catch (Exception e){
            e.getMessage();
        }


    }
}
