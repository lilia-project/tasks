package com.home.example;

import com.home.example.list.ArrayList;
import com.home.example.list.List;

import java.util.Scanner;

public class Converter {

    private final List shortcuts = new ArrayList("sout", "souf", "serr", "psfs");
    private final List results = new ArrayList("System.out.println()", "System.out.printf(\"\");",
            "System.err.println();", "public static final String");
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        do {
            doWork();
        } while (true);
    }

    /**
     * Input operation shortcut from predefined list and get the full command as a result
     * Shortcuts list: sout, souf, serr, psfs
     * Result strings for shortcuts respectively: System.out.println() | System.out.printf(""); |
     * System.err.println(); | public static final String
     */
    private void doWork() {
        String input = showMenuAndGetInput();

        if (isValid(input)) {

            int associatedNumber = getAssociatedNumber(input);
            String result = results.get(associatedNumber);

            System.out.println("Generated result: " + result);

        } else {
            System.out.println("You input incorrect option!");
        }
    }

    private String showMenuAndGetInput() {
        System.out.println("Available shortcut list: [sout, souf, serr, psfs]");
        System.out.print("Input shortcut: ");

        return scanner.nextLine();
    }

    private boolean isValid(String input) {
        return shortcuts.contains(input);
    }

    private int getAssociatedNumber(String input) {
        return shortcuts.getPosition(input);
    }

}
