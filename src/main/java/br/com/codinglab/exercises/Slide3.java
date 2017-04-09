package br.com.codinglab.exercises;

public class Slide3 {

    public Double energyCost(Double kw, Double kwCost) {
        return (kw * kwCost) * 0.9;
    }

    public Double finalGrade(Double n1, Double n2, Double n3, Double nt) {
        return (n1 * 0.2 + n2 * 0.3 + n3 * 0.5) * 0.85 + nt * 0.15;
    }

    public boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public int sumOdds() {
        int sum = 0;
        for(int i=0; i< 100; i++) {
            if(i % 2 != 0) { sum += i + 1; }
        }

        return sum;
    }
}
