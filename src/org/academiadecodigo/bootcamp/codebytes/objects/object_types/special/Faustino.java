package org.academiadecodigo.bootcamp.codebytes.objects.object_types.special;

import org.academiadecodigo.bootcamp.codebytes.engine.Game;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;

public class Faustino extends GameObject implements Special{


    public Faustino(GridPosition position) {
        super(position, GameObjectType.FAUSTINO);
    }

    @Override
    public void specialFeature() {

        Game.increasePoints(Game.getPoints());
    }

}
