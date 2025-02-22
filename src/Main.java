import com.OOPs.Abstract.*;
import com.OOPs.Interfaces.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private String access="Acessed";
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field field=Main.class.getDeclaredField("access");
        field.setAccessible(true);
        System.out.println( field.get(new Main())+" and "+field.get(new Main()).getClass());
        //accessing the private fields


    }
}
