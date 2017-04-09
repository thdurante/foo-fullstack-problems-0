package br.com.codinglab.exercises;

import java.util.stream.IntStream;

public class Ex2 {
    public int[] listNumbers() {
        return IntStream.rangeClosed(1,20).toArray();
    }
}
