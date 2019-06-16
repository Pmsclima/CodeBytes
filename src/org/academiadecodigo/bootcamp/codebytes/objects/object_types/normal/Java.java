package org.academiadecodigo.bootcamp.codebytes.objects.object_types.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_interfaces.Bonus;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;

public class Java extends GameObject {

    public Java(GridPosition position) {
        super(position, GameObjectType.JAVA);
        this.setObjectPoints(GameObjectType.JAVA.getObjectPoints());
    }

}
