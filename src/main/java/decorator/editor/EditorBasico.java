package decorator.editor;

/** ConcreteComponent: editor que apenas exibe o texto. */
public class EditorBasico implements EditorTexto {
    private String texto;

    public EditorBasico(String texto) {
        this.texto = texto;
    }

    @Override
    public String exibir() {
        return texto;
    }
}
