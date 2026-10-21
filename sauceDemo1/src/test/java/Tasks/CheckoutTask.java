package Tasks;

import PageObjects.CheckoutPage;
import Validacao.GenericValidacao;
import org.openqa.selenium.WebDriver;

public class CheckoutTask {
    private WebDriver driver;

    private CheckoutPage checkoutPage;
    private GenericValidacao genericValidacao;

    public CheckoutTask(WebDriver driver){
        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        genericValidacao = new GenericValidacao(this.driver);
    }

    public void preencherCheckout(){
      genericValidacao.validacaoTitlePages("Checkout:Your Information");
      checkoutPage.getFirstNameInput().sendKeys("Sabrina");
      checkoutPage.getLastNameInput().sendKeys("Mello");
      checkoutPage.getZipCodeInput().sendKeys("123456789");
      checkoutPage.getContinueButton().click();
      genericValidacao.validacaoTitlePages("Checkout: Overview");
      genericValidacao.validacaoProduto();
    }
}
