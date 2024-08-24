## Relatório de Testes em Caixa Preta

A aplicação disponibilizada não seguiu as orientações de implementação especificadas no enunciado do exercício.

Especificamente, foi definido os parâmetros para o cálculo no seguinte formato:

```java
public class SimuladorCashBack {
/**
* Calcula o valor de cashback baseado no valor da compra e no grau de
fidelidade do cliente.
* @param valorCompra o valor total da compra
* @param grauFidelidade o grau de fidelidade do cliente (Bronze, Prata,
Ouro)
* @return o valor de cashback calculado
*/
public static double calculaCashBack(double valorCompra, String grauFidelidade) {
// Implementação do método
}
}
```
A aplicação alterou os parâmetros, para (double valorCompra, enum grauFidelidadeEnum) implicando uma mudança na estrutura dos testes.

Foram testados os valores limite de cada partição de equivalencia definidos em:

```
O sistema deve registrar os valores das compras dos clientes, a porcentagem
de cashback oferecida e o grau de fidelidade do cliente.
• O cálculo de cashback deve ser baseado em:
• Valor Total das Compras: Total gasto pelo cliente em um período
específico.
• Percentual de Cashback Baseado em Faixas de Valor:
▪ Até R$ 100: Cashback de 5%.
▪ De R$ 100,01 até R$ 500: Cashback de 10%.
▪ Acima de R$ 500: Cashback de 15%.
• Grau de Fidelidade do Cliente: Pode ser "Bronze", "Prata" ou "Ouro",
com ajustes adicionais no cashback:
▪ Bronze: Nenhum ajuste.
▪ Prata: Aumento de 5% no percentual de cashback.
▪ Ouro: Aumento de 10% no percentual de cashback.
2. O valor de cashback final deve ser calculado e apresentado ao cliente de
forma clara.
```

O arquivo testando-aplicacao-colega/src/test/java/cashback/CashbackTest.java

Implementa 24 testes, desses apenas 5 passaram.

Contudo é preciso resaltar casos como esses:

![image](https://github.com/user-attachments/assets/b19b4d2e-96fd-430d-9992-77a811c93369)

Mesmo com a tolerancia em 2 casas decimais o teste retornou negativo

