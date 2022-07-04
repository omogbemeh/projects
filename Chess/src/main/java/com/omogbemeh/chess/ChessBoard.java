package com.omogbemeh.chess;

import com.omogbemeh.chess.pieces.Piece;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChessBoard {
    public ChessBoard() {
        Piece[][] chessBoard = new Piece[8][8];
    }

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
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

    public Piece getPieceByLocation(String str) {
        return null;
    }

    public void addPieceToBoard(Piece piece, String location) {

    }
}
