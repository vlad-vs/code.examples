package my.examples.comandPattern;

public class Close implements Action{

    private final Editor editor;

    public Close(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void doAcrion() {
        editor.close();
    }
}
