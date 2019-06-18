package ch04;

import java.text.NumberFormat;

public class MetodyFabryczneFormatowanie {
    public static void main(String[] args) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormat = NumberFormat.getPercentInstance();

        double x = 0.1;
        System.out.println(currencyFormat.format(x));
        System.out.println(percentFormat.format(x));
    }
}
