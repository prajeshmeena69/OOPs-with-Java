package Unit_1;

public class Calculator {
    double ar;

    public void Area(double l, double b) {
        ar = l * b;
        System.out.println("Area of Rectangle = " + ar);
    }

    public void Area(double r) {
        ar = Math.PI * r * r;
        System.out.println("Area of Circle = " + ar);
    }

    public void Area(double l, double b, double h) {
        ar = 2 * (l + b) + (b * h) + (l * h);
        System.out.println("Area of Rectangle = " + ar);
    }
}
