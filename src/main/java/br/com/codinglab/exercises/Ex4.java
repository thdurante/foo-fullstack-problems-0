package br.com.codinglab.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public List<Integer> listOddNumbers() {
        List<Integer> oddNumbers = new ArrayList<>();

        for(int i=1; i<=50; i++) {
            if(i % 2 != 0) { oddNumbers.add(i); }
        }

        return oddNumbers;
    }
}
