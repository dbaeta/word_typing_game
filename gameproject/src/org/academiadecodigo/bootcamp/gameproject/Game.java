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
    OutputBlock fallingBlock = new OutputBlock(10, 10, 350, 50, Color.MAGENTA);//Creates new falling block
    OutputWord fallingWord = new OutputWord();
    InputBlock box = new InputBlock(10, 510, 350, 100, Color.CYAN);//Creates new background rectangle for word typing
    InputWord word = new InputWord();//Creates new text for word typing


    private int lives = 3;


    public boolean checkLimit() {
        if (fallingBlock.getY() == box.getY()) {
            countLives();
            fallingBlock.hide();
            fallingWord.hide();

        }
        return false;
    }

    public void checkWord(OutputWord outputWord) {
        if (word.getWord().equals(outputWord.getStr())) {
            fallingWord.hide();
            fallingBlock.hide();
            word.clearInput();
        }

    }

    public void init() {
        background.fill();
        fallingBlock.show();
        fallingWord.show();
        box.show();
        word.show();


    }


    public void start() throws InterruptedException {

        while (true) {
            fallingBlock.move();
            fallingWord.move();
            checkWord(fallingWord);
            checkLimit();
            Thread.sleep(10);

        }
    }

    public void countLives() {
        lives--;
        
    }


}
