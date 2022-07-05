package com.omogbemeh.chess;

import com.omogbemeh.chess.pieces.Pawn;
import com.omogbemeh.chess.pieces.Piece;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PawnTest {
    private ChessBoard chessBoard;
    private Pawn pawn;

    @BeforeEach
    void setUp() {
        pawn = new Pawn();
        chessBoard = new ChessBoard();
    }

    @Test
    public void testGetPawnLocation() {
        this.chessBoard.addPieceToBoard(this.pawn, "a4");
        String location = this.pawn.getLocation();
        assertEquals("0,4", location);
    }

    @Test
    public void testMovePawn() {
        this.chessBoard.addPieceToBoard(this.pawn, "a4");
        String newLocation = this.pawn.move();
        assertEquals("0,3", newLocation);
    }
}
