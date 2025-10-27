## Repositório multi-projetos

Este repositório pode conter vários projetos pequenos. Cada projeto fica em `projects/<nome-do-projeto>`.

Projetos atuais:

- `projects/retangulo` — exemplo simples em Java com a classe `Retangulo`.

Para trabalhar no projeto `retangulo`:

```powershell
Set-Location -Path "c:\Users\vima3\Desktop\Projetos Java\retangulo\projects\retangulo"
md bin -ErrorAction SilentlyContinue
javac -d bin src/Retangulo.java
java -cp bin Retangulo
```

Abra `projects/retangulo/README.md` para instruções específicas do projeto.

