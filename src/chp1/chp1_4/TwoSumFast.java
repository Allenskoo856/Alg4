package chp1.chp1_4;

import chp1.chp1_1.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author : Administrator
 * @create 2018-12-26 19:54
 */
public class TwoSumFast {
    public static int count(int[] a) {
        Arrays.sort(a);
        int N = a.length;
        int cunt = 0;
        for (int i = 0; i < N; i++) {
            if (BinarySearch.rank(-a[i], a) > i) {
                cunt++;
            }
        }
        return cunt;
    }

    public static void main(String[] args) {
        int[] a = In.readInts("1Kints.txt");
        StdOut.println(count(a));
        int[] b = In.readInts("4Kints.txt");
        StdOut.println(count(b));
    }
}
