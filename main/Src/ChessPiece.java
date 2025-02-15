package main.Src;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class ChessPiece {
    Icon pieceIcon;

    public ChessPiece(String IconFileName){
        pieceIcon = new ImageIcon(IconFileName);
        
    }
}
