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
    OutputWord [] fallingWord = new OutputWord[20];
    InputWord word = new InputWord(170, 550);//Creates new text for word typing

    private int lives = 3;





    public boolean checkLimit(int pos) {
        if (fallingWord[pos].getBoxY() + fallingWord[pos].getBoxHeight() == word.getBoxY()) {
            countLives();
            fallingWord[pos].hide();
            return true;
        }
        return false;
    }

    public boolean checkWord(OutputWord outputWord, int pos) {
        if (word.getString().equals(outputWord.getString())) {
            fallingWord[pos].hide();
            word.clearInput();
            return true;
        }
        return false;
    }

    public void init() {
        background.fill();
        for (int i = 0; i <20 ; i++) {
            fallingWord[i] = new OutputWord();
        }

        fallingWord[0].show();
        word.show();

    }


    public void start() throws InterruptedException {

        int counter=0;
        for (int i = 0; i < 10000; i++) {


            boolean verifyLimit;
            boolean verifyWord;

            fallingWord[counter].move();
            verifyWord = checkWord(fallingWord[counter], counter);
            verifyLimit = checkLimit(counter);


            if (verifyLimit || verifyWord) {
                ++counter;
               fallingWord[counter].show();
               continue;
            }

            Thread.sleep(8);
            word.show();
        }
    }


    public void countLives() {
        lives--;

    }


}
