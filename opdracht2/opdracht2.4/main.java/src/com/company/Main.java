package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Typ het startbedrag");
        int startbedrag = scanner.nextInt();
        System.out.println("Typ het rentepercentage:");
        int renteprecentage = scanner.nextInt();
        double m = renteprecentage/10.0;
        double berekening = startbedrag + m;
        System.out.println("De rente is " + m + " Het totaal bedrag is " + berekening );


    }
}