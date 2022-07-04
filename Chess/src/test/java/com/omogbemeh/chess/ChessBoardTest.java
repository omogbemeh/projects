package com.omogbemeh.chess;

import com.omogbemeh.chess.pieces.Knight;
import com.omogbemeh.chess.pieces.Pawn;
import com.omogbemeh.chess.pieces.Piece;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ChessBoardTest {
    private final ChessBoard chessBoard = new ChessBoard();

    @Test
    public void testParseCorrectLocation() {
        String location = ChessBoard.parseLocation("h1");
        assertEquals("7,7", location);
    }

    @Test
    public void testParseWrongLocation() {
        String location = ChessBoard.parseLocation("a9");
        assertEquals("-1", location);
    }

    @Test
    public void testAddPawnToLocation() {
        Pawn pawn = new Pawn();
        chessBoard.addPieceToBoard(pawn, "a8");
        assertEquals("Pawn", chessBoard.chessBoard[0][0].toString());
    }

    @Test
    public void testAddKnightToLocation() {
        Knight knight = new Knight();
        chessBoard.addPieceToBoard(knight, "a4");
        assertEquals("Knight", chessBoard.chessBoard[0][4].toString());
    }

    @Test
    public void testGetPieceAtLocation() {
        Piece piece = chessBoard.getPieceAtLocation("a8");
        assertNull(piece);
    }
}
