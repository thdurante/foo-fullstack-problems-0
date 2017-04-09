package br.com.codinglab.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex6 {

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
}
