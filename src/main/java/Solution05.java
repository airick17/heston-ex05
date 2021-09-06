/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Heston
 */

/*
    create a program to do simple math
    prompt the user for a "first number"
    get user input from system.in (keyboard)
    prompt user for "second number"
    get user input from system.in (keyboard)
    convert strings from user to ints num1 num2
    create new ints for the values of the equations
        -add
        -sub
        -multi
        -div
    display simple math equations USING single print statement
        num1+num2=add
        num1-num2=sub
        num1*num2=multi
        num1/num2=div

    import scanner
    create new scanner in class
    print statement to prompt user for first number
    create a string first and populate it with the users input using nextLine()
    print statement to prompt user for second number
    create a string second and populate it with the users input using nextLine()
    convert these to strings to ints
        -create int num1 and pass it the value of the string using Integer.parseInt()
        -create int num2 and pass it the value of the string using Integer.parseInt()
    create 4 new ints and populate them with the corresponding final values of the equations
        -add
        -sub
        -multi
        -div
    using single print statement display all 4 equations and values
        -+"\n" for new line
*/

import java.util.Scanner; //imports scanner

public class Solution05 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the first number? ");
        String first = input.nextLine();
        System.out.print("What is the second number? ");
        String second = input.nextLine();

        int num1 = Integer.parseInt(first);
        int num2 = Integer.parseInt(second);

        int add = num1+num2;
        int sub = num1-num2;
        int multi = num1*num2;
        int div = num1/num2;

        System.out.println(num1+" + "+num2+" = "+add+"\n" +num1+" - "+num2+" = "+sub+"\n" +num1+" * "+num2+" = "+multi+"\n" +num1+" / "+num2+" = "+div);
    }
}
