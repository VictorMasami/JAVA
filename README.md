## Início rápido

Este repositório contém um exemplo simples em Java que demonstra o uso de uma classe `Retangulo`.

### Estrutura

- `src/` — código-fonte Java (classe `Retangulo`).
- `lib/` — dependências (se houver).
- `bin/` — saída compilada (gerada após compilação).

### Como compilar e executar (linha de comando)

1. Abra um terminal (PowerShell) no diretório do projeto (`c:\Users\vima3\Desktop\Projetos Java\retangulo`).

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
- O comando `javac -d bin src/Retangulo.java` cria a pasta `bin` (se necessário) e grava as classes lá.
- Se adicionar mais classes, você pode compilar todo o diretório `src` com `javac -d bin src/*.java`.

### Executando no VS Code

- Abra a pasta do projeto no VS Code.
- Instale a extensão "Extension Pack for Java" se ainda não tiver.
- Use a visão "JAVA PROJECTS" para compilar e executar facilmente.

### Próximos passos

- Adicionar testes, configurar CI e escolher uma licença (há um `LICENSE` neste repositório).

Mais informações sobre desenvolvimento Java no VS Code:
https://code.visualstudio.com/docs/java/java-projects
