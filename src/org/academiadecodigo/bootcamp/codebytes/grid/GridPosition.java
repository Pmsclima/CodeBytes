package org.academiadecodigo.bootcamp.codebytes.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GridPosition {


    private int col;
    private int row;
    private Grid grid;
    private boolean collided;
    private Picture picture;


    public GridPosition(int col, int row, Grid grid, Picture picture){
        this.col = col;
        this.row = row;
        this.grid = grid;
        this.picture = picture;
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

    public void positionMove (GridDirection direction) {

        switch (direction) {
            case DOWN:
                if (row + 1 <= grid.getRows()){
                    row++;
                    picture.translate(0, grid.getCellSize());
                }
                break;

            case LEFT:
                if (col - 1 >= 0) {
                    col--;
                    picture.translate(grid.getCellSize(), 0);
                }
                break;
            case RIGHT:
                if (col + 1 <= grid.getCols()) {
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
}
