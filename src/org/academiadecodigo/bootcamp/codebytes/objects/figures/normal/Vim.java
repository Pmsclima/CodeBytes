package org.academiadecodigo.bootcamp.codebytes.objects.figures.normal;

import org.academiadecodigo.bootcamp.codebytes.objectsinterfaces.Bonus;
import org.academiadecodigo.bootcamp.codebytes.objects.figures.GameObject;

public class Vim extends GameObject implements Bonus {


    public Vim(int points, int lifes) {
        super(points, lifes);
    }

    @Override
    public int calculateBonus() {

        return (getPoints() + 100);

    }
}
