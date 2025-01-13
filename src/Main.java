import com.OOPs.Abstract.*;
import com.OOPs.Interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Animal> animal=new ArrayList<>();
       animal.add(new Dog());
       animal.add(new Cat());
      for(Animal a:animal){

          a.bark();
      }

    }
}
