#AFROCODIGOS - PROJETO FINAL

Autora: Juliana Chaves Palm
Professora: Analu

#### Descrição
Este projeto implementa um sistema bancário utilizando Java com Spring Boot e PostgreSQL. O sistema permite o gerenciamento de contas correntes e pagamentos, além de transações financeiras entre clientes.

#### Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

#### Dependências do Projeto
- `spring-boot-starter-web`
- `spring-boot-starter-data-jpa`
- `postgresql`

#### Estrutura do Projeto
```
afrobank/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── tech.afrobank/
│   │   │   │   ├── controller/
│   │   │   │   │   ├── CustomerController.java
│   │   │   │   │   ├── AccountController.java
│   │   │   │   │   └── TransactionController.java
│   │   │   │   ├── entity/
│   │   │   │   │   ├── Customer.java
│   │   │   │   │   ├── Account.java
│   │   │   │   │   └── Transaction.java
│   │   │   │   ├── repository/
│   │   │   │   │   ├── CustomerRepository.java
│   │   │   │   │   ├── AccountRepository.java
│   │   │   │   │   └── TransactionRepository.java
│   │   │   │   └── service/
│   │   │   │       ├── CustomerService.java
│   │   │   │       ├── AccountService.java
│   │   │   │       └── TransactionService.java
│   │   │   └── tech.afrobank.Application.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── schema.sql
│   │       └── data.sql
│   └── test/
│       ├── java/
│       │   └── tech.afrobank/
│       │       ├── controller/
│       │       │   └── CustomerControllerTest.java
│       │       └── service/
│       │           └── CustomerServiceTest.java
│       └── resources/
│           └── test-data.sql
└── pom.xml
```

#### Configuração do Banco de Dados
- Utiliza PostgreSQL
- Script de criação de schema (`schema.sql`) e dados de exemplo (`data.sql`) disponíveis em `src/main/resources/`

#### Como Rodar o Projeto
1. Clone o repositório do GitHub: `git clone https://github.com/seu-usuario/seu-repositorio.git`
2. Navegue até o diretório do projeto: `cd afrobank`
3. Compile o projeto utilizando Maven: `mvn clean package`
4. Execute o projeto Spring Boot: `java -jar target/afrobank-1.0-SNAPSHOT.jar`
5. Acesse a API através do navegador ou ferramenta como Postman: `http://localhost:8080`

#### Endpoints da API
- **POST /api/customers**: Cria um novo cliente
- **GET /api/customers/{id}**: Retorna informações de um cliente específico
- **PUT /api/customers/{id}**: Atualiza informações de um cliente
- **DELETE /api/customers/{id}**: Remove um cliente
- **POST /api/accounts**: Cria uma nova conta
- **GET /api/accounts/{id}**: Retorna informações de uma conta específica
- **POST /api/transactions**: Realiza uma nova transação financeira
- **GET /api/transactions/{id}**: Retorna informações de uma transação específica

#### Contribuição
Para contribuir com este projeto, siga os seguintes passos:
1. Fork do repositório
2. Crie uma branch para sua feature: `git checkout -b minha-feature`
3. Commit suas mudanças: `git commit -m 'Adiciona nova feature'`
4. Push para a branch: `git push origin minha-feature`
5. Submeta um pull request

#### Licença
Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT).
