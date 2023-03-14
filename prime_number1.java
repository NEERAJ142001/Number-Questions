package array;

import java.util.Arrays;
import java.util.Vector;

public class Segmented_sieve {
    private Vector<Integer> simpleSieve(int limit, Vector<Integer> prime) {
        boolean isPrime[] = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        int k = 0;
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i < limit; i++) {
            if (isPrime[i] == true) {
                for (int j = i * 2; j < limit; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i < limit; i++) {
            if (isPrime[i] == true)
                prime.add(i);
        }
        return prime;
    }
    public static void main(String args[])
    {
        Segmented_sieve s=new Segmented_sieve();
        Vector<Integer> x=new Vector<Integer>();
        Vector<Integer> y=new Vector<Integer>();
        y=s.simpleSieve(20,x);
        System.out.println(y);
    }
}
