import java.util.*;
public class Q1Main {
    public static void main(String[] args) {
        Wk09Q1 q1=new Wk09Q1();
        String a="";
        String b="";
        String c="";
        String d="";
        for (int i=0;i<15;i++){
            a+=q1.getRandomLowerCaseLetter();
            b+=q1.getRandomUpperCaseletter();
            c+=q1.getRandomDigitCharacter();
            d+=q1.getRandomCharacter();
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
