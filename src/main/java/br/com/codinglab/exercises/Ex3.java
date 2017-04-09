package br.com.codinglab.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ex3 {
    public List<Integer> listSquareNumbers() {
        int[] numbers = IntStream.rangeClosed(1,20).toArray();
        List<Integer> squareNumbers = new ArrayList<>();

        for (int n : numbers) {
            squareNumbers.add(n);
        }

        return squareNumbers;
    }
}
