package org.academiadecodigo.bootcamp.gameproject.blocks;

import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by Daniel Baeta on 06/10/17.
 */
public class InputBlock extends Block {


    public InputBlock(int posX, int posY, int width, int height, Color color) {
        super(posX, posY, width, height);
        super.setColor(color);
    }

    @Override
    public void move() {

    }
}
