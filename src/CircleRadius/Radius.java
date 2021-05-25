package CircleRadius;

import java.util.Scanner;

public class Radius {
    public static void main(String[] Args) {
        int radius;
        double Diameter;
        double Circumference;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle \n");
        radius = sc.nextInt();

        Diameter = 2 * (radius);
        Circumference = 2 * (3.14159) * (radius);
        double Area = (3.14159 * radius) * 2;

        System.out.println("diametre is " + Diameter);
        System.out.println("circumferance is " + Circumference);
        System.out.println("area is " + Area);

    }
}
