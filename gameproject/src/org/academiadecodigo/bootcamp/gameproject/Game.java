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

    Rectangle background = new Rectangle(10, 10, 350, 600);//Create new rectangle backgr
    Score score = new Score(350, 50);// ound
    OutputWord[] fallingWord = new OutputWord[20];
    InputWord word = new InputWord(160, 510);//Creates new text for word typing

    private int speed = 15;
    private boolean changed;


    public boolean checkLimit(int pos) {
        if (fallingWord[pos].getBoxY() + fallingWord[pos].getBoxHeight() == word.getBoxY()) {
            score.setGameLives(score.getLives() - 1);
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
        score.show();
        for (int i = 0; i < 20; i++) {
            fallingWord[i] = new OutputWord();
        }

        fallingWord[0].show();
        word.show();

    }


    public void start() throws InterruptedException {

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
                    changed = false;
                    //System.out.println(score.getLives());
                    continue;

                }

                if (counter>0 && counter%5==0){
                    if(!this.changed){
                        gameSpeed();
                        this.changed = true;
                    }
                }

                Thread.sleep(speed);
                System.out.println(counter + " " + speed);
                word.show();

            }
            //Metodo imagem Game Over!!
        }
    }




    public boolean gameOver() {
        if (score.getLives() == 0) {
            return true;
        }
        return false;
    }

    public void gameSpeed() {

        this.speed--;
    }

}
