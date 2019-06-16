package org.academiadecodigo.bootcamp.codebytes.media;


/**
 * Each background has a different path. Goal is to obtain a random one each start();
 */

public enum Backgrounds {
    BACKGROUND1("resources/background/gameBackGround1.jpg"),
    BACKGROUND2("resources/background/gameBackground2.jpg"),
    BACKGROUND3("resources/background/gameBackground3.jpg"),
    BACKGROUND4("resources/background/gameBackground4.jpg"),
    BACKGROUND5("resources/background/gameBackground5.jpg");


    private String path;

    Backgrounds(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}


