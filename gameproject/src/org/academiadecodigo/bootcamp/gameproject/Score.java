package org.academiadecodigo.bootcamp.gameproject;

import org.academiadecodigo.bootcamp.gameproject.actions.Drawable;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import sun.security.x509.CRLDistributionPointsExtension;


/**
 * Created by Daniel Baeta on 06/10/17.
 */

//Calculate the score based on the number of correct words typed
public class Score implements Drawable {

    Rectangle box;
    Text score;
    Text lives;

    private int scorePoints;
    private int gameLives=3;


    public Score(int width, int height) {
        this.box = new Rectangle(10, 560, width, height);
        this.score = new Text(50,580, "SCORE " + getScorePoints());
        this.lives = new Text(250,580, "LIVES " + getLives() );
    }

    public void setColor(Color color) {
        box.setColor(color);
    }


    public int getLives(){
        return gameLives;
    }


    public void setGameLives(int gameLives) {
        this.gameLives = gameLives;
        lives.setText("LIVES " + this.gameLives);
        show();
    }


    public int getScorePoints() {

        return scorePoints;
    }


    public void setScorePoints(int scorePoints) {
        this.scorePoints += scorePoints;
        score.setText("SCORE " + this.score);
        show();
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
