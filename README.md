# Etapa 2 - Implementação e revisão crítica

## Prompt utilizado

```text
Oi, preciso fazer um trabalho de padrões de projeto em Java usando o Decorator. O cenário é um editor de texto simples que no começo só mostra o texto que o usuário digitou, mas tem que dar pra adicionar formatação tipo negrito, itálico e sublinhado, e combinar elas sem ficar criando uma classe pra cada combinação (TextoNegritoItalico e essas coisas).

Eu já fiz o diagrama UML assim: uma interface EditorTexto (Component) com o método String exibir(), uma classe EditorBasico (ConcreteComponent) que só devolve o texto, uma classe abstrata EditorDecorator (Decorator) que implementa EditorTexto e guarda uma referência pra um EditorTexto, e os decoradores NegritoDecorator, ItalicoDecorator e SublinhadoDecorator que estendem o EditorDecorator.

Pode implementar seguindo esse diagrama? Coloca cada classe no seu arquivo, usa os pacotes decorator.editor, decorator.formatacao e decorator.app, e faz uma Main que mostre as formatações sendo combinadas. Usa Java 11 com Maven, sem dependência externa.
```

## O que foi feito na `v2-p1`

Commit da implementação inicial: [ver commit](https://github.com/Thalisson-Souza/APSOO-decorator/commit/83d18c5e28d54ed3d515f1f5088bdbee87ba71e2)

Foi implementada a estrutura inicial do Decorator em Java seguindo o diagrama da
v1. `EditorTexto` é o Component, `EditorBasico` o ConcreteComponent,
`EditorDecorator` o Decorator e `NegritoDecorator`, `ItalicoDecorator` e
`SublinhadoDecorator` os ConcreteDecorators.

A `Main` mostra as formatações combinadas sem ter uma classe pra cada combinação.

## Parte 2 — Revisão crítica

A implementação segue bem o diagrama e o Decorator do GoF. O `EditorDecorator` é um `EditorTexto` e guarda um `EditorTexto`, por isso dá pra fazer `new ItalicoDecorator(new NegritoDecorator(texto))`. Cada decorador chama o `exibir()` de dentro e só coloca a sua tag, e o `EditorBasico` não foi mexido.

Mas tem uns pontos incompletos. O cenário fala de texto digitado pelo usuário e o texto é fixo no código, não tem como digitar nem mudar depois.

O requisito pede um programa que permita combinar as formatações, a `Main` só imprime 4 combinações prontas, o usuário não escolhe nada...

No `EditorDecorator` o atributo `editor` não é `final` e não tem validação, `new NegritoDecorator(null)` passa e só estoura `NullPointerException` no `exibir()`.

Não tem testes, a `Main` só imprime e ninguém confere se a saída tá certa.

## Melhorias na v2-p2

Na `v2-p2`, realizei melhorias, como: deixar o usuário digitar o texto e escolher
as formatações, validação de nulo, atributo `final` e testes.

[Acessar a v2-p2 — implementação melhorada](https://github.com/Thalisson-Souza/APSOO-decorator/tree/v2-p2)
