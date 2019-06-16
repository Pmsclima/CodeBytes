package org.academiadecodigo.bootcamp.codebytes.objects.object_types.special;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;

public class Alexandra extends GameObject implements Special{

    public Alexandra(GridPosition position) {
        super(position, GameObjectType.ALEXANDRA);
    }


    @Override
    public void specialFeature() {
        GameObject.increaseSpeed();
    }
}
