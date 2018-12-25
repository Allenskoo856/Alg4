package chp1.chp1_2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

/**
 * @author : Administrator
 * @create 2018-12-21 20:58
 */
public class TestVisualAccumulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int i = 0; i < T; i++) {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }

    private static class VisualAccumulator {
        private double total;
        private int N;

        public VisualAccumulator(int trials, double max) {
            StdDraw.setYscale(0, trials);
            StdDraw.setYscale(0, max);
            StdDraw.setPenRadius(.005);
        }

        public void addDataValue(double value) {
            N++;
            total += value;
            StdDraw.setPenColor(StdDraw.DARK_GRAY);
            StdDraw.point(N, value);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.point(N, total / N);
        }
    }
}
