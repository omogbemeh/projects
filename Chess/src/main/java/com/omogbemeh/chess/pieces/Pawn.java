package com.omogbemeh.chess.pieces;

import com.omogbemeh.chess.ChessBoard;

public class Pawn extends Piece {
    public boolean isFirstMove = true;

    public Pawn() {
        this.name = "Pawn";
    }

    @Override
    public String move() {
        String location = this.getLocation();
        int[] coordinates = ChessBoard.getPieceIntCoordinates(location);
        int newXCoordinate = coordinates[0];
        int newYCoordinate = ++coordinates[1];
        return String.format("%s,%s", newXCoordinate, newYCoordinate);
    }
}
