package org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;

public class Nvidia extends GameObject {

    public Nvidia(GridPosition position) {
        super(position, GameObjectType.NVIDIA);
        this.setObjectPoints(GameObjectType.NVIDIA.getObjectPoints());
    }
}

