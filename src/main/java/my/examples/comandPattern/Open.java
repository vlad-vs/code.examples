package my.examples.comandPattern;

public class Open implements Action{

    private final Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void doAcrion() {
        editor.open();
    }
}
