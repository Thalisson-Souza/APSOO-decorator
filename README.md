# Decorator

## Cenário

Imagine que você está desenvolvendo um editor de texto simples. Inicialmente, o
editor permite apenas exibir o texto digitado pelo usuário. Porém, o sistema
deverá permitir que novas funcionalidades de formatação sejam adicionadas, como
negrito, itálico e sublinhado.

Uma possibilidade seria criar uma classe diferente para cada combinação de
funcionalidades, como TextoNegrito, TextoItalico, TextoNegritoItalico,
TextoNegritoItalicoSublinhado etc. À medida que novas funcionalidades fossem
adicionadas, o número de classes cresceria rapidamente.

Utilize o padrão Decorator para permitir que funcionalidades de formatação sejam
adicionadas dinamicamente a um objeto, sem modificar a classe original do editor.

## Requisitos

Utilize o padrão Decorator para desacoplar o editor básico das funcionalidades
adicionais de formatação, permitindo combinar diferentes decoradores de forma
flexível.

O sistema deve possuir, no mínimo:

- um componente abstrato que represente o editor de texto;
- um editor de texto concreto, responsável pelo comportamento básico;
- uma classe decoradora abstrata;
- pelo menos três decoradores concretos: `NegritoDecorator`, `ItalicoDecorator` e `SublinhadoDecorator`;
- um programa de teste que permita combinar diferentes funcionalidades.

## Organização das entregas

As etapas foram organizadas nas seguintes branches:

- [v1 — diagrama UML](https://github.com/Thalisson-Souza/APSOO-decorator/tree/v1)
- [v2-p1 — implementação e revisão crítica](https://github.com/Thalisson-Souza/APSOO-decorator/tree/v2-p1)
- [v2-p2 — implementação melhorada](https://github.com/Thalisson-Souza/APSOO-decorator/tree/v2-p2)
- [v3 — extensão com Tachado e Caixa Alta](https://github.com/Thalisson-Souza/APSOO-decorator/tree/v3)
- [v4 — análise de uma solução alternativa](https://github.com/Thalisson-Souza/APSOO-decorator/tree/v4)
