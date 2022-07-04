package com.omogbemeh.chess;

import com.omogbemeh.chess.pieces.Piece;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    @Disabled
    public void testGetPieceByLocation() {
        Piece piece = chessBoard.getPieceByLocation("a8");
        String pieceName = piece.toString();
        assertEquals("Pawn", pieceName);
    }
}
