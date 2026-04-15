Uma aplicação corporativa possui uma classe de configuração responsável por armazenar parâmetros globais
do sistema, como:

- URL do banco de dados;
- usuário;
- senha;
- porta do servidor;
- idioma padrão.

A equipe identificou que várias partes do sistema estão criando novas instâncias dessa classe, o que pode
gerar inconsistências e desperdício de memória.\
O objetivo é garantir que exista uma única instância dessa
classe durante toda a execução da aplicação, acessível a partir de qualquer ponto do sistema.\
O que se pede:

a) Escolha o padrão de projeto mais adequado;
- Padrão singleton

b) Justifique por que ele deve ser usado nesse caso;
- O Singleton é o mais adequado pois limita a criação de uma unica instancia

c) Explique quais problemas podem surgir caso múltiplas instâncias sejam criadas;
- Se multiplas instancias a classe de configuração forem criadas, pode acontecer de mais de uma delas serem diferentes e gerarem conflitos

d) Elabore o diagrama de classes;
@startuml
'https://plantuml.com/class-diagram
class ConfiguracaoSingleton(){
-instance: ConfiguracaoSingleton
-Singleton(): void
+getInstance: Singleton
}

@enduml

e) Implemente a solução em Java.