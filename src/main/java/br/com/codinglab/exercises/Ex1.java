package br.com.codinglab.exercises;

public class Ex1 {
    public String verifyNumbers(Double[] numbers) {
        Double biggest = Double.MIN_VALUE;
        Double lowest = Double.MAX_VALUE;

        for (Double n: numbers) {
            biggest = n > biggest ? n : biggest;
            lowest = n < lowest ? n : lowest;
        }

        return "Biggest: " + biggest + "\nLowest: " + lowest;
    }
}
