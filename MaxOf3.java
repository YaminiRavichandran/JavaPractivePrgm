package packMarch;

import java.util.Scanner;

public class MaxOf3 {
    public static void main(String[] args) {

byte a,b,c;
Scanner s =new Scanner(System.in);

        System.out.println("Enter A value");
        a = s.nextByte();

        System.out.println("Enter B value");
        b = s.nextByte();

        System.out.println("Enter C value");
        c = s.nextByte();

        if (a>b && a>c)
            System.out.println("A is bigger");


        else if (b>c)
            System.out.println("B is bigger");


        else
            System.out.println("C is bigger");

    }





}
