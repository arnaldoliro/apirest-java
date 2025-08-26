# API de Estudos com Java, Maven e Spring

Este projeto é uma **API básica** criada para fins de estudo e testes, utilizando Java, Maven e Spring Boot.

---

## 🔹 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.4.9**
- **Maven**
- **VS Code** (ou qualquer IDE de sua preferência)

---

## 🔹 Rotas da API

A API possui apenas **duas rotas** simples:

### 1. `GET /api/greeting`

- **Descrição:** Retorna uma mensagem de boas-vindas.
- **Exemplo de resposta:**

```json
{
  "message": "Hello, World!"
}
```

- **Uso com cURL:**

```bash
curl -X GET http://localhost:8080/api/greeting
```

---

### 2. `POST /api/echo`

- **Descrição:** Recebe uma mensagem do usuário e retorna exatamente a mesma mensagem.
- **Exemplo de requisição:**

```json
{
  "message": "Minha mensagem de teste"
}
```

- **Exemplo de resposta:**

```json
{
  "message": "Minha mensagem de teste"
}
```

- **Uso com cURL:**

```bash
curl -X POST http://localhost:8080/api/echo \
     -H "Content-Type: application/json" \
     -d '{"message":"Minha mensagem de teste"}'
```

---

## 🔹 Como Rodar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/arnaldoliro/apirest-java.git
cd apirest
```

2. Compile e rode a aplicação com Maven:

```bash
mvn clean install
mvn spring-boot:run
```

3. Acesse a API via `http://localhost:8080`.

---

## 🔹 Estrutura do Projeto

```
apirest
│
├─ src/main/java/br/com/apirest/apirest/
│   ├─ ApirestApplication.java
│   └─ SampleRestController.java
│
├─ src/main/resources/
│   └─ application.properties
│
├─ pom.xml
└─ mvnw / mvnw.cmd
```

---

## 🔹 Observações

- Projeto criado **apenas para estudo** e testes básicos de rotas.
- Não possui banco de dados ou autenticação.
- Simples e direto, ideal para aprender a criar endpoints REST com Spring Boot.

