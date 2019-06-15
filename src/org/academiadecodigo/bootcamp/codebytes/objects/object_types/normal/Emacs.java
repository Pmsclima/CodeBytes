package org.academiadecodigo.bootcamp.codebytes.objects.object_types.normal;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_interfaces.Bonus;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;

public class Emacs extends GameObject  {


    public Emacs(GridPosition position) {
        super(position, GameObjectType.EMACS);
        super.setObjectPoints(GameObjectType.EMACS.getObjectPoints());

    }

}

