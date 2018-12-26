package chp1.chp1_4;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * @author : Administrator
 * @create 2018-12-26 15:24
 */
public class DoublingTest {

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


    public static void main(String[] args) {
        for (int N = 250; true; N += N) {
            double time = timeTrial(N);
            // 打印数据规模和时间
            StdOut.printf("%7d %5.1f\n", N, time);
        }
    }
}
