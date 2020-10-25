package com.utm.apa;

public class IterativePrimeNumberAlgorithm implements PrimeNumberAlgorithm {
    @Override
    public void showPrimNumbers(int n) {

        for (int i = 2; i < n; i++)
            for (int j = 2; j < i; j++)
            {

                if (i % j == 0){
                    break;
                }
                else if (i == j + 1)
                {
                    System.out.println(i + " ");
                }

            }

    }
}
