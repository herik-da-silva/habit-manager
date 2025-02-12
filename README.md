# Gerenciamento de Hábitos ✨

Este é um projeto de API REST desenvolvida com Java e Spring Boot para o gerenciamento de hábitos.

## Tecnologias Utilizadas
- Java 21
- Spring Boot 3.4.2
- Spring Data JPA
- Hibernate
- Banco de Dados Relacional (exemplo: H2, MySQL, PostgreSQL)

## Como Executar o Projeto

### Requisitos
- Java 21
- Maven
- Banco de Dados configurado (caso não use o H2)

### Passos para execução
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. Acesse o diretório do projeto:
   ```sh
   cd nome-do-repositorio
   ```
3. Compile e execute o projeto:
   ```sh
   mvn spring-boot:run
   ```
4. A API estará disponível em: `http://localhost:8080`

## Endpoints da API

### Criar um hábito
```sh
curl --request POST \
  --url http://localhost:8080/api/habitos \
  --header 'Content-Type: application/json' \
  --data '{
    "nome": "Ler",
    "descricao": "Ler 30 minutos por dia",
    "dataInicial": "2023-10-01",
    "dataFinal": "2023-12-31",
    "completo": false
}'
```

### Buscar todos os hábitos
```sh
curl --request GET \
  --url http://localhost:8080/api/habitos
```

### Buscar um hábito por ID
```sh
curl --request GET \
  --url http://localhost:8080/api/habitos/{id}
```

### Atualizar um hábito
```sh
curl --request PUT \
  --url http://localhost:8080/api/habitos/{id} \
  --header 'Content-Type: application/json' \
  --data '{
    "nome": "Estudar",
    "descricao": "Estudar todos os dias",
    "dataInicial": "2023-10-08",
    "dataFinal": "2023-12-31",
    "completo": false
}'
```

### Deletar um hábito
```sh
curl --request DELETE \
  --url http://localhost:8080/api/habitos/{id}
```
