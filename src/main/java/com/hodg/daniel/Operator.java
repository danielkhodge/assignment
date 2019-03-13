package com.hodg.daniel;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        System.out.println("Hello World");

            String l1 = "* * * * * * ==================================\n * * * * *  ==================================";
            String l2 = "==============================================";

            for (int i = 0; i < 4; i++) {
                System.out.println(l1);
            }

            System.out.println("* * * * * * ==================================");

            for (int i = 0; i < 6; i++) {
                System.out.println(l2);
            }

            Scanner in = new Scanner(System.in);

            System.out.println("The first num is ");
            int x = in.nextInt();

            System.out.println("The second num is ");
            int y = in.nextInt();

            System.out.println(x + " + " + y + " = " + (x + y));

            System.out.println(x + " - " + y + " = " + (x - y));

            System.out.println(x + " * " + y + " = " + (x * y));

            System.out.println(x + " / " + y + " = " + (x / y));

            System.out.println(x + " % " + y + " = " + (x % y));
        }
    }
