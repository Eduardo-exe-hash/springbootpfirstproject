
# Título do Projeto

Projeto CRUD(Create, Read, Update, Delete) de Sistema de Controle de Estoques utilizando Spring Boot e suas dependências

Banco de dados usados: H2 Database e Postman

URL base do projeto: localhost:8080/produtos

## Documentação da API de Controle de Estoques

#### Inserindo os dados no banco

```http
  POST /produtos
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `name` | `string` | nome do produto |

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `stock`      | `int` | informar o estoque  |

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `price`      | `float` | informar numero real |


#### Inserindo item utilizando O POST em formato json
```http
json 
{
    "name": "Leite Ninho"
    "stock": 20,
    "price": 24,50
}

```
### Após o cadastro, verificar se o produto foi cadastrado
```http
  GET /produtos
```
### Caso necessite deletar algum produto, após a remoção, verifique, por meio do GET/produtos, se o produto foi deletado
```http
DELETE/produtos
```
#### Requisição retorna o 200 OK, significando que a requisição(GET,POST e DELETE) foram bem sucedidas

Possíveis erros de requisição que pode acontecer durante a verificação:

Error 404 Not Found: Erro de usuário não encontrado. Ocorre quando a url estiver incorreta

Error 400 Bad Request: Erro de dados inválidos
