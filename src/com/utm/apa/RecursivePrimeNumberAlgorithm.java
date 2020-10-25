package com.utm.apa;

public class RecursivePrimeNumberAlgorithm implements PrimeNumberAlgorithm {


    @Override
    public void showPrimNumbers(int n) {
        for (int i = 0; i < n; i++) {
            if(isPrime(i, 2)){
                System.out.println(i + " ");
            }
        }
    }

    boolean isPrime(int n, int i){
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }
}
