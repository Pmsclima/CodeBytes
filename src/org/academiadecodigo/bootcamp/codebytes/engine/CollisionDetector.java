package org.academiadecodigo.bootcamp.codebytes.engine;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.special.Special;
import org.academiadecodigo.bootcamp.codebytes.player.Player;


import java.lang.reflect.Field;
import java.util.ArrayList;

public class CollisionDetector {

    private Player player;
    private ArrayList<GameObject> gameObjects;

    public CollisionDetector(ArrayList<GameObject> gameObjects, Player player) {
        this.gameObjects = gameObjects;
        this.player = player;
    }

    // if object hits the player

    //if object hits the ground

   /* public boolean isUnSafe(GridPosition position) {

        for (GameObject object : gameObjects) {

            if (object.getPos()!= pos && object.getPos().equals(pos)) {
                return true;
            }

        }

        return false;
    }*/

    public void checkCollision() {

        for (GameObject gameObject : gameObjects) {

            if (this.player.getPlayerPosition().equals1(gameObject.getPosition())) {
                gameObject.collided();
                gameObject.getPosition().collision();

                if (gameObject instanceof Special) {
                    Special gameOb = (Special) gameObject;
                    gameOb.specialFeature();
                    return;
                }

                Game.increasePoints(gameObject.getObjectPoints());
            }

        }

       }


}
