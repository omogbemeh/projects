package com.omogbemeh.chess.pieces;

import com.omogbemeh.chess.ChessBoard;

public class Pawn extends Piece {
    private boolean isFirstMove = true;

    public Pawn() {
        this.name = "Pawn";
    }

    @Override
    public String move() {
        String location = this.getLocation();
        int[] coordinates = ChessBoard.getPieceIntCoordinates(location);
        int newXCoordinate = coordinates[0];
        int newYCoordinate = ++coordinates[1];
        this.isFirstMove = false;
        return String.format("%s,%s", newXCoordinate, newYCoordinate);
    }

    public String moveTwoStepsForward() {
        if (!isFirstMove) return "-1";
        String location = this.getLocation();
        int[] coordinates = ChessBoard.getPieceIntCoordinates(location);
        int xCoordinate = coordinates[0];
        int yCoordinate = coordinates[1] + 2;
        this.isFirstMove = false;
        return String.format("%s,%s", xCoordinate, yCoordinate);
    }
}
