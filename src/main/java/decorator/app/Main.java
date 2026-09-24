package decorator.app;

import decorator.editor.EditorBasico;
import decorator.editor.EditorTexto;
import decorator.formatacao.ItalicoDecorator;
import decorator.formatacao.NegritoDecorator;
import decorator.formatacao.SublinhadoDecorator;

public class Main {
    public static void main(String[] args) {
        EditorTexto texto = new EditorBasico("Olá, mundo!");
        System.out.println("Básico: " + texto.exibir());

        EditorTexto negrito = new NegritoDecorator(texto);
        System.out.println("Negrito: " + negrito.exibir());

        EditorTexto negritoItalico = new ItalicoDecorator(new NegritoDecorator(texto));
        System.out.println("Negrito + Itálico: " + negritoItalico.exibir());

        EditorTexto todos = new SublinhadoDecorator(
                new ItalicoDecorator(new NegritoDecorator(texto)));
        System.out.println("Negrito + Itálico + Sublinhado: " + todos.exibir());
    }
}
