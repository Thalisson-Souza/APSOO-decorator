package decorator;

import decorator.editor.EditorBasico;
import decorator.editor.EditorTexto;
import decorator.formatacao.CaixaAltaDecorator;
import decorator.formatacao.ItalicoDecorator;
import decorator.formatacao.NegritoDecorator;
import decorator.formatacao.SublinhadoDecorator;
import decorator.formatacao.TachadoDecorator;

/** Testes da Etapa 3; executar com a opção -ea. */
public class DecoratorEtapa3Test {
    public static void main(String[] args) {
        deveAplicarTachado();
        deveAplicarCaixaAlta();
        deveCombinarNegritoSublinhadoCaixaAlta();
        deveCombinarItalicoTachado();
        System.out.println("Testes Decorator Etapa 3 aprovados.");
    }

    private static void deveAplicarTachado() {
        assert new TachadoDecorator(new EditorBasico("Olá")).exibir().equals("<s>Olá</s>");
    }

    private static void deveAplicarCaixaAlta() {
        assert new CaixaAltaDecorator(new EditorBasico("Olá")).exibir().equals("OLÁ");
    }

    private static void deveCombinarNegritoSublinhadoCaixaAlta() {
        EditorTexto editor = new CaixaAltaDecorator(
                new SublinhadoDecorator(new NegritoDecorator(new EditorBasico("Olá"))));
        assert editor.exibir().equals("<u><b>OLÁ</b></u>");
    }

    private static void deveCombinarItalicoTachado() {
        EditorTexto editor = new TachadoDecorator(new ItalicoDecorator(new EditorBasico("Olá")));
        assert editor.exibir().equals("<s><i>Olá</i></s>");
    }
}
