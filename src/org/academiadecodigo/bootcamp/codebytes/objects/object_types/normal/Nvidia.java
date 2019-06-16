package org.academiadecodigo.bootcamp.codebytes.objects.object_types.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;

public class Nvidia extends GameObject {

    public Nvidia(GridPosition position) {
        super(position, GameObjectType.NVIDIA);
        this.setObjectPoints(GameObjectType.NVIDIA.getObjectPoints());
    }
}

