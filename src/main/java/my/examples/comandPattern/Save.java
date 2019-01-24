package my.examples.comandPattern;

public class Save implements Action{

    private final Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void doAcrion() {
        editor.save();
    }
}
