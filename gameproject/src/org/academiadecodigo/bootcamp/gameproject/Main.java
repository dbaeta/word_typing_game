package org.academiadecodigo.bootcamp.gameproject;

/**
 * Created by codecadet on 10/10/17.
 */
public class Main {
    public static void main(String[] args) {
        GameIntro gameIntro = new GameIntro();
        Game game = new Game();
        boolean cenas=true;

        try {
            while (cenas) {
                gameIntro.intro();
                if (gameIntro.isSpaceStart()) {
                    gameIntro.introClose();
                    game.init();
                    game.start();
                    cenas=false;

                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
