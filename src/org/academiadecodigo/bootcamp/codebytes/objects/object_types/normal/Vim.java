package org.academiadecodigo.bootcamp.codebytes.objects.object_types.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_interfaces.Bonus;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;

public class Vim extends GameObject {


    public Vim(GridPosition position) {
        super(position, GameObjectType.VIM);
        this.setObjectPoints(GameObjectType.VIM.getObjectPoints());
    }
}
