package org.academiadecodigo.bootcamp.gameproject;

import org.academiadecodigo.bootcamp.gameproject.utils.Sound;
import org.academiadecodigo.bootcamp.gameproject.words.InputWord;
import org.academiadecodigo.bootcamp.gameproject.words.OutputWord;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by Daniel Baeta on 06/10/17.
 */
class Game {

    //private Rectangle background = new Rectangle(10, 10, 350, 600);//Create new rectangle background
    private Picture background = new Picture(10.0D, 10.0D, "/game_background.jpg");

    private Score score = new Score(350, 50);//
    private OutputWord[] fallingWord = new OutputWord[55];
    private InputWord word = new InputWord();//Creates new text for word typing
    private Sound soundCorrectWord = new Sound("/plock.wav");
    private Sound soundWrongWord = new Sound("/glassBreak.wav");
    private Sound soundGameOver = new Sound("/sadTrombone.wav");
    private Sound soundGame = new Sound("/8Bit.wav");

    private int speed = 15;
    private boolean changed;


    /**
     * Verifies if the OutputWord's box is above the position of the InputWord's box
     *
     * @param pos array index
     **/
    private boolean checkLimit(int pos) {
        if (fallingWord[pos].getBoxY() + fallingWord[pos].getBoxHeight() == word.getBoxY()) {
            soundWrongWord.play(true);
            score.setGameLives(score.getLives() - 1);
            fallingWord[pos].hide();
            word.clearInput();
            return true;
        }
        return false;
    }

    /**
     * Verifies if the String input matches the OutputWord's
     *
     * @param pos        array index for the OutputWord
     * @param outputWord The OutputWord to compare with
     **/
    private boolean checkWord(OutputWord outputWord, int pos) {
        if (word.getString().equals(outputWord.getString())) {
            soundCorrectWord.play(true);
            fallingWord[pos].hide();
            word.clearInput();
            score.setScorePoints(fallingWord[pos].getBoxY());
            return true;
        }
        return false;
    }

    public void init() throws InterruptedException {
        background.draw();
        score.show();
        for (int i = 0; i < 55; i++) {
            fallingWord[i] = new OutputWord();
        }

        fallingWord[0].show();
        word.show();
    }


    public void start() throws InterruptedException {

        int counter = 0;

        soundGame.play(true);

        while (!gameOver()) {
            if (counter > 54) {
                System.out.println("You win");
                Rectangle winMessage = new Rectangle(10, 150, 350, 100);
                winMessage.setColor(Color.MAGENTA);
                winMessage.draw();
                winMessage.fill();
                Text message = new Text(185, 190, "You Win");
                message.grow(50, 25);
                message.draw();
                Thread.sleep(3000);
                break;
            }

            boolean verifyLimit;
            boolean verifyWord;

            fallingWord[counter].move();
            verifyWord = checkWord(fallingWord[counter], counter);
            verifyLimit = checkLimit(counter);


            if (verifyLimit || verifyWord) {

                ++counter;
                fallingWord[counter].show();
                changed = false;
                System.out.println(counter + " " + speed);
                continue;

            }

            if (counter > 0 && counter % 3 == 0) {
                if (!this.changed) {
                    gameSpeed();
                    this.changed = true;
                }
            }

            Thread.sleep(speed);

            word.show();

        }
        soundGame.stop();
    }


    private boolean gameOver() {
        if (score.getLives() == 0) {

            Rectangle winMessage = new Rectangle(10, 150, 350, 100);
            winMessage.setColor(Color.MAGENTA);
            winMessage.draw();
            winMessage.fill();
            Text message = new Text(185, 190, "You Lose!");
            message.grow(50, 25);
            message.draw();
            System.out.println("You lost");
            soundGameOver.play(true);
            return true;
        }
        return false;
    }

    private void gameSpeed() {

        this.speed -= 1;
        if (this.speed < 2) {
            this.speed = 1;
        }
    }

}
