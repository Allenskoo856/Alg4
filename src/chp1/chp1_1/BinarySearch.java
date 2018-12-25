package chp1.chp1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author : Administrator
 * @create 2018-12-21 16:12
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] witeList = In.readInts(args[0]);
        Arrays.sort(witeList);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, witeList) < 0) {
                StdOut.println(key);
            }
        }
    }
}
