import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "", quit = "quit";
        while (true) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");

            // getting and validating num1
            num1 = sc.next();
            if (num1.equals("quit")) {
                System.out.println("quitting now...");
                System.exit(0); // Terminates the program
            }

            if (!Ex1.isNumber(num1)){
                System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
                continue;
            }
            // if num1 is valid run it through number to int and save its value
            int value1 = Ex1.number2Int(num1);

            // getting num2
            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2 = sc.next();
            if (num2.equals("quit")) {
                System.out.println("quiting now...");
                System.exit(0);
            }
            if (!Ex1.isNumber(num2)){
                System.out.println("ERR: num2 is in the wrong format! ("+num2+")");
                continue;
            }
            // if num2 is valid run it through number to int and save its value
            int value2 = Ex1.number2Int(num2);

            // getting the output base
            System.out.println("Enter a base for output (a number between [2,16]): ");
            int outPutBase = sc.nextInt();
            if (outPutBase < 2 || outPutBase > 16){
                System.out.println("ERR: Invalid base!");
                continue;
            }
            // preforming operations
            int addSum = value1 + value2;
            int multSum = value1 * value2;

            String addSumStr = Ex1.int2Number(addSum , outPutBase);
            String multSumStr = Ex1.int2Number(multSum, outPutBase);
            System.out.println(num1 + " + " + num2 + " = " + addSumStr);
            System.out.println(num1 + " * " + num2 + " = " + multSumStr);

            String[] results = {num1 , num2 , addSumStr, multSumStr};
            int maxIdx = Ex1.maxIndex(results);
            System.out.println("Max number over " + java.util.Arrays.toString(results));
        }
    }
}