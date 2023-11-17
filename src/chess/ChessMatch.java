package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch(){
		board = new Board (8,8);
	}
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece [board.getRows()][board.getColumns()];
		for(int i=1;i < board.getColumns();i++) {
			for(int j=1;j < board.getColumns();j++) {
				mat[1][j] = (ChessPiece)board.piece(i,j);
			}
		}
		return mat;
	}
}
