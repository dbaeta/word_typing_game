package org.academiadecodigo.bootcamp.gameproject.words;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by Daniel Baeta on 06/10/17.
 */
public class InputWord extends Word implements KeyboardHandler {

    Word inputText = new Word(); //Creates new Text Shape for player to write. Needs to be in the constructor
    String word = ""; //Creates new string to pass as argument to the inputText

    public InputWord() {
        inputKey(); //Initializes the method
    }

    //Adds the keys available to the keyboard listener
    public void inputKey() {
        Keyboard keyboard = new Keyboard(this);

        for (int i = 65; i < 91; i++) {
            System.out.println((char) i);
            System.out.println(i);
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

        word += ((char) keyboardEvent.getKey()); //Adds the typed letter to word
        inputText.setText(word); //Sets the input text with a new string
        inputText.show(); // Displays the inputText with the new text

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public String getWord() {
        return word;
    }

    public void clearInput(){
        word = "";
        inputText.setText(word);
    }

    public void show() {
        inputText.draw();
    }


}
