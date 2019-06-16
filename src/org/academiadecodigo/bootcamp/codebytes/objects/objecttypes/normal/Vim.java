package org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;

public class Vim extends GameObject {


    public Vim(GridPosition position) {
        super(position, GameObjectType.VIM);
        this.setObjectPoints(GameObjectType.VIM.getObjectPoints());
    }
}
