package org.academiadecodigo.bootcamp.gameproject.words;

import org.academiadecodigo.bootcamp.gameproject.blocks.OutputBlock;
import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 10/10/17.
 */
public class OutputWord extends Word {


    private String[] str = {"IMPORT", "RETURN", "PUBLIC", "STRING", "JAVA", "PRIVATE", "UTIL", "STATIC", "THROWS", "BOOLEAN",
            "PACKAGE", "ANDROID", "APACHE", "JAVAX", "LENGTH", "OBJECT", "CONTEXT", "APPEND", "AUTHOR", "METHOD"};

    private int chooseWord = (int) Math.floor(Math.random() * str.length);

    OutputBlock box = new OutputBlock(10, 10, 350, 50, Color.MAGENTA);

    public OutputWord() {
        super(175, 25, "");
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
        super.setTextMiddle(box.getWidth());
        super.show();

    }

    @Override
    public void hide(){
        super.hide();
        box.hide();
    }

    public int getBoxY(){
        return box.getY();
    }

    public int getBoxHeight(){
        return box.getHeigth();
    }

}
