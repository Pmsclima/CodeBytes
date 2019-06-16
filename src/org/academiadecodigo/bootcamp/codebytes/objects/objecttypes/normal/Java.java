package org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;

public class Java extends GameObject {

    public Java(GridPosition position) {
        super(position, GameObjectType.JAVA);
        this.setObjectPoints(GameObjectType.JAVA.getObjectPoints());
    }

}
