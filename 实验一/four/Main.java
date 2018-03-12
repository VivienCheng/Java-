package four;

import java.math.*;
public class Main {
    public static void main(String[] args) {
        BigInteger res = BigInteger.valueOf(0);
        for(int i = 1; i <= 20; ++i){
            res = res.add(Solve(i));
        }
        System.out.println(res);
    }

    public static BigInteger Solve(int x){
        BigInteger tmp = BigInteger.valueOf(1);
        for(int i = 1; i <= x; ++i){
            tmp = tmp.multiply(BigInteger.valueOf(i));
        }
        return tmp;
    }
}