package com.economica.devtools;

public final class DevTools {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("======================================");
        System.out.println("       ECONOMICA BUILD SYSTEM");
        System.out.println("======================================");
        System.out.println();

        System.out.println("Version 0.1");

        if (args.length == 0) {
            System.out.println();
            System.out.println("Available commands:");
            System.out.println("  analyze");
            System.out.println("  extract");
            System.out.println("  new");
            System.out.println("  doctor");
            System.out.println();
            return;
        }

        System.out.println("Executing command: " + args[0]);
    }

}
