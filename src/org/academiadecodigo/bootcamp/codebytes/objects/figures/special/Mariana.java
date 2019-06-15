package org.academiadecodigo.bootcamp.codebytes.objects.figures.special;

import org.academiadecodigo.bootcamp.codebytes.objectsinterfaces.Bonus;
import org.academiadecodigo.bootcamp.codebytes.objects.figures.GameObject;

public class Mariana extends GameObject implements Bonus {

    public Mariana(int points, int lifes) {
        super(points, lifes);
    }

    @Override
    public int calculateBonus() {

        return (getLifes() + 1);

    }
}
