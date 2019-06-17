package org.academiadecodigo.bootcamp.codebytes.player;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.grid.GridDirection;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player implements KeyboardHandler {


    private int lives;
    private GridPosition playerPosition;
    private Grid grid;
    private final int MAX_SPEED = 3;
    private Keyboard keyboard;
    private int speed = 0;
    protected GridDirection currentDirection;

    public Player(Grid grid) {
        playerPosition = new GridPosition(((int) (Math.random() * 24)), 12, grid, "resources/logos/Player.png" );
        //this.currentDirection = GridDirection.DOWN;
        lives = 3;
        keyboard = new Keyboard(this);
        init();
    }

    public void init() {

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(left);
        keyboard.addEventListener(right);

    }



    public GridPosition getPlayerPosition() {
        return playerPosition;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                currentDirection = GridDirection.LEFT;
                playerPosition.positionMovePlayer(currentDirection);
                break;
            case KeyboardEvent.KEY_RIGHT:
                currentDirection = GridDirection.RIGHT;
                playerPosition.positionMovePlayer(currentDirection);
                break;
        }


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            speed = 0;
        }

    }

}
