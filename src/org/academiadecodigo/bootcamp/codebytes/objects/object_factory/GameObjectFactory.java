package org.academiadecodigo.bootcamp.codebytes.objects.object_factory;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.normal.*;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.special.Alexandra;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.special.Faustino;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.special.Mariana;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.special.Seringas;

public class GameObjectFactory {

    public static GameObject createNewGameObject(Grid grid) {

        int random = (int) (Math.random() * GameObjectType.values().length);

        GameObjectType gameObjectType = GameObjectType.values()[random];

        GameObject gameObject;

        switch (gameObjectType) {

            case ALEXANDRA:
                gameObject = new Alexandra(Grid.);
                break;

            case EMACS:
                gameObject = new Emacs(Grid.);
                break;

            case FAUSTINO:
                gameObject = new Faustino(Grid.);
                break;

            case GIT:
                gameObject = new Git(Grid.);
                break;

            case INTELLIJ:
                gameObject = new Intellij(Grid.);
                break;

            case JAVA:
                gameObject = new Java(Grid.);
                break;

            case LINUX:
                gameObject = new Linux(Grid.);
                break;

            case MAC:
                gameObject = new Mac(Grid.);
                break;

            case MARIANA:
                gameObject = new Mariana(Grid.);
                break;

            case NVIDIA:
                gameObject = new Nvidia(Grid.);
                break;

            case SERINGAS:
                gameObject = new Seringas(Grid.);
                break;

            case VIM:
                gameObject = new Vim(Grid.);
                break;

            case WINDOWS:
                gameObject = new Windows(Grid.);
                break;

                default:
                    gameObject = new Java(Grid.);
        }

        return gameObject;
    }
}

