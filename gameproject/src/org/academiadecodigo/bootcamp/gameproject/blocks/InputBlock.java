package org.academiadecodigo.bootcamp.gameproject.blocks;

import org.academiadecodigo.bootcamp.gameproject.actions.Drawable;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by Daniel Baeta on 06/10/17.
 */
public class InputBlock extends Block implements Drawable {

    Rectangle box = new Rectangle(10, 710, 700, 200); //Creates a new rectangle for background

    public InputBlock(){
        box.setColor(Color.BLUE); //Sets the color
        box.fill(); //Shows the shape on the screen
    }
}
