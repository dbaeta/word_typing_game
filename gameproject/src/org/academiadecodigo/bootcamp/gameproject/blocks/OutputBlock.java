package org.academiadecodigo.bootcamp.gameproject.blocks;

import org.academiadecodigo.bootcamp.gameproject.actions.Drawable;
import org.academiadecodigo.bootcamp.gameproject.actions.Movable;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 10/10/17.
 */
public class OutputBlock extends Block implements Drawable, Movable {

    Rectangle box = new Rectangle(10, 10, 700, 100); //Creates a new falling block

    public OutputBlock() {
    }

    @Override
    public void move() {
        box.translate(0, 1);
    }

    @Override
    public void getPos() {

    }

    public void show() {
        box.setColor(Color.CYAN);
        box.fill();
    }

    @Override
    public void hide() {
        box.delete();
    }
}
