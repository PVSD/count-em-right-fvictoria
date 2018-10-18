package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String input, sp[];

        do {
            System.out.println("Type in a sentence and press ENTER");
            Scanner kbReader = new Scanner(System.in);
            input = kbReader.nextLine();
            input += "z";
            if (input.equals("EX".toUpperCase()))
                break;

            sp = input.split("S\\s*A");

            System.out.println("There are " + (sp.length - 1) + " occurrences");

        }
    }
}



