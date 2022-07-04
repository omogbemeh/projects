package com.omogbemeh.chess;

import com.omogbemeh.chess.pieces.Knight;
import com.omogbemeh.chess.pieces.Pawn;
import com.omogbemeh.chess.pieces.Piece;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ChessBoardTest {
    private ChessBoard chessBoard;

    @BeforeEach
    void setUp() {
        this.chessBoard = new ChessBoard();
    }

    @Test
    public void testParseCorrectLocation() {
        String location = ChessBoard.parseLocation("a2");
        assertEquals("0,6", location);
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

    @Test
    public void testPawnOldLocationIsNull() {
        Pawn pawn = new Pawn(); // Creates a new pawn
        chessBoard.addPieceToBoard(pawn, "a2"); // Adds the pawn to the location "a2"
        String pawnOldLocation = pawn.getLocation(); // Gets old location as a String Coordinate "0,6"
        int[] oldCoordinates = ChessBoard.getPieceIntCoordinates(pawnOldLocation); // Turns the old location into an Integer Array [0,6]
        chessBoard.movePiece(pawn); // moves the piece and sets the pawn's old location to null
        assertNull(chessBoard.chessBoard[oldCoordinates[0]][oldCoordinates[1]]);
    }
}
