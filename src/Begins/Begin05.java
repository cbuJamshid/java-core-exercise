package Begins;

import java.util.Scanner;

public class Begin05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("R1 ni kiriting:");
        float R1 = scan.nextFloat();

        final float pi=3.14f;
        System.out.println("L uzunligi:"+2*pi*R1);
        System.out.println("S yuzasi:"+pi*R1*R1);
    }
}

