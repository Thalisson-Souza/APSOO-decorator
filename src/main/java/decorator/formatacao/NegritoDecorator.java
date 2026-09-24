package decorator.formatacao;

import decorator.editor.EditorTexto;

/** ConcreteDecorator que aplica negrito. */
public class NegritoDecorator extends EditorDecorator {
    public NegritoDecorator(EditorTexto editor) {
        super(editor);
    }

    @Override
    public String exibir() {
        return "<b>" + super.exibir() + "</b>";
    }
}
