package ch03a;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import static java.math.RoundingMode.HALF_UP;


public class WielkieLiczby {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(100);
        BigInteger b = BigInteger.valueOf(11);
        BigInteger c = a.add(b);
        BigInteger d = c.multiply(b.add(BigInteger.valueOf(5)));
        BigInteger res = d.mod(a);
        BigDecimal div = BigDecimal.valueOf(55.2232);
        BigDecimal decmal = div.divide(BigDecimal.valueOf(11.534),HALF_UP);
        System.out.println(d.divide(BigInteger.valueOf(3)));
        System.out.println(res);
        System.out.println(div);
        System.out.println(decmal);

    }
}
