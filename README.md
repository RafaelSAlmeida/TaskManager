# Task Manager

Gerenciador de tarefas

## Getting Started
Instruções básicas para execução do projeto em ambiente local.

### Pré requisitos

```
Java SDK 8
IDE que preferir
```

### Instalação

```
Realizar git clone do repositório no local desejado.
Abrir o projeto na IDE de preferência.
Baixar o arquivo taskManagerBD referente ao banco de dados, e importar no MYSQL.
Executar o comando mvn spring-boot:run
```

### Chamada básica API REST

```
localhost:8085/api/taskAll GET - Retornar todas as tasks
localhost:8085/api/task/{id} GET - Retornar a task desejada
localhost:8085/api/taskAdd POST - Adiciona uma nova task ou atualiza uma já existente caso passe um id
localhost:8085/api/taskDel/{id} GET - Remove uma task
```

### Author

* **Rafael Almeida** - [RafaelSAlmeida](https://github.com/RafaelSAlmeida)
