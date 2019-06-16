package org.academiadecodigo.bootcamp.codebytes.objects.object_types.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;

public class Intellij extends GameObject{

    public Intellij(GridPosition position) {
        super(position, GameObjectType.INTELLIJ);
        super.setObjectPoints(GameObjectType.INTELLIJ.getObjectPoints());
    }

}
