package org.academiadecodigo.bootcamp.gameproject.words;

import org.academiadecodigo.bootcamp.gameproject.blocks.InputBlock;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by Daniel Baeta on 06/10/17.
 */
public class InputWord extends Word implements KeyboardHandler {

    InputBlock box = new InputBlock(10, 460, 350, 100, Color.CYAN);

    public InputWord() {
        super(185, 510, "");
        inputKey(); //Initializes the method
    }

    public void clearInput() {
        setString("");
    }

    public void inputKey() {
        Keyboard keyboard = new Keyboard(this);


        for (int i = 65; i < 91; i++) {
            KeyboardEvent kbEvent = new KeyboardEvent();
            kbEvent.setKey((char) i);
            kbEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(kbEvent);

        }

        //Adds the BACKSPACE key
        KeyboardEvent kb = new KeyboardEvent();
        kb.setKey((char) 8);
        kb.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(kb);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == 8) {
            clearInput();
            return;
        }
        setString(getString() + (char) keyboardEvent.getKey()); //Adds the typed letter to word
        setTextMiddle(box.getWidth());
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void show() {
        box.show();
        super.show();
    }

    @Override
    public void hide() {
        super.hide();
        box.hide();
    }

    public int getBoxY() {
        return box.getY();
    }
}
