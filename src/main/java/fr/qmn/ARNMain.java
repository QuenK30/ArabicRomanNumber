package fr.qmn;

import java.util.Scanner;

public class ARNMain {
    public static void main(String[] args) {
        System.out.println("With ArabicRomanNunber, you can convert arabic numbers to roman numbers.");
        System.out.println("Just type a number below and press enter.");
        System.out.println("Type 'exit' to quit the program.");
        System.out.println("Type 'help' to display this message again.");

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")) {
            input = scanner.nextLine();
            if (input.equals("help")) {
                System.out.println("With ArabicRomanNunber, you can convert arabic numbers to roman numbers.");
                System.out.println("Just type a number below and press enter.");
                System.out.println("Type 'exit' to quit the program.");
                System.out.println("Type 'help' to display this message again.");
            } else if (!input.equals("exit")) {
                try {
                    int number = Integer.parseInt(input);
                    System.out.println(ARNumeral.toRoman(number));
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                }
            }
        }
    }
}