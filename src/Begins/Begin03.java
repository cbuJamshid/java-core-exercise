package Begins;
import java.util.Scanner;

// Begin9
public class Begin03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("a ni kiriting:");
        float a = scan.nextFloat();
        System.out.println("b ni kiriting:");
        float b = scan.nextFloat();
        System.out.println("S:"+ Math.sqrt(a*b));
    }
}

