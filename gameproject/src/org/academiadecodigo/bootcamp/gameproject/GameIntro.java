package org.academiadecodigo.bootcamp.gameproject;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 14/10/17.
 */
public class GameIntro implements KeyboardHandler {

    private boolean spaceStart;
    private Keyboard keyboard = new Keyboard(this);
    private KeyboardEvent keyboardEvent=new KeyboardEvent();
    private Picture background = new Picture (10, 10, "game_start_menu.jpg");
    private Picture instructions = new Picture (10, 10, "game_start_instructions.png");

    protected GameIntro(){
        keyboardEvent.setKey(KeyboardEvent.KEY_SPACE);
        keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEvent);
    }

<<<<<<< HEAD
    protected void intro() {
        background.setColor(Color.BLUE);
        background.fill();
        introText1.draw();
        introText2.draw();
        introText3.draw();
    }

    protected void introClose() {
        background.delete();
        introText1.delete();
        introText2.delete();
        introText3.delete();
=======
    public void intro() throws InterruptedException{
        background.draw();
        instructions.draw();
        while(!spaceStart){
            Thread.sleep(1000);
            instructions.delete();
            Thread.sleep(500);
            instructions.draw();
        }
    }

    public void introClose() {
>>>>>>> master

    }

    protected boolean isSpaceStart() {
        return spaceStart;
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey()==KeyboardEvent.KEY_SPACE){
            spaceStart = true;
            System.out.println("Game Started");
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

