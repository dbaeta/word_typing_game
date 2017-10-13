package org.academiadecodigo.bootcamp.gameproject;

import org.academiadecodigo.bootcamp.gameproject.actions.Drawable;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;


/**
 * Created by Daniel Baeta on 06/10/17.
 */

//Calculate the score based on the number of correct words typed
public class Score implements Drawable {

    private Rectangle box;
    private Text score;
    private Text lives;

    private int scorePoints;
    private int gameLives=3;


    public Score(int width, int height) {
        this.box = new Rectangle(10, 560, width, height);
        this.score = new Text(50,580, "SCORE " + getScorePoints());
        this.lives = new Text(250,580,"LIVES " + getLives() ); // + getLives());
    }

    public void setColor(Color color) {
        box.setColor(color);
    }

    public void setScorePoints(int scorePoints) {
        this.scorePoints = scorePoints;
    }

    int getScorePoints() {

        return scorePoints;
    }

    void setGameLives(int gameLives) {
        this.gameLives = gameLives;
    }

    int getLives(){
        return gameLives;
    }

    @Override
    public void show() {
        box.setColor(Color.YELLOW);
        box.fill();
        score.draw();
        lives.draw();
    }

    @Override
    public void hide() {

    }


}
