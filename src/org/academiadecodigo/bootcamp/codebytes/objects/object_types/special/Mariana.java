package org.academiadecodigo.bootcamp.codebytes.objects.object_types.special;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;

public class Mariana extends GameObject {

    public Mariana(GridPosition position) {
        super(position, GameObjectType.MARIANA);
    }

}
