import com.OOPs.MotorBike;
import com.practice.Table;

public class Main {
    public static void main(String[] args) {
MotorBike duke = new MotorBike();
duke.start();
duke.setSpeed(50);
duke.setGears(5);
System.out.println(duke.getGears()+" "+duke.getSpeed());
    }
}