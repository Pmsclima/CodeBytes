package org.academiadecodigo.bootcamp.codebytes.menus;

import org.academiadecodigo.bootcamp.codebytes.grid.Grid;
import org.academiadecodigo.bootcamp.codebytes.media.sound.Sound;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PresentingScreen implements Menus2 {

    private Picture menuPresentScreen;
    private Sound loading;

    public PresentingScreen() {

        // first screen after game initialization;
        this.menuPresentScreen = new Picture(Grid.PADDING,Grid.PADDING, "Resources/Menu/Team 4.jpg");
        // sound loaded when game is initialized;
        loading = new Sound("/resources/sounds/MGMT_Kids.wav");
    }

    @Override
    public void initMenu() {
        menuPresentScreen.draw();
        loading.play(false);
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteMenu() {
        menuPresentScreen.delete();
    }

    @Override
    public void backMenu() {

        return;
    }
}
