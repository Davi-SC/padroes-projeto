# Questao 04
**Uma empresa desenvolveu um player de vídeo para treinamento corporativo. O player pode estar nos
estados:\
\
• Reproduzindo\
• Pausado\
• Parado\
\
Dependendo do estado atual, as ações do usuário devem se comportar de maneira diferente. Por exemplo:\
\
• ao clicar em play quando o vídeo está pausado, ele continua do ponto em que parou;\
• ao clicar em play quando o vídeo está parado, o vídeo começa do início;\
• ao clicar em pause quando já está pausado, nada deve acontecer;\
• ao clicar em stop quando está reproduzindo, o vídeo é encerrado.\
\
O sistema ficou muito confuso porque todas essas regras estão dentro de uma única classe, usando várias
condicionais.**

O que se pede:

a) Identifique o padrão de projeto mais adequado;(0.5)\
*O padrão mais adequado é o State.*

b) Justifique a escolha;(0.5)\
*O state é a melhor opção para o caso, pois como ja mostra, o problema envolve os estados do objeto, e seu comportamento muda a partir desses estados.*

c) Explique como os comportamentos mudam de acordo com o estado;(1)\
*A partir do estado do objeto(player), o comportamento dele será alterado. O objeto não precisa ser criado novamente, a sua instancia muda a partir dos métodos implementados.*

d) Elabore o diagrama de classes (1);

e) Implemente a solução em Java (2).
