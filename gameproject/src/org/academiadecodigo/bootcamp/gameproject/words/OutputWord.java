package org.academiadecodigo.bootcamp.gameproject.words;

import org.academiadecodigo.bootcamp.gameproject.blocks.OutputBlock;
import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 10/10/17.
 */
public class OutputWord extends Word {


   private String[] str = {"IMPORT", "RETURN", "PUBLIC", "STRING", "JAVA", "PRIVATE", "UTIL", "STATIC", "THROWS", "BOOLEAN",
            "PACKAGE", "ANDROID", "APACHE", "JAVAX", "LENGTH", "OBJECT", "CONTEXT", "APPEND", "AUTHOR", "SYNCHRONIZED",
            "GOOGLE", "MODEL", "COMMON", "BYTE", "CLIENT", "SYSTEM", "FROM", "GENERATED", "ANNOTATION", "REQUEST",
            "MESSAGE", "CONTENT", "INTEGER", "EXCEPTION", "INSTANCEOF", "DEFAULT", "SPRINGFRAMEWORK", "ATTRIBUTE",
            "PROPERTY", "RETURNS", "DESCRIPTION", "PERSISTENCE","INFORMATION", "FRAMEWORK", "SPECIFIED",  "METHOD",
            "ANNOTATIONS", "COLLECTION","THROWABLE", "EXECUTE", "REFERENCE", "ITERATOR", "BOOLEAN", "FACTORY","RUNTIME"};

    private int chooseWord = (int) Math.floor(Math.random() * str.length);

    private OutputBlock box = new OutputBlock(10, 10, 350, 50, Color.WHITE);

    public OutputWord() {
        super(165, 25, "");
    }

    @Override
    public void move() {
        super.move();
        box.move();
    }

    @Override
    public void show() {
        box.show();
        super.setString(str[chooseWord]);
        setTextMiddle(box.getWidth());
        super.show();

    }

    @Override
    public void hide() {
        super.hide();
        box.hide();
    }

    public int getBoxY() {
        return box.getY();
    }

    public int getBoxHeight() {
        return box.getHeigth();
    }

}
