package decorator.app;

import decorator.editor.EditorBasico;
import decorator.editor.EditorTexto;
import decorator.formatacao.ItalicoDecorator;
import decorator.formatacao.NegritoDecorator;
import decorator.formatacao.SublinhadoDecorator;

import java.util.Scanner;

/** Programa de teste: o usuário digita o texto e escolhe as formatações. */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        if (!entrada.hasNextLine()) {
            return;
        }
        EditorTexto editor = new EditorBasico(entrada.nextLine());

        while (true) {
            System.out.println();
            System.out.println("Atual: " + editor.exibir());
            System.out.println("1 - Negrito | 2 - Itálico | 3 - Sublinhado | 0 - Sair");
            System.out.print("Opção: ");
            if (!entrada.hasNextLine()) {
                return;
            }

            switch (entrada.nextLine().trim()) {
                case "1": editor = new NegritoDecorator(editor); break;
                case "2": editor = new ItalicoDecorator(editor); break;
                case "3": editor = new SublinhadoDecorator(editor); break;
                case "0": System.out.println("Resultado final: " + editor.exibir()); return;
                default: System.out.println("Opção inválida.");
            }
        }
    }
}
