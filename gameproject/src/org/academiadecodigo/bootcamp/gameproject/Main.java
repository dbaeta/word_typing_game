package org.academiadecodigo.bootcamp.gameproject;

/**
 * Created by codecadet on 10/10/17.
 */
public class Main {

    static GameIntro gameIntro = new GameIntro();
    static Game game = new Game();
    static boolean gameBegun = true;

    public static void main(String[] args) {


        try {
            while (gameBegun) {
                gameIntro.intro();
                if (gameIntro.isSpaceStart()) {
                    gameIntro.introClose();
                    game.init();
                    game.start();
                    gameBegun = false;
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
