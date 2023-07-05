## Serviço para consumir uma API externa de filmes:

:gear: Tecnologias
- Java 11.
- Frameworks: Spring Boot, Spring Cloud Openfeign, Spring Hateoas.
- Banco: JPA, MySQL ou H2.

## Projeto
Esta aplicação tem como objetivo demonstrar um dos exemplos de implementação para consumir uma API externa de filmes chamada omdbAPI, 
nesse serviço estamos consumindo os seus dados através de um Payload Json e em seguida retornaremos os seus valores através do método GET.

Nesta implementação utilizamos alguns dos verbos HTTP abaixo para fazer essa requisição:
- Listar todos os filmes já salvo no Banco.
- Listar um filme específico através do título.
- Listar um filme específico através do ID.
- Salvar um filme específico no banco de dados através do Body passado via Postman.

## 🔗 Endpoints

| Method | Route          | Description                         | Body required |
|--------|----------------|-------------------------------------|---------------|
| GET    | `/filme`       | Obter todos os filmes               | false         |
| GET    | `/omdb/{tema}` | Obter um titulo específico do filme | false         |
| GET    | `/filme/{id}`  | Obter um ID específico do filme     | false         |
| POST   | `/filme/`      | Salva um filme no Banco de Dados    | true          |
| DELETE | `/filme/{id}`  | Deleta um filme por ID específico   | false         |
## Exemplo URL

- localhost:8080/filme/omdb/{tema}

Para ter o acesso a essa API que foi utilizada para fazer essa requisição [clique aqui](https://omdbapi.com).
