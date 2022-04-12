package Java.CarTuning;

import java.util.Scanner;

public class Tuning {

    public static void main(String[] args) {

        //////////////////////////
        // Declaring Variables //
        /////////////////////////

        double max;
        double min;

        double front;
        double rear;

        double percentageFront;
        double pctFrontDecimal;
        double pctRearDecimal;

        double bumpStiffFront;
        double bumpStiffRear;

        int x;

        //////////////////
        // New Scanner //
        /////////////////

        Scanner keyboard = new Scanner(System.in);

        //////////////////////
        // Data Collection //
        /////////////////////

        System.out.println("What is the maximum value?");
        max = keyboard.nextDouble();

        System.out.println("What is the minimum value?");
        min = keyboard.nextDouble();

        System.out.println("What is the weight percentage in the front of the vehicle?");
        percentageFront = keyboard.nextDouble();

        System.out.println("Does bump stiffness need to be calculated?(1 = yes / 0 = No)");
        x = keyboard.nextInt();

        keyboard.close();

        ///////////////////
        // Calculations //
        //////////////////

        pctFrontDecimal = (percentageFront / 100);
        front = ((max - min) * (pctFrontDecimal) + min);

        pctRearDecimal = 1 - pctFrontDecimal;
        rear = ((max - min) * (pctRearDecimal) + min);

        bumpStiffFront = (front * 0.6);
        bumpStiffRear = (rear * 0.6);

        if (x == 1) {

            System.out.printf("Front Setting: %,.2f", front);
            System.out.printf("   Rear Setting: %,.2f", rear);

            System.out.println("\n");

            System.out.printf("Front Bump Stiffness: %,.1f", bumpStiffFront);
            System.out.printf("   Rear Bump Stiffness: %,.1f", bumpStiffRear);

        } else {

            System.out.printf("Front Setting: %,.2f", front);
            System.out.printf("   Rear Setting: %,.2f", rear);

        }
    }
}