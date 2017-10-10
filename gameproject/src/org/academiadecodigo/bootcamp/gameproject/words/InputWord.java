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

        for (int i = 65; i < 91; i++){
            System.out.println((char) i);
            System.out.println(i);
            KeyboardEvent kbEvent = new KeyboardEvent();
            kbEvent.setKey((char) i);
            kbEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(kbEvent);

        }
        KeyboardEvent kb = new KeyboardEvent();
        kb.setKey((char) 8);
        kb.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(kb);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        while (keyboardEvent.getKey() == ((char)8)){
            word = word.substring(0, word.length()-1);
            inputText.setText(word);
            inputText.show();
        }
        word += ((char) keyboardEvent.getKey());
        inputText.setText(word);
        inputText.show();

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
