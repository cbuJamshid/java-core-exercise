package Begins;
import java.util.Scanner;

//Begin7
public class Begin02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("a ni kiriting:");
        final float PI = 3.14f;
        float a = scan.nextFloat();
        System.out.println("S:"+ PI * a * a);
        System.out.println("L:" + a * 2*PI);
    }
}
