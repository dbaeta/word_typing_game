package org.academiadecodigo.bootcamp.gameproject.words;

import org.academiadecodigo.bootcamp.gameproject.actions.Drawable;
import org.academiadecodigo.bootcamp.gameproject.actions.Movable;
import org.academiadecodigo.bootcamp.gameproject.blocks.OutputBlock;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

/**
 * Created by codecadet on 10/10/17.
 */
public class OutputWord implements Movable, Drawable {


    String[] str = {"IMPORT", "RETURN", "PUBLIC", "STRING", "JAVA", "PRIVATE", "UTIL", "STATIC", "THROWS", "BOOLEAN",
            "PACKAGE", "ANDROID", "APACHE", "JAVAX", "LENGTH", "OBJECT", "CONTEXT", "APPEND", "AUTHOR", "METHOD"};


    int chooseWord = (int) Math.floor(Math.random() * str.length);


    Text banana = new Text(175, 25, str[chooseWord]);
    OutputBlock block = new OutputBlock(3, 3, 50, 4, Color.CYAN);

    public OutputWord() {

    }

    @Override
    public void move() {
        banana.translate(0, 1);
    }

    @Override
    public int getX() {
        return 0;

    }

    @Override
    public int getY() {
        return 0;

    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeigth() {
        return 0;

    }

    @Override
    public void show() {
        banana.draw();
    }

    @Override
    public void hide() {
        banana.delete();
    }

    public String getStr() {

        return str[chooseWord];
    }
}
