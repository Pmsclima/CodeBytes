package org.academiadecodigo.bootcamp.codebytes.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    public static final int PADDING = 10;
    private int cols;
    private int rows;
    private int cellSize;
    private Rectangle rect;

    public Grid() {
        this.cols = 24;
        this.rows = 14;
        cellSize = 50;
    }

    public void initialization () {
        rect= new Rectangle(PADDING, PADDING, cols*cellSize, rows*cellSize);
        rect.setColor(Color.WHITE);
        rect.draw();

    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int getWidth() {
        return rect.getWidth();
    }

    public int getHeight() {
        return rect.getHeight();
    }

    public int getX() {
        return rect.getX();
    }

    public int getY() {
        return rect.getY();
    }

    public int getCellSize() {
        return cellSize;
    }

    public int rowToY(int row) {
        return (row*cellSize) + PADDING;
    }

    public int columnToX(int column) {
        return (column*cellSize) + PADDING;
    }


}
