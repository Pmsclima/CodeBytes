package org.academiadecodigo.bootcamp.codebytes;

import org.academiadecodigo.bootcamp.codebytes.engine.Game;
import org.academiadecodigo.bootcamp.codebytes.menus.Menu;

public class Main {

    public static void main(String[] args) {

       Game game = new Game();

       game.init();

       while (!game.isGameOn()) {
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       game.start();
       game.setGameOn();



    }
}
