package org.academiadecodigo.bootcamp.codebytes.menus;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Loading implements Menus2 {

    private Picture menuLoading;

    public Loading() {

       // logo screen;
        this.menuLoading = new Picture(Grid.PADDING,Grid.PADDING, "Resources/Menu/Start.jpg");

    }

    @Override
    public void initMenu() {
        menuLoading.draw();

    }

    @Override
    public void deleteMenu() {
        menuLoading.delete();


    }

    @Override
    public void backMenu() {
        return;

    }
}
