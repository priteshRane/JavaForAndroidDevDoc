package controlstatement;

public class IfElse {
    public static void main(String[] args) {
        // if statement
        int age = 20;
        if (age > 18) {
            System.out.println("Age is greater than 18");
        }

        // if - else statement
        int number = 13;
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // Ternary operator
        int numberOne = 13;
        String output = (numberOne % 2 == 0) ? "even number" : "odd number";
        System.out.println(output);

        // If-else-if ladder Statement
        int marks = 65;

        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid!");
        }

        // Nested if
        age = 20;
        int weight = 80;
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            }
        }
    }
}

/*
Types of if statement in java
1. if Statement
2. if-else statement
3. if-else-if ladder
4. nested if statement
 */

