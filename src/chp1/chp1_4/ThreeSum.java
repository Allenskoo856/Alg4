package chp1.chp1_4;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author : Administrator
 * @create 2018-12-26 15:18
 */
public class ThreeSum {

    public static int count(int[] a) {
        int N = a.length;
        int cunt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cunt++;
                    }
                }
            }
        }
        return cunt;
    }

    public static void main(String[] args) {
        int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}
