package org.academiadecodigo.bootcamp.gameproject.words;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by Daniel Baeta on 06/10/17.
 */
public class InputWord extends Word implements KeyboardHandler {

    Word inputText = new Word();
    String word = "";

    public InputWord(){
        inputText.grow(30, 20);
        inputText.draw();
        inputKey();
    }

    public void inputKey(){
        Keyboard keyboard = new Keyboard(this);
        KeyboardEvent keyboardEvent = new KeyboardEvent();
        keyboardEvent.setKey(KeyboardEvent.KEY_F);
        keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEvent);

        KeyboardEvent keyboardEvent1 = new KeyboardEvent();
        keyboardEvent1.setKey(KeyboardEvent.KEY_A);
        keyboardEvent1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEvent1);
        
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        word += ((char) keyboardEvent.getKey());
        inputText.setText(word);
        inputText.show();

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
