package com.omogbemeh.chess.pieces;

public class Piece {
    protected String name;
    protected String location;

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
