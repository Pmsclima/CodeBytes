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
                gameObject = new Alexandra(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Alexandra.png"));
                break;

            case EMACS:
                gameObject = new Emacs(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Linus.png"));
                break;

            case FAUSTINO:
                gameObject = new Faustino(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Faustino.png"));
                break;

            case GIT:
                gameObject = new Git(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Git.png"));
                break;

            case INTELLIJ:
                gameObject = new Intellij(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Git.png"));
                break;

            case JAVA:
                gameObject = new Java(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Java.png"));
                break;

            case LINUX:
                gameObject = new Linux(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Linux.png"));
                break;

            case MAC:
                gameObject = new Mac(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Apple.png"));
                break;

            case MARIANA:
                gameObject = new Mariana(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Mariana.png"));
                break;

            case NVIDIA:
                gameObject = new Nvidia(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Nvidia.png"));
                break;

            case SERINGAS:
                gameObject = new Seringas(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Seringas.png"));
                break;

            case VIM:
                gameObject = new Vim(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Vim.png"));
                break;

            case WINDOWS:
                gameObject = new Windows(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Windows.png"));
                break;

            default:
                gameObject = new Java(new GridPosition(((int) (Math.random()*24)), 0, grid, "resources/Logos/Java.png"));
        }

        return gameObject;
    }
}

