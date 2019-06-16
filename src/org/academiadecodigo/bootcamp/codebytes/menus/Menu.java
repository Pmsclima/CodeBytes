package org.academiadecodigo.bootcamp.codebytes.menus;

import org.academiadecodigo.bootcamp.codebytes.engine.Game;
import org.academiadecodigo.bootcamp.codebytes.media.sound.Sound;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Menu {



    public static class MenuRepresentation implements KeyboardHandler {


        private Picture menuMain;
        private Picture menuLoading;
        private Picture menuPresentScreen;
        private Picture instructions;
        private Picture credits;
        private Sound loading;
        private Keyboard menuKeyboard;
        private Game game;


        public MenuRepresentation() {

            this.menuPresentScreen = new Picture(0, 0, "Resources/Menu/Team 4.jpg"); // first screen after launch todo: start mgmt music;
            this.menuMain = new Picture(0, 0, "Resources/Menu/Menu.jpg"); //button menu
            this.menuLoading = new Picture(0,0, "Resources/Menu/Start.jpg"); // logo screen
            this.instructions = new Picture(0,0, "Resources/Menu/Instructions.jpg"); // instructions screen
            this.credits = new Picture(0,0, "Resources/menu/credits.png"); // credits screen; todo: need path & img on resources
            loading = new Sound("/resources/sounds/MGMT_Kids.wav");

        }



        public void init() throws InterruptedException {

            menuPresentScreen.draw();
            loading.play(false);
            Thread.sleep(7000);
            menuLoading.draw();
            menuPresentScreen.delete();
            Thread.sleep(14500);
            menuMain.draw();
            menuPresentScreen.delete();


            /**
             * Keyboard to use in game menu following menu names
             * S - Start game
             * I - access instructions
             * C - access credits
             * E - exit game
             * B - back to main menu
             */
            Keyboard menuKeyboard = new Keyboard(this);
            KeyboardEvent start = new KeyboardEvent();

            start.setKey(KeyboardEvent.KEY_S);
            start.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            KeyboardEvent credits = new KeyboardEvent();
            credits.setKey(KeyboardEvent.KEY_C);
            credits.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            KeyboardEvent instructions = new KeyboardEvent();
            instructions.setKey(KeyboardEvent.KEY_I);
            instructions.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            KeyboardEvent exit = new KeyboardEvent();
            exit.setKey(KeyboardEvent.KEY_E);
            exit.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            KeyboardEvent back = new KeyboardEvent();
            back.setKey(KeyboardEvent.KEY_B);
            back.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


            menuKeyboard.addEventListener(start);
            menuKeyboard.addEventListener(credits);
            menuKeyboard.addEventListener(instructions);
            menuKeyboard.addEventListener(exit);
            menuKeyboard.addEventListener(back);


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

        public void menuBack() {
            mainMenu();
            instructionsDelete();
            creditsDelete();

        }


        public void keyPressed(KeyboardEvent keyboardEvent) {

            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_S:
                    game.start();
                    break;

                case KeyboardEvent.KEY_C:
                    credits();
                    break;

                case KeyboardEvent.KEY_I:
                    instructions();
                    break;

                case KeyboardEvent.KEY_E:
                    System.exit(1);
                    break;

                case KeyboardEvent.KEY_B:
                    menuBack();
                    instructions.delete();
                    credits.delete();
                    break;
        }
    }

        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {
            return;
        }


    }
}
