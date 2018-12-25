package chp1.chp1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

/**
 * @author : Administrator
 * @create 2018-12-21 14:44
 */
public class RandomSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double lo = sc.nextDouble();
        double hi = sc.nextDouble();
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
