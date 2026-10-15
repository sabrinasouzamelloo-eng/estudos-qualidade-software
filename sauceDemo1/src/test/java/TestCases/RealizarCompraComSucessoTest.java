package TestCases;

import Framework.TesteBase;
import Tasks.LoginTask;
import Tasks.ProdutoTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucessoTest extends TesteBase {

    private  final WebDriver driver = getDriveManeger();

    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);

    @Test
    public void realizarCompra() throws InterruptedException{

        loginTask.efetuarLogin();
        produtoTask.selecionarProduto();
    }
}
