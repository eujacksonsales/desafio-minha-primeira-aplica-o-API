# 📚 Minha Primeira Web API

Este projeto é uma API RESTful construída com **Spring Boot 3.1.8**, seguindo boas práticas de organização, segurança e documentação.  
A API permite o cadastro de usuários, autenticação e gestão de endereços via integração com o serviço ViaCep.

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 Database (banco de dados em memória)
- OpenFeign (consumo de API externa)
- Swagger (documentação da API)
- Maven

## 🏧 Estrutura do Projeto

- **controller**: Camada de entrada da aplicação (exposição dos endpoints).
- **service**: Regras de negócio da aplicação.
- **repository**: Interface com o banco de dados.
- **model/entity**: Representação das entidades no banco.
- **config**: Configurações de segurança e CORS.
- **dataloader**: Inicialização de dados (criação de um admin padrão).
- **exception**: Gerenciamento de exceções customizadas.

## 🛠️ Funcionalidades

- Cadastro de novos usuários.
- Atualização de usuários (exceto senha).
- Atualização de senha separadamente.
- Login com autenticação básica (Basic Auth).
- Busca automática de endereço via CEP usando a API ViaCep.
- Documentação interativa via Swagger.
- Proteção de rotas com Spring Security.

## 🧪 Como rodar o projeto localmente

1. Clone o repositório:

    ```bash
    git clone https://github.com/eujacksonsales/minha-primeira-web-api.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd minha-primeira-web-api
    ```

3. Execute o projeto:

    ```bash
    ./mvnw spring-boot:run
    ```

4. Acesse a aplicação:

    - Swagger: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
    - Banco H2: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

> **Nota**: As credenciais iniciais são criadas automaticamente via `DataLoader`.

## 🔐 Credenciais padrão

- **Usuário**: `admin`
- **Senha**: `admin123`

Essas credenciais podem ser usadas para autenticar no Swagger e no Postman.

## 📖 Endpoints principais

| Método   | Endpoint                | Descrição                                       |
|----------|--------------------------|-------------------------------------------------|
| `POST`   | `/usuarios`               | Cadastra um novo usuário                        |
| `PUT`    | `/usuarios/{id}`           | Atualiza dados do usuário (sem alterar a senha) |
| `PATCH`  | `/usuarios/{id}/senha`     | Atualiza apenas a senha do usuário              |
| `GET`    | `/usuarios`               | Lista todos os usuários                        |
| `GET`    | `/usuarios/{id}`           | Busca usuário por ID                           |
| `DELETE` | `/usuarios/{id}`           | Deleta usuário                                 |


## 🛡️ Segurança

- **Autenticação**: Basic Auth (usuário e senha enviados no header HTTP).
- **Proteção**: Todas as rotas são seguras, exceto o cadastro de usuário.
- **Transações**: Atualizações e criações usam `@Transactional` para garantir consistência no banco de dados.

## ⚙️ Observações

- O projeto usa banco **H2 em memória** — ao parar a aplicação, os dados serão perdidos (exceto o admin que é recarregado via `DataLoader`).
- Para ambiente real, recomenda-se utilizar banco persistente (como PostgreSQL ou MySQL).

## ✍️ Autor

Feito por [Jackson Sales].

## 📢 Contribuições

Fique à vontade para abrir issues e enviar PRs! 🚀
