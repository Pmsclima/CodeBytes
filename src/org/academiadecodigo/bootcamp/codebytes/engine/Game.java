package org.academiadecodigo.bootcamp.codebytes.engine;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.media.Backgrounds;
import org.academiadecodigo.bootcamp.codebytes.media.sound.Sound;
import org.academiadecodigo.bootcamp.codebytes.menus.Menu;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectFactory;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;
import org.academiadecodigo.bootcamp.codebytes.player.Player;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;


import java.util.ArrayList;

public class Game {

    private Menu.MenuRepresentation menu;
    private CollisionDetector collisionDetector;
    private Player player;
    private Grid grid;
    private ArrayList <GameObject> gameObjects;
    private static int points;
    private static int lifes = 20;
    Picture gameBackGround;
    Sound gameSound;
    private boolean gameOn;
    private Text displayScore;
    private Text displayLife;

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

            int random = (int) (Math.random() * Backgrounds.values().length);
            gameBackGround = new Picture(Grid.PADDING, Grid.PADDING, Backgrounds.values()[random].getPath());
            gameBackGround.draw();

            gameOn = true;
            gameSound = new Sound("/resources/sounds/GameMusic.wav");
            gameSound.play(true);
            gameSound.setLoop(10);

            points = 0;

            scoreInit(points);
            drawScore();
            lifeInit(lifes);
            drawLife();

            player = new Player(grid);

            gameObjects = new ArrayList<>();
            GameObject gameObject = GameObjectFactory.createNewGameObject(grid);
            gameObjects.add(gameObject);

            collisionDetector = new CollisionDetector(gameObjects, player);


            while (lifes > 0) {



                gameObjects.add(gameObject);
                gameObject = GameObjectFactory.createNewGameObject(grid);

                moveAllObjects();
                collisionDetector.checkCollision();


                updateScore(points);
                updateLife(lifes);


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
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

    public void setGameOn() {
        gameOn = true;
    }

    public boolean isGameOn(){
        return gameOn;
    }



    public void scoreInit(Integer score) {
        displayScore = new Text(1050, 30, score.toString());
        displayScore.setColor(Color.WHITE);
        displayScore.grow(20, 20);
    }

    public void drawScore(){
        displayScore.draw();
    }

    public void updateScore(Integer newScore){
        displayScore.setText(newScore.toString());
    }

    public void lifeInit(Integer lifes) {
        displayLife = new Text (1150, 30, lifes.toString());
        displayLife.setColor(Color.RED);
        displayLife.grow(15, 15);
    }

    public void drawLife() {
        displayLife.draw();
    }

    public void updateLife(Integer newLife) {
        displayLife.setText(newLife.toString());
    }
}
