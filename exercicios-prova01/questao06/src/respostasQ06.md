#QUESTÃO 6

Um sistema de notificações corporativo precisa enviar mensagens por diferentes canais externos. Porém, cada serviço de terceiro possui uma interface incompatível com o padrão esperado pelo sistema interno:

| Serviço Externo | Interface Existente |
|----------------|-------------------|
| **EmailService (legado)** | `enviarEmail(destinatario: String, assunto: String, corpo: String): boolean` |
| **SmsGateway (terceiro)** | `dispatchSms(numero: String, mensagem: String): boolean` |
| **PushAPI (cloud)** | `sendPush(token: String, title: String, body: String, priority: int): boolean` |

O sistema interno, porém, espera uma interface padronizada:
```java
interface Notificador {
    boolean notificar(String destinatario, String mensagem, String tipo);
}
```

A equipe precisa integrar esses serviços sem modificar nem o código do sistema principal, nem as bibliotecas externas.

a) Identifique o padrão de projeto mais adequado;  
- Adapter

b) Justifique por que esse padrão é o mais apropriado;  
- Converte Interfaces incompativeis; permite que classes diferentes sejam usadas atraves e uma interface comum esperada pelo cliente
- Reutilização de legado: possibilita usar bibliotecas antigas ou de terceiros sem precisar alterar todo o codigo fonte
- Integra novos serviços sem modificar o codigo existente do sistema principal

c) Explique como ele permite que interfaces incompatíveis trabalhem juntas;  
O adapter funciona como um "tradutor" entre duas interfaces, O sistema interno não sabe qual esta usando, ele apenas chama notificar e o adapter cuida da conversão

d) Elabore o diagrama de classes da solução;  


e) Implemente a solução em Java.
