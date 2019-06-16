package org.academiadecodigo.bootcamp.codebytes.objects.object_factory;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.media.Pictures;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.normal.*;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.special.Alexandra;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.special.Faustino;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.special.Mariana;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.special.Seringas;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameObjectFactory {

    public static GameObject createNewGameObject(Grid grid) {

        int random = (int) (Math.random() * GameObjectType.values().length);

        GameObjectType gameObjectType = GameObjectType.values()[random];

        GameObject gameObject;


        switch (gameObjectType) {

            case ALEXANDRA:
                gameObject = new Alexandra(new GridPosition(((int) (Math.random()*24)), 0, grid, Pictures.values()));
                break;

            case EMACS:
                gameObject = new Emacs(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            case FAUSTINO:
                gameObject = new Faustino(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            case GIT:
                gameObject = new Git(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            case INTELLIJ:
                gameObject = new Intellij(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            case JAVA:
                gameObject = new Java(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            case LINUX:
                gameObject = new Linux(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            case MAC:
                gameObject = new Mac(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            case MARIANA:
                gameObject = new Mariana(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            case NVIDIA:
                gameObject = new Nvidia(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            case SERINGAS:
                gameObject = new Seringas(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            case VIM:
                gameObject = new Vim(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            case WINDOWS:
                gameObject = new Windows(new GridPosition(((int) (Math.random()*24)), 0, grid, Picture.));
                break;

            default:
                gameObject = new Java(Grid.);
        }

        return gameObject;
    }
}

