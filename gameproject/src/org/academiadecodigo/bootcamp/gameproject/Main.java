package org.academiadecodigo.bootcamp.gameproject;

/**
 * Created by codecadet on 10/10/17.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        try {
            game.init();
            game.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
