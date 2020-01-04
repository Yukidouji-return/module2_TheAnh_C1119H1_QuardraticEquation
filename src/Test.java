import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta == 0) {
            System.out.println("Your Root is: " + quadraticEquation.getRoot1());
        } else if (delta > 0) {
            System.out.println("You have too root: \n Root 1: " + quadraticEquation.getRoot1() + "\n Root 2: " + quadraticEquation.geRoot2());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}

