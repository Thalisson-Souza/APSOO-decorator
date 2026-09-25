package decorator.formatacao;

import decorator.editor.EditorTexto;

/** ConcreteDecorator que transforma o texto em letras maiúsculas. */
public class CaixaAltaDecorator extends EditorDecorator {
    public CaixaAltaDecorator(EditorTexto editor) {
        super(editor);
    }

    @Override
    public String exibir() {
        StringBuilder resultado = new StringBuilder();
        boolean dentroDaTag = false;

        // Só o texto vira maiúsculo; as tags das outras formatações ficam iguais.
        for (char c : super.exibir().toCharArray()) {
            if (c == '<') {
                dentroDaTag = true;
            } else if (c == '>') {
                dentroDaTag = false;
            }
            resultado.append(dentroDaTag ? c : Character.toUpperCase(c));
        }
        return resultado.toString();
    }
}
