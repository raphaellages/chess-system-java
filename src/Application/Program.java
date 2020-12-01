package Application;

import java.util.Scanner;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch mat = new ChessMatch();
		UI.printBoard(mat.getPieces());
		//problemas com o githut na hora do commit
		/*
		Board board = new Board(8, 8);	
		int rows = 8, columns = 8;
		String[][] mat =  new String[rows][columns];
		for(int i=0;i<rows;i++) {
			System.out.print((8-i)+" ");
			for (int j=0;j<columns;j++) {
				System.out.print("-");
				System.out.print(" ");
				
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
		//System.out.println(mat);
		*/
	}
	
}
