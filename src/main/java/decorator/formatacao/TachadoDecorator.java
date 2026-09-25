package decorator.formatacao;

import decorator.editor.EditorTexto;

/** ConcreteDecorator que aplica tachado. */
public class TachadoDecorator extends EditorDecorator {
    public TachadoDecorator(EditorTexto editor) {
        super(editor);
    }

    @Override
    public String exibir() {
        return "<s>" + super.exibir() + "</s>";
    }
}
