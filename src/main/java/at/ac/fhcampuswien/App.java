package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        int counter = 2;
        double input;
        double input2;
        double highestNumber = 0;

        System.out.print("Number 1: ");


        while ((input = scanner.nextDouble()) > 0) {

            if (counter > 1) {
                System.out.print("Number " + counter + ": ");
            }
            input2 = input;
            if (input2 > highestNumber) {
                highestNumber = input2;

            }
            counter++;
        }
        if (input <= 0 && counter == 2) {
            System.out.print("No number entered." + System.lineSeparator());
        } else {
            System.out.println("The largest number is " + String.format("%.2f", highestNumber));
        }


    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        int rowsNumber;

        rowsNumber = scanner.nextInt();
        System.out.print("n: ");
        if (rowsNumber <= 0 ) {
            System.out.print("Invalid number!" + System.lineSeparator());
        } else {
            int counter = 1;

            for (int i = 0; i < rowsNumber; i++) {
                System.out.print(counter + " ");
                counter++;
                for (int k = 0; k < i; k++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.print(System.lineSeparator());
            }
        }

    }

    //todo Task 3
    public void printPyramid(){
        final int NUM_OF_ROWS = 6;

        for (int i = 0; i < NUM_OF_ROWS; i++) {
            for (int k = NUM_OF_ROWS; k > i + 1; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2 + 1; j++) {
                System.out.print("*");
            }
            System.out.print(System.lineSeparator());

        }

    }

    //todo Task 4
    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);

        int height = 0;
        char c;
    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int currentInput, intersum = 0, counter = 0, fivesCounter = 0, k = 1;

        for (int i = k - 1; i < k; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            currentInput = scanner.nextInt();

        if (currentInput >= 1 && currentInput <= 5) {
            if (currentInput == 5) {
                fivesCounter++;
            }

            intersum += currentInput;
            counter++;
            k++;
        }else if (currentInput != 0) {
            System.out.print("Invalid mark!" + System.lineSeparator());
            i--;
        } else if (currentInput == 0) {
            if (counter == 0) {
                counter++;
            }
            double average = (Double.valueOf(intersum)) / (Double.valueOf(counter));
            System.out.print("Average: " + String.format("%.2f", average) + System.lineSeparator());
            System.out.print("Negative marks: " + String.format("%d", fivesCounter) + System.lineSeparator());
        }

      }

    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);
        int input, a, b, c;

        System.out.print("n: ");
        input = scanner.nextInt();

        while (input != 4 && input != 1) {
            if (input > 99) {
                a = input/100;
                b = (input - a*100)/10;
                c = input - a*100 - b*10;
                input = a*a + b*b + c*c;
            } else if (input < 100) {
                b = input/10;
                c = input - b*10;
                input = b*b + c*c;
            }

        }

        if (input == 1) {
            System.out.print("Happy number!" + System.lineSeparator());
        } else if (input == 4) {
            System.out.print("Sad number!" + System.lineSeparator());
        }

    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        //exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        //exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        //exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        //exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        //exercise2.happyNumbers();
    }
}