import com.OOPs.Abstract.Recipe1;
import com.OOPs.Interfaces.Chess;
import com.OOPs.Interfaces.Game;
import com.OOPs.Interfaces.MarioGame;

public class Main {
    public static void main(String[] args) {
       Game game= new MarioGame();
       Game chessGame= new Chess();
       game.down();
       game.up();
       game.left();
       game.right();
        System.out.println("\t");
        chessGame.down();
        chessGame.up();
        chessGame.left();
        chessGame.right();
    }
}
