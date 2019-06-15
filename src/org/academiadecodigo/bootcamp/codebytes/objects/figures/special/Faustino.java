package org.academiadecodigo.bootcamp.codebytes.objects.figures.special;

import org.academiadecodigo.bootcamp.codebytes.objectsinterfaces.Bonus;
import org.academiadecodigo.bootcamp.codebytes.objects.figures.GameObject;

public class Faustino extends GameObject implements Bonus {

    public Faustino(int points, int lifes) {
        super(points, lifes);
    }

    @Override
    public int calculateBonus() {

        return (getPoints() * 2);


    }
}
