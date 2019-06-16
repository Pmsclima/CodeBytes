package org.academiadecodigo.bootcamp.codebytes.objects.object_factory;

public enum GameObjectType {

    ALEXANDRA(0),
    EMACS(-100),
    FAUSTINO(0),
    GIT(50),
    INTELLIJ(100),
    JAVA(150),
    LINUX(300),
    MAC(-200),
    MARIANA(0),
    NVIDIA(-100),
    SERINGAS(0),
    VIM(200),
    WINDOWS(-300),
    ;

    private int objectPoints;

    GameObjectType(int objectPoints) {
        this.objectPoints = objectPoints;
    }

    public int getObjectPoints() {
        return objectPoints;
    }
}
