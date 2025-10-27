## Início rápido

Este diretório contém o projeto de exemplo `Retangulo`.

### Estrutura do projeto

- `src/` — código-fonte Java (classe `Retangulo`).
- `lib/` — dependências (se houver).
- `bin/` — saída compilada (gerada após compilação).

### Como compilar e executar (linha de comando)

1. Abra um terminal (PowerShell) no diretório do projeto (`projects/retangulo`).

2. Compile o código colocando os .class em `bin/`:

```powershell
md bin -ErrorAction SilentlyContinue
javac -d bin src/Retangulo.java
```

3. Execute a aplicação:

```powershell
java -cp bin Retangulo
```

Observações:
- Use `javac -d bin src/*.java` para compilar múltiplas classes.
