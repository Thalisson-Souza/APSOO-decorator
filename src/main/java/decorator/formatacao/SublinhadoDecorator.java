package decorator.formatacao;

import decorator.editor.EditorTexto;

/** ConcreteDecorator que aplica sublinhado. */
public class SublinhadoDecorator extends EditorDecorator {
    public SublinhadoDecorator(EditorTexto editor) {
        super(editor);
    }

    @Override
    public String exibir() {
        return "<u>" + super.exibir() + "</u>";
    }
}
