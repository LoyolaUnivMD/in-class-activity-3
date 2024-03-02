//Programmers: [Gabriel.S]
//Course: CS212
// Due Date: [
//Lab Assignment: Lab 3: Ski Jump
//Problem Statement: 
//Winter is coming! One winter sport is the ski jump, where the score is determined by the distance traveled after skiing down a ramp and into the air. Given the type of ski jump (normal vs. large) and the jumper’s speed at the end of the ramp, predict how far they will jump and output their number of points earned based on the distance. Points depend on whether the distance is above par (good) or below or equal to par (bad). Tell the jumper their performance level based on their earned points.
//Data In: 
// - Type of ski jump (normal or large) [string]
//  - Jumper's speed at the end of the ramp [float]
// Data Out:
// - Distance traveled [float]
// - Points earned [int]
//Credits: 

import java.util.Scanner;

public class SkiJump {
    // Method to calculate the distance traveled by the jumper
    public static double calculateDistance(int height, double speed) {
        // Calculate the time spent in the air
        double timeInAir = Math.sqrt((2 * height) / 9.8);
        // Calculate and return the distance traveled
        return speed * timeInAir;
    }

    // Method to determine the points earned by the jumper
    public static int determinePoints(double distance, int par, double pointsPerMeter) {
        // Calculate and return the points earned
        return (int) (60 + (distance - par) * pointsPerMeter);
    }

    // Method to determine the performance based on the points earned
    public static String determinePerformance(int points) {
        // Determine the performance level based on the points earned
        if (points >= 61) {
            return "Great job for doing better than par!";
        } else if (points < 10) {
            return "What happened??";
        } else {
            return "Sorry you didn’t go very far";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the type of ski jump and the jumper's speed
        System.out.print("Enter the type of ski jump (normal or large): ");
        String hillType = scanner.nextLine().toLowerCase();

        System.out.print("Enter the jumper's speed at the end of the ramp (m/s): ");
        double speed = scanner.nextDouble();

        int height, par;
        double pointsPerMeter;

        // Determine the parameters based on the type of ski jump
        switch (hillType) {
            case "normal":
                height = 46;
                pointsPerMeter = 2;
                par = 90;
                break;
            case "large":
                height = 70;
                pointsPerMeter = 1.8;
                par = 120;
                break;
            default:
                System.out.println("Invalid input. Please enter 'normal' or 'large' for the ski jump type.");
                return;
        }

        // Calculate the distance traveled
        double distance = calculateDistance(height, speed);
        // Determine the points earned
        int points = determinePoints(distance, par, pointsPerMeter);
        // Determine the performance based on the points earned
        String performance = determinePerformance(points);

        // Output the results
        System.out.printf("Distance traveled: %.2f meters%n", distance);
        System.out.println("Points earned: " + points);
        System.out.println(performance);

        // Close the scanner
        scanner.close();
    }
}
