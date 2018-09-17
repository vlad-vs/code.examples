package my.examples.comandPattern;

import java.util.Objects;

public class Load implements Action{

    private final Editor editor;

    public Load(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void doAcrion() {
        editor.load();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Load load = (Load) o;
        return Objects.equals(editor, load.editor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(editor);
    }
}
