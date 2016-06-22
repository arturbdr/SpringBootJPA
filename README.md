# SpringBootJPA


Projeto desenvolvido com Spring Boot para verificar o funcionamento da do Spring Boot JPA com um banco de dados in memory.
Versão do Spring Boot utilizada 1.3.3.RELEASE

Fiz o projeto para avaliar quais os passos necessários para configurar uma aplicação e iniciar o desenvolvimento com:
1 - Export Serviços REST
2 - JPA
3 - Banco de Dados InMemory (nesse caso utilizei o HSQLDB)

Em pouco tempo (cerca de 20 minutos) o projeto já estava com as configurações prontas para o desenvolvimento. A utilização do SpringBoot (com as devidas dependências no pom, e respetivas annotations) simplifica muito bastante o setup necessários para preparar um projeto configurando os frameworks desejados um por um.
A utilização das APIs para o desenvolvimento unida às anotações do Spring transparecem a implementação concreta de determinado framework (como Hibernate, nesse projeto, por exemplo e respectiva base de dados). Eventuais migrações para outras bases de dados sejam banco de dados fica transparente para a aplicação.

Utilizei o GUAVA apenas para facilitar a conversão de Iterator para List. Fiz uso da classe 'Lists'.
