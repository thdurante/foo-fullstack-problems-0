package br.com.codinglab.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Slide1 {

    public String verifyNumbers(Double[] numbers) {
        Double biggest = Double.MIN_VALUE;
        Double lowest = Double.MAX_VALUE;

        for (Double n: numbers) {
            biggest = n > biggest ? n : biggest;
            lowest = n < lowest ? n : lowest;
        }

        return "Biggest: " + biggest + "\nLowest: " + lowest;
    }

    public int[] listNumbers() {
        return IntStream.rangeClosed(1,20).toArray();
    }

    public List<Integer> listSquareNumbers() {
        int[] numbers = IntStream.rangeClosed(1,20).toArray();
        List<Integer> squareNumbers = new ArrayList<>();

        for (int n : numbers) {
            squareNumbers.add(n);
        }

        return squareNumbers;
    }

    public List<Integer> listOddNumbers() {
        List<Integer> oddNumbers = new ArrayList<>();

        for(int i=1; i<=50; i++) {
            if(i % 2 != 0) { oddNumbers.add(i); }
        }

        return oddNumbers;
    }

    public int sumNumbers() {
        int sum = 0;
        for(int i=0; i<50; i++) {
            sum += i+1;
        }

        return sum;
    }

    private int factorial(int number) {
        if (number <= 1) {
            return number;
        } else {
            return number * factorial(number -1);
        }
    }

    public List<Integer> listFactorial() {
        List<Integer> factorialList = new ArrayList<>();
        for (int i=0; i<10; i++) {
            factorialList.add(factorial(i+1));
        }

        return factorialList;
    }

    public Double[] bhaskara(int a, int b, int c) {
        Double x1 = ((b * -1) + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        Double x2 = ((b * -1) - Math.sqrt(b * b - 4 * a * c)) / 2 * a;

        return new Double[]{x1, x2};
    }
}
