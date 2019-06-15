package org.academiadecodigo.bootcamp.codebytes.objects.figures;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;

public abstract class GameObject {

    private Grid grid;
    private GridPosition position;
    private boolean collided;
    private int points;
    private int lifes;

    public GameObject(int points, int lifes) {
        this.points = 0;
        this.lifes = 3;
    }

    public int getPoints() {
        return points;
    }

    public int getLifes() {
        return lifes;
    }

    public void gameOver(){
        if (lifes == 0 || points == 0){
            return;
        }
    }
}
