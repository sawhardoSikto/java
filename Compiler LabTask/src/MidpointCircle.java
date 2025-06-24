import java.util.Scanner;

public class MidpointCircle {

    public static void midpointCircle(double xCenter, double yCenter, double radius) {
        double x = 0;
        double y = radius;
        double d = 1 - radius;

        while (x < y) {
            if (d <0) {
                System.out.println(x + " " + y);
                d += 2 * x + 3;
                x++;
            } else {
                System.out.println(x + " " + y);
                d += 2 * (x - y) + 5;
                x++;
                y--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the initial point (x y): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Please enter the radius: ");
        double radius = scanner.nextDouble();

        midpointCircle(x1, y1, radius);
    }
}
