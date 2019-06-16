package org.academiadecodigo.bootcamp.codebytes.objects.object_types.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;

public class Mac extends GameObject {

    public Mac(GridPosition position, GameObjectType gameObjectType) {
        super(position, GameObjectType.MAC);
        this.setObjectPoints(GameObjectType.MAC.getObjectPoints());
    }

}
