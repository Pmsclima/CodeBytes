package org.academiadecodigo.bootcamp.codebytes.player;

import org.academiadecodigo.bootcamp.codebytes.engine.CollisionDetector;
import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.grid.GridDirection;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.media.Pictures;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player implements KeyboardHandler {


    private int lives;
    private int score;
    private GridPosition playerPosition;
    private Grid grid;
    protected CollisionDetector collisionDetector;
    private final int MAX_SPEED = 3;
    private Keyboard keyboard;
    private int speed = 0;
    protected GridDirection currentDirection;

    public Player(GridPosition position) {
        this.playerPosition = new GridPosition(((int) (Math.random() * 24), 14, grid, Pictures ))
        this.currentDirection = GridDirection.DOWN;
        this.lives = 3;
        this.keyboard = new Keyboard(this);
        init();
    }

    public void init() {

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent faster = new KeyboardEvent();
        faster.setKey(KeyboardEvent.KEY_SPACE);
        faster.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent slower = new KeyboardEvent();
        slower.setKey(KeyboardEvent.KEY_SPACE);
        slower.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        keyboard.addEventListener(left);
        keyboard.addEventListener(down);
        keyboard.addEventListener(faster);
        keyboard.addEventListener(slower);
    }

    public Player createPlayer() {
        return new Player(new GridPosition(((int) (Math.random() * 24), 14, Pictures.);
    }

    public void move() {
        accelerate(currentDirection, speed);
    }


    public void accelerate(GridDirection direction, int speed) {

        // if the space bar is pressed down the player speed increases

        getPlayerPosition().positionMove(direction);

        for (int i = 0; i < speed; i++) { ;
            if (collisionDetector.isUnSafe(getPlayerPosition())) {
                //addPoints();
                break;
            }
        }

    }


    public void loseLife() {
        this.lives-=1;
    }


    public void addPoints(int points) {
        this.score += points;
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            speed = MAX_SPEED;
            return;
        }

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                currentDirection = GridDirection.LEFT;
                break;
            case KeyboardEvent.KEY_RIGHT:
                currentDirection = GridDirection.RIGHT;
                break;
        }

        if (speed == 0) {
            accelerate(currentDirection, 1);
        }

    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            speed = 0;
        }
    }


    public GridPosition getPlayerPosition() {
        return playerPosition;
    }

}
