import com.OOPs.Abstract.AbstractRecipe;
import com.OOPs.Abstract.Recipe1;
import com.OOPs.Interfaces.*;

public class Main {
    public static void main(String[] args) {
        Flyable [] fly=new Flyable[]{new Bird(), new Aeroplane()};
        fly[0].fly();
        fly[1].fly();
    }
}
