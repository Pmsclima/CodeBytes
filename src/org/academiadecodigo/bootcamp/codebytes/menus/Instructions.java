package org.academiadecodigo.bootcamp.codebytes.menus;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Instructions implements Menus2, KeyboardHandler {

    private Picture instructions;

    public Instructions() {
        // instructions screen;
        this.instructions = new Picture(Grid.PADDING,Grid.PADDING, "Resources/Menu/Instructions.jpg");
    }

    @Override
    public void initMenu() {
        instructions.draw();
    }

    @Override
    public void deleteMenu() {
        instructions.delete();
    }

    @Override
    public void backMenu() {

      InitialMenu initialMenu = new InitialMenu();
      initialMenu.initMenu();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
