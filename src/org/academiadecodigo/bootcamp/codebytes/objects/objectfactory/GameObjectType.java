package org.academiadecodigo.bootcamp.codebytes.objects.objectfactory;

public enum GameObjectType {

    ALEXANDRA(0),
    EMACS(-100),
    FAUSTINO(0),
    GIT(+200),
    INTELLIJ(+100),
    JAVA(+200),
    LINUX(+100),
    MAC(+100),
    MARIANA(0),
    NVIDIA(-100),
    SERINGAS(+1000),
    VIM(100),
    WINDOWS(-200),
    ;

    private int objectPoints;

    GameObjectType(int objectPoints) {
        this.objectPoints = objectPoints;
    }

    public int getObjectPoints() {
        return objectPoints;
    }
}
