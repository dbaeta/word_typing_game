package org.academiadecodigo.bootcamp.gameproject.words;

import org.academiadecodigo.bootcamp.gameproject.actions.Drawable;
import org.academiadecodigo.bootcamp.gameproject.actions.Movable;
import org.academiadecodigo.simplegraphics.graphics.Text;

/**
 * Created by Daniel Baeta on 06/10/17.
 */
public class Word implements Drawable, Movable {

    Text text;
    String string = "";

    public Word(int posX, int posY, String string){
        this.string = string;
        text = new Text (posX, posY, string);
    }


    @Override
    public void show() {
        text.draw();
    }

    @Override
    public void hide() {
        text.delete();
    }

    public String getString(){
        return string;
    }

    public void setString(String string){
        this.string = string;
        text.setText(string);
        text.draw();
    }

    @Override
    public void move() {
        text.translate(0,1);
    }

    @Override
    public int getX() {
        return text.getX();
    }

    @Override
    public int getY() {
        return text.getY();
    }

    @Override
    public int getWidth() {
        return text.getWidth();
    }

    @Override
    public int getHeigth() {
        return text.getHeight();
    }
}
