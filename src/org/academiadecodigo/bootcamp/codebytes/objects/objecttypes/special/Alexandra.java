package org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.special;

import org.academiadecodigo.bootcamp.codebytes.engine.Game;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;

public class Alexandra extends GameObject implements Special{

    public Alexandra(GridPosition position) {
        super(position, GameObjectType.ALEXANDRA);
    }


    @Override
    public void specialFeature() {
        Game.increaseLife();
        Game.increaseLife();
    }
}
