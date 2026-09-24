# SDD — Editor de Texto com Decorator (v2-p2)

## Objetivo

Adicionar formatações ao editor por composição, mantendo o Decorator como
estrutura central e sem modificar o editor básico.

## Papéis do padrão

- `EditorTexto`: Component;
- `EditorBasico`: ConcreteComponent, guarda o texto digitado;
- `EditorDecorator`: Decorator, guarda um `EditorTexto` e repassa o `exibir()`;
- `NegritoDecorator`, `ItalicoDecorator` e `SublinhadoDecorator`: ConcreteDecorator.

## Regras da melhoria

- `EditorBasico.digitar()` permite alterar o texto, e os decoradores refletem a alteração;
- texto nulo e editor decorado nulo são rejeitados;
- o objeto decorado é `final` dentro do decorador;
- a `Main` deixa o usuário digitar o texto e escolher as formatações em qualquer ordem;
- os comportamentos principais são validados por testes executáveis com `-ea`.

`TachadoDecorator` e `CaixaAltaDecorator` pertencem à Etapa 3 e não fazem parte desta branch.
