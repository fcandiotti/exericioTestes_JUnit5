## Teste para uma aplicação simples de financiamento:

### Tecnologias utilizadas:

- Java 11
- JUnit vanilla

### Resumo dos testes:

Um financiamento possui três dados:
- totalAmont: valor total de dinheiro financiado
- income: renda mensal do cliente que está financiando
- months: número de meses do financiamento
- 
E dois métodos:
- entry: entrada do financiamento, igual a 20% do valor total
- quota: prestação mensal do financiamento (sem juros)
---

`Há ainda uma regra: o valor da prestação não pode ser maior que metade da renda mensal do cliente. A seguir alguns exemplos de financiamentos para ajudar a entender a regra:`

---

## Testes implementados:

Construtor
- Deve criar o objeto com os dados corretos quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

setTotalAmount
- Deve atualizar o valor quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

setIncome
- Deve atualizar o valor quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

setMonths
- Deve atualizar o valor quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

entry
- Deve calcular corretamente o valor da entrada

quota
- Deve calcular corretamente o valor da prestação



