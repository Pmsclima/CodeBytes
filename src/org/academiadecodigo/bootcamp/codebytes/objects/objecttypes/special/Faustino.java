package org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.special;

import org.academiadecodigo.bootcamp.codebytes.engine.Game;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;

public class Faustino extends GameObject implements Special{


    public Faustino(GridPosition position) {
        super(position, GameObjectType.FAUSTINO);
    }

    @Override
    public void specialFeature() {

        Game.increasePoints(Game.getPoints());
    }

}
