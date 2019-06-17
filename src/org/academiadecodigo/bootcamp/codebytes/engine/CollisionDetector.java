package org.academiadecodigo.bootcamp.codebytes.engine;


import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.special.Special;
import org.academiadecodigo.bootcamp.codebytes.player.Player;


import java.util.ArrayList;

public class CollisionDetector {

    private Player player;
    private ArrayList<GameObject> gameObjects;

    public CollisionDetector(ArrayList<GameObject> gameObjects, Player player) {
        this.gameObjects = gameObjects;
        this.player = player;
    }



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
