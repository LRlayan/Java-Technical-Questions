package org.example.questions;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Questions {

    Scanner sc = new Scanner(System.in);

    public void Questions01 () {
        // Swap x,y values without using 3rd variable.
        int x = 10;
        int y = 20;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    public void Questions02 () {
        // Swap s1,s2 values without using 3rd (String) variable.

        String s1 = "tree";
        String s2 = "flower";

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);
    }

    public void Questions03 () {
        // Print 1 to 100 without using numbers.
        String fixVal = "1";
        String value = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        for (int i = 0; i < value.length(); i++) {
            System.out.println(i + fixVal.length());
        }
    }

    public void Questions04 () {
        // Multiplication Table (1 to 12) of given number

        int val = 12;
        System.out.print("Enter the number : ");
        int inputNumber = sc.nextInt();

        for (int i = 1; i <= val; i++) {
            System.out.println(inputNumber + " x " + i + " = " + inputNumber*i);
        }
    }

    public void Questions05 () {
        // Salary Calculate
        // If the salary is more than 10000, deduct 10% of tax, else not deduct tax.

        int tax = 10;
        double taxAmount = 0;
        double finalSalary = 0;

        System.out.print("Enter your salary : ");
        double salary = sc.nextDouble();

        System.out.println("\nInput salary : " + salary);
        if (salary > 10000) {
            taxAmount = salary*tax/100;
            finalSalary = salary - taxAmount;
            System.out.println("Tax Amount : "+ taxAmount);
            System.out.println("Final Salary : "+ finalSalary);
        } else {
            System.out.println(salary+" amount is not tax dedicated.");
        }
    }

    public void Questions06 () {
        // Reverse a string

        String word = "Hello!";

        // 1st method
        // using String builder
        System.out.println(new StringBuilder(word).reverse());

        // 2nd method
        char[] array = word.toCharArray();
        char[] reverseArray = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--,j++) {
            reverseArray[j] = array[i];
        }
        System.out.println(reverseArray);
    }

    public void Questions07 () {
        // Check if a string is a palindrome
        // Palindrome words
        // madam
        // level
        // racecar

        String words = "level";

        String simpleWord = words.toLowerCase();
        String reverse = "";

        for (int i = simpleWord.length() - 1; i >= 0; i--) {
            reverse += simpleWord.charAt(i);
        }

        if (simpleWord.equals(reverse)) {
            System.out.println(simpleWord+" is Palindrome is true");
        } else {
            System.out.println(simpleWord+" is Palindrome is false");
        }
    }

    public void Questions08 () {
        // Determine if two strings are anagrams

        System.out.print("Enter the first word : ");
        String text1 = sc.nextLine();
        System.out.print("Enter the second word : ");
        String text2 = sc.nextLine();

        String toLower1 = text1.toLowerCase();
        String toLower2 = text2.toLowerCase();

        char[] array1 = toLower1.toCharArray();
        char[] array2 = toLower2.toCharArray();

        if (array1.length == array2.length) {
            Arrays.sort(array1);
            Arrays.sort(array2);

            boolean isAnagram = Arrays.equals(array1,array2);
            if (isAnagram) {
                System.out.println(text1 + " & " + text2 + " are Anagram.");
            } else {
                System.out.println(text1 + " & " + text2 + " are not Anagram.");
            }
        } else {
            System.out.println("Please input same character of words");
        }
    }

    public void Questions09 () {
        // Find the factorial of a number

        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial*i;
        }
        System.out.println("Input Number : " + factorial);
        System.out.println("Factorial Number is : " + factorial);
    }

    public void Questions10 () {
        // Print the Fibonacci sequence

        System.out.print("How many numbers do you want ? - ");
        int count = sc.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public void Questions11 () {
        int numberOfStars = 5;

        LeftAlign(numberOfStars);
        RightAlign(numberOfStars);
        PyramidStarPattern(numberOfStars);
    }

    public void LeftAlign (int limit) {
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void RightAlign (int rows) {
        int spaces = rows;

        for (int i = 0; i < rows; i++) {
            for (int k = 1; k < spaces; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            spaces--;
            System.out.println();
        }
    }

    public void PyramidStarPattern (int rows) {
        int spaces = rows;

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            spaces--;
            System.out.println();
        }
    }
}
