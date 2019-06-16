package org.academiadecodigo.bootcamp.codebytes.objects.object_types.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;

public class Linux extends GameObject {

    public Linux(GridPosition position) {
        super(position, GameObjectType.LINUX);
        this.setObjectPoints(GameObjectType.LINUX.getObjectPoints());
    }
}
