package chp1.chp1_4;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * @author : Administrator
 * @create 2018-12-26 20:26
 */
public class DoublingRatio {
    public static double timeTrial(int N) {
        int Max = 1000000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-Max, Max);
        }
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        return timer.elapsedTime();
    }
}
