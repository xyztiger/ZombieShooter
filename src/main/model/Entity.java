package model;

import java.util.ArrayList;

// Represents an entity which occupies a specific location (x-position and y-position) on the stage
public abstract class Entity {
    int posX;
    int posY;
//    void move();
//
//    void hurt();
//
//    void die();

    public ArrayList<Integer> getPosition() {
        ArrayList<Integer> position = new ArrayList<>();
        position.add(posX);
        position.add(posY);
        return position;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
