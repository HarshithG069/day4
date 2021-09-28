package com.company;

public class Snakelader {


    private int position = 0;
    private String name = null;

    public Snakelader(String name) {
        this.name = name;
    }
    public int getPosition() {
        return position;
    }
    public String getName() {
        return name;
    }
    public void setPosition(int currentPosition) {
        this.position = currentPosition;
    }
    public void setName(String playerName) {
        this.name = playerName;
    }
}