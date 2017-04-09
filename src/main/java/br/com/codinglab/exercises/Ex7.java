package br.com.codinglab.exercises;

public class Ex7 {
    public Double[] bhaskara(int a, int b, int c) {
        Double x1 = ((b * -1) + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        Double x2 = ((b * -1) - Math.sqrt(b * b - 4 * a * c)) / 2 * a;

        return new Double[]{x1, x2};
    }
}
