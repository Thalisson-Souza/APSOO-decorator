package decorator.editor;

/** ConcreteComponent: editor que apenas exibe o texto digitado. */
public class EditorBasico implements EditorTexto {
    private String texto;

    public EditorBasico(String texto) {
        digitar(texto);
    }

    public void digitar(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("O texto é obrigatório.");
        }
        this.texto = texto;
    }

    @Override
    public String exibir() {
        return texto;
    }
}
