package decorator.formatacao;

import decorator.editor.EditorTexto;

/** Decorator abstrato do padrão Decorator. */
public abstract class EditorDecorator implements EditorTexto {
    protected EditorTexto editor;

    public EditorDecorator(EditorTexto editor) {
        this.editor = editor;
    }

    @Override
    public String exibir() {
        return editor.exibir();
    }
}
