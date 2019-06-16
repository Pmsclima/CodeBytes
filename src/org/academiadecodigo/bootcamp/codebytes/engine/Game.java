package org.academiadecodigo.bootcamp.codebytes.engine;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.grid.GridDirection;
import org.academiadecodigo.bootcamp.codebytes.media.Backgrounds;
import org.academiadecodigo.bootcamp.codebytes.media.sound.Sound;
import org.academiadecodigo.bootcamp.codebytes.menus.Menu;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectFactory;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;
import org.academiadecodigo.bootcamp.codebytes.player.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public class Game {

    private Menu.MenuRepresentation menu;
    private CollisionDetector collisionDetector;
    private Player player;
    private Grid grid;
    private ArrayList <GameObject> gameObjects;
    private static int points;
    private static int lifes =3;
    Picture gameBackGround;
    Sound gameSound;
    private boolean gameOn;

    public Game() {
    }

    public void init(){
        grid = new Grid();
        grid.initialization();
        Menu.MenuRepresentation menu = new Menu.MenuRepresentation(this);
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
        if (!gameOn) {
            int random = (int) (Math.random() * Backgrounds.values().length);
            gameBackGround = new Picture(Grid.PADDING, Grid.PADDING, Backgrounds.values()[random].getPath());
            gameBackGround.draw();

            gameOn = true;
            gameSound = new Sound("/Resources/sounds/GameMusic.wav");
            gameSound.play(true);
            gameSound.setLoop(10);

            points = 0;

            player = new Player(grid);
            gameObjects = new ArrayList<>();

            System.out.println(gameObjects);


        }


            while (lifes >= 0) {

                GameObject gameObject = GameObjectFactory.createNewGameObject(grid);
                gameObjects.add(gameObject);

                System.out.println(gameObjects.toString());
                System.out.println("BATATA");
                moveAllObjects();
                System.out.println("sout after move");
                collisionDetector.checkCollision();
                System.out.println("sout after collision");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }

            }

            gameOver();

            //GameObject go = GameObjectFactory.createNewGameObject(grid);

    }

    private void moveAllObjects () {
        for (GameObject gameObject : gameObjects) {
            gameObject.move(1);
        }
    }

    // TODO: 16/06/2019 - Need to implement points gathered and reset.
    public void gameOver(){
        Picture gameOver = new Picture(Grid.PADDING,Grid.PADDING, "resources/menu/gameover.jpg");
        gameOver.draw();
        gameBackGround.delete();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.getMessage();
        }

        menu.mainMenu();
        gameOver.delete();
    }

    public static int getPoints() {
        return points;
    }

    public static int getLifes() {
        return lifes;
    }

    public static void increasePoints (int add) {
        points += add;
    }

    public static void increaseLife () {
        lifes ++;
    }

    public static void decreaseLife () {
        lifes--;
    }
}
