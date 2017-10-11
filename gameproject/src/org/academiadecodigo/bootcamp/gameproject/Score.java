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

    Rectangle box;
    Text score;
    Text lives;

    private int scorePoints;


    public Score(int width, int height) {
        this.box = new Rectangle(210, 10, width, height);
        this.score = new Text(240,40, "SCORE " + getScorePoints());
        this.lives = new Text(240,60,"LIVES "); // + getLives());
    }

    public void setColor(Color color) {
        box.setColor(color);
    }

    public void setScorePoints(int scorePoints) {
        this.scorePoints = scorePoints;
    }

    public int getScorePoints() {
        return scorePoints;
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
