package com.omogbemeh.chess;

import com.omogbemeh.chess.pieces.Pawn;
import com.omogbemeh.chess.pieces.Piece;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PawnTest {
    private final ChessBoard chessBoard = new ChessBoard();
    private Pawn pawn;

    @BeforeEach
    void setUp() {
        pawn = new Pawn();
    }

    @Test
    public void testGetPawnLocation() {
        this.chessBoard.addPieceToBoard(this.pawn, "a4");
        String location = this.pawn.getLocation();
        assertEquals("0,4", location);
    }

    @Test
    @Disabled
    public void testMoveOneStepForward() {
        chessBoard.addPieceToBoard(pawn, "a2");
        this.pawn.moveForward();
        Piece movedPawn = chessBoard.getPieceAtLocation("a3");
        Piece pawnOldLocation = chessBoard.getPieceAtLocation("a2");
        assertEquals(this.pawn.toString(), movedPawn.toString(), "Pawn moved forward by one step");
        assertNull(pawnOldLocation);
    }
}
