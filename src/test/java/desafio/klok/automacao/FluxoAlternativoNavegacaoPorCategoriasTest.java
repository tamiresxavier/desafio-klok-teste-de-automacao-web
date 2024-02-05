package desafio.klok.automacao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FluxoAlternativoNavegacaoPorCategoriasTest extends TesteAutomatizado {

    @Test
    public void testNavegacaoPorCategorias() {
        driver.get("https://www.submarino.com.br");

        // Localizar e clicar em uma categoria específica
        WebElement categoria = driver.findElement(By.id("rsyswpsdk"));
        categoria.click();

        // Validar se os produtos exibidos pertencem à categoria selecionada
        List<WebElement> produtos = driver.findElements(By.id("rsyswpsdk"));

        // Exemplo: Verificar se cada produto possui a categoria desejada
        for (WebElement produto : produtos) {
            String categoriaProduto = produto.findElement(By.id("rsyswpsdk")).getText();
            Assert.assertEquals("Produto fora da categoria selecionada", "Categoria Desejada", categoriaProduto);
        }  
    }
}