package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] names = {"John ", "Kelvin ", "Tom "};

        String[] newNames = Arrays.copyOf(names, 4);
        newNames[3] = "Fate";

        /*
        String[] names = {};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        i = i + 1; ->
        i += 1; ->
        i++;
        ++i;
         */
        boolean isRainy = false;
        int temp = -3;

       /* while (!isRainy) {
            if (temp > 15) {
                System.out.println("can walk");
            } else if (temp < 0) {
                System.out.println("stay home");
                isRainy = true;
            }
        }*/

        for (int i = 0; i < newNames.length; i++) {

            switch (i) {
                case 0:
                    System.out.println("Good morning! " + newNames[0]);
                    break;
                case 1:
                    System.out.println("Good afternoon! " + newNames[1]);
                    break;
                case 2:
                    System.out.println("Good evening! " + newNames[2]);
                    break;
                case 3:
                    System.out.println("Greeting day " + newNames[3]);
                    break;
                default:
                    System.out.println("Hello!");
            }
        }

    }
}
