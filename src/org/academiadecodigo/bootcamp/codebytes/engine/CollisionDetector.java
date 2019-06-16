package org.academiadecodigo.bootcamp.codebytes.engine;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;
import org.academiadecodigo.bootcamp.codebytes.player.Player;

public class CollisionDetector {

    private Player player;
    private GameObject[] gameObjects;

    public CollisionDetector(GameObject[] gameObjects) {
        this.gameObjects = gameObjects;
    }

    // if object hits the player

    //if object hits the ground

    public boolean isUnSafe(GridPosition position) {

        for (GameObject object : gameObjects) {

            if (object.getPos()!= pos && object.getPos().equals(pos)) {
                return true;
            }

        }

        return false;
    }

    public void checkGameObjects() {

        for (GameObject gameObject : gameObjects) {

            if (ic.getPos().equals(car.getPos())) {
                ic.crash();
                car.crash();
            }
        }

    }


}
