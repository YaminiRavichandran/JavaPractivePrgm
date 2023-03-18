package packMarch;

import java.util.Scanner;

public class MathPrgm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x values");
        int x = sc.nextInt();
        System.out.println("Enter y values");
        int y = sc.nextInt();
        System.out.println("Enter z values");
        int z = sc.nextInt();

        double Xvalue = Math.pow(x,2);
        System.out.println("x square : " + Xvalue );
        double Yvalue = Math.pow(y,2);
        System.out.println("y square : " + Yvalue );
        double Zvalue = Math.abs(z);
        System.out.println("z modulus : " + Zvalue );

        double XYZvalues = (Xvalue + Yvalue - Zvalue);
        System.out.println("Values inside brackets : " + XYZvalues );

        double CubeOfAll = Math.cbrt(XYZvalues);
        System.out.println("Result : " + CubeOfAll );


    }
}
