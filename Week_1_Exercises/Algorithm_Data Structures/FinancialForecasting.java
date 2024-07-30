package com.mycompany.week1;

/**
 *
 * @author shuva
 */


public class FinancialForecasting {

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }

        double futureValue = presentValue * (1 + growthRate);
        return calculateFutureValue(futureValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05;
        int years = 10;

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("The future value after %d years is: %.2f\n", years, futureValue);
    }
}
