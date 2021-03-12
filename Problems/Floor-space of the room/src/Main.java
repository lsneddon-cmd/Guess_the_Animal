import java.util.Scanner;

class Main {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // put your code here
        String shape = scanner.nextLine();

        switch (shape) {
            case "circle":
                System.out.println(calculateCircleArea());
                break;
            case "rectangle":
                System.out.println(calculateRectArea());
                break;
            case "triangle":
                System.out.println(calculateTriangleArea());
                break;
            default:
                System.out.println("unexpected input");
        }
    }

    private static double calculateCircleArea() {
        return circleArea(scanner.nextInt());
    }

    private static double calculateRectArea() {
        return rectangleArea(scanner.nextInt(), scanner.nextInt());
    }

    private static double calculateTriangleArea() {
        return triangleArea(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    private static double circleArea(int radius) {
        return Math.pow(radius, 2) * 3.14;
    }

    private static int rectangleArea(int width, int height) {
        return width * height;
    }

    private static double triangleArea(int opp, int adj, int hyp) {
        double semiP = semiPerimeter(opp, adj, hyp);
        return Math.sqrt(semiP * (semiP - opp) * (semiP - adj) * (semiP - hyp));
    }

    private static double semiPerimeter(int opp, int adj, int hyp) {
        return 0.5 * (opp + adj + hyp);
    }
}