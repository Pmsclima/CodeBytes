package org.academiadecodigo.bootcamp.codebytes.engine;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.media.Backgrounds;
import org.academiadecodigo.bootcamp.codebytes.menus.Menu;
import org.academiadecodigo.bootcamp.codebytes.objectfactory.GameObjectsType;
import org.academiadecodigo.bootcamp.codebytes.objects.figures.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Menu.MenuRepresentation menu;
    private Player player;
    private GameObjectsType gameObjectsType;
    private int points;
    private int lifes;

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

    public void start(){
        int random = (int) (Math.random()* 5);
        Picture gameBackGround = new Picture(0,0, "");
    }

    public void gameOver(){
        Picture gameOver = new Picture(0,0, "resources/menu/gameover.jpg");
        gameOver.draw();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
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
