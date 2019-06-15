package org.academiadecodigo.bootcamp.codebytes.menus;

import org.academiadecodigo.bootcamp.codebytes.media.sound.Sound;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Menu {

    public static class MenuRepresentation {


        private Picture menuMain;
        private Picture menuLoading;
        private Picture menuPresentScreen;
        private Picture instructions;
        private Picture credits;
        private Sound loading;


        public MenuRepresentation() {

            this.menuPresentScreen = new Picture(0, 0, "Resources/Menu/Team 4.jpg"); // first screen after launch todo: start mgmt music;
            this.menuMain = new Picture(0, 0, "Resources/Menu/Menu.jpg"); //button menu
            this.menuLoading = new Picture(0,0, "Resources/Menu/Start.jpg"); // logo screen
            this.instructions = new Picture(0,0, "Resources/Menu/Instructions.jpg"); // instructions screen
            this.credits = new Picture(0,0, ""); // credits screen; todo: need path & img on resources
            loading = new Sound("/resources/sounds/MGMT_Kids.wav");

        }



        public void init() throws InterruptedException {

            menuPresentScreen.draw();
            loading.play(false);
            Thread.sleep(7000);
            menuLoading.draw();
            menuPresentScreen.delete();
        }


        public void mainMenu () {
            menuMain.draw();
        }

        public void instructions() {
            instructions.draw();
        }

        public void credits() {
            credits.draw();
        }

        public void creditsDelete() {
            credits.delete();
        }

        public void instructionsDelete() {
            instructions.delete();
        }






    }








}
