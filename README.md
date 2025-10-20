## Trabalho de Desenvolvimento Web Back end: Implementação de uma API de Tarefas 


### 🛠️ Configuração do Banco de Dados (MySQL via XAMPP)

Para este projeto, foi utilizado o **MySQL** fornecido pelo **XAMPP**, utilizando o **phpMyAdmin** para gerenciar o banco de dados de forma visual.

#### 🔧 Etapas para configurar o banco:

1. Inicie o **XAMPP** e ative os serviços:

   * ✅ Apache
   * ✅ MySQL

2. Acesse o **phpMyAdmin** pelo navegador:

   ```
   http://localhost/phpmyadmin
   ```

3. Crie um novo banco de dados com as seguintes configurações:

   * **Nome do banco**: `api_tarefas_db`
   * **Colação (collation)**: `utf8mb4_general_ci`

### ✅ Funcionando?

Se o banco estiver corretamente configurado e o projeto for iniciado com sucesso, o Spring Boot criará automaticamente a tabela `tarefas` no banco `api_tarefas_db`.




## 🔗 Endpoints da API utilizado no Postman

### ✅ 1. Criar uma tarefa

* **Método**: `POST`
* **URL**: `http://localhost:8080/api/tarefas`
* **Body (JSON)**:

```json
{
  "nome": "Desenvolvimento da API",
  "responsavel": "Rafael Keiti Azuma - RU: 4845625",
  "dataEntrega": "12-12-2025"
}
```

* **Resposta esperada**:

```json
{
  "id": 1,
  "nome": "Desenvolvimento da API",
  "responsavel": "Rafael Keiti Azuma - RU: 4845625",
  "dataEntrega": "12-12-2025"
}
```

---

### 🔎 2. Listar todas as tarefas

* **Método**: `GET`

* **URL**: `http://localhost:8080/api/tarefas`

* **Resposta esperada**:

```json
[
  {
    "id": 1,
    "nome": "Desenvolvimento da API",
    "responsavel": "Rafael Keiti Azuma - RU: 4845625",
    "dataEntrega": "12-12-2025"
  }
]
```

---

### 🔍 3. Consultar tarefa por ID

* **Método**: `GET`
* **URL**: `http://localhost:8080/api/tarefas/{id}`

**Exemplo:**

```
http://localhost:8080/api/tarefas/1
```

* **Resposta esperada**:

```json
{
  "id": 1,
  "nome": "Desenvolvimento da API",
  "responsavel": "Rafael Keiti Azuma - RU: 4845625",
  "dataEntrega": "12-12-2025"
}
```

---

### ✏️ 4. Atualizar uma tarefa

* **Método**: `PUT`
* **URL**: `http://localhost:8080/api/tarefas/{id}`

**Exemplo:**

```
http://localhost:8080/api/tarefas/1
```

* **Body (JSON)**:

```json
{
  "nome": "Desenvolvimento da API",
  "responsavel": "Rafael Keiti Azuma - RU: 4845625",
  "dataEntrega": "12-12-2025"
}
```

* **Resposta esperada**:

```json
{
  "id": 1,
  "nome": "Desenvolvimento da API",
  "responsavel": "Rafael Keiti Azuma - RU: 4845625",
  "dataEntrega": "12-12-2025"
}
```

---

### ❌ 5. Deletar uma tarefa

* **Método**: `DELETE`
* **URL**: `http://localhost:8080/api/tarefas/{id}`

**Exemplo:**

```
http://localhost:8080/api/tarefas/1
```

* **Resposta esperada**: `204 No Content`