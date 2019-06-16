package org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objectfactory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;

public class Emacs extends GameObject  {


    public Emacs(GridPosition position) {
        super(position, GameObjectType.EMACS);
        super.setObjectPoints(GameObjectType.EMACS.getObjectPoints());

    }

}

