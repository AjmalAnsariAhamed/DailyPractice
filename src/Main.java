import com.OOPs.*;
import com.practice.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Book onePiece= new Book(1,"one piece","Eiichiro Oda");
       onePiece.addReview(new Reviews(1,"the best fiction of my time ",5));
       System.out.println(onePiece);

       Book naruto = new Book(2,"naruto","Mashashi Kiishimoto");
       naruto.addReview(new Reviews(1,"i deeply love this book the emotion the author has pulled of is realy good",4));

        System.out.println(naruto);

    }
}
