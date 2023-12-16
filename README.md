# Projeto AlfaAirlines - Sistema de Agência de Viagens com Spring

Este projeto é a refatoração da aplicação web AlfaAirlines, utilizando o ecossistema Spring Framework para o back-end, com Java Spring Boot, Spring MVC, e persistência de dados utilizando Spring Data JPA. O banco de dados escolhido é o MongoDB para atender às especificações do projeto.

## Tecnologias Utilizadas

- [Spring Framework](https://spring.io/) - Plataforma para construção de aplicativos Java.
- [Spring Boot](https://spring.io/projects/spring-boot) - Simplifica o desenvolvimento de aplicativos Spring.
- [Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html) - Framework para o desenvolvimento de aplicações web.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Facilita a implementação da camada de persistência.
- [MongoDB](https://www.mongodb.com/) - Banco de dados NoSQL utilizado para persistência.

## Estrutura do Projeto

O projeto segue o padrão de projeto MVC tanto no back-end quanto no front-end. As views podem ser desenvolvidas utilizando a biblioteca React ou qualquer Java template engine, como Thymeleaf.

```plaintext
projeto-alfaairlines/
|-- src/
|   |-- main/
|       |-- java/
|           |-- com/
|               |-- alfaairlines/
|                   |-- controllers/     # Controladores Spring MVC
|                   |-- models/          # Entidades e modelos de dados
|                   |-- repositories/    # Interfaces de repositório Spring Data JPA
|                   |-- services/        # Serviços de negócios
|                   |-- AlfaAirlinesApplication.java # Classe principal do Spring Boot
|       |-- resources/
|           |-- static/                      # Recursos estáticos (CSS, JS, etc.)
|           |-- templates/                   # Templates para views Thymeleaf
|       |-- application.properties          # Configurações do Spring Boot
|-- README.md                               # Informações sobre o projeto
