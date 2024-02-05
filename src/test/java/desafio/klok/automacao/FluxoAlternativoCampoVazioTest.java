package desafio.klok.automacao;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FluxoAlternativoCampoVazioTest extends TesteAutomatizado {

    @Test
    public void testCampoVazio() {
        driver.get("https://www.submarino.com.br");

        // Localizar o campo de busca
        WebElement campoBusca = driver.findElement(By.name("conteudo"));

        // Deixar o campo de busca vazio
        campoBusca.clear();

        // Pressionar Enter para realizar a busca
        campoBusca.sendKeys(Keys.RETURN);

        // Aguardar até que a mensagem de nenhum resultado seja exibida
        WebElement mensagemSemResultado = driver.findElement(By.id("rsyswpsdk"));

        // Verificar se a mensagem de nenhum resultado está presente
        Assert.assertTrue("Mensagem de nenhum resultado não encontrada", mensagemSemResultado.isDisplayed());
    }
}