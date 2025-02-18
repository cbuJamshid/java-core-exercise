package Begins;
import java.util.Scanner;

//Begin13

public class Begin04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("R1 ni kiriting:");
        float R1 = scan.nextFloat();
        System.out.println("R2 ni kiriting:");
        float R2 = scan.nextFloat();
        final float pi=3.14f;
        System.out.println("S1 ning yuzasi:"+pi*R1*R1);
        System.out.println("S2 ning yuzasi:"+pi*R2*R2);
        if (R1 > R2){
            System.out.println("S3 ning yuzasi:"+(pi*R1*R1-pi*R2*R2));
        } else{
            System.out.println("R1 kichkina R2");
        }

    }
}

