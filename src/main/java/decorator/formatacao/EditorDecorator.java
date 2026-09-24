package decorator.formatacao;

import decorator.editor.EditorTexto;

/** Decorator abstrato do padrão Decorator. */
public abstract class EditorDecorator implements EditorTexto {
    protected final EditorTexto editor;

    protected EditorDecorator(EditorTexto editor) {
        if (editor == null) {
            throw new IllegalArgumentException("O editor decorado é obrigatório.");
        }
        this.editor = editor;
    }

    @Override
    public String exibir() {
        return editor.exibir();
    }
}
