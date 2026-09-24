package decorator.formatacao;

import decorator.editor.EditorTexto;

/** ConcreteDecorator que aplica itálico. */
public class ItalicoDecorator extends EditorDecorator {
    public ItalicoDecorator(EditorTexto editor) {
        super(editor);
    }

    @Override
    public String exibir() {
        return "<i>" + super.exibir() + "</i>";
    }
}
