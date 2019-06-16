package org.academiadecodigo.bootcamp.codebytes.menus;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class InitialMenu implements Menus2, KeyboardHandler {

    private Picture menuMain;

    public InitialMenu() {
        //button menu;
        this.menuMain = new Picture(Grid.PADDING, Grid.PADDING, "Resources/Menu/Menu.jpg"); //button menu;
    }

    @Override
    public void initMenu() {
        menuMain.draw();

    }

    @Override
    public void deleteMenu() {
        menuMain.delete();

    }

    @Override
    public void backMenu() {


    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
