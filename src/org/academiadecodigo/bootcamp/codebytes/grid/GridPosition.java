package org.academiadecodigo.bootcamp.codebytes.grid;

import org.academiadecodigo.bootcamp.codebytes.engine.Game;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.special.Special;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GridPosition {


    private int col;
    private int row;
    private Grid grid;
    private boolean collided;
    private Picture picture;


    public GridPosition(int col, int row, Grid grid, String path){
        this.col = col;
        this.row = row;
        this.grid = grid;
        picture = new Picture(grid.columnToX(col), grid.rowToY(row), path);
        picture.draw();
    }

    public Grid getGrid() {
        return grid;
    }

    public boolean isCollided() {
        return collided;
    }

    public void collision () {
        collided = true;
        picture.delete();
    }

    public void positionMove (GameObject gameObject) {

        if (row + 1 <= grid.getRows()-1) {
            row++;
            picture.translate(0, grid.getCellSize());
        }

        if (row + 1 > grid.getRows()-1) {
            if (gameObject instanceof Special) {
                collision();
                gameObject.collided();
                return;
            }

            collision();
            gameObject.collided();

            Game.decreaseLife();
        }

    }


    public void positionMovePlayer(GridDirection direction) {
        switch (direction) {
            case LEFT:
                if (col - 1 >= 0) {
                    col--;
                    picture.translate(-grid.getCellSize(), 0);
                }
                break;
            case RIGHT:
                if (col + 1 < grid.getCols()) {
                    col++;
                    picture.translate(grid.getCellSize(), 0);
                }
                break;
        }

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }


    public boolean equals1(GridPosition position1) {
        return row == position1.getRow() && col == position1.getCol();

    }
}
