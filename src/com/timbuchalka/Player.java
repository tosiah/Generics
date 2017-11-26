package com.timbuchalka;

/**
 * Created by Antonina on 2017-11-21.
 */
public abstract class Player {

    private String name;
    private boolean taken = false;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }
}
