# Etapa 4 — Análise de uma solução alternativa

## Solução analisada

Outro desenvolvedor fez o sistema com uma única classe `EditorDeTexto`, com
atributos e `if` pra cada formatação:

```java
public String exibir() {
    String resultado = texto;
    if (negrito) resultado = "<b>" + resultado + "</b>";
    if (italico) resultado = "<i>" + resultado + "</i>";
    if (sublinhado) resultado = "<u>" + resultado + "</u>";
    return resultado;
}
```

## Análise

O problema dessa abordagem aparece quando começam a pedir formatações novas. Toda vez tem que abrir a `EditorDeTexto` e colocar mais um atributo e mais um `if`. Com tachado, caixa alta, cor, tamanho, etc... ela vai crescendo até virar uma classe gigante que sabe fazer tudo, difícil de ler e de testar cada formatação sozinha. E a ordem fica presa no código, o usuário não escolhe se o negrito vem antes ou depois do itálico.

Isso viola o Aberto/Fechado, porque não tem como estender sem modificar a classe. E também a Responsabilidade Única, ela cuida do texto e de todas as formatações ao mesmo tempo, qualquer mudança cai nela.

Com o Decorator cada `if` vira uma classe. O `if (negrito)` vira o `NegritoDecorator`, e assim por diante. O editor fica só com o texto, e quem monta a combinação é o cliente, embrulhando um no outro. Formatação nova é classe nova, como foi na v3 com o tachado e a caixa alta.

Mas nem sempre precisa disso. Se fossem poucas formatações e não fosse entrar outras, tipo só negrito, um `boolean` e um `if` resolviam, criar interface e decorador seria exagero. O Decorator vale a pena quando as formatações vão crescer e precisam ser combinadas de jeitos diferentes, que é o caso desse editor.
