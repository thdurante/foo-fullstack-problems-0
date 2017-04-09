package br.com.codinglab.exercises;

import java.util.ArrayList;
import java.util.List;

public class Slide2 {

    public int numberOfChars(String string) {
        return string.length();
    }

    public String upper(String string) {
        return string.toUpperCase();
    }

    public Double roundCeil(Double number) {
        return Math.ceil(number);
    }

    public Double roundFloor(Double number) {
        return Math.floor(number);
    }

    public long roundNormal(Double number) {
        return Math.round(number);
    }

    public Double[] biggestAndLowest(Double n1, Double n2) {
        return n1 > n2 ? new Double[]{n1, n2} : new Double[]{n2, n1};
    }

    public Double randomNumber() {
        return Math.random() * 100;
    }

    public Double squareOfNumber(Double number) {
        return Math.pow(number, 2);
    }

    public Double squareRootOfNumber(Double number) {
        return Math.sqrt(number);
    }

    public String basicOperations(Double n1, Double n2) {
        return "N1+N2: " + (n1 + n2) + " N1-N2: " + (n1 - n2) + " N1*N2: " + (n1 * n2) + " N1/N2: " + (n1 / n2);
    }

    public boolean nameAndPhoneValid(String name, String phone) {
        boolean nameValid = true;
        boolean phoneValid = true;

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isAlphabetic(name.charAt(i))) {
                nameValid = false;
            }
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                phoneValid = false;
            }
        }

        return nameValid && phoneValid;
    }

    private boolean checkCpfDigit(String cpf, int digitsValidation, int productFactor) {
        boolean isValidDigit = false;

        int sumCharValuesValidation = 0;
        for (int i=0, j=productFactor; i<digitsValidation; i++, j--) {
            int charIntValue = Integer.parseInt(cpf.substring(i, i+1));
            sumCharValuesValidation += charIntValue * j;
        }

        int remainsValidation = (sumCharValuesValidation * 10) % 11 == 10 ? 0 : (sumCharValuesValidation * 10) % 11;
        if (remainsValidation == Integer.parseInt(cpf.substring(digitsValidation, digitsValidation + 1))) {
            isValidDigit = true;
        }

        return isValidDigit;
    }

    public boolean isCpf(String cpf) {

        /*
        * All digits the same, the cpf is invalid
        * */
        List<String> invalidKnownCpfs = new ArrayList<>();
        invalidKnownCpfs.add("11111111111");
        invalidKnownCpfs.add("22222222222");
        invalidKnownCpfs.add("33333333333");
        invalidKnownCpfs.add("44444444444");
        invalidKnownCpfs.add("55555555555");
        invalidKnownCpfs.add("66666666666");
        invalidKnownCpfs.add("77777777777");
        invalidKnownCpfs.add("88888888888");
        invalidKnownCpfs.add("99999999999");
        invalidKnownCpfs.add("00000000000");

        if (invalidKnownCpfs.contains(cpf)) {
            return false;
        }

        boolean firstDigit = checkCpfDigit(cpf, 9, 10);
        boolean secondDigit = checkCpfDigit(cpf, 10, 11);

        return firstDigit && secondDigit;
    }
}
