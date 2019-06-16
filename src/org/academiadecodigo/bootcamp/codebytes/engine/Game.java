package org.academiadecodigo.bootcamp.codebytes.engine;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.media.Backgrounds;
import org.academiadecodigo.bootcamp.codebytes.media.sound.Sound;
import org.academiadecodigo.bootcamp.codebytes.menus.Menu;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.player.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Menu.MenuRepresentation menu;
    private Player player;
    private GameObjectType gameObjectsType;
    private int points;
    private int lifes;
    Picture gameBackGround;
    Sound gameSound;

    public Game() {
    }

    public void init(){
        Grid grid = new Grid();
        grid.initialization();
        Menu.MenuRepresentation menu = new Menu.MenuRepresentation();
        try {
            menu.init();
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

    /**
     * Getting a random background for gameplay each time game is started.
     */
    public void start(){
        int random = (int) (Math.random() * Backgrounds.values().length);
        gameBackGround = new Picture(0,0, Backgrounds.values()[random].getPath());
        gameBackGround.draw();
        gameSound = new Sound("resources/sounds/GameMusic.wav");
        gameSound.setLoop(10);
        gameSound.play(true);

    }

    // TODO: 16/06/2019 - Need to implement points gathered and reset.
    public void gameOver(){
        Picture gameOver = new Picture(0,0, "resources/menu/gameover.jpg");
        gameOver.draw();
        gameBackGround.delete();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        gameSound.stop();
        menu.mainMenu();
        gameOver.delete();
    }

    public int getPoints() {
        return points;
    }

    public int getLifes() {
        return lifes;
    }
}
