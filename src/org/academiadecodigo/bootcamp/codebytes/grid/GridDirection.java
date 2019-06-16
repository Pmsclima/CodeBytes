package org.academiadecodigo.bootcamp.codebytes.grid;

public enum GridDirection {

    DOWN,
    LEFT,
    RIGHT,
    ;

    public boolean isOpposite(GridDirection dir) {
        return dir.equals(oppositeDirection());
    }

    public GridDirection oppositeDirection() {

        GridDirection opposite = null;

        switch (this) {

            case DOWN:
                opposite = GridDirection.DOWN;
                break;
            case LEFT:
                opposite = GridDirection.RIGHT;
                break;
            case RIGHT:
                opposite = GridDirection.LEFT;
                break;
        }

        return opposite;
    }



}
