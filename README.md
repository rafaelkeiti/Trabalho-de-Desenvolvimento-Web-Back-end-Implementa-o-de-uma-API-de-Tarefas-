## 🔗 Endpoints da API

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