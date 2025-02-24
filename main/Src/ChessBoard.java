package main.Src;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class ChessBoard {
	
	private JButton[][] chessBoardSquares = new JButton[8][8];
	private JPanel chessBoard = new JPanel(new GridLayout(8, 8));
	
	ChessBoard() {
        initializeBoard();
    }
	
	public final void initializeBoard() {
		chessBoard.setBorder(new LineBorder(Color.black));
		
		// create the chess board squares
        Insets buttonMargin = new Insets(0,0,0,0);
		for (int i = 0; i < chessBoardSquares.length; i++) {
			for (int j = 0; j < chessBoardSquares[i].length; j++) {
				JButton square = new JButton();
				square.setMargin(buttonMargin);
				ImageIcon icon = new ImageIcon(new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB));
                square.setIcon(icon);
				
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
					square.setBackground(Color.lightGray);
				} else {
					square.setBackground(Color.darkGray);
				}
				chessBoardSquares[i][j] = square;
				chessBoard.add(chessBoardSquares[i][j]);
			}
		}
	}
	
	public final JComponent getChessBoard() {
		return chessBoard;
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Chess");
		frame.setSize(800, 800);
		
		ChessBoard cb = new ChessBoard();
		frame.add(cb.getChessBoard());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}