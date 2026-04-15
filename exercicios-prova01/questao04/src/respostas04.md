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
O padrão mais adequado é o State.

b) Justifique a escolha;(0.5)\
O State é a melhor opção pois:
- Elimina condicionais complexas, substituindo por classes edicadas para cada estado
- Cada estado encapsula sua propria lógica para as ações, facilitando testes e modificações futuras
- As mudanças e estado são controladas pelos proprios objetos de estado, centralizando a lógica de transição
- Adicionar um novo estado requer criar apenas uma nova classe.

c) Explique como os comportamentos mudam de acordo com o estado;(1)\
A classe player mantem uma referencia para um objeto PlayerState, quando p usuário chama player.play() o Player delega a execução para o metodo play() o estado atual.

d) Elabore o diagrama de classes (1);


e) Implemente a solução em Java (2).
