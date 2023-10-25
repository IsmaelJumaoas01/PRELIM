import java.util.InputMismatchException;
import java.util.Scanner;

public class Routes_PT {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        double d1 = 86.6;
        double d2 = 92.2;
        double d3 = 94;

        System.out.println("Cebu City to Moalboal Route:");
        defRoute();
        System.out.println("");
        int c1 = getDecision(choice, "Is Barili obstructed? Enter 1 for yes, 2 for no: ");
        if (c1 == 2) {
            double time = speedDistance(choice, d1);
            recRoute3();
            displayTime(time);
        } else if (c1 == 1) {
            int c2 = getDecision(choice, "Is Dumanjug obstructed? Enter 1 for yes, 2 for no: ");
            if (c2 == 1) {
                double time = speedDistance(choice, d2);
                recRoute1();
                displayTime(time);
            } else if (c2 == 2) {
                double time = speedDistance(choice, d3);
                recRoute();
                displayTime(time);
            } else {
                System.out.println("Invalid input for Dumanjug.");
            }
        } else {
            System.out.println("Invalid input for Barili.");
        }
    }

    static int getDecision(Scanner choice, String prompt) {
        int decision;
        do {
            try {
                System.out.print(prompt);
                decision = choice.nextInt();
                if (decision != 1 && decision != 2) {
                    System.out.println("Invalid input. Please enter 1 for yes or 2 for no.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 for yes or 2 for no.");
                choice.nextLine();
                decision = -1;
            }
        } while (decision != 1 && decision != 2);
        return decision;
    }

    static void defRoute() {
        System.out.println("");
        System.out.println("Default Routes: ");
        System.out.println("Cebu City (Start)");
        System.out.println("Minglanilla (Route 1)");
        System.out.println("San Fernando (Route 2)");
        System.out.println("Carcar (Route 3)");
        System.out.println("Barili (Route 4.1)");
        System.out.println("Dumanjug (Route 4.1.1)");
        System.out.println("Alcantara (Route 4.1.2)");
        System.out.println("Moalboal (End)");
    }

    static void recRoute() {
        System.out.println("");
        System.out.println("Recommended Routes: ");
        System.out.println("Cebu City (Start)");
        System.out.println("Minglanilla (Route 1)");
        System.out.println("San Fernando (Route 2)");
        System.out.println("Carcar (Route 3)");
        System.out.println("Sibonga (Route 4.2)");
        System.out.println("Dumanjug (Route 4.2.1)");
        System.out.println("Alcantara (Route 4.2.2)");
        System.out.println("Moalboal (End)");
    }

    static void recRoute1() {
        System.out.println("");
        System.out.println("Recommended Routes: ");
        System.out.println("Cebu City (Start)");
        System.out.println("Minglanilla (Route 1)");
        System.out.println("San Fernando (Route 2)");
        System.out.println("Carcar (Route 3)");
        System.out.println("Sibonga (Route 4.2)");
        System.out.println("Argao (Route 5)");
        System.out.println("Ronda (Route 5.1)");
        System.out.println("Alcantara (Route 5.2)");
        System.out.println("Moalboal (End)");
    }

    static void recRoute3() {
        System.out.println("");
        System.out.println("Recommended Routes: ");
        System.out.println("Cebu City (Start)");
        System.out.println("Minglanilla (Route 1)");
        System.out.println("San Fernando (Route 2)");
        System.out.println("Carcar (Route 3)");
        System.out.println("Barili (Route 4.1)");
        System.out.println("Dumanjug (Route 4.1.1)");
        System.out.println("Alcantara (Route 4.1.2)");
        System.out.println("Moalboal (End)");
    }

    public static void displayTime(double time) {
        int hours = (int) time;
        int minutes = (int) ((time - hours) * 60);
        System.out.println("ETA: " + hours + " hour(s) and " + minutes + " minute(s)");
    }

    public static double speedDistance(Scanner choice, double distance) {
        double speed;
        do {
            try {
                System.out.print("What is your speed (in km/h): ");
                speed = choice.nextDouble();
                if (speed <= 0) {
                    System.out.println("Speed must be a positive number. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for speed. Please enter a numeric value.");
                choice.nextLine();
                speed = -1;
            }
        } while (speed <= 0);

        double time = distance / speed;
        return time;
    }
}
