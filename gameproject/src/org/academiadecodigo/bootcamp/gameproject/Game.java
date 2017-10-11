package org.academiadecodigo.bootcamp.gameproject;

import org.academiadecodigo.bootcamp.gameproject.blocks.InputBlock;
import org.academiadecodigo.bootcamp.gameproject.blocks.OutputBlock;
import org.academiadecodigo.bootcamp.gameproject.words.InputWord;
import org.academiadecodigo.bootcamp.gameproject.words.OutputWord;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by Daniel Baeta on 06/10/17.
 */
public class Game {

    Rectangle background = new Rectangle(10, 10, 350, 600);//Create new rectangle background
    OutputWord fallingWord = new OutputWord();
    InputWord word = new InputWord(170, 550);//Creates new text for word typing

    private int lives = 3;





    public boolean checkLimit() {
        if (fallingWord.getBoxY() == word.getBoxY()) {
            countLives();
            fallingWord.hide();
            return true;
        }
        return false;
    }

    public void checkWord(OutputWord outputWord) {
        if (word.getString().equals(outputWord.getString())) {
            fallingWord.hide();
            word.clearInput();
        }

    }

    public void init() {
        background.fill();
        fallingWord.show();
        word.show();
    }


    public void start() throws InterruptedException {


        for (int i = 0; i < 800 ; i++) {
            boolean verify;
            fallingWord.move();
            checkWord(fallingWord);
            verify = checkLimit();
            if (verify) {
                System.out.println(i);
            }
            Thread.sleep(10);
        }
    }

    public void countLives() {
        lives--;

    }


}
