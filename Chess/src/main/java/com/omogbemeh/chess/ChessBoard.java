package com.omogbemeh.chess;

import com.omogbemeh.chess.pieces.Pawn;
import com.omogbemeh.chess.pieces.Piece;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChessBoard {
    public Piece[][] chessBoard;

    public ChessBoard() {
        chessBoard = new Piece[8][8];
    }

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        Pawn pawn = new Pawn();
        chessBoard.addPieceToBoard(pawn, "a5");
    }

    public static String parseLocation(String str) {
        Pattern pat = Pattern.compile("(?<letter>[a-h])(?<number>[0-8])");
        Matcher mat = pat.matcher(str);
        if (mat.find()) {
            int indx1 = mat.group("letter").charAt(0) - 'a';
            int indx2 = 8 - Integer.parseInt(mat.group("number"));
            return String.format("%s,%s", indx1, indx2);
        }
        return "-1";
    }

    public Piece getPieceAtLocation(String str) {
        String location = ChessBoard.parseLocation(str);
        if ("-1".equals(location)) return null;
        int xCoordinate = getPieceIntCoordinates(location)[0];
        int yCoordinate = getPieceIntCoordinates(location)[1];
        return this.chessBoard[xCoordinate][yCoordinate];
    }

    private int[] getPieceIntCoordinates(String location) {
        int xCoordinate = Integer.parseInt(location.split(",")[0]);
        int yCoordinate = Integer.parseInt(location.split(",")[1]);
        return new int[] {xCoordinate, yCoordinate};
    }

    public void addPieceToBoard(Piece piece, String location) {
        String parsedLocation = ChessBoard.parseLocation(location);
        Piece pieceAtLocation = getPieceAtLocation(location);
        if (pieceAtLocation != null || "-1".equals(parsedLocation)) return;
        int xCoordinate = getPieceIntCoordinates(parsedLocation)[0];
        int yCoordinate = getPieceIntCoordinates(parsedLocation)[1];
        this.chessBoard[xCoordinate][yCoordinate] = piece;
        piece.setLocation(parsedLocation);
    }

}
