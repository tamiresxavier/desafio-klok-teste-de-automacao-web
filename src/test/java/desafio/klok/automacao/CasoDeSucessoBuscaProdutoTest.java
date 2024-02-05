package desafio.klok.automacao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CasoDeSucessoBuscaProdutoTest extends TesteAutomatizado {

    @Test
    public void testBuscarProdutoComSucesso() {
        driver.get("https://www.submarino.com.br");

        // Localizar o campo de busca e inserir o termo desejado
        WebElement campoBusca = driver.findElement(By.name("conteudo"));
        campoBusca.sendKeys("livro e assim que acaba");

       // Pressionar Enter para realizar a busca
        campoBusca.sendKeys(Keys.RETURN);

        // Validar se os resultados contêm o produto desejado
        List<WebElement> resultados = driver.findElements(By.id("rsyswpsdk"));

        // Verificar se o nome do produto está presente nos resultados
        boolean produtoEncontrado = false;
        for (WebElement resultado : resultados) {
            String nomeProduto = resultado.findElement(By.id("rsyswpsdk")).getText();
            if (nomeProduto.contains("livro e assim que acaba")) {
                produtoEncontrado = true;
                break;
            }
        }
    }
}