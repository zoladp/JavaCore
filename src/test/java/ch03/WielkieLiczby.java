package ch03;

import java.math.BigInteger;

public class WielkieLiczby {
    public static void main(String[] args) {
        //BidInteger - umozliwia wykonywanie dzialan arytmetycznych o dowolnej prezycji na liczbach calkowitych
        //BigDecimal - -=- zmiennoprzecinkowe

        BigInteger a = BigInteger.valueOf(1000000000), b, c;
        c = a.add(BigInteger.valueOf(345345355));
        System.out.println(a);
        System.out.println(c);
        b = a.multiply(c);
        System.out.println(b);
    }
}
