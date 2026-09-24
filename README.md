# Etapa 2 — Implementação melhorada

Commit das melhorias: [ver commit](https://github.com/Thalisson-Souza/APSOO-decorator/commit/7e197d6db047f03621ac29af3f42561d2e70c9fd)

A `Main` agora deixa o usuário digitar o texto e escolher pelo menu as formatações, na ordem que quiser. Cada escolha embrulha o editor atual num novo decorador.

O `EditorBasico` ganhou o `digitar()` pra trocar o texto. Como os decoradores chamam o `exibir()` na hora, a formatação vale pro texto novo também.

O `EditorDecorator` agora tem o `editor` como `final` e valida nulo no construtor. O `EditorBasico` também não aceita texto nulo.

Adição de testes pra validar decorador sozinho, encadeamento, repetir decorador, trocar texto e rejeitar nulo. Antes isso só era executado, não validado.

Tudo ainda mantendo o padrão Decorator, nenhum decorador concreto precisou mudar.

## Próxima etapa

A extensão com Tachado e Caixa Alta está em
[v3 — extensão do sistema](https://github.com/Thalisson-Souza/APSOO-decorator/tree/v3).
