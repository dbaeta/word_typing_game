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

    private Rectangle background = new Rectangle(10, 10, 350, 600);//Create new rectangle backgr
    private Score score = new Score(350, 50);
    private OutputWord[] fallingWord = new OutputWord[20];
    private InputWord word = new InputWord();//Creates new text for word typing


    private boolean checkLimit(int pos) {
        if (fallingWord[pos].getBoxY() + fallingWord[pos].getBoxHeight() == word.getBoxY()) {
            score.setGameLives(score.getLives() - 1);
            fallingWord[pos].hide();
            word.clearInput();
            return true;
        }
        return false;
    }

    //Falta implementar o score.setScorePoints()
    private boolean checkWord(OutputWord outputWord, int pos) {
        if (word.getString().equals(outputWord.getString())) {
            fallingWord[pos].hide();
            word.clearInput();
            return true;
        }
        return false;
    }

    void init() {
        background.fill();
        score.show();
        for (int i = 0; i < 20; i++) {
            fallingWord[i] = new OutputWord();
        }

        fallingWord[0].show();
        word.show();

    }


    void start() throws InterruptedException {

        int counter = 0;

        for (int i = 0; i < 10000; i++) {

            while (!gameOver()) {
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
//Metodo imagem Game Over!!
        }
    }


    private boolean gameOver() { //
        return (score.getLives() == 0);
    }


}
