package org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;

public class Linux extends GameObject {

    public Linux(GridPosition position) {
        super(position, GameObjectType.LINUX);
        this.setObjectPoints(GameObjectType.LINUX.getObjectPoints());
    }
}
