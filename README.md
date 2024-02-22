# Desafio Klok (Teste de Automação Web) - Portal de Comércio Online 🌐

## Estrutura do Projeto 🛠️

O projeto de testes automatizados é organizado de maneira clara:

- **TesteAutomatizado.java:** Configuração do WebDriver (ChromeDriver) e métodos de setup e teardown.
- **CasoDeSucessoBuscaProdutoTest.java:** Teste automatizado para validar a busca por produto com sucesso.
- **FluxoAlternativoCampoVazioTest.java:** Teste automatizado para validar a busca com campo vazio.
- **FluxoAlternativoNavegacaoPorCategoriasTest.java:** Teste automatizado para validar a navegação por categorias.

## Cenários - Testes Automatizados 🚀

### Caso de Sucesso - Busca por Produto 🎯

1. Abra o navegador e acesse o portal de comércio online.
2. Pesquise por um produto específico.
3. Valide se os resultados da busca correspondem ao produto desejado.

### Fluxo Alternativo - Campo Vazio ❓

1. Abra o navegador e acesse o portal de comércio online.
2. Realize uma busca com o campo vazio.
3. Valide se a mensagem de "Nenhum resultado encontrado" é exibida.

### Fluxo Alternativo - Navegação por Categorias 🏷️

1. Abra o navegador e acesse o portal de comércio online.
2. Escolha uma categoria específica.
3. Valide se os produtos exibidos pertencem à categoria selecionada.

## Executando os Testes ▶️

1. Certifique-se de ter o ChromeDriver configurado no caminho especificado no arquivo de configuração.
2. Execute os testes usando uma ferramenta de execução de testes JUnit.

```bash
mvn test
```

Os testes serão executados, e os resultados serão apresentados no console.

## Consulta SQL 📊

Realiza uma consulta SQL para obter informações sobre clientes e apólices ativas.

```sql
SELECT clientes.nome AS NomeCliente, apolices.numero_apolice AS NumeroApolice, 
       apolices.tipo_seguro AS TipoSeguro, apolices.valor_premio AS ValorPremio
FROM clientes
JOIN apolices ON clientes.id_cliente = apolices.id_cliente
WHERE apolices.status = 'ativa';
```

