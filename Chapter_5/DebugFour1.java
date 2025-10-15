import java.util.Scanner;

// Main class
public class DebugFour1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;

        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();

        Circle c = new Circle(radius);

        System.out.println("The radius is " + c.getRad());
        System.out.println("The diameter is " + c.getDiam());
        System.out.println("The area is " + c.getArea());
    }
}

// Circle class
class Circle {
    private int radius;

    public Circle(int r) {
        radius = r;
    }

    public int getRad() {
        return radius;
    }

    public int getDiam() {
        return radius * 2;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
