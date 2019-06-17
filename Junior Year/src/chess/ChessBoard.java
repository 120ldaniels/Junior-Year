package chess;

import java.awt.Color;

import general.Board;
import general.Side;

public class ChessBoard extends Board
{

	public ChessBoard(int size, Color c1, Color c2) {
		super(8, Color.BLACK, Color.WHITE);
		
		
		//creates all pieces in the board
		//Creates all white pieces
			for (int x = 0; x < 8; x++)
			{
				int y = 0;
				if (x==0||x==7)
					board[x][y] = new Rook(null, c2);
				if (x==1||x==6)	
					board[x][y] = new Knight(null, c2);
				if (x==2||x==5)	
					board[x][y] = new Bishop(null, c2);
				if (x==3)	
					board[x][y] = new Queen(null, c2);
				if (x==4)
					board[x][y] = new King(null, c2);
			}
			
			//Creates all black pieces
			for (int x = 0; x < 8; x++)
			{
				int y = 7;
				if (x==0||x==7)
					board[x][y] = new Rook(null, c2);
				if (x==1||x==6)	
					board[x][y] = new Knight(null, c2);
				if (x==2||x==5)	
					board[x][y] = new Bishop(null, c2);
				if (x==3)	
					board[x][y] = new Queen(null, c2);
				if (x==4)
					board[x][y] = new King(null, c2);
			}
			
		}
		// TODO Auto-generated constructor stub
	{
					//if (x <= 2)
					//	board[x][y] = new (Side.TOP, Color.BLACK);
					//else if (x >= 5)
					//	board[x][y] = new (Side.BOTTOM, Color.RED);
				}
	}


