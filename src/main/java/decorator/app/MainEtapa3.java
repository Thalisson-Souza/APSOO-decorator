package decorator.app;

import decorator.editor.EditorBasico;
import decorator.editor.EditorTexto;
import decorator.formatacao.CaixaAltaDecorator;
import decorator.formatacao.ItalicoDecorator;
import decorator.formatacao.NegritoDecorator;
import decorator.formatacao.SublinhadoDecorator;
import decorator.formatacao.TachadoDecorator;

/** Demonstra as extensões da Etapa 3 combinadas com os decoradores existentes. */
public class MainEtapa3 {
    public static void main(String[] args) {
        EditorTexto negritoSublinhadoCaixaAlta = new CaixaAltaDecorator(
                new SublinhadoDecorator(new NegritoDecorator(new EditorBasico("Olá, mundo!"))));
        System.out.println("Básico → Negrito → Sublinhado → Caixa Alta: "
                + negritoSublinhadoCaixaAlta.exibir());

        EditorTexto italicoTachado = new TachadoDecorator(
                new ItalicoDecorator(new EditorBasico("Olá, mundo!")));
        System.out.println("Básico → Itálico → Tachado: " + italicoTachado.exibir());
    }
}
