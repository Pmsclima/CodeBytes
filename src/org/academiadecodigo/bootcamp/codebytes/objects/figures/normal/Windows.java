package org.academiadecodigo.bootcamp.codebytes.objects.figures.normal;

import org.academiadecodigo.bootcamp.codebytes.objectsinterfaces.Bonus;
import org.academiadecodigo.bootcamp.codebytes.objects.figures.GameObject;

public class Windows extends GameObject implements Bonus {

    public Windows(int points, int lifes) {
        super(points, lifes);
    }

    @Override
    public int calculateBonus() {

        if (getPoints() == 0){
            gameOver();
        }
            return (getPoints() - 200);

    }
}
