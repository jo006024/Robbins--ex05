package Exercise05;

import java.util.Scanner;

/*
Gather Scanner input (System.in);
println(enter a number stored as x);
store x in obj.nextint();
repeat println but for value, y. Store y as int in same fashion as x;
create 4 math functions of entered values with output +(function) in println;
 */

public class Solution05 {



    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 1 program 2 solution
         *  Copyright 2021 Jonathan Robbins
         */

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number(x): ");
          int x = myObj.nextInt();
        System.out.println("Enter a second number(y): ");
            int y = myObj.nextInt();

            System.out.println("x+y = " +(x+y));
            System.out.println("x-y = " +(x-y));
            System.out.println("x*y = "+(x*y));
            System.out.println("x/y = "+(x/y));

    }
}
