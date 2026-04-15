# Questão 01
Uma empresa está desenvolvendo um sistema de relatórios financeiros. Esse sistema precisa exportar
relatórios em diferentes formatos, como PDF, CSV e XML. A forma de exportação pode mudar de acordo
com a escolha do usuário no momento da execução, sem que seja necessário alterar o restante do sistema.
Atualmente, o desenvolvedor utilizou vários blocos de if/else para decidir como cada relatório será
exportado. O sistema funciona, mas ficou difícil de manter, e a equipe sabe que futuramente poderão surgir
novos formatos de exportação.

O que se pede:

a) Identifique o padrão de projeto mais adequado para esse cenário;

~~O padrão mais adequado é o Template Method~~

- Na verdade o mais adequado é o Strategy, errei na primeira resposta.

b) Justifique por que esse padrão é o mais apropriado;

~~O template method é o mais apropriao pois é baseado em herança, e vai permitir que as subclasses especificas para cada formato(PDF,CSV e XML) determinem seus metodos específicos seguindo uma estrutura central comum a todas~~

- O padrão strategy é o mais adequado pois encapsula cada formato de exportação em classes estratégicas independentes que implementam uma interface comum. Com isso, o usuário pode fazer a seleção em runtime, novos formatos são adicionados apenas criando novas classes sem modificar as existentes e cada estratégia pode ser testada separadamente.

c) Explique por que outras abordagens com muitas condicionais prejudicam a manutenção;

Uma abordagem com muitas condições introduz muita complexidade, possibilidade de erro e dificulta manutenção e escalabilidade, uma vez que, todas as diferentes implementações para cada formato de relatório estariam em um mesmo arquivo, e qualquer alteração dos formatos existentes ou introdução de um novo formato poderia quebrar toda a classe.
- O Template Method também resolveria o problema de muitas condicionais, mas como precisa trocar a forma de exportação em tempo de execução, o Strategy é mais adequado.

d) Elabore o diagrama de classes da solução;

- @DiagramClassesQ01.puml

e) Implemente a solução em Java.