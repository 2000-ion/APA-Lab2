package com.utm.apa;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        int n;
        int algorithmType;
        PrimeNumberAlgorithm algorithm;
        System.out.println("Introdu:\n1 - pentru algroitm iterativ\n2 - pentru algoritm recursiv\n3 - pentru ciurul lui Eratosthenes.\n");
        Scanner scanner = new Scanner(System.in);
        algorithmType = Integer.parseInt(scanner.nextLine());

        System.out.println("Introdu n: ");

        String input = scanner.nextLine();
        n = Integer.parseInt(input);

        long startTime = System.nanoTime();
        switch (algorithmType){
            case 1:
                algorithm = new IterativePrimeNumberAlgorithm();
                algorithm.showPrimNumbers(n);
                break;
            case 2:
                algorithm = new RecursivePrimeNumberAlgorithm();
                algorithm.showPrimNumbers(n);
                break;
            case 3:
                algorithm = new SieveOfEratosthenesPrimeNumberAlgorithm();
                algorithm.showPrimNumbers(n);
                break;
            default:
                break;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000;
        System.out.println(String.format("Timpul de executie %d milisecunde.", duration));

    }

}
