package org.academiadecodigo.bootcamp.gameproject.blocks;

import org.academiadecodigo.bootcamp.gameproject.actions.Drawable;
import org.academiadecodigo.bootcamp.gameproject.actions.Movable;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


/**
 * Created by Daniel Baeta on 06/10/17.
 */
public class Block implements Drawable, Movable {

    Rectangle box;

    public Block(int posX, int posY, int width, int height) {
        box = new Rectangle(posX, posY, width, height);
    }

    public void setColor(Color color) {
        box.setColor(color);
    }

    @Override
    public void show() {
        box.fill();
    }

    @Override
    public void hide() {
        box.delete();
    }

    @Override
    public void move() {
        box.translate(0, 1);
    }

    @Override
    public void getX() {
        box.getX();
    }

    @Override
    public void getY() {
        box.getY();
    }

    @Override
    public void getWidth() {
        box.getWidth();
    }

    @Override
    public void getHeigth() {
        box.getHeight();
    }
}
