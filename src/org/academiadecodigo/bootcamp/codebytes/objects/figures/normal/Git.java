package org.academiadecodigo.bootcamp.codebytes.objects.figures.normal;

import org.academiadecodigo.bootcamp.codebytes.objectsinterfaces.Bonus;
import org.academiadecodigo.bootcamp.codebytes.objects.figures.GameObject;

public class Git extends GameObject implements Bonus {


    public Git(int points, int lifes) {
        super(points, lifes);
    }

    @Override
    public int calculateBonus() {

        return (getPoints() + 200);

    }
}
