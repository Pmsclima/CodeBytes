package org.academiadecodigo.bootcamp.codebytes.objects.objecttypes;

import org.academiadecodigo.bootcamp.codebytes.engine.CollisionDetector;
import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.grid.GridDirection;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObject {

    private Grid grid;
    private GridPosition position;
    private GridDirection currentDirection;
    private int directionChangeLevel;
    private GameObjectType gameObjectType;
    private boolean collided = false;
    private int objectPoints;
    protected CollisionDetector collisionDetector;
    private Picture picture;
    private static int speed;

    public GameObject(GridPosition position, GameObjectType gameObjectType) {
        this.position = position;
        this.gameObjectType = gameObjectType;
        objectPoints = gameObjectType.getObjectPoints();

    }

    public void move(int speed) {

        if (isCollided()) {
            return;
        }

        position.positionMove(this);

    }

    //abstract public void increasedMovementSpeed();

    public void collided() {
        this.collided = true;
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

    public int getObjectPoints() {
        return objectPoints;
    }

    public void setObjectPoints(int objectPoints) {
        this.objectPoints = objectPoints;
    }

    public CollisionDetector getCollisionDetector() {
        return collisionDetector;
    }

    public void setCollisionDetector(CollisionDetector collisionDetector){
        this.collisionDetector = collisionDetector;
    }

    public boolean isCollided() {
        return collided;
    }

    public static void increaseSpeed () {
         speed++;
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
