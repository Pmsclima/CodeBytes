package org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.special;

import org.academiadecodigo.bootcamp.codebytes.engine.Game;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;

public class Seringas extends GameObject implements Special {


    public Seringas(GridPosition position) {
        super(position, GameObjectType.SERINGAS);
    }

    @Override
    public void specialFeature() {
        Game.increasePoints(1000);
    }

}
