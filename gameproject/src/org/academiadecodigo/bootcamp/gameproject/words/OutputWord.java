package org.academiadecodigo.bootcamp.gameproject.words;

import org.academiadecodigo.bootcamp.gameproject.actions.Drawable;
import org.academiadecodigo.bootcamp.gameproject.actions.Movable;
import org.academiadecodigo.simplegraphics.graphics.Text;

/**
 * Created by codecadet on 10/10/17.
 */
public class OutputWord implements Movable, Drawable {

    String str = "CENAS";
    Text banana = new Text(350, 50, str);

    public OutputWord() {

    }

    @Override
    public void move() {
        banana.translate(0,1);
    }

    @Override
    public void getPos() {

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
        return str;
    }
}
