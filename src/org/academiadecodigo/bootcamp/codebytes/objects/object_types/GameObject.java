package org.academiadecodigo.bootcamp.codebytes.objects.object_types;

import org.academiadecodigo.bootcamp.codebytes.engine.CollisionDetector;
import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.grid.GridDirection;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;

public abstract class GameObject {

    private Grid grid;
    private GridPosition position;
    private GridDirection currentDirection;
    private int directionChangeLevel;
    private GameObjectType gameObjectType;
    private boolean collided = false;
    private int objectPoints;
    protected CollisionDetector collisionDetector;

    public GameObject(GridPosition position, GameObjectType gameObjectType) {
        this.position = position;
        this.gameObjectType = gameObjectType;
    }

    public void move(GridDirection direction, int speed) {

        if (isCollided()) {
            return;
        }

        this.currentDirection = direction;

        for (int i = 0; i < speed; i++) {
            this.position.positionMove(direction);
            if (collisionDetector.isUnSafe(position)) {
                collided();
                break;
            }
        }
    }

    //abstract public void increasedMovementSpeed();

    public void collided() {
        this.collided = true;
    }

    public GridDirection chooseDirection() {

        GridDirection newDirection = currentDirection;

        if (Math.random() > ((double) directionChangeLevel) / 10) {
            newDirection = GridDirection.values()[(int) (Math.random() * GridDirection.values().length)];


            if (newDirection.isOpposite(currentDirection)) {
                return chooseDirection();
            }
        }

        return newDirection;

    }


    public boolean isHittingWall() {

        switch (currentDirection) {

            case LEFT:
                if (position.getCol() == 0) {
                    return true;
                }
                break;

            case RIGHT:
                if (position.getCol() == grid.getCols() - 1) {
                    return true;
                }
                break;

            case DOWN:
                if (position.getRow() == grid.getRows() - 1) {
                    return true;
                }
                break;
        }

        return false;

    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public GridPosition getPosition() {
        return position;
    }

    public void setObjectPoints(int objectPoints) {
        this.objectPoints = objectPoints;
    }

    public void setCollisionDetector(CollisionDetector collisionDetector){
        this.collisionDetector = collisionDetector;
    }

    public boolean isCollided() {
        return collided;
    }

    @Override
    public String toString() {
        return "GameObject{" +
                "position=" + position +
                ", gameObjectType=" + gameObjectType +
                ", collided=" + collided +
                '}';
    }
}
