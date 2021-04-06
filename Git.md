# Git

Git é um dos versionadores de codigo encontrado no mercado, sendo ele o mais famoso.

## Anotações

- `git init` inicia o repositorio **git**, do qual é um repositorio escondido.
- `git add [nome da pasta/arquivo]` ou `git add *` adiciona os  arquivos ou pastas para serem **comitados**.  A partir desse comando os arquivos estão prestes a entrar em cena (*staging*).

```bash
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
```

- `git commit -m "Frase descrevendo o repertorio"` **comita** os arquivos ou diretorios. Apesar do reportorio ou arquivo está em desevolvimento local ainda, vamos dizer que eles já entraram em cena. São os atores definitivos.
- `git push -u origin master` leva os arquivos para o palco que pode ser o **Github**, **Gitlab**, entre outros. Aqui fica um adendo que a **Linux** recomenda chamar a *branch* de ***main***, ao invez de ***master*** . Porém esse comando só funcionará se foi escrito este comando no terminal.
- `git remote add origin https://github.com/LeiteSS/recipes-book.git` adiciona o repertorio onde você quer enviar teus arquivos. 
- `git config --global user.email "estoudente.program@gmail.com"` para configurar o email do **github** ou **gitlab**.
- `git config --global user.nickname "LeiteSS"` para configurar o *nickname* usado no **github** ou **gitlab**.
- `git config --global --unset user.nickname` e `git config --global --unset user.email` para limpar as configurações de *email* e *nickname*. Após usar este dois comando foi usado o comando `git config` também.
- `git config --list` lista as configurações.
- `git remote -v` mostra as `urls`  adicionadas usando o `git remote add origin https://github.com/LeiteSS/recipes-book.git` .
- As vezes pode haver erro na atualização ou no comite, por exemplo: fez o comite a primeira vez, porém o `README.md` foi atualizado. Então o **git** irá dar um erro e a solução é dar um `pull` no repertorio com o comando `git pull origin master`. 