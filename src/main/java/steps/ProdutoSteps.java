package steps;

import cucumber.api.java.pt.Quando;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import utils.ContextoSetup;

public class ProdutoSteps {

    ContextoSetup contextoSetup;

    public ProdutoSteps (ContextoSetup contextoSetup){
        this.contextoSetup = contextoSetup;
    }

    @Quando("^eu incluo o produto no carrinho$")
    public void euIncluoOProdutoNoCarrinho() {
        contextoSetup.driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Backpack')]")).click();
        contextoSetup.driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        contextoSetup.driver.findElement(By.name("back-to-products")).click();
    }
}
