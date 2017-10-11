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

    String [] str ={"IMPORT", "RETURN", "PUBLIC", "STRING", "JAVA", "PRIVATE", "UTIL", "STATIC", "THROWS", "BOOLEAN",
            "PACKAGE", "ANDROID", "APACHE", "JAVAX", "LENGTH", "OBJECT", "CONTEXT", "APPEND", "AUTHOR", "METHOD"};


    int chooseWord = (int)Math.floor(Math.random()*str.length);


    Text banana = new Text(350, 50, str[chooseWord] );
    OutputBlock block = new OutputBlock(3, 3, 50, 4, Color.CYAN);

    public OutputWord() {

    }

    @Override
    public void move() {
        banana.translate(0,1);
    }

    @Override
    public void getX() {

    }

    @Override
    public void getY() {

    }

    @Override
    public void getWidth() {

    }

    @Override
    public void getHeigth() {

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
        System.out.println(str[chooseWord]);
        return str[chooseWord];
    }
}
