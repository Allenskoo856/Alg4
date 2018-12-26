package chp1.chp1_4;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

/**
 * @author : Administrator
 * @create 2018-12-26 20:20
 */
public class TreeSumFast {

    public static void main(String[] args) {
        int[] a = In.readInts("8Kints.txt");
        Stopwatch timer = new Stopwatch();
        StdOut.println(count(a) + " timer is:" + timer.elapsedTime());
    }

    private static int count(int[] a) {
        Arrays.sort(a);
        int N = a.length;
        int cunt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (BinarySearch.rank(-a[i] - a[j], a) > j) {
                    cunt++;
                }
            }
        }
        return cunt;
    }
}
