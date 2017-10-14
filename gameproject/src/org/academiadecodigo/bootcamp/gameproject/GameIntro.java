package org.academiadecodigo.bootcamp.gameproject;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by codecadet on 14/10/17.
 */
public class GameIntro implements KeyboardHandler {

    private Rectangle background = new Rectangle(10, 10, 350, 600);
    private Text introText = new Text(100, 175, "PRESS SPACE TO START");
    private boolean spaceStart;
    private Keyboard keyboard = new Keyboard(this);
    private KeyboardEvent keyboardEvent=new KeyboardEvent();

    public GameIntro(){
        keyboardEvent.setKey(KeyboardEvent.KEY_SPACE);
        keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEvent);
    }

    public void intro() {
        background.setColor(Color.BLUE);
        background.fill();
        introText.draw();
    }

    public void introClose() {
        background.delete();
        introText.delete();

    }

    public boolean isSpaceStart() {
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
