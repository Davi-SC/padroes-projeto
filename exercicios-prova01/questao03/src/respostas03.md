# QUESTÃO 3

**Um sistema acadêmico precisa gerar documentos para alunos, como declaração de matrícula, histórico
escolar e certificado de conclusão.\
Todos os documentos seguem um fluxo semelhante:**

1. buscar os dados do aluno;
2. montar o cabeçalho institucional;
3. gerar o corpo do documento;
4. assinar digitalmente;
5. disponibilizar para download.

**Apesar de o fluxo geral ser o mesmo, o conteúdo do corpo do documento muda conforme o tipo de documento emitido. A equipe quer evitar duplicação de código.\
O que se pede:**

a) Identifique o padrão de projeto mais adequado;

- O padrão mais adequado é o template method.

b) Justifique por que ele resolve bem o problema;

O Template Method resolve o problema pois :
- Define o esqueleto do algoritmo em um metodo final da classe abstrata, garantindo a sequencia de passos
- Implementa os passos que são constantes diretamente na superclasse, evitando duplicação de codigo
- Declara os passos que variam como metodos abstratos forçando as subclasses a implementarem apenas o que é específico de cada uma

c) Explique como ele ajuda a manter o fluxo fixo e variar apenas partes específicas;

O método principal é declarado como final na classe abstrata, impedindo que subclasses alterem a sequencia de execução dos passos.
Apenas o metodo que varia é declarado como abstrato, o resto é herdao pronto, garantindo consistência e evitando repetição de codigo

d) Elabore o diagrama de classes;



e) Implemente a solução em Java.