package org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;

public class Mac extends GameObject {

    public Mac(GridPosition position) {
        super(position, GameObjectType.MAC);
        this.setObjectPoints(GameObjectType.MAC.getObjectPoints());
    }

}
