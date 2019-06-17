package org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;

public class Intellij extends GameObject{

    public Intellij(GridPosition position) {
        super(position, GameObjectType.INTELLIJ);
        super.setObjectPoints(GameObjectType.INTELLIJ.getObjectPoints());
    }

}
