package org.academiadecodigo.bootcamp.codebytes.objects.objectfactory;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.GameObject;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.normal.*;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.special.Alexandra;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.special.Faustino;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.special.Mariana;
import org.academiadecodigo.bootcamp.codebytes.objects.objecttypes.special.Seringas;

public class GameObjectFactory {

    public static GameObject createNewGameObject(Grid grid) {

        int random = (int) (Math.random() * GameObjectType.values().length);

        GameObjectType gameObjectType = GameObjectType.values()[random];

        GameObject gameObject;


        switch (gameObjectType) {

            case ALEXANDRA:
                gameObject = new Alexandra(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Alexandra.png"));
                break;

            case EMACS:
                gameObject = new Emacs(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Linus.png"));
                break;

            case FAUSTINO:
                gameObject = new Faustino(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Faustino.png"));
                break;

            case GIT:
                gameObject = new Git(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Git.png"));
                break;

            case INTELLIJ:
                gameObject = new Intellij(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Git.png"));
                break;

            case JAVA:
                gameObject = new Java(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Java.png"));
                break;

            case LINUX:
                gameObject = new Linux(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Linux.png"));
                break;

            case MAC:
                gameObject = new Mac(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Apple.png"));
                break;

            case MARIANA:
                gameObject = new Mariana(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Mariana.png"));
                break;

            case NVIDIA:
                gameObject = new Nvidia(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Nvidia.png"));
                break;

            case SERINGAS:
                gameObject = new Seringas(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Seringas.png"));
                break;

            case VIM:
                gameObject = new Vim(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Vim.png"));
                break;

            case WINDOWS:
                gameObject = new Windows(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Windows.png"));
                break;

            default:
                gameObject = new Java(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/logos/Java.png"));
        }

        return gameObject;
    }
}

