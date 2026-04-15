# QUESTÃO 2

**Um sistema de pagamentos de uma loja virtual precisa calcular o valor final de compra utilizando diferentes
políticas promocionais. Em algumas situações, aplica-se desconto percentual; em outras, frete grátis; em
outras, uma política de cashback. A política utilizada pode variar de acordo com campanhas e regras de
negócio.\
A equipe deseja uma solução flexível, permitindo trocar a lógica usada sem alterar a classe principal do
sistema.**

**O que se pede:**

a) Escolha o padrão de projeto mais adequado;
- O padrão mais adequado é o Strategy.

b) Justifique a escolha;
- O strategy permite encapsulamento do método que precisa ser alterado, de forma que as classes específicas implementam a interface principal de estratégia.

c) Mostre como o sistema poderá trocar o comportamento em tempo de execução;
- O sistema podera trocar o comportamento apenas chamando o método setStrategy, que vai modificar a instancia da classe Strategy sem criar uma nova, e tudo pode seguir em tempo de execução.

d) Elabore o diagrama de classes;

e) Implemente a solução em Java.