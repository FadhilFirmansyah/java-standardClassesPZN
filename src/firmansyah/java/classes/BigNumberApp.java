package firmansyah.java.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1000000000000000000000000000");
        BigInteger b = new BigInteger("1000000000000000000000000000");

        System.out.println(a.add(b));
    }
}