# Etapa 3 — Extensão do sistema

## Objetivo

O editor precisa agora de texto tachado e caixa alta. Adicione os dois sem
modificar nenhuma classe ou interface existente.

Commit da extensão: [ver commit](https://github.com/Thalisson-Souza/APSOO-decorator/commit/e34cd496db89c651887e893c1845c5b3b5e48007)

## Classes criadas

Foi criada a classe `TachadoDecorator`, que estende `EditorDecorator` e coloca a tag `<s>` no texto.

Também foi criada a `CaixaAltaDecorator`, que deixa o texto em maiúsculo. Só dar `toUpperCase()` transformava o `<b>` em `<B>`, então ela só muda o que tá fora das tags.

Foi criada a `MainEtapa3` pra demonstrar as combinações pedidas:

```java
EditorTexto a = new CaixaAltaDecorator(
        new SublinhadoDecorator(new NegritoDecorator(new EditorBasico("Olá, mundo!"))));
// <u><b>OLÁ, MUNDO!</b></u>

EditorTexto b = new TachadoDecorator(new ItalicoDecorator(new EditorBasico("Olá, mundo!")));
// <s><i>Olá, mundo!</i></s>
```

## Por que não precisou mexer no que já existia

Cada decorador só depende da interface `EditorTexto`. O novo não precisa conhecer os outros e os outros não precisam conhecer ele. Então o sistema tá aberto pra extensão e fechado pra modificação.

## Como funciona o encadeamento

Cada decorador guarda um `EditorTexto`. O de fora chama o `exibir()` do de dentro até chegar no `EditorBasico`, e na volta cada um coloca sua formatação.

```text
CaixaAlta → Sublinhado → Negrito → EditorBasico  = "Olá"
                         Negrito                 = "<b>Olá</b>"
            Sublinhado                           = "<u><b>Olá</b></u>"
CaixaAlta                                        = "<u><b>OLÁ</b></u>"
```

Por isso a ordem importa, o último aplicado é o de fora.

## Um decorador pra tudo x um por funcionalidade

Um decorador só pra tudo ia ter vários `if` dentro e toda formatação nova ia mexer nele. Volta o mesmo problema de ter uma classe só.

Um por funcionalidade, cada classe faz uma coisa, é fácil de testar, e quem combina é o cliente na hora.

## Comparação com uma classe por combinação

Teria que ter classes como:

- TextoNegrito
- TextoItalico
- TextoNegritoItalico
- TextoNegritoItalicoSublinhado
- ...

Com n formatações seria:

```text
2^n - 1 classes
```

No Decorator seria:

```text
n decoradores + interface + editor básico + decorador abstrato = n + 3 classes
```

Com 5 formatações seriam 31 classes contra 8. E cada formatação nova dobraria as classes, repetindo o código do negrito em todas que têm negrito. No Decorator é só uma classe nova, e dá pra combinar em qualquer ordem na hora de rodar.

Com esse padrão podemos combinar as formatações sem criar classes demais, ou mexer em código já existente.

## Próxima etapa

A análise da solução alternativa está em
[v4 — análise de uma solução alternativa](https://github.com/Thalisson-Souza/APSOO-decorator/tree/v4).
