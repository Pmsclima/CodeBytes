package org.academiadecodigo.bootcamp.codebytes.menus;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Credits implements Menus2, KeyboardHandler {

    private Picture credits;

    public Credits() {

        // credits screen
        this.credits = new Picture(Grid.PADDING,Grid.PADDING, "Resources/menu/credits.png");
    }

    @Override
    public void initMenu() {
        credits.draw();

    }

    @Override
    public void deleteMenu() {
        credits.delete();

    }

    @Override
    public void backMenu() {
        return;

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
