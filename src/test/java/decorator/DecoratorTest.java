package decorator;

import decorator.editor.EditorBasico;
import decorator.editor.EditorTexto;
import decorator.formatacao.ItalicoDecorator;
import decorator.formatacao.NegritoDecorator;
import decorator.formatacao.SublinhadoDecorator;

/** Testes leves sem dependências externas; executar com a opção -ea. */
public class DecoratorTest {
    public static void main(String[] args) {
        deveExibirTextoSemFormatacao();
        deveAplicarUmDecorador();
        deveEncadearDecoradoresNaOrdemAplicada();
        devePermitirRepetirDecorador();
        deveRefletirTextoDigitadoDepois();
        deveRejeitarEditorNulo();
        System.out.println("Testes Decorator aprovados.");
    }

    private static void deveExibirTextoSemFormatacao() {
        assert new EditorBasico("Olá").exibir().equals("Olá");
    }

    private static void deveAplicarUmDecorador() {
        assert new NegritoDecorator(new EditorBasico("Olá")).exibir().equals("<b>Olá</b>");
    }

    private static void deveEncadearDecoradoresNaOrdemAplicada() {
        EditorTexto editor = new SublinhadoDecorator(
                new ItalicoDecorator(new NegritoDecorator(new EditorBasico("Olá"))));
        assert editor.exibir().equals("<u><i><b>Olá</b></i></u>");
    }

    private static void devePermitirRepetirDecorador() {
        EditorTexto editor = new NegritoDecorator(new NegritoDecorator(new EditorBasico("Olá")));
        assert editor.exibir().equals("<b><b>Olá</b></b>");
    }

    private static void deveRefletirTextoDigitadoDepois() {
        EditorBasico basico = new EditorBasico("Olá");
        EditorTexto editor = new ItalicoDecorator(basico);
        basico.digitar("Tchau");
        assert editor.exibir().equals("<i>Tchau</i>");
    }

    private static void deveRejeitarEditorNulo() {
        try {
            new NegritoDecorator(null);
            throw new AssertionError("Era esperado rejeitar editor nulo.");
        } catch (IllegalArgumentException esperado) {
            // Comportamento esperado.
        }
    }
}
